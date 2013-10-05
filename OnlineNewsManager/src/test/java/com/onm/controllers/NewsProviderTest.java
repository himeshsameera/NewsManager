/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onm.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ctharinda_ce
 */
public class NewsProviderTest extends TestCase {
    
    public NewsProviderTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(NewsProviderTest.class);
        return suite;
    }

    /**
     * Test of showNews method, of class NewsProvider.
     */
    public void testShowNews() throws Exception {
        System.out.println("showNews");
        HttpServletRequest req = null;
        HttpServletResponse res = null;
        Model model = null;
        String nid = "";
        NewsProvider instance = new NewsProvider();
        ModelAndView expResult = null;
        ModelAndView result = instance.showNews(req, res, model, nid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showHeadlines method, of class NewsProvider.
     */
    public void testShowHeadlines() {
        System.out.println("showHeadlines");
        NewsProvider instance = new NewsProvider();
        ModelAndView expResult = null;
        ModelAndView result = instance.showHeadlines();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
