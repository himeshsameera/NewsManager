/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onm.models;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author ctharinda_ce
 */
public class HeadlineTest extends TestCase {
    
    public HeadlineTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(HeadlineTest.class);
        return suite;
    }

    /**
     * Test of getHeadline method, of class Headline.
     */
    public void testGetHeadline() {
        System.out.println("getHeadline");
        Headline instance = null;
        String expResult = "";
        String result = instance.getHeadline();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHeadline method, of class Headline.
     */
    public void testSetHeadline() {
        System.out.println("setHeadline");
        String headline = "";
        Headline instance = null;
        instance.setHeadline(headline);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getText method, of class Headline.
     */
    public void testGetText() {
        System.out.println("getText");
        Headline instance = null;
        String expResult = "";
        String result = instance.getText();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setText method, of class Headline.
     */
    public void testSetText() {
        System.out.println("setText");
        String text = "";
        Headline instance = null;
        instance.setText(text);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
