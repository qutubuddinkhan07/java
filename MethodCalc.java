class Cal {

  double l, b;

  void calculate(double l, double b) {
    this.l = l;
    this.b = b;
    double area = l * b;
    double peri = 2 * (l + b);  // Fix: Use the multiplication operator here
    System.out.println("Area of rectangle= " + area);
    System.out.println("Perimeter of revtangle = " + peri);
  }

  void calculate(double side) {
    l = side;
    double area = l * l;
    double peri = 4 * l;
    System.out.println("Area of square = " + area);
    System.out.println("Perimeter of square= " + peri);
  }
}

class MethodCalc {
  public static void main(String args[]) {
    Cal s = new Cal();  // Fix: Use the correct class name
    s.calculate(10, 20);
    s.calculate(5);
  }
}
