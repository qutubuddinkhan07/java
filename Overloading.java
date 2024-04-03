class Demo {
    double l, b, s;

    void rectangle(double x, double y) {
        this.l = x;
        this.b = y;
        System.out.println("Area = " + (l * b));
        System.out.println("Perimeter = " + (2 * (l + b)));
    }

    void square(double x) {
        s = x;
        System.out.println("Area = " + (s * s));
        System.out.println("Perimeter = " + (4 * s));
    }
}

class Overloading {
    public static void main(String args[]) {
        Demo r = new Demo();  
        r.rectangle(10, 20);
        r.square(6);
    }
}
