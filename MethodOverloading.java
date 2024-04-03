class Demo {
    double l, b, s;

    void calculate(double x, double y) {
        this.l = x;
        this.b = y;
        System.out.println("Area of rectangle = " + (l * b));
        System.out.println("Perimeter of rectangle= " + (2 * (l + b)));
    }

    void calculate(double x) {
        s = x;
        System.out.println("Area of square = " + (s * s));
        System.out.println("Perimeter of square = " + (4 * s));
    }
}

class MethodOverloading {
    public static void main(String args[]) {
        Demo r = new Demo();  
        r.calculate(10, 20);
        r.calculate(6);
    }
}