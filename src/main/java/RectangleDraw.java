public class RectangleDraw {
    private double height;
    private double width;

    public RectangleDraw() {
    }

    public RectangleDraw(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() { return width; }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.height + this.width) * 2;
    }
}

