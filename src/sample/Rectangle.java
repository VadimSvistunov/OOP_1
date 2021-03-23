package sample;

import javafx.scene.canvas.GraphicsContext;

class Rectangle extends Square {

    protected double height;

    Rectangle() {
        super();
    }

    Rectangle(double x, double y, double width, double height) {
        super(x, y, width);
        this.height = height;
    }

    @Override
    void settings(Point startPoint, Point endPoint) {
        super.settings(startPoint, endPoint);
        height = Math.abs(startPoint.getY() - endPoint.getY());
    }

    @Override
    protected void draw(GraphicsContext graphicsContext) {
        graphicsContext.strokeRect(startPoint.getX(), startPoint.getY(), width, height);
    }
}