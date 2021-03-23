package sample;

import javafx.scene.canvas.GraphicsContext;

class Circle extends Shape {

    protected double radius_1;

    Circle() {
        super(new Point(0,0));
    }

    Circle(double x, double y, double radius_1) {
        super(new Point(x, y));
        this.radius_1 = radius_1;
    }

    @Override
    void settings(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.radius_1 = Math.abs(startPoint.getY() - endPoint.getY());
    }

    @Override
    protected void draw(GraphicsContext graphicsContext) {
        graphicsContext.strokeOval(startPoint.getX(), startPoint.getY(), radius_1, radius_1);
    }
}