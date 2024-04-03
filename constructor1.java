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
    void display()
    {
        System.out.println("Roll= "+roll+" Name="+name);
    }
    Student(int x)
    {
        this(x,"Priti Ranjan");
    }
}
class constructor1
{
    public static void main(String args[])
    {
        Student s1=new Student();
        s1.display();;
        Student sc = new Student(10,"Lagnajit");
        sc.display();
        Student s3 = new Student(30);
        s3.display();
    }
}