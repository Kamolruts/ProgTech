
import java.util.ArrayList;

/**
 *
 * @author 6334302223
 */
public class Order {

    public static int cntOrder = 0;
    private int id;
    private Customer c;
    private ArrayList<Pizza> p;

    public Order(Customer c) {
        p = new ArrayList<Pizza>();
        this.c = c;
        this.id = id;
        this.p = p;
    }

    public void addPizza(Pizza a) {
        p.add(a);
    }

    public double getTotalPrice() {
        double TotalPrice = p.get(0).getPrice() + p.get(1).getPrice();
        return TotalPrice;
    }

    public String getOrderDetail() {
        cntOrder++;
        String numOrder = null;
        if (c.getClass().getSimpleName().equals("Customer")) {
            numOrder = "Order id : " + cntOrder + "\n" + c.toString() + "\n";
        } else {
            GoldCustomer GC = (GoldCustomer) c;
            GC.getdiscount();

            numOrder = "Order id : " + cntOrder + "\n" + c.toString() + " discount : " + GC.getdiscount() + "\n";
        }
        for (int i = 0; i < p.size(); i++) {
            
                numOrder += p.get(i).toString() + "\n";
     
        }
        numOrder += "Total pieces : " + p.size() + "\n" + "Total cost : " + calculatePayment();
        return numOrder;
    }

    public double calculatePayment() {
        double TotalPrice = 0.0;
        for (int i = 0; i < p.size(); i++) {
            if (c.getClass().getSimpleName().equals("Customer")) {
                TotalPrice += p.get(i).getPrice();
            } else {
                GoldCustomer GC = (GoldCustomer) c;
                GC.getDiscount();

                TotalPrice += (p.get(i).getPrice()) - (p.get(i).getPrice()) * GC.getDiscount();
            }
        }
        return TotalPrice;
    }

}
