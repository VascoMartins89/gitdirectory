package org.academiadecodigo.hackstreetboys;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import javax.swing.*;

public class GameFrame extends JPanel {

    private static int MIN_MAP_RECTANGLE_X = 10;
    private static int MIN_MAP_RECTANGLE_Y = 10;
    private static int MAX_MAP_RECTANGLE_X = 600;
    private static int MAX_MAP_RECTANGLE_Y = 600;

    private int width, height;
    private char[][] boardMatrix;
    Rectangle rectangle;

    Fruit fruit = null;



    Fruit fruit2 = null;
    Snake snake = null;


    /*
    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        this.boardMatrix = new char[this.height][this.width];
    }
    */
    public void build(){
        //
        rectangle = new Rectangle(MIN_MAP_RECTANGLE_X,MIN_MAP_RECTANGLE_Y, MAX_MAP_RECTANGLE_X,MAX_MAP_RECTANGLE_Y);
        rectangle.setColor(Color.WHITE);
        rectangle.draw();
        rectangle.fill();

        Picture background = new Picture(-190, -190, "resources/street.jpg");
        background.grow(-200, -200);
        background.draw();
    }

    public Fruit getFruit() {
        return fruit;
    }

    public Fruit getFruit2() {
        return fruit2;
    }

    public void setFruit2(Fruit fruit2) { this.fruit2 = fruit2; }
    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }

    public boolean fruitInCanvas() {
        return fruit != null;

    }

    public Snake getSnake() {
        return snake;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    @Override
    public int getWidth() {
        return width;
    }
}