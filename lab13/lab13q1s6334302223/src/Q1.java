import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author HP
 */
public class Q1 {
    public static void main(String[] args) throws IOException{        
        
        
        Scanner keyboard = new Scanner(System.in);
        String txt = keyboard.nextLine();
        
        FileWriter fwriter = new FileWriter("conver.txt");
        PrintWriter outputFile = new PrintWriter(fwriter);
        
        int cntCHAR = 0;
        int cntWORD = 0;
        int cntLINE = 0;
        
        while(!txt.equals("quit")){
            cntCHAR += txt.length();
            
            String[] data = txt.split(" ");
            cntWORD += data.length;
            
            String[] line = txt.split("\n");
            cntLINE += line.length;
            
            
            outputFile.println(txt);
            txt = keyboard.nextLine();
        }
        
        System.out.println("Total characters : " + cntCHAR);
        System.out.println("Total words : " + cntWORD);
        System.out.println("Total lines : " + cntLINE);
        
        
    
        outputFile.close();
        
       
    }
    
}
