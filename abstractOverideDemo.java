abstract class Demo{
    void display()
    {
        System.out.println("Good morning");
    }
    abstract void display1();
}
class Demo1 extends Demo{
    void display()
    {
        System.out.println("Good afternoon... How are you?");
    }
    void display1()
    {
        super.display();
        System.out.println("Hello everyone");
    }
}
class abstractOverideDemo {
    public static void main(String args[])
    {
        Demo d=new Demo1();
        d.display();
        d.display1();
    }
}