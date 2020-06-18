package org.academiadecodigo.hackstreetboys;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Position implements KeyboardHandler {

    private Snake snakedemo;

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

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch(keyboardEvent.getKey()){
            case KeyboardEvent.KEY_RIGHT:
               // snakedemo.moveRight();
                System.out.println("DIREITA!");
                break;

            case KeyboardEvent.KEY_LEFT:
               // snakedemo.moveLeft();
                System.out.println("ESQUERDA!");
                break;

            case KeyboardEvent.KEY_UP:
              //  snakedemo.moveUp();
                System.out.println("CIMA!");
                break;

            case KeyboardEvent.KEY_DOWN:
               // snakedemo.moveDown();
                System.out.println("BAIXO!");
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

    public void setSnakedemo(Snake snakedemo) {
        this.snakedemo = snakedemo;
    }



}
