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
public class ContentTest extends TestCase {
    
    public ContentTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ContentTest.class);
        return suite;
    }

    /**
     * Test of getType method, of class Content.
     */
    public void testGetType() {
        System.out.println("getType");
        Content instance = null;
        int expResult = 0;
        int result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setType method, of class Content.
     */
    public void testSetType() {
        System.out.println("setType");
        int type = 0;
        Content instance = null;
        instance.setType(type);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValue method, of class Content.
     */
    public void testGetValue() {
        System.out.println("getValue");
        Content instance = null;
        String expResult = "";
        String result = instance.getValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValue method, of class Content.
     */
    public void testSetValue() {
        System.out.println("setValue");
        String value = "";
        Content instance = null;
        instance.setValue(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
