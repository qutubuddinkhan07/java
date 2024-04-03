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
        System.out.println("Good Afternoon...How are you");
    }
}
class OverRiding1
{
public static void main(String args[])
{
    Demo1 d=new Demo1();
    d.display();
}
}