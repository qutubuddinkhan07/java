class Demo
{
    void display()
    {
        System.out.println("Hello good evening");
    }
}
class Demo1 extends Demo
{
    void display()
    {
        System.out.println("Today's students have come");
    }
}
class finalMethodDemo {
    public static void main(String args[])
    {
        Demo1 d= new Demo1();
        d.display();
    }
}
