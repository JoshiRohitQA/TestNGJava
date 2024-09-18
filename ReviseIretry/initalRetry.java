package ReviseIretry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class initalRetry implements IRetryAnalyzer {

	int current_cont=0;
	int retry_count=2;
	public boolean retry(ITestResult result) {
		if(current_cont<retry_count) {
			current_cont++;
			return true;
		}
		return false;
	}
	

}
