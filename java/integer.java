import java.util.Scanner; 
class posint extends Exception
{
    public posint(String s)
    {
        super(s);
    }
}
public class integer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the limit");
        int n=sc.nextInt();
        int average,sum=0;
        try
        {
            for(int i=1;i<=n;i++)
            {
                System.out.println("enter the number");
                int a=sc.nextInt();
                if(a<0)
                {
                    i--;

                    throw new posint("negative number is invalid");
                }
                else
                {
                    sum=sum+a;
                }
            }
        }
        catch(posint e)
        {
            System.out.println("exception caught"+e);
        }
        average=sum/n;
       System.out.println("average is"+average);
        sc.close();

    }
}
