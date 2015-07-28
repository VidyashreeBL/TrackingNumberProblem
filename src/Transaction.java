package trackingnumberproblem;

import trackingnumberproblem.Range;

public class Transaction
{
    protected Range range;
    protected char statusCode;
    protected char transferCode;
    protected boolean isDeleted;
    protected String transactionHeader;
    
    public Transaction(Range r, char s, char t){
        range = r;
        statusCode = s;
        transferCode = t;
        isDeleted = false;
    }
            
}

       
