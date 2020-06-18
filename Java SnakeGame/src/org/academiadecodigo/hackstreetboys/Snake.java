package org.academiadecodigo.hackstreetboys;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import javax.swing.*;

public class Snake extends Ellipse{



    private boolean alive = false;

    private GameFrame rectangle;
    private int direction;

    public Snake(double v, double v1, double v2, double v3,boolean isALive) {
        super(v, v1, v2, v3);
        setColor(Color.BLACK);
        fill();
        grow(0,0);
        setAlive(isALive);
    }
    // 0 - direction right, 1 - direction down, 2 - direction left, 3 - direction up

    //Ellipse snake1 = new Ellipse(50, 180, 30, 30);
    //Ellipse snake2 = new Ellipse(50, 210, 30, 30);

    public boolean insideRectangle() {
        return (getX() >= 0 && getX() <= 590) && (getY() >= 11 && getY() <= 590);
    }

    public void setUp() {
        direction = 3;
    }

    public void setDown() {
        direction = 1;
    }

    public void setLeft() {
        direction = 2;
    }

    public void setRight() {
        direction = 0;
    }


    private Picture snakedemo;
    private Picture background;
    private Picture banana;
    private Picture gameover;

    public void spawn() {
        //snakedemo = new Picture(90, 90, "snakedemo.png");
        //snakedemo.grow(0, 20);
        //snakedemo.draw();



        banana = new Picture(450,450, "resources/banana.png");
        banana.grow(10,10);
        banana.draw();

    }

    public void spawnGameOver() {
        gameover = new Picture(100,200, "resources/gameover.png");
        gameover.grow(20,20);
        gameover.draw();

    }

    public void moveSnake() {
        switch (direction) {


            case 0:
            if (getX() >= 0 && getX() <= 590) {
                translate(10, 0);
            }
            //snake1.translate(10,0);
            //snake2.translate(10,0);
            System.out.println(getX());
            break;


            case 2:
                if (getX() >= -1 && getX() < 590) {
                    translate(-10, 0);
                    //snake1.translate(-10,0);
                    //snake2.translate(-10,0);
                    System.out.println(getX());
                }
                    break;




            case 3:
                if (getY() >= 11 && getY() <= 590) {
                    translate(0, -10);
                    System.out.println(getY());
                }
                    break;

                //snake1.translate(0,-10);
                //snake2.translate(0,-10);



            case 1:
                if (getY() >= 11 && getY() <= 590) {
                    translate(0, 10);
                    System.out.println(getY());
                }
                    break;

                //snake1.translate(0,10);
                //snake2.translate(0,10);
            }
        }

        public boolean isAlive(){
            return this.alive;
        }

        public void setAlive(boolean alive) {
            this.alive = alive;
        }
    }






