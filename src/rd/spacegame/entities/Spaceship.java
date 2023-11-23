package rd.spacegame.entities;

import java.awt.geom.Point2D;

public class Spaceship {
    public Point2D.Double position;
    public int size;

    public Spaceship(Point2D.Double position, int size) {
        this.position = position;
        this.size = size;
    }
}
