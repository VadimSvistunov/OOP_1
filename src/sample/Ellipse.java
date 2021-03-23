package sample;

import javafx.scene.canvas.GraphicsContext;

class Ellipse extends Circle {

    protected double radius_2;

    Ellipse() {
        super();
    }

    Ellipse(double x, double y, double radius_1, double radius_2) {
        super(x, y, radius_1);
        this.radius_2 = radius_2;
    }

    @Override
    void settings(Point startPoint, Point endPoint) {
        super.settings(startPoint, endPoint);
        radius_2 = Math.abs(startPoint.getX() - endPoint.getX());
    }

    @Override
    protected void draw(GraphicsContext graphicsContext) {
        graphicsContext.strokeOval(startPoint.getX(), startPoint.getY(), radius_2, radius_1);
    }
}
