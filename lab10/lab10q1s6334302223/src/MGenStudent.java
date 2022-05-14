
/**
 *
 * @author 6334302223
 */
public class MGenStudent extends MGenCard {
    
    public static int discount = 20;
    
    public MGenStudent(String name){
        super(name);
    }
    
    //Override
    public void buyTicket(Cinema C, int NumberofTickets){
        super.buyTicket(C, NumberofTickets);
        double StudentDiscount = (C.getTicketPrice()*NumberofTickets)*0.2;
        System.out.println("You got " + StudentDiscount + " discount");
        
    }
}
