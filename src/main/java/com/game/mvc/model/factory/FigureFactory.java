package com.game.mvc.model.factory;

import com.game.mvc.model.figures.Figure;
import com.game.mvc.model.figures.FigureType;
import com.game.mvc.model.figures.impl.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by alex on 15.02.2017.
 */
public class FigureFactory {

    private static Map<FigureType, Figure> figures;

    static {
        figures = new HashMap();
        figures.put(FigureType.SQUARE, new Square(new byte[2][2]));
    }

    public static Figure getFigure(FigureType type) {
        Figure fig = figures.get(type);
        fig.resetPosition();
        return fig;
    }
}
