package baseTest;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {
	
	int count =0;
	int retrylimit = 2;
	

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(result.isSuccess()!= true) {
		if(count<retrylimit) {
			count ++;
			return true;
		}
		}
		return false;
	}

}
