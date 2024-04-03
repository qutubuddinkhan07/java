import java.io.*;

class ReadingInput {
    public static void main(String args[]) throws Exception
    {
        int sum;
        InputStreamReader IR = new InputStreamReader(System.in);
        BufferedReader BR  = new BufferedReader(IR);
        System.out.println("Enter first number: ");
        int a=Integer.parseInt(BR.readLine());
        System.out.println("Enter second number: ");
        int b=Integer.parseInt(BR.readLine());
        sum=a+b;
        System.out.println("Sum= "+sum);
    }    
}
