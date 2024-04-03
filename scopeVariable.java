class scope
{
    static int a=0;
    int b;
    void display()
    {
        int c=10;
        System.out.println("Local variable c="+c);
        System.out.println("Instance variable b="+b);
        a++;
        System.out.println("Static variable a="+a);
    }
}
class scopeVariable
{
    public static void main(String args[])
    {
        scope p1=new scope();
        scope p2=new scope();
        p1.b=100;
        p2.b=200;
        p1.display();
        p2.display();
    }
}
//OUTPUT
// Local variable c=10
// Instance variable b=100
// Static variable a=1
// Local variable c=10
// Instance variable b=200
// Static variable a=2