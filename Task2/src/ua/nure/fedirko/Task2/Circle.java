package ua.nure.fedirko.Task2;

public class Circle {
    private double x;
    private double y;
    private double r;

    public Circle(double x, double y, double r) {
        this.r = r;
        this.x = x;
        this.y = y;
    }

    public void move(double dx, double dy) {
        x += dx;
        y += dy;
    }

    public boolean isInside(double x, double y) {
        return r > Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
    }

    public boolean isInside(Circle c) {
        return r > Math.sqrt(Math.pow((this.x - c.x), 2) + Math.pow((this.y - c.y), 2)) + c.r;
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format("Circle (%s, %s, %s)", x, y, r);
    }

    public static void main(String[] args) {
        System.out.println("~~~ c");
        Circle c = new Circle(0, 0, 1);
        c.print();
        System.out.println("~~~ c.move(1, 1)");
        c.move(1, 1);
        c.print();
        System.out.println("~~~ c.isInside(1, 1)");
        System.out.println(c.isInside(1, 1));
        System.out.println("~~~ c.isInside(10, 1)");
        System.out.println(c.isInside(10, 1));
        System.out.println("~~~ c2");
        Circle c2 = new Circle(1, 1, 2);
        c2.print();
        System.out.println("~~~ c.isInside(c2)");
        System.out.println(c.isInside(c2));
        System.out.println("~~~ c2.isInside(c)");
        System.out.println(c2.isInside(c));
    }
}
