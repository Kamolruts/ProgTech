
/**
 *
 * @author 6334302223
 */
public class GoldCustomer extends Customer {
    
    private double discount;
    
    public GoldCustomer(String name, String tel, int discount){
        super(name,tel);
        this.discount = discount;
    }
    public double getDiscount(){
        return this.discount/100;
    }
    public double getdiscount(){
        return this.discount;
    }
    
}
