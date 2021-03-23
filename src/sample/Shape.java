package sample;

import javafx.scene.canvas.GraphicsContext;

public abstract class Shape {

    protected Point startPoint;

    public Shape(Point startPoint) {
        this.startPoint = startPoint;
    }

    abstract void settings(Point startPoint, Point endPoint);

    protected abstract void draw(GraphicsContext graphicsContext);

}
