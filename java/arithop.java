import arithmatic.*;
import java.util.Scanner; 
public class arithop {
    public static void main(String[] args) {
        operation obj=new operation();
    Scanner sc=new Scanner(System.in);
    System.out.println("enter first num");
    double x=sc.nextDouble();
    System.out.println("enter sec num");
    double y=sc.nextDouble();
    System.out.println("addition of two numbers"+obj.add(x, y));
    System.out.println("substraction of two numbers"+obj.sub(x, y));
    System.out.println("multiplication of two numbers"+obj.multi(x, y));
    System.out.println("division of two numbers"+obj.div(x, y));

sc.close();

    }

}
