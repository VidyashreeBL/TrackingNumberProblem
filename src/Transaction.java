package trackingnumberproblem;

import trackingnumberproblem.Range;

public class Transaction
{
    private Range range;
    private char statusCode;
    private char transferCode;
    private boolean isDeleted;
    
    Transaction(Range r, char s, char t){
        range = r;
        statusCode = s;
        transferCode = t;
        isDeleted = false;
    }
}

       
