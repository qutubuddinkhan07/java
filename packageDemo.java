import Mypkg.Studentpkg;
class exam extends Studentpkg{
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
class packageDemo
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