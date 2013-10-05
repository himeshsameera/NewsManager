/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package java.com.onm.models;

import com.onm.models.CommentTest;
import com.onm.models.ContentTest;
import com.onm.models.HeadlineTest;
import com.onm.models.NewsTest;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author ctharinda_ce
 */
public class ModelsSuite extends TestCase {
    
    public ModelsSuite(String testName) {
        super(testName);
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("ModelsSuite");
        suite.addTest(CommentTest.suite());
        suite.addTest(NewsTest.suite());
        suite.addTest(HeadlineTest.suite());
        suite.addTest(ContentTest.suite());
        return suite;
    }
}
