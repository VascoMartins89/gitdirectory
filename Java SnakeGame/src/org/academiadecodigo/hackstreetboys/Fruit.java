package org.academiadecodigo.hackstreetboys;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.hackstreetboys.Controls;

public class Fruit extends Ellipse {

    public Fruit(double v, double v1, double v2, double v3) {
        super(v, v1, v2, v3);
        setColor(Color.ORANGE);
        fill();
    }


}
