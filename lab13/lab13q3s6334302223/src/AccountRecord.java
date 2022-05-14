
/**
 *
 * @author 6334302223
 */
public class AccountRecord {

    private int acctNo;
    private String name;
    private double balance;
    private int transCnt = 0;

    public AccountRecord(int acctNo, String name, double balance) {
        this.acctNo = acctNo;
        this.name = name;
        this.balance = balance;
    }

    public int getAcctNo() {
        return acctNo;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public int getTransCnt() {
        return transCnt;
    }
    
    public void combine(TransactionRecord t){
        transCnt++;
        balance+=t.getamountOfTransaction();
    }
}
