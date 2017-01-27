/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spprfull.gui;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Da-pro
 */
public class GuiTest {

    public GuiTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of main method, of class Gui.
     */
    @org.junit.Test
    public void testVisible() {
        System.out.println("____Visibility-TESTING____");
        Gui gui = new Gui();
        System.out.println("CheckBoxVisibility");
        assertTrue(gui.jCheckBox1.isVisible());
        assertTrue(gui.jCheckBox2.isVisible());
        assertTrue(gui.jCheckBox3.isVisible());
        assertTrue(gui.jCheckBox4.isVisible());
        System.out.println("ButtonVisibility");
        assertTrue(gui.jButton2.isVisible());
        System.out.println("PanelVisibility");
        assertTrue(gui.jPanel2.isVisible());
        System.out.println("TabbedPanelVisibility");
        assertTrue(gui.jTabbedPane6.isVisible());
    }

    @org.junit.Test(timeout = 2000)
    public void testSpeed() {
        System.out.println("____Speed-TESTING____");
        Gui gui = new Gui();
        gui.makeMessage("Coool", "Nice");
    }



    @Test
    public void expectedExceptionTest() {
        System.out.println("____expectedException-TESTING____");
        Gui gui = new Gui();
        gui.makeMessage("Cool", "Nice");
        assertEquals(gui.myMessage, "Nice");
    }

    @Test
    public void correctlyValues() {
        System.out.println("____correctlyValue-TESTING____");
        Gui gui = new Gui();
        gui.makeMessage("Cool", "Nice");
         
        assertNotSame(gui.myMessage, "Cool");
    }
}
