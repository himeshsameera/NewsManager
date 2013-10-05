/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onm.models;

import java.util.List;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author ctharinda_ce
 */
public class NewsTest extends TestCase {
    
    public NewsTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(NewsTest.class);
        return suite;
    }

    /**
     * Test of getText method, of class News.
     */
    public void testGetText() {
        System.out.println("getText");
        News instance = null;
        String expResult = "";
        String result = instance.getText();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setText method, of class News.
     */
    public void testSetText() {
        System.out.println("setText");
        String text = "";
        News instance = null;
        instance.setText(text);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHeadline method, of class News.
     */
    public void testGetHeadline() {
        System.out.println("getHeadline");
        News instance = null;
        String expResult = "";
        String result = instance.getHeadline();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHeadline method, of class News.
     */
    public void testSetHeadline() {
        System.out.println("setHeadline");
        String headline = "";
        News instance = null;
        instance.setHeadline(headline);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImgPath method, of class News.
     */
    public void testGetImgPath() {
        System.out.println("getImgPath");
        News instance = null;
        String expResult = "";
        String result = instance.getImgPath();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImgPath method, of class News.
     */
    public void testSetImgPath() {
        System.out.println("setImgPath");
        String imgPath = "";
        News instance = null;
        instance.setImgPath(imgPath);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComments method, of class News.
     */
    public void testGetComments() {
        System.out.println("getComments");
        News instance = null;
        List expResult = null;
        List result = instance.getComments();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setComments method, of class News.
     */
    public void testSetComments() {
        System.out.println("setComments");
        List<Comment> comments = null;
        News instance = null;
        instance.setComments(comments);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContents method, of class News.
     */
    public void testGetContents() {
        System.out.println("getContents");
        News instance = null;
        List expResult = null;
        List result = instance.getContents();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContents method, of class News.
     */
    public void testSetContents() {
        System.out.println("setContents");
        List<Content> contents = null;
        News instance = null;
        instance.setContents(contents);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
