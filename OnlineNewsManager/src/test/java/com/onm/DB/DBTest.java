/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onm.DB;

import com.onm.models.News;
import java.sql.ResultSet;
import java.util.List;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author ctharinda_ce
 */
public class DBTest extends TestCase {
    
    public DBTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(DBTest.class);
        return suite;
    }

    /**
     * Test of getDBResult method, of class DB.
     */
    public void testGetDBResult() throws Exception {
        System.out.println("getDBResult");
        String sql = "";
        ResultSet expResult = null;
        ResultSet result = DB.getDBResult(sql);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verifyLogin method, of class DB.
     */
    public void testVerifyLogin() throws Exception {
        System.out.println("verifyLogin");
        String user = "";
        String pass = "";
        boolean expResult = false;
        boolean result = DB.verifyLogin(user, pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHeadlines method, of class DB.
     */
    public void testGetHeadlines() {
        System.out.println("getHeadlines");
        List expResult = null;
        List result = DB.getHeadlines();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNews method, of class DB.
     */
    public void testGetNews() {
        System.out.println("getNews");
        int id = 0;
        News expResult = null;
        News result = DB.getNews(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
