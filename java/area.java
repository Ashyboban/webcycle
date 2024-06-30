import graphics_pack.*;

import java.util.Scanner;

public class area {
    public static void main(String[] args)
    {
        graphics_pack obj=new graphics_pack();
        Scanner s=new Scanner(System.in);
        System.out.println("enter length");
        int l=s.nextInt();
        System.out.println("enter breadth");
        int b=s.nextInt();
        System.out.println("enter radius");
        int r=s.nextInt();
        System.out.println("enter side");
        int a=s.nextInt();
        System.out.println("area of rec"+obj.recarea(l,b));
        System.out.println("area of cir"+obj.cirarea(r));
        System.out.println("area of squa"+obj.squarea(a));

s.close();

    }
}
