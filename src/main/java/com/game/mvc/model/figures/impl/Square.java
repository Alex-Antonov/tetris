package com.game.mvc.model.figures.impl;

import com.game.mvc.model.figures.Figure;

/**
 * Created by alex on 23.02.2017.
 */
public class Square extends Figure {

    private final static String IMAGE_PATH = "/img/red.png";

    public Square(byte[][] body) {
        super(body);
        image = tk.getDefaultToolkit().getImage(getClass().getResource(IMAGE_PATH));
        for(int i = 0; i < body.length; i++) {
            for(int j = 0; j < body[i].length; j++) {
                body[i][j] = 1;
            }
        }
    }

    public void turn() {

    }
}
