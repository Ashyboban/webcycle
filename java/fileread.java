import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.IOException;
public class fileread {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the file name");
        String filename=sc.nextLine();
        System.out.println("enter the content");
        String content=sc.nextLine();
       try (FileWriter writer=new FileWriter(filename)){
         
        writer.write(content);
       } catch (IOException e) {
System.out.println("error:"+e.getMessage());     
  }
  try (BufferedReader reader=new BufferedReader(new FileReader(filename))){
    
    String line;
    
    while ((line=reader.readLine())!=null) {
        System.out.println(line);
    }
  } catch (IOException e) {
System.out.println("error:"+e.getMessage());  }
       
        sc.close();
       

    }
}
