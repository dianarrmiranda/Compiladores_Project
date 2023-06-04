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


### __Análise Semântica - Informação__
Nesta secção, há uma explicação sucinta dos erros semânticos que encontramos, incluíndo aqueles que foram resolvidos e aqueles que não conseguimos resolver.

#### __Erros Semânticos resolvidos__
---

###### Erros específicos a certas operações

- caratéres repetidos na definição de alfabeto (incluindo quando se usa um 'range' para definir um alfabeto, como [a-z]);
- definir autómatos cujo conjunto de transições é inválido, dependendo do tipo de automato (NFA, DFA, complete DFA);
- estados definidos num autómato usáveis em views que não são definidas para esse autómato (ex: há um automato a1 com estados J,K,L e um autómato a2 com estados A,B,C; uma view v1 of a2 não poderá usar os estados J,K,L, apenas pode definir os estados do autómato sobre o qual a view é definida);
- autómato não tem pelo menos 1 estado de aceitação e 1 e só 1 estado inicial;
- não definir estados com o mesmo nome dentro de um autómato
- definir transições sobre carateres que não pertencem ao alfabeto definido no inicio. ___Observação___: também há análise semântica associada à transição vazia, representada por uma string vazia, incluindo o seu uso em autómatos DFA, NFA e complete DFA.



- os 'argumentos' para definir transições são garantidamente dois estados, e não elementos de outro tipo;
- definir transições duplicadas (A -> 'a', 'a', -> B, é inválido semanticamente);
- definir uma view para um autómato que não existe, ou um elemento que não é um autómato;
- na definição das setas das transições, não usar pontos (exemplo válido: ```<B,A> as p1 -- pm -- p2;``` em que p1, pm e p2 são pontos);
- na definição das setas das transições, definir uma propriedade que não é slope (exemplo inválido: ```<B,A> as p1 [align=right] -- pm [accepting=true] -- p2 [initial=false];``` );
- ao referir a uma label, usar uma propriedade que não é align (exemplo inválido: ```place <B,A>#label [slope = 10] at pa;``` );
- ao referir a uma transição dentro de uma view, usar uma transição que não existe ou não existe para o autómato atual;
- na construção "place ID at expr", expr não ser um ponto;
- na definição de grid, a expressão dada para height e width não ser um ponto (ou uma variável que é um ponto);
- definir propriedades da grid com elementos inválidos (por exemplo, não usar um número ao definir a propriedade "step");
- ao definir um viewport, o símbolo dado não existe ou, se existir, não corresponde a uma view;
- ao definir um viewport, as expressões especificadas não são do tipo ponto (exemplo inválido: ```viewport vp3 for v3 at 1 -- ++2;``` exemplo válido: ```viewport vp3 for v3 at (10,10) -- ++(500,300);``` );
- na instrução show 'ID', usar uma variável que não está associada a um estado (exemplo inválido: ```number n = 1; show n;``` exemplo válido: ```state cs = A; show cs;```);
- na instrução show 'transition', usar uma transição que não existe para o autómato da view cujo viewport foi definido
- na instrução play 'id', usar uma variável que não está associada a uma animation



---

###### Erros globais a muitas operações
- usar variáveis com o mesmo nome dentro do mesmo scope (não se pode por exemplo, criar dois pontos chamados p1 dentro de uma view, mas pode se criar dois pontos chamados p1 dentro de  views diferentes)
- em ciclos for, não iterar por uma expressão iterável, que no caso deste trabalho são os types 'list' e 'string' (apenas se pode iterar por string num ciclo for dentro de um viewport)
- criar listas com tipos incompatíveis, como por exemplo, uma lista com 2 elementos do tipo 'state' e 1 do tipo 'number' (é garantido que todos os elementos são do mesmo tipo, se não, produzirá um erro semântico)
- expressões booleanas inválidas (como por exemplo: ```while (10 or (1 < 2))```)
 ___Observação___:  Não consideramos um inteiro como expressão válida booleana na análise semântica, mas sim como apenas um número, pois a linguagem é type-safe.
- uso de expressões não booleanas em ciclos 'while' e condições 'if' (```if 1 + 1``` não é permitido, por exemplo)
- elementos de uso global/local (poder usar autómatos fora do scope de um autómato, mas não um ponto fora do scope de onde este foi definido)
- na soma de dois elementos, usar elementos de tipos diferentes 
___Observação___: assumimos que há não é possível somar ponto com número e vice-versa, apenas somas entre tipos iguais. (nota: não temos suporte a análise semântica de soma/concatenação de strings)
- na multiplicação de duas expressões, não seguir umas das seguintes condições: ```(ponto) * (numero)```, ```(numero) * (numero)```, ```(numero) * (ponto)```
- na divisão de duas expressões, não seguir umas das seguintes condições: ```(ponto) / (numero)```, ```(numero) / (numero)```
- na declaração e assignment de variáveis, os tipos são incompatíveis (exemplo válido: ```point n1 = 1;``` isto causa um erro semântico, pois espera um ponto)
- não haver warning de variáveis declaradas mas não assigned. (por exemplo, declarar ```point p1;``` e depois nunca dar um valor a p1, causa um warning)
- usar valores inválidos para certas propriedades (por exemplo: fazer ```A [accepting = 100]``` produzirá um erro semântico pois espera ```true``` ou ```false```, o mesmo se aplica a todas as outras propriedades como por exemplo ```align```, que espera ```below```, ```below right```, etc..)


---

#### __Erros Semânticos não resolvidos__

---

<br />

## Contribuições

Para este trabalho, o nosso grupo dividiu-o nos seguintes tópicos e distribui os mesmos pelos elementos do grupo da seguinte forma:
- __Construção Gramatical__;
  - Inserir aqui;
- __Análise Semântica__;
  - Inserir aqui;
- __Interface Gráfica__;
  - Inserir aqui;
- __Geração de Código__;
  - Inserir aqui;
- __Interpretador para a Gramática Secundária__;
  - Inserir aqui;




