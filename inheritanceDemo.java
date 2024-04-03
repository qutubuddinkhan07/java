class student
{
    int roll;
    String name;
void setstudent(int a, String b)
{
    roll=a;
    name=b;
}
void displaystudent()
{
    System.out.println("Roll= "+roll+" Name= "+name);
}
}
class exam extends student{
    int mark1,mark2;
    void setexam(int a,int b)
    {
        mark1=a;
        mark2=b;
    }
    void displayexam()
    {
        System.out.println("Mark1= "+mark1+" Mark2= "+mark2);
    }
}
class inheritanceDemo
{
    public static void main(String args[])
    {
        exam s=new exam();
        s.setstudent(10,"harry");
        s.setexam(89,92);
        s.displaystudent();
        s.displayexam();
    }
}