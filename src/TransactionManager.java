import java.util.ArrayList;

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
                overwrite(i, t);
               //break;
            }
            else if (t.range.classify(current.range) == Range.Relation.SUPERSET){
                if (i == 0){
                    overwrite(i, t);
                }
                else{
                    current.isDeleted = true;
                }
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
            else if (t.range.classify(current.range) == Range.Relation.MOREDISJOINT){
                int index = findTillLessDisjoint(t.range);
                //insert at index
            }
            else if (t.range.classify(current.range) == Range.Relation.LESSDISJOINT){
             int index = findTillMoreDisjoint(t.range);
                //insert at index
            }
        }
    }
    
    public void displayTransactions(){
        
    }
    
    private void overwrite(int index, Transaction t){
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
}
