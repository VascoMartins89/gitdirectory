package org.academiadecodigo.hackstreetboys;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Controls implements KeyboardHandler {

    public Snake snake;
    public Snake snake1;
    public Snake snake2;

    public void init(){

        Keyboard keyboard = new Keyboard(this);

        //RIGHT//

        KeyboardEvent rightPressed = new KeyboardEvent();
        rightPressed.setKey(KeyboardEvent.KEY_RIGHT);
        rightPressed.setKeyboardEventType((KeyboardEventType.KEY_PRESSED));

        keyboard.addEventListener(rightPressed);

        //LEFT//

        KeyboardEvent leftPressed = new KeyboardEvent();
        leftPressed.setKey(KeyboardEvent.KEY_LEFT);
        leftPressed.setKeyboardEventType((KeyboardEventType.KEY_PRESSED));

        keyboard.addEventListener(leftPressed);


        //UP//

        KeyboardEvent upPressed = new KeyboardEvent();
        upPressed.setKey(KeyboardEvent.KEY_UP);
        upPressed.setKeyboardEventType((KeyboardEventType.KEY_PRESSED));

        keyboard.addEventListener(upPressed);

        //DOWN//

        KeyboardEvent downPressed = new KeyboardEvent();
        downPressed.setKey(KeyboardEvent.KEY_DOWN);
        downPressed.setKeyboardEventType((KeyboardEventType.KEY_PRESSED));

        keyboard.addEventListener(downPressed);


    }

    public int lastMove;

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch(keyboardEvent.getKey()){
            case KeyboardEvent.KEY_RIGHT:
                snake.setRight();

                //snake1.moveRight();
                //snake2.moveRight();

                break;

            case KeyboardEvent.KEY_LEFT:
                snake.setLeft();

                //snake1.moveLeft();
                //snake2.moveLeft();

                break;

            case KeyboardEvent.KEY_UP:
                snake.setUp();
                //snake1.moveUp();
                //snake2.moveUp();
                break;

            case KeyboardEvent.KEY_DOWN:
                snake.setDown();
                //snake1.moveDown();
                //snake2.moveDown();
                break;
        }
    }



    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }
    public void setSnake1(Snake snake1) { this.snake1 = snake1;
    }
    public void setSnake2(Snake snake2) { this.snake2 = snake2;
    }

}
