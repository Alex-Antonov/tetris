package com.game.mvc.view.panels;

import com.game.mvc.model.field.GameField;

import javax.swing.*;
import java.awt.*;

/**
 * Created by alex on 11.02.2017.
 */
public class GameFieldPanel extends JPanel {

    private GameField modelGameField;
    private final static int SIZE_X = 250;
    private final static int SIZE_Y = 500;

    public GameFieldPanel() {
        setPreferredSize(new Dimension(SIZE_X, SIZE_Y));
    }

    public void paint(Graphics g) {

        if(modelGameField != null) {

        }
    }

    private void paintObjects(Graphics g, byte[][] mass, Image im, int deltaX, int deltaY) {
        for(int i = 0; i < mass.length; i++) {
            for(int j = 0; j < mass[i].length; j++) {
                if (mass[i][j] == 1) {
                    g.drawImage(im, deltaX + j * getWidth() / 10, deltaY + i * getHeight() / 20, null);
                }
            }
        }
    }

    public void setGameField(GameField modelGameField) {
        this.modelGameField = modelGameField;
    }
}
