
import java.util.ArrayList;

/**
 *
 * @author 6334302223
 */
public class ChoiceQuestion extends Question {

    private ArrayList<String> choices;

    public ChoiceQuestion() {
        super();
        choices = new ArrayList<String>();
        this.choices = choices;
    }

    public ChoiceQuestion(String text) {
        super(text);
        choices = new ArrayList<String>();
        this.choices = choices;
    }

    public void addChoice(String choice, boolean correct) {
        choices.add(choice);
            if (Boolean.TRUE.equals(correct)) {          
                int size = choices.size();
                setAnswer(String.valueOf(size));
        
        }
    }

    @Override
    public void display() {
        super.display();
        for (int i = 0; i < 4; i++) {
            System.out.println((i+1)+": "+choices.get(i));
        }                
    }

    @Override
    public boolean checkAnswer(String response) {
        super.checkAnswer(response);
        boolean isTrue = false;
        if (response.equals(getAnswer())) {
            isTrue = true;
        }
        return isTrue;
    }

}
