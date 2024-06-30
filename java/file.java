import java.util.Scanner;
import java.io.File;
public class file
{
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the path directory");
        String path=sc.nextLine();
        File dir=new File(path);
        System.out.println("enter the file search");
        String filetosearch=sc.nextLine();
        listsearch( dir, filetosearch);
        sc.close();

     }
        public static void listsearch(File dir,String filetosearch)
        {
             if (dir.exists()&&dir.isDirectory())
              {
                    File[] files=dir.listFiles();
                    if(files !=null) {
                        for(File file:files)
                       {
                        if(file.isDirectory())
                        {
                            listsearch(file, filetosearch);

                        }
                       else if (file.isFile() && file.getName().equals(filetosearch)) {
                            System.out.println("file name is"+file.getAbsolutePath());
                        }
                    }}

             }
                 else
                 {
                    System.out.println("directory not found");
                 }
                        
         }


        } 

      
    

