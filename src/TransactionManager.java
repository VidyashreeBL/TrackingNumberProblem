package trackingnumberproblem;
import java.util.ArrayList;
import trackingnumberproblem.Range;
import trackingnumberproblem.Transaction;

public class TransactionManager {
    ArrayList<Transaction> transactions = new ArrayList<Transaction>();
    
    public void addNewTransaction(Transaction t){
        
        if(transactions.size() == 0){
            transactions.add(t);
            return;
        }
        Transaction current;
        //transactions.add(t);
        for(int i = 0; i < transactions.size(); i++){
            current = transactions.get(i);
            if (t.range.classify(current.range) == Range.Relation.SAME){
                overwriteCodes(i, t);
                break;
            }
            else if (t.range.classify(current.range) == Range.Relation.SUPERSET){
                if (i == 0){
                    overwriteCodes(i, t);
                }
                mergeIsPossible();
            }
            else if (t.range.classify(current.range) == Range.Relation.SUBSET){
                
            }
            else if (t.range.classify(current.range) == Range.Relation.LESSOVERLAP){
                current.isDeleted = true;
                //Slpit and add 2 rows
                //Range r1 = new Range(t.range.hi+1, current.range.hi);
                
            }
            else if (t.range.classify(current.range) == Range.Relation.MOREOVERLAP){
                current.isDeleted = true;
                //Split and add 2 rows
            }
            //Nothing to do for MOREDISJOINT and LESSDISJOINT cases
            }
        }
    }
    
    public void displayTransactions(){
        for(Transaction t : transactions) {
            if( t.isDeleted == false) {
                String printString = "";
                printString += t.transactionHeader+"\n";
                printString += t.range.getLow()+" "+t.range.getHigh()+" "+(t.statusCode+"")+" "+(t.transferCode+"");
                System.out.println(printString);
            }
        }
        
    }
    
    private void overwriteCodes(int index, Transaction t){
        Transaction x = transactions.get(index);
        x.statusCode = t.statusCode;
        x.transferCode = t.transferCode;
    }
    
    private int findTillLessDisjoint(Range r){
        return 0;
    }
    
    private int findTillMoreDisjoint(Range r){
        return 0;
    }
    
    private void mergeIsPossible(){
        
    }
}
