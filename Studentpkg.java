package Mypkg;

public class Studentpkg {
    public int roll;
    public String name;

    public void setstudent(int a, String b) {
        roll = a;
        name = b;
    }

    public void displaystudent() {
        System.out.println("Roll=" + roll + " name=" + name);
    }
}