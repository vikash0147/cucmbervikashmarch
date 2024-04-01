package runner;

import java.util.Collections;

import org.testng.TestNG;
import org.testng.xml.XmlSuite;

public class TestNGRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestNG testNG = new TestNG();
        XmlSuite suite = new XmlSuite();
        suite.setSuiteFiles(Collections.singletonList("testng.xml"));
        testNG.setXmlSuites(Collections.singletonList(suite));
        testNG.run();

	}

}
