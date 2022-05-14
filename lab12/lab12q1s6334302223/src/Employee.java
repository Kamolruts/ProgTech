
/**
 *
 * @author 6334302223
 */
public class Employee {
    private String name;
    private int salary;
    
    public Employee(String name , int salary){
        this.name = name;
        this.salary = salary;
    }
    
    public void setSalary(int salary){
        this.salary = salary;
    }
    @Override
    public String toString(){
        return this.name +"\n"+"salary = "+ this.salary;
    }
    
}
