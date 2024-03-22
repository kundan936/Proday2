package Parametters;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;
public class Retry implements IRetryAnalyzer{

		 int count = 0;
	      int maxTry = 3;
		@Test
	    public boolean retry(ITestResult result) {
	        if (!result.isSuccess()) {                      
	            if (count < maxTry) {                           
	                count++;                                     
	                result.setStatus(ITestResult.FAILURE);  
	                return true;                                 
	            } else {
	                result.setStatus(ITestResult.FAILURE);  
	            }
	        } else {
	            result.setStatus(ITestResult.SUCCESS);      
	        }
	        return false;
	    }
}
