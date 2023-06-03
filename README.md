# Tema **ADV**, grupo **adv-02**
-----

## Constituição dos grupos e participação individual global

| NMec | Nome | email | Participação |
|:---:|:---|:---|:---:|
| 107457 | DIANA RAQUEL RODRIGUES MIRANDA | dianarrmiranda@ua.pt | 0.0% |
| 108298 | DIOGO MACHADO MARTO | diogo.marto@ua.pt | 0.0% |
| 108636 | JOAO PEDRO DUARTE DOURADO | joao.dourado1@ua.pt | 0.0% |
| 108840 | JOSÉ MIGUEL COSTA GAMEIRO | jose.mcgameiro@ua.pt | 0.0% |
| 108287 | MIGUEL BELCHIOR FIGUEIREDO | miguel.belchior@ua.pt | 0.0% |
| 108546 | TIAGO FILIPE GONÇALVES PEREIRA | tfgp@ua.pt | 0.0% |

## Estrutura do repositório

- **src** - deve conter todo o código fonte do projeto.

- **doc** -- deve conter toda a documentação adicional a este README.

- **examples** -- deve conter os exemplos ilustrativos das linguagens criadas.

    - Estes exemplos devem conter comentários (no formato aceite pelas linguagens),
      que os tornem auto-explicativos.

## Relatório

### Introdução

Relatório para a linguagem adv do grupo P4-G2 para a unidade curricular de Compiladores 2022/2023.
<br />
- Foi nos proposto, como projeto final, o desenvolvimento de uma linguagem de programação designada por adv (automata description and visualization), bem como as correspondentes ferramentas necessárias para a compilação da mesma, que permita a criação de programas numa linguagem de programação genérica, para o nosso caso essa linguagem foi o Python.
- Esta linguagem tem como principal funcionalidade permitir a definição de autómatos bem como a visualização da sua estrutura.
- Também nos foi proposto desenvolvermos uma linguagem secundária, designada por xAdv, que permite auxilar a linguagem adv, ao permitir a definição de estilos para o autómato, como a forma de cada estado, o tamanho da fonte de texto das etiquetas dos estados e das transições, a cor dos estados e transições, entre outros.
- Para nós desenvolvermos o nosso projeto utilizámos a ferramenta __ANTLR4__ como *Parser Generator* implementado em __Java__ para a linguagem principal, adv, e em __Python__ para a linguagem secundária, xadv, sendo que a nossa linguagem alvo é o __Python__, pois usámos a livraria __OpenCV__ para a representação dos autómatos.

<br />

### Requisitos
Foram definidos 4 níveis para a realização deste projeto:
- Nível mínimo;
- Nível desejável;
- Nível adicional;
- Desafio;

O nosso grupo conseguiu cumprir totalmente  os requisitos definidos no nível mínimo, que consistem em:
- Construir a gramática que conseguisse abrangir as seguintes funcionalidades:
  1. Definir um alfabeto;
  2. Definir autómatos finitos dos tipos não-deterministas, deterministas e determinista completo;
  3. Definir a vista de um autómato;
  4. Definir uma animação de um autómato;
  5. Instruções para executar uma animação de um autómato;
  6. Permitir alterar a alteração das propriedades dos elementos intrínsicos (estado, transição) de um autómato;
  7. Definição dos tipos de dados número, ponto e lista, assim como álgebras que permitam a sua manipulação;
  8. Definições de instruções de iteração sobre os elementos de uma lista;
 - Verificação semântica para os elementos referidos anteriormente;

### Nível Mínimo

<br />

#### __Definição de um alfabeto__
---
Exemplo:
``` 
alphabet { 'a', 'b', 'c' }
```
- Para se definir um alfabeto em adv é necessário incluir a instrução referida acima, os elementos pertencentes a este iram pertencer a transições presentes num autómato. 
- Para esta instrução é necessário verificar se o alfabeto é um conjunto não vazio, se os símbolos presentes são sempre representados por caracteres entre plicas, limitados a letras e a algarismos decimais e estes não podem ser repetidos.

<br />

#### __Definição de autómatos finitos dos tipos não-deterministas, deterministas e determinista completo;__
---
Exemplo:
```
/* Autómato finito não determinístico */
NFA a1 <<< >>>

/* Autómato finito determinístico */
DFA a2 <<< >>>

/* Autómato finito determinístico completo */
complete DFA a3 <<< >>>
```
- A instrução acima mostra como  definir um automato de entre os 3 tipos disponíveis para a linguagem adv. Esta instrução encontra-se divida em 3 partes:
  1. Indicação do tipo do autómato;
  2. Indicação do ID deste;
  3. Dentro dos elementos "<<< >>>" irá se definir os estados e as transições que constituem o autómato.

