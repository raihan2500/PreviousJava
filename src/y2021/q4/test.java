package y2021.q4;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.io.Serializable;

public class test {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Rectangle2D r2 = r;
        Shape sh = r;
        Serializable s = r;

        Object x = r;
    }
}
