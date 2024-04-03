// constructor
class Student
{
    int roll;
    String name;
    Student(int a, String b)
    {
        roll = a;
        name = b;
    }
    void displayStudent()
    {
        System.out.println();
    }
}
class Exam extends Student{
    int mark1, mark2;
    Exam(int x, String y, int a, int b)
    {
        super(x,y);
        mark1=a;
        mark2=b;
    }
    void displayExam()
    {
        //displayStudent();
        System.out.println("Mark1= "+mark1+" "+"Mark2= "+mark2);
    }
}

class SuperDemo
{
    public static void main(String args[])
    {
        Exam s = new Exam(23,"Ayush",89,93);
        s.displayStudent();
        s.displayExam();
    }
}