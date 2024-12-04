class sujan
{
     public static void main(String[] args)
    {
        int x=001;
        int y=010;
        int z=100;
        int i=--x+y++-z-- - --z+ ++y- --x+y-- - --x;
        
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(i);
       
    }
}