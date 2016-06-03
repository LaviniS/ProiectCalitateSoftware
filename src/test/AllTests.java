package test;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(TestFactory.class);
		suite.addTestSuite(TestCarteCitita.class);
		suite.addTestSuite(TestCarteFactory.class);
		suite.addTestSuite(TestComposite.class);
		suite.addTestSuite(TestSetVarstaBibliotecar.class);
		suite.addTestSuite(TestSetNumeBibliotecar.class);
		suite.addTestSuite(TestSetVechimeMoneda.class);
		suite.addTestSuite(TestLungimeVedere.class);
		suite.addTestSuite(TestLatimeVedere.class);
		suite.addTestSuite(TestSetDenumireVedere.class);
		suite.addTestSuite(CitittoriTesting.class);
		suite.addTestSuite(TestObserver.class);
		suite.addTestSuite(TestConstructor.class);
		//$JUnit-END$
		return suite;
	}

}
