
/**
 *
 * @author 6334302223
 */
public class Car {

    private double gas;
    private double efficiency;

    public Car(double gas, double efficiency) {
        this.gas = gas;
        this.efficiency = efficiency;
    }

    public void drive(double distance) {
        double GastoGo = (distance) / (efficiency);
        if (GastoGo > gas) {
            System.out.println("You cannot drive too far, please add gas");
        } else {
            gas = gas - GastoGo;
        }
    }

    public void setGas(double amount) {
        this.gas = gas;
    }

    public double getGas() {
        return gas;
    }

    public double getEfficiency() {
        return efficiency;
    }

    public void addGas(double amount) {
        gas += amount;
    }
}


