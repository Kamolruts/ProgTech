
/**
 *
 * @author 6334302223
 */
public class Sentence {

    private String s;

    public Sentence(String s) {
        this.s = s;
    }

    public boolean find(String sth) {
        return find(sth, 0, sth.length());
    }

    private boolean find(String sth, int low, int high) {
        boolean b = false;
        if (high <= s.length()) {
            if (sth.equals(s.substring(low, high))) { //Base case
                return b = true;
            } else if (!sth.equals(s.substring(low, high))) { //Recursive call
                return find(sth, low + 1, high + 1);
            }
        }
        return b;

    }

}
