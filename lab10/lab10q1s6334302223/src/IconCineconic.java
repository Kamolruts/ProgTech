
import java.util.ArrayList;

/**
 *
 * @author 6334302223
 */
public class IconCineconic {
    public static void main(String[] args) {
        Cinema c1=new Cinema("Cinema", 250);
        Cinema c2=new Cinema("IMAX", 350);
        Cinema c3=new Cinema("4DX", 450);
     
        ArrayList<MGenCard> cardAL = new ArrayList<>();
        
        cardAL.add(new MGenCard("Sasipa"));
        cardAL.add(new MGenFirstClass("Monnat"));
        cardAL.add(new MGenStudent("Mike"));
        
         System.out.println(cardAL.get(2).memberFee);
         
        
        System.out.println("Test run : Sasipa buys ticket(s) at cinema");
        cardAL.get(0).buyTicket(c1, 2);
        
        System.out.println("Test run : Sasipa buys ticket(s) at 4DX");
        cardAL.get(0).buyTicket(c3, 2);
        
        System.out.println("Test run : Monnat buys ticket(s) at IMAX");
        cardAL.get(1).buyTicket(c2, 2);
        
        System.out.println("Test run : Monnat buys ticket(s) at 4DX");
        cardAL.get(1).buyTicket(c3, 4);
        
        System.out.println("Test run : Mike buys ticket(s) at cinema");
        
        cardAL.get(2).buyTicket(c1, 2);
        
        System.out.println("Test run : Monnat gets 2 free tickets");
        
        MGenFirstClass m = (MGenFirstClass)cardAL.get(1);
        m.getFreeTicket(2);
        
        System.out.println("Test run : Call usePoint() of every object in the array list");
        
        for (int i = 0; i < cardAL.size(); i++) {
            cardAL.get(i).usePoint();
        }
    }
    
}
