import java.io.*;

class addition
{
public static void main(String args[]) throws Exception
{
InputStreamReader IR = new InputStreamReader(System.in);
BufferedReader BR = new BufferedReader(IR);

int a,b,sum;

System.out.println("Enter first number: ");
 a = Integer.parseInt(BR.readLine());

System.out.println("Enter the second number");
 b = Integer.parseInt(BR.readLine());

 sum = a+b;

System.out.println("Sum = "+sum);
}
}