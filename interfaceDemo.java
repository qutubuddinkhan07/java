class Student
{
    int roll;
    String name;
    void SetStudent(int a, String b)
    {
        roll = a;
        name = b;
    }
    void diplayStudent()
    {
        System.out.println("ROLL= "+roll+" NAME= "+name);
    }
}
interface Sports
{
    int sports_mark=90;
    void displayResult();
}
class Exam extends Student implements Sports
{
    int mark1,mark2;
    void SetExam(int a,int b)
    {
        mark1=a;
        mark2=b;
    }
    void displayExam()
    {
        System.out.println("Mark1= "+mark1+" Mark2= "+mark2);
    }
    public void displayResult()
    {
        int total=mark1+mark2+sports_mark;
        System.out.println("Total mark= "+total);
        System.out.println("Sports mark= "+sports_mark);
    }
}
class interfaceDemo {
    public static void main(String args[])
    {
        Exam s=new Exam();
        s.SetStudent(10, "Aftab");
        s.SetExam(89, 92);
        s.diplayStudent();
        s.displayExam();
        s.displayResult();
    }
}
