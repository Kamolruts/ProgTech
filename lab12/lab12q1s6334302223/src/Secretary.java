
/**
 *
 * @author 6334302223
 */
class Secretary extends Employee implements Evaluation {
    
    private int typingSpeed;
    private int[] score;  
    
    public Secretary(String name , int salary,int[] score,int typingSpeed){
        super(name,salary);
        this.typingSpeed = typingSpeed;
        this.score = score;       
    }
    
    @Override
    public double evaluate() {
        double sumScore = 0;
        for(int i = 0; i<score.length;i++){
            sumScore += score[i];
        }
        return sumScore;
    }

    @Override
    public char grade(double sumScore) {
        if(sumScore>=90){
            setSalary(18000);
            return 'P';
        }else{
            return 'F';
        }
        
    }
    
    
}
