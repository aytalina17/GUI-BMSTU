package classes;

public class Equation {
    private double a;
    private double b;
    private double c;

    public Equation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public int rootsCounter() {
        double d = b * b - 4 * a * c;
        if (d < 0) {
            return 0;
        } else if (d == 0) {
            return 1;
        } else {
            return 2;
        }
    }

    public double[] rootsOfEquation() {
        if (rootsCounter() == 0) {
            double[] roots = new double[0];
            return roots;
        } else if (rootsCounter() == 1) {
            double[] roots = new double[1];
            double x = -b / (2 * a);
            roots[0] = x;
            return roots;
        } else {
            double[] roots = new double[2];
            double x1 = (-b + Math.pow(b * b - 4 * a * c, 0.5)) / (2 * a);
            double x2 = (-b - Math.pow(b * b - 4 * a * c, 0.5)) / (2 * a);
            roots[0] = x1;
            roots[1] = x2;
            return roots;
        }
    }
}
