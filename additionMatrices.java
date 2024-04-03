import java.util.Scanner;
class additionMatrices {
    public static void main(String args[])
    {
        int a[][]=new int[2][3];
        int b[][]=new int[2][3];
        int c[][]=new int[2][3];
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of 1st matrix: ");
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of 2nd matrix: ");
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }

        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("Sum of two matrices is: ");
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
