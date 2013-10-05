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
public class CommentTest extends TestCase {
    
    public CommentTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(CommentTest.class);
        return suite;
    }

    /**
     * Test of getComment method, of class Comment.
     */
    public void testGetComment() {
        System.out.println("getComment");
        Comment instance = null;
        String expResult = "";
        String result = instance.getComment();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setComment method, of class Comment.
     */
    public void testSetComment() {
        System.out.println("setComment");
        String comment = "";
        Comment instance = null;
        instance.setComment(comment);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
