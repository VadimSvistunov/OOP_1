package sample;

import javafx.scene.canvas.GraphicsContext;

class Parallelogram extends Rectangle {

    protected double angel = 45.0f;

    Parallelogram() {
        super();
    }

    Parallelogram(double x, double y, double width, double height, double angel) {
        super(x, y, width, height);
        this.angel = angel;
    }

    @Override
    protected void draw(GraphicsContext graphicsContext) {
        graphicsContext.beginPath();
        double offset = height / Math.tan(angel * Math.PI / 180);
        graphicsContext.moveTo(startPoint.getX() + offset, startPoint.getY());
        graphicsContext.lineTo(startPoint.getX() + width, startPoint.getY());
        graphicsContext.lineTo(startPoint.getX() + width - offset, startPoint.getY() + height);
        graphicsContext.lineTo(startPoint.getX(), startPoint.getY() + height);
        graphicsContext.lineTo(startPoint.getX() + offset, startPoint.getY());
        graphicsContext.fill();
        graphicsContext.closePath();
    }
}