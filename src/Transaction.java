package trackingnumberproblem;

import trackingnumberproblem.Range;

public class Transaction
{
    private Range range;
    private char statusCode;
    private char transferCode;
    private boolean isDeleted;
    
    Transaction(Range r, int s, int t){
        range = r;
        statusCode = s;
        transactionCode = t;
        isDeleted = false;
    }
}
       
