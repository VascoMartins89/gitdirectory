package org.academiadecodigo.hackstreetboys;

import java.util.Random;

public class Main {


    public static void main(String[] args) throws InterruptedException {
        GameFrame gameframe = new GameFrame();

        gameframe.build();
        gameframe.setFruit(new Fruit(90,140,20,20));

        gameframe.setSnake(new Snake(20,20,20,20,true));
        gameframe.getSnake().spawn();
        //snake.createSnake1();




        //snake1.spawn();
        //snake2.spawn();


        Controls controls = new Controls();
        controls.setSnake(gameframe.getSnake());
        //controls.setSnake1(snake1);
        //controls.setSnake2(snake2);
        controls.init();
        //Position position = new Position();
        //position.setSnakedemo(snake);
        //position.init();

        Snake snake = gameframe.getSnake();
        Fruit fruit = gameframe.getFruit();

        //while(gameframe.getSnake().isAlive()==true){
            while (gameframe.getSnake().insideRectangle()==true) {
                gameframe.getSnake().moveSnake();
                //if(snakeposition==appleposition)
                //Ate the apple????
                System.out.println("Snake X:"+gameframe.getSnake().getX()+" Y:"+gameframe.getSnake().getY()+
                                    "\n Fruit X:"+gameframe.getFruit().getX()+" Y:"+gameframe.getFruit().getY()
                );
                if(snakeEatsFruit(gameframe.getSnake(),gameframe.getFruit())==true){
                    //Apaga maça anterior
                    //deleteFruitFromGameFrame(gameframe.getFruit());
                    gameframe.getFruit().translate(20,50);

                    if(snakeEatsFruit(gameframe.getSnake(),gameframe.getFruit())==true){


                    }
                }

                Thread.sleep(100);
            }
            gameframe.getSnake().spawnGameOver();
        System.out.println("Gameover!!!");
    }

    // Checks if the snake and the fruit are in the same position

    private static boolean snakeEatsFruit(Snake snake, Fruit fruit){
        if(snake.getX()==fruit.getX() && snake.getY()==fruit.getY()){
            return true;
        }
        return false;
    }



   // private static void deleteFruitFromGameFrame(Fruit fruit){
        //fruit.delete();
    //}

    private static void createNewFruitOnGameFrame(GameFrame gameFrame, Snake snake){

        // Definir nova fruta e faze-lo no gameframe
        Fruit fruit2 = new Fruit(50,89,20,20);
        gameFrame.setFruit(new Fruit(50,89,20,20));


    }

}