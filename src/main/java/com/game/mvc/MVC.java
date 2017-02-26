package com.game.mvc;

import com.game.mvc.controller.IController;
import com.game.mvc.controller.impl.Controller;
import com.game.mvc.model.Model;
import com.game.mvc.view.MainFrame;

/**
 * Created by alex on 10.02.2017.
 */
public class MVC {

    private MainFrame mainFrame;
    private Model model;
    private IController controller;

    public MVC() {
        mainFrame = new MainFrame();
        model = new Model();
        controller = new Controller(model, mainFrame);
    }

    public void showMainFrame() {
        mainFrame.setVisible(true);
    }
}
