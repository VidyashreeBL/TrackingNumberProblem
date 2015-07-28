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
public class RangeTest {
    
    public RangeTest() {
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
     * Test of contains method, of class Range.
     */
    @Test
    public void testContains_int() {
        System.out.println("contains");
        int x = 5;
        Range instance = new Range(4,10);
        boolean expResult = true;
        boolean result = instance.contains(x);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of contains method, of class Range.
     */
    @Test
    public void testContains_Range() {
        System.out.println("contains");
        Range r = new Range(3,6);
        Range instance = new Range(4,5);
        boolean expResult = false;
        boolean result = instance.contains(r);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of equals method, of class Range.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Range r = new Range(3,5);
        Range instance = new Range(3,5);
        boolean expResult = true;
        boolean result = instance.equals(r);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of isDisjoint method, of class Range.
     */
    @Test
    public void testIsDisjoint() {
        System.out.println("isDisjoint");
        Range r = new Range(5,15);
        Range instance = new Range(1,4);
        boolean expResult = true;
        boolean result = instance.isDisjoint(r);
        assertEquals(expResult, result);
    }

    /**
     * Test of isOverlapping method, of class Range.
     */
    @Test
    public void testIsOverlapping() {
        System.out.println("isOverlapping");
        Range r = new Range(2,12);
        Range instance = new Range(1,5);
        boolean expResult = true;
        boolean result = instance.isOverlapping(r);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of lessThan method, of class Range.
     */
    @Test
    public void testLessThan() {
        System.out.println("lessThan");
        Range r = new Range(5,12);
        Range instance = new Range(13,18);
        boolean expResult = false;
        boolean result = instance.lessThan(r);
        assertEquals(expResult, result);
    }

    /**
     * Test of classify method, of class Range.
     */
    @Test
    public void testClassify() {
        System.out.println("classify");
        Range r =new Range(1,10);
        Range instance = new Range(2,5);
        Range.Relation expResult = Range.Relation.SUPERSET ;
        Range.Relation result = r.classify(instance);
        assertEquals(expResult, result);
    }

    /**
     * Test of getHigh method, of class Range.
     */
    
    
}
