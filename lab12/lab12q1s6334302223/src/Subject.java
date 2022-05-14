
/**
 *
 * @author 6334302223
 */
class Subject implements Evaluation {

    private String subjName;
    private int[] score;

    public Subject(String subjName, int[] score) {
        this.subjName = subjName;
        this.score = score;
    }

    @Override
    public double evaluate() {
        double sumScore = 0;
        double cnt = 0;
        for (int i = 0; i < score.length; i++) {
            cnt++;
            sumScore += score[i];
        }
        double avgScore = sumScore / cnt;
        return avgScore;
    }

    @Override
    public char grade(double avgScore) {
        if (avgScore >= 70) {
            return 'P';
        } else {
            return 'F';
        }
    }

    @Override
    public String toString() {
        return subjName;

    }

}
