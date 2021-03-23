package sample;

import javafx.scene.canvas.GraphicsContext;

class Square extends Shape {

    protected double width;

    Square() {
        super(new Point(0,0));
    }

    Square(double x, double y, double width) {
        super(new Point(x, y));
        this.width = width;
    }

    @Override
    void settings(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        width = Math.abs(startPoint.getX() - endPoint.getX());
    }

    @Override
    protected void draw(GraphicsContext graphicsContext) {
        graphicsContext.strokeRect(startPoint.getX(), startPoint.getY(), width, width);
    }
}