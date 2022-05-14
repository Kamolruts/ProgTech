
/**
 *
 * @author 6334302223
 */
public class CNGBus extends Bus implements LiquidFuel {
    
    private double range;
    private int emissionTier;
    
    public CNGBus(double range,int emissionTier,int capacity,double cost){
        super(capacity,cost);
        this.emissionTier = emissionTier;
        this.range = range;    
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
    public double getAccel(){
        return 3.0;
    }
    @Override
    public String toString(){
        String info = "ID: " + getID() + "\n" + "Emission Tier: " + this.emissionTier + "\n" + "Accel: " + getAccel();
        return info;
    }
    
}
