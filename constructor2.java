class Student{
    int roll;
    String name;
    Student()
    {
        roll=10;
        name="Rengoku";
    }
    Student(int a, String b)
    {
        roll=a;
        name=b;
    }
    Student(Student x)
    {
        roll=x.roll;
        name=x.name;
    }
    void display()
    {
        System.out.println("Roll= "+roll+" Name="+name);
    }
    Student(int x)
    {
        this(x,"Priti Ranjan");
    }
}
class constructor2
{
    public static void main(String args[])
    {
        Student s1=new Student();
        s1.display();;
        Student s2 = new Student(s1);
        s2.display();
        Student s3 = new Student(30);
        s3.display();
        Student s4 = new Student(s2);
        s4.display();
    }
}