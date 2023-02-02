import java.util.*;

abstract class shape {
    int a, b;

    shape(int i, int j) {
        a = i;
        b = j;
    }

    abstract void printarea();
}

class rectangle extends shape {
    rectangle(int i, int j) {
        super(i, j);
    }

    void printarea() {
        double area;
        area = a * b;
        System.out.println("Area of rectangle is" + area);
    }
}

class triangle extends shape {
    triangle(int i, int j) {
        super(i, j);
    }

    void printarea() {
        double area;
        area = 0.5 * a * b;
        System.out.println("Area of triangle is" + area);
    }
}

class circle extends shape {
    int r;

    circle(int i, int j) {
        super(i, j);
    }

    void printarea() {
        double area;
        area = 3.14 * a * b;
        System.out.println("Area of circle is" + area);
    }
}

public class program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        circle ob = new circle(1, 1);
        ob.printarea();
        triangle obj = new triangle(2, 6);
        obj.printarea();
        rectangle la = new rectangle(3, 4);
        la.printarea();

    }
}
