package RetryMethods;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retryBase implements IRetryAnalyzer {
	
	int current_count=0;
	int count_retry=2;

	@Override
	public boolean retry(ITestResult result) {
		if(current_count<count_retry) {
			current_count++;
			return true;
		}
		return false;
	}
	
	

}
