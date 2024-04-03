// 2D ARRAY
class StringDemo
{
    public static void main(String args[])
    {
        String s="This is a Demo of String Class";
        System.out.println("No. of characters= "+s.length());
        System.out.println("First character= "+s.charAt(0));

        int a =10;
        int b=14;
        char c[]=new char[4];
        s.getChars(a, b, c, 0);
        System.out.println(c);
    }
}
// a=starting point 
// b=ending point
// c=destination
// 0=destination index