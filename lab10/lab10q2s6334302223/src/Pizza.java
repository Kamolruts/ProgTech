
/**
 *
 * @author 6334302223
 */
public class Pizza {

    private String name;
    private double price;

    public Pizza(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public String toString() {
        return this.name + " price : " + this.price;
    }

}
