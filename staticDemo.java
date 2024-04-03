class Demo
{
    static int a = 100;
    int b;
    void display()
    {
        b=50;
        System.out.println("Value of b= "+b);
        a=a+10;
        System.out.println("Value of a= "+a);
    }
    static void display1()
    {
        a=a+10;
        System.out.println("Value of a= "+a);
    }
}
class staticDemo
{
    public static void main(String args[])
    {
        Demo d1= new Demo();
        d1.display();
        Demo.display1();
    }
}

// output 
// Value of b= 50
// Value of a= 110
// Value of a= 120