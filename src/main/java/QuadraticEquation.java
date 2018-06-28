public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {

    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return (b * b) - 4 * a * c;
    }

    private double getRoot1() {
        double top = -b + getDiscriminant();
        return top / 2 * a;
    }

    private double getRoot2() {
        double top = -b - getDiscriminant();
        return top / 2 * a;
    }

    public String result() {
        if (getDiscriminant() > 0) {
            return "Phuong trinh co hai nghiem la: " + getRoot1() + " va " + getRoot2();
        } else if (getDiscriminant() == 0) {
            return "Phuong trinh co mot nghiem duy nhat la: " + getRoot1();
        } else {
            return "Phuong trinh vo nghiem";
        }

    }
}
