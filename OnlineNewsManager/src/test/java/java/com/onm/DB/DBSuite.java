/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package java.com.onm.DB;

import com.onm.DB.DBTest;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author ctharinda_ce
 */
public class DBSuite extends TestCase {
    
    public DBSuite(String testName) {
        super(testName);
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("DBSuite");
        suite.addTest(DBTest.suite());
        return suite;
    }
}
