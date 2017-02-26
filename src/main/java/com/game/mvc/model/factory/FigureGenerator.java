package com.game.mvc.model.factory;

import com.game.mvc.model.figures.Figure;
import com.game.mvc.model.figures.FigureType;

import java.util.Random;

/**
 * Created by alex on 23.02.2017.
 */
public class FigureGenerator {

    private final static Random rand = new Random(System.nanoTime());;
    private final static FigureType[] types = FigureType.values();

    private static Figure nextFigure = null;

    public static Figure getRandomFigure() {
        Figure figure = null;

        return figure;
    }

    public static Figure getNextFigure() {
        return nextFigure;
    }
}
