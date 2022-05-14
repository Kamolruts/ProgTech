
/**
 *
 * @author 6334302223
 */
public class TransactionRecord{
    
    private int accountNumber;
    private double amountOfTransaction;
    

    public TransactionRecord(int acctNo,double amountOfTransaction){
        this.accountNumber = acctNo;
        this.amountOfTransaction = amountOfTransaction;        
    }
    public int getaccountNumber() {
        return accountNumber;
    }
    public double getamountOfTransaction() {
        return amountOfTransaction;
    }
    public void setaccountNumber(int acctNo) {
        this.accountNumber = acctNo;
    }
    public void setamountOfTransaction(double amount) {
        this.amountOfTransaction = amount;
    }
    
}
