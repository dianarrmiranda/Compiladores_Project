import cv2
import numpy as np

# Constantes
CIRCLE_RADIUS = 50
TEXT_SIZE = 2
LINE_THICKNESS = 5
FPS = 10

def draw_circle(img, center, radius, color):
    cv2.circle(img, center, radius, color, 2)

def draw_text(img, text, position, font_scale, color):
    font = cv2.FONT_HERSHEY_SIMPLEX
    thickness = 2
    size, _ = cv2.getTextSize(text, font, font_scale, thickness)
    x = position[0] - size[0] // 2
    y = position[1] + size[1] // 2
    cv2.putText(img, text, (x, y), font, font_scale, color, thickness, cv2.LINE_AA)

def draw_arrow(img, start, end, color, thickness):
    cv2.arrowedLine(img, start, end, color, thickness)

def interpolate(start, end, alpha):
    return int(start[0] + alpha * (end[0] - start[0])), int(start[1] + alpha * (end[1] - start[1]))

def animate_arrows(states, transitions, num_frames, fps):
    num_states = len(states)
    img = np.zeros([1000, 1000, 3], dtype=np.uint8)
    img.fill(255)

    circle_positions = []

    for i in range(num_states):
        angle = i * (2 * np.pi / num_states)
        x = int(400 * np.cos(angle)) + 500
        y = int(400 * np.sin(angle)) + 500
        circle_center = (x, y)
        draw_circle(img, circle_center, CIRCLE_RADIUS, (0, 0, 255))
        circle_positions.append(circle_center)

        text_position = (x, y)
        draw_text(img, states[i], text_position, TEXT_SIZE, (0, 0, 0))

    for frame in range(num_frames):
        frame_img = img.copy()

        for i, transition in enumerate(transitions):
            if frame >= i:
                start_state, end_state = transition
                start_center = circle_positions[start_state]
                end_center = circle_positions[end_state]

                angle = np.arctan2(end_center[1] - start_center[1], end_center[0] - start_center[0])

                start_offset = (int(CIRCLE_RADIUS * np.cos(angle)), int(CIRCLE_RADIUS * np.sin(angle)))
                start = (start_center[0] + start_offset[0], start_center[1] + start_offset[1])

                end_offset = (int(CIRCLE_RADIUS * np.cos(angle + np.pi)), int(CIRCLE_RADIUS * np.sin(angle + np.pi)))
                end = (end_center[0] + end_offset[0], end_center[1] + end_offset[1])

                alpha = (frame - i) / num_frames
                interpolated_end = interpolate(start, end, alpha)
                draw_arrow(frame_img, start, interpolated_end, (0, 0, 0), LINE_THICKNESS)

        cv2.imshow("Animation", frame_img)
        cv2.waitKey(int(1000 / fps))

def main():
    states = ['A', 'B', 'C', 'D', 'E']
    transitions = [(0, 1), (1, 2), (2, 3), (3, 0), (0, 4), (4, 2)]

    animate_arrows(states, transitions, num_frames=30, fps=FPS)

    while True:
        if cv2.waitKey(1) == 27:
            break

    cv2.destroyAllWindows()

if __name__ == "__main__":
    main()