class EnterElementsArray
{
    public static void main(String args[])
    {
        System.out.println("Elements are: ");
        for(String arg:args)
        {
            System.out.print(arg+" ");
        }
        if(args.length>0)
        {
            int max=Integer.parseInt(args[0]);
            for(int i=1;i<args.length;i++)
            {
                int currentNumber = Integer.parseInt(args[i]);
                if(currentNumber>max)
                {
                    max=currentNumber;
                }
            }
            System.out.println("\nThe largest number is: "+max);
        } 
        else{
            System.out.println("No number provided.");
        }
    }
}