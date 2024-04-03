class Array {
    public static void main(String args[])
    {
        int a[]=new int[3];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        int b[]={40,50,60};
        int[] c=new int[]{70,80,90};
        System.out.println("First Array");

        for(int i=0;i<3;i++)
        {
            System.out.println(a[i]);
        }

        System.out.println("\n2nd array");
        for(int i=0;i<b.length;i++)
        {
            System.out.println(b[i]);
        }

        System.out.println("\n3rd array");
        for(int val:c)
        {
            System.out.println(val);
        }
    }    
}
