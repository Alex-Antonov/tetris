package com.game.mvc.controller.session;

import com.game.mvc.controller.IController;
import com.game.mvc.controller.IUpdater;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by alex on 15.02.2017.
 */
public class GameSession {

    private IUpdater updater;
    private Timer timer;
    private boolean pause = true;
    private int speed = 1000;

    public GameSession(IUpdater updater) {
        this.updater = updater;
        timer = new Timer(speed, new ActionTiming());
    }

    private class ActionTiming implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            updater.update();
        }
    }

    public void startGame() {

    }

    public void pause() {

    }

}
