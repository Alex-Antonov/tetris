package com.game.mvc.model.field;

import com.game.mvc.model.factory.FigureGenerator;
import com.game.mvc.model.figures.Figure;

import java.awt.*;

/**
 * Created by alex on 14.02.2017.
 */
public class GameField {

    private byte[][] field;
    private Figure currentFigure;
    private Image image;
    private int total = 0;

    private final Toolkit tk = Toolkit.getDefaultToolkit();
    private final static int SIZE_X = 10;
    private final static int SIZE_Y = 20;
    private final static String IMAGE_PATH = "/img/dark.png";

    public GameField() {
        image = tk.getDefaultToolkit().getImage(getClass().getResource(IMAGE_PATH));
        field = new byte[SIZE_Y][SIZE_X];
    }

}
