
import java.util.Scanner;

/**
 *
 * @author 6334302223
 */
public class FillInQuestion extends Question {
    public FillInQuestion() {
        super();       
    }
    public void constructQuestionAndAnswer(String questionText) {
        Scanner parser = new Scanner(questionText);
        parser.useDelimiter("_");
        String question = parser.next();
        String answer = parser.next();
        parser.close();
        
        question += " ";
        for (int i = 0; i < answer.length(); i++) {
            question += "_ ";
        }
        this.setText(question);
        this.setAnswer(answer);
    }
}
