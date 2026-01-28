# Snake Game

import pygame
import random

# Initialize Pygame
pygame.init()

# Set the screen dimensions
WIDTH, HEIGHT = 600, 400
CELL_SIZE = 20
GRID_WIDTH = WIDTH // CELL_SIZE
GRID_HEIGHT = HEIGHT // CELL_SIZE

# Colors
WHITE = (255, 255, 255)
BLACK = (0, 0, 0)
RED = (255, 0, 0)
GREEN = (0, 255, 0)

# Direction vectors
UP = (0, -1)
DOWN = (0, 1)
LEFT = (-1, 0)
RIGHT = (1, 0)

# Snake class
class Snake:
    def __init__(self):
        self.body = [(GRID_WIDTH // 2, GRID_HEIGHT // 2)]
        self.direction = RIGHT

    def move(self):
        head = self.body[0]
        x, y = head[0] + self.direction[0], head[1] + self.direction[1]
        # Wrap around screen edges
        x %= GRID_WIDTH
        y %= GRID_HEIGHT
        new_head = (x, y)
        self.body.insert(0, new_head)
        self.body.pop()

    def grow(self):
        tail = self.body[-1]
        x, y = tail[0] - self.direction[0], tail[1] - self.direction[1]
        new_tail = (x, y)
        self.body.append(new_tail)

    def change_direction(self, direction):
        if direction == 'UP' and self.direction != DOWN:
            self.direction = UP
        elif direction == 'DOWN' and self.direction != UP:
            self.direction = DOWN
        elif direction == 'LEFT' and self.direction != RIGHT:
            self.direction = LEFT
        elif direction == 'RIGHT' and self.direction != LEFT:
            self.direction = RIGHT

    def check_collision(self):
        if self.body[0] in self.body[1:]:
            return True
        return False

# Food class
class Food:
    def __init__(self):
        self.position = (random.randint(0, GRID_WIDTH - 1), random.randint(0, GRID_HEIGHT - 1))

    def respawn(self):
        self.position = (random.randint(0, GRID_WIDTH - 1), random.randint(0, GRID_HEIGHT - 1))

# Main function
def main():
    screen = pygame.display.set_mode((WIDTH, HEIGHT))
    pygame.display.set_caption('Snake Game')
    clock = pygame.time.Clock()

    snake = Snake()
    food = Food()

    score = 0
    font = pygame.font.Font(None, 36)

    running = True
    paused = False
    while running:
        screen.fill(BLACK)

        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                running = False
            elif event.type == pygame.KEYDOWN:
                if event.key == pygame.K_UP:
                    snake.change_direction('UP')
                elif event.key == pygame.K_DOWN:
                    snake.change_direction('DOWN')
                elif event.key == pygame.K_LEFT:
                    snake.change_direction('LEFT')
                elif event.key == pygame.K_RIGHT:
                    snake.change_direction('RIGHT')
                elif event.key == pygame.K_SPACE:
                    paused = not paused

        if not paused:
            snake.move()

            if snake.body[0] == food.position:
                snake.grow()
                food.respawn()
                score += 10

            if snake.check_collision():
                running = False

            # Draw snake
            for segment in snake.body:
                pygame.draw.rect(screen, GREEN, (segment[0] * CELL_SIZE, segment[1] * CELL_SIZE, CELL_SIZE, CELL_SIZE))

            # Draw food
            pygame.draw.rect(screen, RED, (food.position[0] * CELL_SIZE, food.position[1] * CELL_SIZE, CELL_SIZE, CELL_SIZE))

            # Display score
            score_text = font.render(f"Score: {score}", True, WHITE)
            screen.blit(score_text, (10, 10))

        if paused:
            pause_text = font.render("Paused", True, WHITE)
            screen.blit(pause_text, (WIDTH // 2 - 50, HEIGHT // 2))

        pygame.display.flip()
        clock.tick(10)

    pygame.quit()

if __name__ == "__main__":
    main()
