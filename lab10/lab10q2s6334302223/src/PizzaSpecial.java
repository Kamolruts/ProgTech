
/**
 *
 * @author 6334302223
 */
public class PizzaSpecial extends Pizza {
    
    private String special;
    
    public PizzaSpecial(String name, double price, String special){
        super(name,price);
        this.special = special;        
    }
    public String getSpecial(){
        return this.special;
    }
    public String toString(){
        return super.toString() + " special : " + this.special;
    }
}
