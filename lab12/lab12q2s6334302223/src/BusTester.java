
import java.util.ArrayList;

/**
 *
 * @author 6334302223
 */
public class BusTester {

    public static void main(String[] args) {

        ArrayList<Object> arr = new ArrayList<>();

        Hybrid HB = new Hybrid(150, 1, Electric.HIGH_VOLTAGE, 45, 1200000);
        CNGBus CNG = new CNGBus(200, 2, 50, 1000000);

        arr.add(HB);
        arr.add(CNG);

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) instanceof Hybrid) {
                System.out.println(arr.get(i).toString());
            }
            if (arr.get(i) instanceof CNGBus) {
                System.out.println(arr.get(i).toString());
            }
        }
    }
}
