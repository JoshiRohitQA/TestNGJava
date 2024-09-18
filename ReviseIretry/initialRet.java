package ReviseIretry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class initialRet implements IRetryAnalyzer{

	int current_Count=0;
	int retry_count=2;
	public boolean retry(ITestResult result) {
		if(current_Count<retry_count) {
			current_Count++;
			return true;
		}
		return false;
	}

}
