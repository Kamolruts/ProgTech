
/**
 *
 * @author 6334302223
 */
public class NumericQuestion extends Question {
   
    public NumericQuestion(){
        super();
    }
    public NumericQuestion(String text){
        super(text);
    }
    
    //Override
    public boolean checkAnswer(String response){
        boolean isTrue = false;
        if (Math.abs((Double.parseDouble(response))-Double.parseDouble(getAnswer()))<=0.01){
            isTrue = true;            
        }
        return isTrue;
    }
    
}
