package org.academiadecodigo;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.awt.*;

public class GamePanel {

    private final int PADDING = 10;

    public void setPanelSize() {
        Rectangle panel = new Rectangle(PADDING, PADDING, FieldSize.fieldWidth, FieldSize.fieldHeight);
        panel.draw();
        System.out.println(FieldSize.fieldWidth + " " + FieldSize.fieldHeight);
    }
}
