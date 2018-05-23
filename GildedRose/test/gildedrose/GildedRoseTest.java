/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gildedrose;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SOIB1A07
 */
public class GildedRoseTest {
    
    

   
    @Test
    public void testUpdate_Quality() {
        System.out.println("update_Quality");
        AgedBrie instance = new AgedBrie("Aged brie",2,0);
        instance.update_Quality();
        assertEquals(1, instance.getQuality());
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        AgedBrie instance1 = new AgedBrie("Aged brie",-1,4);
        instance.update_Quality();
        assertEquals(6, instance.getQuality());
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        BackStage instance2 = new BackStage("BackStage",15,20);
        instance.update_Quality();
        assertEquals(21, instance.getQuality());
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        fail("The test case is a prototype.");
        BackStage instance3 = new BackStage("BackStage",15,50);
        instance.update_Quality();
        assertEquals(50, instance.getQuality());
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        fail("The test case is a prototype.");
        fail("The test case is a prototype.");
        BackStage instance4 = new BackStage("BackStage",0,50);
        instance.update_Quality();
        assertEquals(0, instance.getQuality());
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        fail("The test case is a prototype.");
        fail("The test case is a prototype.");
        Sulfuras instance5 = new Sulfuras("Sulfuras",0,50);
        instance.update_Quality();
        assertEquals(0, instance.getQuality());
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
    }

   
    
}
