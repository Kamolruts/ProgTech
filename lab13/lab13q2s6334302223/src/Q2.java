
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author HP
 */
public class Q2 {

    public static void main(String[] args){
        try{
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = keyboard.nextLine();
        String[] data = sentence.split(" ");
        List data1 = Arrays.asList(data);
        
        String txt;
        Scanner inFile1 = new Scanner(new File("wordlist.txt"));

        ArrayList<String> str = new ArrayList<String>();

        while (inFile1.hasNext()) {
            txt = inFile1.next();
            str.add(txt);
        }

        ArrayList<String> Maimee = new ArrayList<String>();
        ArrayList<Boolean> check = new ArrayList<>();
        boolean isEquals = false;

        for (int j = 0; j < data1.size(); j++) {
            if (str.contains(data1.get(j))) {
                //System.out.println("Exist : " + data1.get(j));
                isEquals = true;
                check.add(isEquals);
            } else {
                //System.out.println("Not Exist : " + data1.get(j));
                isEquals = false;
                check.add(isEquals);
                Maimee.add((String) data1.get(j));
            }

        }
        Set<Boolean> set = new HashSet<>(check);
        check.clear();
        check.addAll(set);

        if(check.get(0).equals(true)){
            System.out.println("Words not contained: " + "\n" + "N/A");
        }else{
            System.out.println("Words not contained: ");
            for(int i = 0 ; i<Maimee.size() ; i++){
                 System.out.println(Maimee.get(i));
            }
        }
        inFile1.close();
        }catch(Exception e){
            System.out.println(e);
        }       
    }    
}


