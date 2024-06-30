import java.io.File;
import java.util.Scanner;
public class FileSearch {
    public static void main(String[] args) {
        // Define the directory to search and the file name to search for
        File directory = new File("exampleDirectory");
        String fileNameToSearch = "targetFile.txt";

        // List all subdirectories and files, and search for the specific file
        listFilesAndSearch(directory, fileNameToSearch);
    }

    public static void listFilesAndSearch(File dir, String fileNameToSearch) {
        // Check if the directory exists and is indeed a directory
        if (dir.exists() && dir.isDirectory()) {
            // Get the list of all files and directories in the given directory
            File[] files = dir.listFiles();
            
            if (files != null) { // Check if the directory is not empty
                for (File file : files) {
                    // Print the file or directory name
                    System.out.println(file.getName());

                    // Check if the current file is a directory
                    if (file.isDirectory()) {
                        // If it's a directory, recursively list its contents
                        listFilesAndSearch(file, fileNameToSearch);
                    } else if (file.isFile() && file.getName().equals(fileNameToSearch)) {
                        // If it's a file and matches the search name, print a message
                        System.out.println("File found: " + file.getAbsolutePath());
                    }
                }
            }
        } else {
            // Print a message if the directory does not exist or is not a directory
            System.out.println("The provided directory does not exist or is not a directory.");
        }
    }
}
