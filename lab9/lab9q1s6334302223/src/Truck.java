
/**
 *
 * @author 6334302223
 */
public class Truck extends Car {

    private double M_weight, weight;

    public Truck(double gas, double efficiency, double M_weight, double weight) {
        super(gas, efficiency);
        if (weight > M_weight) {
            M_weight = weight;
            this.M_weight = M_weight;
            this.weight = weight;
        } else {
            this.M_weight = M_weight;
            this.weight = weight;
        }
    }

    @Override
    public void drive(double distance) {
        if (this.weight < 1) {
            if ((distance / getEfficiency()) > super.getGas()) {
                System.out.println("You cannot drive too far, please add gas");
            } else if ((distance / getEfficiency()) < super.getGas()) {
                super.getGas();
            }
        } else if (this.weight >= 1 && this.weight <= 10) {
            if ((distance / getEfficiency()) * 1.1 > super.getGas()) {
                System.out.println("You cannot drive too far, please add gas");
            } else if ((distance / getEfficiency()) * 1.1 < super.getGas()) {
                super.addGas(-(distance / getEfficiency()) * 1.1);
            }
            super.getGas();
        } else if (this.weight >= 10 && this.weight <= 20) {
            if ((distance / getEfficiency()) * 1.2 > super.getGas()) {
                System.out.println("You cannot drive too far, please add gas");
            } else if ((distance / getEfficiency()) * 1.2 < super.getGas()) {
                super.addGas(-(distance / getEfficiency()) * 1.2);
            }
            super.getGas();
        } else {
            if ((distance / getEfficiency()) * 1.3 > super.getGas()) {
                System.out.println("You cannot drive too far, please add gas");
            } else if ((distance / getEfficiency()) * 1.3 < super.getGas()) {
                super.addGas(-(distance / getEfficiency()) * 1.3);
            }
            super.getGas();
        }
    }

}
