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
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ctharinda_ce
 */
public class LoginCntrollerTest extends TestCase {
    
    public LoginCntrollerTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(LoginCntrollerTest.class);
        return suite;
    }

    /**
     * Test of authenticateUser method, of class LoginCntroller.
     */
    public void testAuthenticateUser() throws Exception {
        System.out.println("authenticateUser");
        HttpServletRequest req = null;
        HttpServletResponse res = null;
        LoginCntroller instance = new LoginCntroller();
        ModelAndView expResult = null;
        ModelAndView result = instance.authenticateUser(req, res);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
