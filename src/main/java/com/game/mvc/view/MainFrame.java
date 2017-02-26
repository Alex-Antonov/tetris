package com.game.mvc.view;

import com.game.mvc.controller.IController;
import com.game.mvc.model.field.GameField;
import com.game.mvc.model.figures.Figure;
import com.game.mvc.view.panels.GameFieldPanel;
import com.game.mvc.view.panels.NextFigurePanel;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.NoRouteToHostException;

/**
 * Created by alex on 10.02.2017.
 */
public class MainFrame extends JFrame {

    private GameFieldPanel gameField;

    private JPanel infoPanel;
    private NextFigurePanel nextFigurePanel;
    private JButton pauseButton;
    private JButton startGameButton;
    private JLabel totalLabel;

    private final static int FRAME_SIZE_X = 450;
    private final static int FRAME_SIZE_Y = 535;

    public MainFrame() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(new Dimension(FRAME_SIZE_X, FRAME_SIZE_Y));
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("My awesome tetris");

        initFrame();
        initInfoPanel();
    }

    private void initFrame() {
        gameField = new GameFieldPanel();
        infoPanel = new JPanel();
        infoPanel.setPreferredSize(new Dimension(170, FRAME_SIZE_Y));



        SpringLayout spr = new SpringLayout();
        setLayout(spr);

        add(gameField);
        add(infoPanel);

        spr.putConstraint(SpringLayout.NORTH, gameField, 5, SpringLayout.NORTH, this);
        spr.putConstraint(SpringLayout.WEST, gameField, 5, SpringLayout.WEST, this);

        spr.putConstraint(SpringLayout.NORTH, infoPanel, 5, SpringLayout.NORTH, this);
        spr.putConstraint(SpringLayout.WEST, infoPanel, 5, SpringLayout.EAST, gameField);
        spr.putConstraint(SpringLayout.SOUTH, infoPanel, 0, SpringLayout.SOUTH, gameField);

        infoPanel.setBorder(new LineBorder(Color.black, 1));

    }

    private void initInfoPanel() {
        nextFigurePanel = new NextFigurePanel(170, FRAME_SIZE_Y);

        pauseButton = new JButton("Pause");
        startGameButton = new JButton("Start");
        totalLabel = new JLabel("Total: ");

        SpringLayout spr = new SpringLayout();
        infoPanel.setLayout(spr);

        infoPanel.add(nextFigurePanel);
        infoPanel.add(pauseButton);
        infoPanel.add(startGameButton);
        infoPanel.add(totalLabel);

        spr.putConstraint(SpringLayout.NORTH, nextFigurePanel, 5, SpringLayout.NORTH, infoPanel);
        spr.putConstraint(SpringLayout.WEST, nextFigurePanel, 5, SpringLayout.WEST, infoPanel);

        spr.putConstraint(SpringLayout.NORTH, totalLabel, 5, SpringLayout.SOUTH, nextFigurePanel);
        spr.putConstraint(SpringLayout.WEST, totalLabel, 5, SpringLayout.WEST, infoPanel);
        spr.putConstraint(SpringLayout.EAST, totalLabel, 0, SpringLayout.EAST, infoPanel);

        spr.putConstraint(SpringLayout.NORTH, pauseButton, 15, SpringLayout.SOUTH, totalLabel);
        spr.putConstraint(SpringLayout.WEST, pauseButton, 5, SpringLayout.WEST, infoPanel);
        spr.putConstraint(SpringLayout.EAST, pauseButton, 0, SpringLayout.EAST, infoPanel);

        spr.putConstraint(SpringLayout.NORTH, startGameButton, 5, SpringLayout.SOUTH, pauseButton);
        spr.putConstraint(SpringLayout.WEST, startGameButton, 5, SpringLayout.WEST, infoPanel);
        spr.putConstraint(SpringLayout.EAST, startGameButton, 0, SpringLayout.EAST, infoPanel);

        nextFigurePanel.setBorder(new LineBorder(Color.black, 5));
    }

    public void initController(final IController controller) {

    }

    public void repaintField(GameField modelGameField) {

    }
}