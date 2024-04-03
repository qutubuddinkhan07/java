class Demo
{
    void display()
    {
        System.out.println("Good Morning");
    }
}
class Demo1 extends Demo{
    void display()
    {
        super.display();
        System.out.println("Good Afternoon...How are you");
    }
}
class OverRiding2
{
public static void main(String args[])
{
    Demo1 d=new Demo1();
    d.display();
}
}