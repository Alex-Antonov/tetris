package com.game.mvc.model.figures;


import java.awt.*;

/**
 * Created by alex on 14.02.2017.
 */
public abstract class Figure {

    protected int positionX;
    protected int positionY;
    protected byte[][] body;
    protected Image image;
    protected final Toolkit tk = Toolkit.getDefaultToolkit();

    public Figure(byte[][] body) {
        this.body = body;
        resetPosition();
    }

    public byte[][] getBody() {
        return body;
    }

    public void left() {
        positionX--;
    }

    public void right() {
        positionX++;
    }

    public void down() {
        positionY++;
    }

    public int getPositionY() {
        return positionY;
    }

    public int getPositionX() {
        return positionX;
    }

    public Image getImage() {
        return image;
    }

    public void resetPosition() {
        positionX = 4;
        positionY = 0;
    }

    public abstract void turn();

}