- Nesta instrução, relativamente à análise semântica, foi necessário se o tipo do autómato especificado era correto e se o id do autómato já foi definido anteriormente.

<br />

#### __Definição dos elementos intrínsicos de um autómato__
---
Exemplo:
```
NFA a1 <<<

    // Definição dos estados
    state A, B;

    A [initial = true];  // O estado A é definido como o inicial
    B [accepting = true];  // O estado B é definido como o de aceitação

    transition 
        A -> 'a','b' -> B,
        A -> 'a','b','c' -> A;
>>>
```
- Para qualquer tipo de autómato definido na linguagem adv, pode-se definir os estados, qual é o inicial e qual é o de aceitação, bem como as suas transições.
- Nesta instrução, para os dois tipos de autómatos possíveis, definimos como análise semântica os seguintes pontos:
    - Verificar se a definição dos estados e das transições são corretas;
    - Verificar se não existem estados e transições repetidas;
    - Verificar nas transições se existem símbolos repetidos;
    - Garantir que existe apenas 1 estado de iniciação;
    - Garantir que existe pelo menos 1 estado de aceitação;

<br />

#### __Definição da vista de um autómato__
Uma vista de um autómato é definida para se puder representar um autómato numa tela ou canvas. Nesta pode-se indicar qual a posição dos estados na tela, redefinir as setas que representam as transições e reposicionar as etiquetas dessas mesmas transições. 
<br />
A tabela seguinte indica as instruções possíveis para uma view bem como uma pequena descrição:
| Instrução | Descrição|
|:---:|:---:|
| ```view v1 for a1 <<< >>>``` | Definição de uma view (v1) para o autómato a1. É necessário garantir que o autómato a1 existe e que a view v1 ainda não foi criada.|
| ```place A at (2,1), B at (5,1);``` | Posicionar o estado A e B nos pontos respetivos apresentados. Neste caso, é necessário verificar se a definição do ponto está correta e se os estados escolhidos existem, se são do tipo estado e se pertencem ao autómato definido.|
| ```point p1 = (5,2);``` | Definição de uma variável do tipo point. 
| ```p1 = (B);``` | Atribuir a uma variável do tipo ponto, definido anteriormente, um estado do autómato.
| ``` point p2 = (A) + (-20:0.6); ``` | Operações algébricas com pontos . |
| ``` <B,A> as p1 -- pm -- p2; ``` | Redefinir a posição de uma seta para prevenir a disposição de duas transições uma em cima da outra. Neste caso a transição de B para A irá ser alterada.
| ``` place <B,A>#label [align = below] at pm; ``` |  Definir a posição da legenda da transição no ponto indicado. |
| ``` <E,E>#label [align=left]; ``` | Alterar a posição da legenda da trasnsição para a indicada. |

<br />

#### __Definição de uma animação de um autómato__
---
A animação de um autómato consiste num conjunto de instruções que permitem visualizar o autómato numa janela/viewport, sendo que podem existir várias viewport's, uma por cada view definida para o autómato.
<br />
A tabela seguinte apresenta instruções que podem existir dentro de uma animação:
| Instrução | Descrição |
| :---: | :---: |
| ``` viewport vp1 for v1 at (10,10) -- ++(500,500); ``` | Criar uma viewport para a view v1 no ponto (10,10), com um tamanho de 500x500 |
| ``` on vp1 <<< >>> ``` | Para definir quais os elementos que vão ficar visíveis na viewport terá de se escrever esta instrução, tendo de sido feito na anaĺise semântica a verificação de se a viewport referida existe. 
| ``` show B [accepting = true]; ``` | Esta instrução tem como objetivo indicar quais são os estados que vão ser representados na tela e definir o estado indicado como estado de aceitação. Para indicar qual o estado inicial seria [inital = true]. |
| ``` pause; ``` | Esta instrução tem como funcionalidade parar a animação do autómato, esta só irá retornar quando o utilizador pressionar a tecla right arrow é que a animação irá avançar para o próximo passo. |

<br />

#### __Tipos de dados número, ponto e lista, assim como álgebras que permitam a sua manipulação__
---

<br />

## Contribuições

- Use esta secção para expôr as contribuições individuais dos vários elementos do grupo e que
  justificam as participações individuais globais apresentadas no início.
