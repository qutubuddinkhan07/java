class cal {

  double l, b;
  double area;
double peri;

  void calculate(double l, double b) {
    this.l = l;
    this.b = b;
    area = l * b;
    peri = (2 * (l + b));  // Fix: Use the multiplication operator here
    System.out.println("Area = " + area);
    System.out.println("Perimeter = " + peri);
  }

  void calculate(double side) {
    l = side;
    area = l * l;
    peri = 4 * l;
    System.out.println("Area = " + area);
    System.out.println("Perimeter = " + peri);
  }
}

class MethodCalc {
  public static void main(String args[]) {
    cal s = new cal();  // Fix: Use the correct class name
    s.calculate(10, 20);
    s.calculate(5);
  }
}
