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

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        double area = this.width * this.height;
        System.out.println("Dien tich cua hinh chu nhat la: " + area);
        return area;
    }

    public double getPerimeter() {
        double perimeter = (this.height + this.width) * 2;
        System.out.println("Chu vi cua hinh chu nhat la: " + perimeter);
        return perimeter;
    }
}

