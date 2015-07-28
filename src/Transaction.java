package trackingnumberproblem;

import trackingnumberproblem.Range;

public class Transaction
{
    private Range range;
    private char statusCode;
    private char transferCode;
    private boolean isDeleted;
    private String transactionHeader;
    
    public Transaction(Range r, char s, char t){
        range = r;
        statusCode = s;
        transferCode = t;
        isDeleted = false;
    }
    public String getTransactionHeader() {
        return transactionHeader;
    }
    
    public char getTransferCode() {
        return transferCode;
    }
    
     public char getStatusCode() {
        return statusCode;
    }
     
     public boolean getisDeleted() {
        return isDeleted;
    } 
    
     public Range getRange() {
         return range;
     }
             
    
            
}

       
