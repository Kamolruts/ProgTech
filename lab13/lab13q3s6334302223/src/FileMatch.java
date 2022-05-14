
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 6334302223
 */
public class FileMatch {

    public static void main(String[] args) {

        File file1 = new File("master.txt");
        File file2 = new File("trans.txt");


        try ( Scanner inFilemaster = new Scanner(file1);  
                Scanner inFiletrans = new Scanner(file2);
                RandomAccessFile inFilenewMaster = new RandomAccessFile("newMaster.dat","rw");
                ) {

            ArrayList<AccountRecord> AcctRec = new ArrayList<>();
            ArrayList<TransactionRecord> TranRec = new ArrayList<>();
           

            while (inFilemaster.hasNextLine()) {
                
                int acctno = inFilemaster.nextInt();
                String name = inFilemaster.next() + inFilemaster.next();
                double balance = inFilemaster.nextDouble();

                
                AcctRec.add(new AccountRecord(acctno,name,balance));

            }

            while (inFiletrans.hasNextLine()) {
                
                int acctno = inFiletrans.nextInt();
                double amountOfTransaction = inFiletrans.nextDouble();
                
               
                TranRec.add(new TransactionRecord(acctno,amountOfTransaction));
            }
          

            for(AccountRecord a: AcctRec){
                for(TransactionRecord t: TranRec){
                    if(a.getAcctNo()==t.getaccountNumber()){
                        a.combine(t);
                    }
                }
            }
            
                    
                    
            for(AccountRecord a : AcctRec){
                String txt = a.getName();
                inFilenewMaster.writeInt(a.getAcctNo());
                while(txt.length()<30){
                    txt+=" ";
                }
                inFilenewMaster.writeChars(txt);
                inFilenewMaster.writeDouble(a.getBalance());
                inFilenewMaster.writeInt(a.getTransCnt());
            }
            
            long totalAcct = (inFilenewMaster.length())/76;
            double totalBalance = 0;
            int totalTrans = 0;
            
            for(int i = 0; i<totalAcct;i++){
                inFilenewMaster.seek(64+(76*i));
                totalBalance+=inFilenewMaster.readDouble();
                
                inFilenewMaster.seek(72+(76*i));
                
                if(inFilenewMaster.readInt()==0){
                    totalTrans+=1;
                }
            }
            
            System.out.println("Total Account Record : " + totalAcct);
            System.out.println("Total balance : " + totalBalance);
            System.out.println("No transaction : " + totalTrans + " account.");
            
            
            

        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
