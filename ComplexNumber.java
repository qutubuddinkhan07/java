//————Complex Number Example—————
class Complex
{
    int real;
    int imag;
    Complex(int a,int b)
    {
        real=a;
        imag=b;
    }
    Complex()
    {
        // System.out.println("");
        //default constructor
    }
   static Complex add(Complex c1,Complex c2)
    {
        Complex temp=new Complex();
        temp.real=c1.real+c2.real;
        temp.imag=c1.imag+c2.imag;
        return temp;
    }
    void display()
    {
        System.out.println(real + "+" + imag+"i");
    }
}
class ComplexNumber
{
    public static void main(String[] args) {
        Complex c1=new Complex(2,5);
        Complex c2=new Complex(3,6);
        System.out.println("First Complex Number: ");
        c1.display();
        System.out.println("\nSecond Complex Number: ");
        c2.display();
        Complex res= Complex.add(c1, c2);
        System.out.println("\n Addition is: ");
        res.display(); 
    }
}