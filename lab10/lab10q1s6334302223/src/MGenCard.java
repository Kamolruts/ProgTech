
/**
 *
 * @author 6334302223
 */
public class MGenCard {

    public static int memberFee = 150;  
    public static int cnt = 0;          
    private int number;                 
    private String name;                
    private int point;                  

    public MGenCard(String name) {
        cnt++;
        this.number = cnt;
        this.name = name;
    }

    public void usePoint() { 
        if (point >= 20) {
            System.out.println("You got a free Cinema ticket");
            point -= 20;
        } 
        else {
            System.out.println("You don't have enough points");
        }
        
        System.out.println(toString());
    }
    public void buyTicket(Cinema C, int NumberofTickets){
        int TotalPrice = C.getTicketPrice()*NumberofTickets;
        double NewPoint = TotalPrice/50;
        point += NewPoint;
        System.out.println(C.getName() + " Total amount : " + TotalPrice);
        System.out.println(toString());
    }
    
    public String toString(){
        return "iconcineconic." + getClass().getSimpleName() + "[number : " + this.number + ", name : " + this.name + ", point : " + this.point + "]";
    }

}
