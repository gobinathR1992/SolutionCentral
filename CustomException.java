package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import extentmanager.ExtentManager;

import MongoDB.TestStatus; 


public class CustomException extends RuntimeException {
	
	
	public  CustomException(String msg){
		automationLib.Driver.killCloseDriver();
		System.out.println(msg);
		
	}
	public  CustomException(String msg,ExtentReports reports,ExtentTest logger,TestStatus mongotest){
		System.out.println("Custom Exception");
		if(!(ExtentManager.getTeststatus().contains("Warning")))
		{
		logger.fail( "The Test Case failed due to "+msg);
		ExtentManager.setTeststatus("Fail");
		}
		else
			logger.warning(ExtentManager.getTeststatus());
		System.out.println(msg); 
}
	
	public  CustomException(String msg,ExtentReports reports,ExtentTest logger){
		System.out.println("Custom Exception");
		if(!(ExtentManager.getTeststatus().contains("Warning"))){
		logger.fail( "The Test Case failed due to "+msg);
		ExtentManager.setTeststatus("Fail");
		}
		
		else
			logger.warning(ExtentManager.getTeststatus());
		System.out.println(msg); 
}
	
	public  CustomException(String msg,boolean isServiceDown,ExtentReports reports,ExtentTest logger,TestStatus mongotest){
		if(isServiceDown){
			logger.warning("Service down/Data issue");
			ExtentManager.setTeststatus("Warning");
				}
		else{
			logger.fail("Test case failed");
			ExtentManager.setTeststatus("Fail");
			}
		System.out.println(msg);
		
	}
	
	public  CustomException(String msg,boolean isServiceDown,ExtentReports reports,ExtentTest logger){
		if(isServiceDown){
			logger.warning("Service down/Data issue");
			ExtentManager.setTeststatus("Warning");
			System.out.println();
			}
		else{
			logger.fail("Test case failed");
			ExtentManager.setTeststatus("Fail");
			}
		System.out.println(msg);
		
	}
}
