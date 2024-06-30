import  java.util.Scanner; 
class auth extends Exception
{
    public auth(String s)
    {
        super(s);
    }
}
public class authentication
 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String user_name="Ashy";
        String passcode="ashy@123";
        String username,password;
        try{
            System.out.println("enter username");
            username=sc.nextLine();
            System.out.println("enter password");
            password=sc.nextLine();
            if (username.equals(user_name)&&passcode.equals(password)) {
                System.out.println("succefull");
            }
            else
            throw new auth("inavlid credentials"); 
            
        }   

        catch(auth e)
        {
            System.err.println("exception caught"+e);
        }
        finally
        {
            sc.close();
        }
        
    }
 
 }
