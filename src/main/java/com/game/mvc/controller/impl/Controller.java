package com.game.mvc.controller.impl;

import com.game.mvc.controller.IController;
import com.game.mvc.controller.IUpdater;
import com.game.mvc.controller.session.GameSession;
import com.game.mvc.model.Model;
import com.game.mvc.view.MainFrame;

/**
 * Created by alex on 14.02.2017.
 */
public class Controller implements IController, IUpdater {

    private Model model;
    private MainFrame mainFrame;
    private GameSession gameSession;

    public Controller(Model model, MainFrame mainFrame) {
        this.model = model;
        this.mainFrame = mainFrame;
        this.mainFrame.initController(this);
        gameSession = new GameSession(this);
    }

    public void startGame() {

    }

    public void pause() {

    }

    public void turnCurrentFigure() {

    }

    public void tookLeftCurrentFigure() {

    }

    public void tookRightCurrentFigure() {

    }

    public void update() {

    }

    public void tookDownCurrentFigure() {
        update();
    }
}
