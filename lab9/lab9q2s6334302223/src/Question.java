
/**
 *
 * @author 6334302223
 */
public class Question {

    private String text, answer;

    public Question() {
        
    }
    public Question(String text) {
        this.text = text;      
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    public void setText(String text) {
        this.text = text;
    }
    public String getAnswer() {
        return answer;
    }
    public String getText() {
        return text;
    }
    public boolean checkAnswer(String response){
        boolean isTrue = false;
        if (response.equals(this.answer)){
            isTrue = true;
        }
        return isTrue;
    }
    public void display(){
        System.out.println(this.text);
    }
}
