
/**
 *
 * @author 6334302223
 */
public class Customer {
    
    private String name, tel;
    
    public Customer(String name, String tel){
        this.name = name;
        this.tel = tel;
    }
    public String getName(){
        return this.name;
    }
    public String getTel(){
        return this.tel;
    }
    public String toString(){
        return this.name + " tel : " +this.tel;
    }
}
