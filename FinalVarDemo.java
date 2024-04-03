//Polymorphism----------------
class FinalVarDemo {
    int x=100;
    void display()
    {
        x=x+20;
        System.out.println("Value= "+x);
    }
    public static void main(String args[])
    {
        FinalVarDemo obj= new FinalVarDemo();
        obj.display();
    }
}
