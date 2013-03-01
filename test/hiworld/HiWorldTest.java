/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hiworld;

import hiworld.HiWorld;
import hiworld.HiWorld;
import hiworld.Static;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sarah de Voss
 */
public class HiWorldTest {
    
    public HiWorldTest() {
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
     * Test of main method, of class HiWorld.
     */
    @Test
    public static void testMain() {
        System.out.println("main");
        String[] args = null;
        HiWorld.main(args);
        HiWorld hi= new HiWorld();
        // TODO review the generated test code and remove the default call to fail.
        Static ourNewClass = new Static();
        String output = ourNewClass.HelloString("Sarah and Elvis");
        assertEquals("Hello Sarah and Elvis", output);
    }
}
