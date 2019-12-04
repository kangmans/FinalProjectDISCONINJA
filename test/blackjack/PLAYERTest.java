/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class PLAYERTest {
    
    public PLAYERTest() {
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
     * Test of wantToHit method, of class PLAYER.
     */
    @Test
    public void testWantToHitGood() {
        System.out.println("wantToHit");
        PLAYER instance = new PLAYER();
        String input = "hit/stay";
        boolean expResult = true;
        boolean result = instance.wantToHit(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    /**
     * Test of wantToHit method, of class PLAYER.
     */
    @Test
    public void testWantToHitBad() {
        System.out.println("wantToHit");
        PLAYER instance = new PLAYER();
        String input = "1234567890";
        boolean expResult = false;
        boolean result = instance.wantToHit(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of wantToHit method, of class PLAYER.
     */
    @Test
    public void testWantToHitBoundary() {
        System.out.println("wantToHit");
        PLAYER instance = new PLAYER();
        String input = " ";
        boolean expResult = false;
        boolean result = instance.wantToHit(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of wantToHit method, of class PLAYER.
    
    @Test
    public void testWantToHit() {
        System.out.println("wantToHit");
        PLAYER instance = new PLAYER();
        boolean expResult = false;
        boolean result = instance.wantToHit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    *  */
}
