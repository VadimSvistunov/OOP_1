package sample;


import javafx.scene.canvas.GraphicsContext;

class Line extends Shape {

    protected Point endPoint;

    Line() {
        super(new Point(0,0));
        endPoint = new Point(0, 0);
    }

    Line(double x1, double y1, double x2, double y2) {
        super(new Point(x1, y1));
        endPoint = new Point(x2, y2);
    }

    @Override
    void settings(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    @Override
    protected void draw(GraphicsContext graphicsContext) {
        graphicsContext.strokeLine(startPoint.getX(), startPoint.getY(), endPoint.getX(), endPoint.getY());
    }
}

