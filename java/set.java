import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class set {
    public static void main(String[] args) {
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the limit1");
        int n=sc.nextInt();
        System.out.println("elements are");
        for(int i=0;i<n;i++)
        {
            int ele=sc.nextInt();
            set1.add(ele);
        }
        System.out.println("enter the limit2");
        int m=sc.nextInt();
        System.out.println("elements are");
        for(int i=0;i<m;i++)
        {
            int ele=sc.nextInt();
            set2.add(ele);
        }
        if(set1.equals(set2))
        {
            System.out.println("elements are equal");
        }
        else
        {
            System.out.println("elemets are not equal");
        }
sc.close();
    }
}
