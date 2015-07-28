/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trackingnumberproblem;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author test
 */
public class TransactionManagerTest {
    
    public TransactionManagerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addNewTransaction method, of class TransactionManager.
     */
    @Test
    public void testAddNewTransaction() {
        System.out.println("addNewTransaction");
        Transaction t = new Transaction ( new Range(1,10),'A','1');
        TransactionManager instance = new TransactionManager();
        instance.addNewTransaction(t);
        Transaction expected = new Transaction ( new Range(1,10),'A','1'); 
        assertEquals(1, instance.transactions.size());
        for(Transaction i: instance.transactions)
        {
             assertEquals(expected.range.lo, i.range.lo);
             assertEquals(expected.range.hi, i.range.hi);
             assertEquals(expected.statusCode,i.statusCode);
             assertEquals(expected.transferCode,i.transferCode);
        }
        
    }
   
}
