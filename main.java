class Geometry {
    double length;
    double width;

    // Default constructor
    Geometry() {
        length = 0;
        width = 0;
    }

    // Constructor for square
    Geometry(double side) {
        length = side;
        width = side;
    }

    // Constructor for rectangle
    Geometry(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Area of square
    double area(double side) {
        return side * side;
    }

    // Area of rectangle
    double area(double length, double width) {
        return length * width;
    }

    // Area using object
    double area(Geometry g) {
        return g.length * g.width;
    }

    // Create and return rectangle
    Geometry createReactangle(double length, double width) {
        return new Geometry(length, width);
    }

    // Total area of multiple values
    double totalArea(double... areas) {
        double total = 0;

        for (double area : areas) {
            total = total + area;
        }

        return total;
    }
}

public class Main {
    public static void main(String[] args) {

        Geometry g1 = new Geometry();
        Geometry g2 = new Geometry();
        Geometry g3 = new Geometry();

        System.out.println("Square area = " + g2.area(5));

        System.out.println("Rectangle area = " + g3.area(10, 4));

        System.out.println("Area using object = " + g3.area(g3));

        //creation of reactangle
        Geometry g4 = g1.createReactangle(6, 5);

        System.out.println("Area of returned rectangle = " + g4.area(g4));

        double total = g1.totalArea(25, 40, 10, 20);

        System.out.println("Total area = " + total);
    }
}