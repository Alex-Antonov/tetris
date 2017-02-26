package com.game.mvc.controller;

import com.game.mvc.model.figures.Figure;

/**
 * Created by alex on 10.02.2017.
 */
public interface IController {

    void startGame();
    void pause();
    void turnCurrentFigure();
    void tookLeftCurrentFigure();
    void tookRightCurrentFigure();
    void tookDownCurrentFigure();
}
