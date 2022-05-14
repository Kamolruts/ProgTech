
import java.util.Scanner;


/**
 *
 * @author 6334302223
 */
public class Hanoi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter number of disks : ");
        int n = inp.nextInt();
        moveDisks(n, 'A', 'B', 'C');
    }

    private static void moveDisks(int n, char a, char b, char c){
 
    if(n==1){ //Base case
      System.out.println("Move 1 from "+a+" to "+c);
      return;
    }
 
    //Move top n-1 disks from A to B using C as middle
    moveDisks(n-1,a,c,b);
 
    //Move last disk from A to C
    System.out.println("Move "+n+" from "+a+" to "+c);
 
    //Move n-1 disks from B to C using A as middle
    moveDisks(n-1,b,a,c);
 
  }
    }
    

