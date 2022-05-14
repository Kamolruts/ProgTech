
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author 6334302223
 */
public class DirectorySize {

    public static void main(String[] args) {
        // Prompt the user to enter a directory or a file
        System.out.print("Enter a directory or a file: ");
        Scanner input = new Scanner(System.in);
        String directory = input.nextLine();

        // Display the size
        System.out.println(getSize(new File(directory)) + " bytes");

    }

    private static long getSize(File root) {
        long sum = 0;
        if (root.isDirectory()) {
            File[] file = root.listFiles();

            for (int i = 0; i < file.length; i++) {
                if (file[i].isFile()) {
                    sum += file[i].length();
                } else 
                    sum += getSize(file[i]);
            }
            
        }else if (root.isFile()){
            sum +=root.length();
          
    }
        
                return sum;
              
    }

}
