package com.game.mvc.view.panels;

import com.game.mvc.model.figures.Figure;

import javax.swing.*;
import java.awt.*;

/**
 * Created by alex on 11.02.2017.
 */
public class NextFigurePanel extends JPanel {

    private Figure currentFigure;

    public NextFigurePanel(int sizeX, int sizeY) {
        setPreferredSize(new Dimension(sizeX, sizeY / 3));
    }

    public void paint(Graphics g) {
        if(currentFigure != null) {

        }
    }

    public void updateNextFigure(Figure figure) {
        currentFigure = figure;
    }
}
