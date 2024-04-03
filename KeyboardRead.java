import java.io.*;
class KeyboardRead
{
public static void main(String args[]) throws Exception
{
InputStreamReader IR = new InputStreamReader(System.in);
BufferedReader BR = new BufferedReader(IR);

System.out.println("Enter your name");
String s = BR.readLine();
System.out.println("Welcome "+s);
}
}