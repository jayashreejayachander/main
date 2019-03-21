package utils;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public abstract class Reporter {

	public static ExtentHtmlReporter html;
	public static ExtentReports extent;
	public static ExtentTest test, suiteTest;

	public void startReport() {
		html = new ExtentHtmlReporter("./reports/result.html");
		html.setAppendExisting(true);		
		extent = new ExtentReports();		
		extent.attachReporter(html);	
	}

	public ExtentTest startTestModule(String testCaseName, String testDescription) {
		suiteTest = extent.createTest(testCaseName, testDescription);
		return suiteTest;
	}

	public ExtentTest startTestCase(String testNodes) {
		test = 	suiteTest.createNode(testNodes);
		return test;
	}

	public abstract long takeSnap();

	public void logStep(String desc, String status, boolean bSnap)  {

		MediaEntityModelProvider img = null;
		if(bSnap && !status.equalsIgnoreCase("info")){

			long snapNumber = 100000L;
			snapNumber = takeSnap();
			try {
				img = MediaEntityBuilder.createScreenCaptureFromPath
						("./../reports/images/"+snapNumber+".jpg").build();
			} catch (IOException e) {				
			}
		}
		if(status.equalsIgnoreCase("pass")) {
			test.pass(desc, img);			
		}else if (status.equalsIgnoreCase("fail")) {
			test.fail(desc, img);
			throw new RuntimeException();
		}else if (status.equalsIgnoreCase("warning")) {
			test.warning(desc, img);
		}else if (status.equalsIgnoreCase("info")) {
			test.info(desc);
		}						
	}

	public void logStep(String desc, String status) {
		logStep(desc, status, true);
	}

	public void endReport() {
		extent.flush();
	}	

}