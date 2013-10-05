/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package java.com.onm.controllers;

import com.onm.controllers.LoginCntrollerTest;
import com.onm.controllers.NewsProviderTest;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author ctharinda_ce
 */
public class ControllersSuite extends TestCase {
    
    public ControllersSuite(String testName) {
        super(testName);
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("ControllersSuite");
        suite.addTest(LoginCntrollerTest.suite());
        suite.addTest(NewsProviderTest.suite());
        return suite;
    }
}
