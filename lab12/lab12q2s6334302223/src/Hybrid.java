
/**
 *
 * @author 6334302223
 */
public class Hybrid extends Bus implements LiquidFuel, Electric {

    private double voltage;
    private double range;
    private int emissionTier;

    public Hybrid(double range,int emissionTier,double voltage, int capacity, double cost) {
        super(capacity, cost);
        this.range = range;
        this.emissionTier = emissionTier;
        if (voltage < LOW_VOLTAGE) {
            this.voltage = LOW_VOLTAGE;
            if (voltage > HIGH_VOLTAGE) {
                this.voltage = HIGH_VOLTAGE;
            }
        }
    }
    @Override
    public double getRange(){
        return this.range;
    }
    @Override
    public int getEmissionTier(){
        return this.emissionTier;
    }
    @Override
    public double getVoltage(){
        return this.voltage;
    }
    @Override
    public double getAccel(){
        return 4.0;
    }
    @Override
    public String toString(){
        String info = "ID: " + getID() + "\n" + "Emission Tier: " + this.emissionTier + "\n" + "Accel: " + getAccel();
        return info;
    }
    
}
