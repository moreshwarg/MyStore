package com.mystore.utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
//com.mystore.utilities.ExtentListnerClass
public class ExtentListnerClass implements ITestListener {
	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;

	public void configureReport() {
		ReadConfig readConfig = new ReadConfig();
		String timeStamp= new SimpleDateFormat("yyyy.mm.dd.hh.mm.ss").format(new Date());
		String reportName = "MyTestStoreReport" + timeStamp + ".html";
		htmlReporter= new ExtentSparkReporter(System.getProperty("user.dir") +"//Reports//" + reportName);
		reports= new ExtentReports();
		reports.attachReporter(htmlReporter);

		//Adding System information
		reports.setSystemInfo("Machine", "testpc1");
		reports.setSystemInfo("OS", "windows 10");
		reports.setSystemInfo("browser", readConfig.getBrowser() );
		reports.setSystemInfo("user name", "Moreshwar");

		//Configuration to change look and fill
		htmlReporter.config().setDocumentTitle("Extent Listner Report");
		htmlReporter.config().setReportName("Test Automation Report");
		htmlReporter.config().setTheme(Theme.STANDARD);

	}

	//On start method is called when any Test Start. 
	public void onStart(ITestContext Result) {
		configureReport();
		System.out.println("Start method Invoked...");
	}
	//On Finished method is called when any Test Finished
	public void onFinish(ITestContext Result) {
		System.out.println("Finish method Invoked...");
		reports.flush();//It is mandatory to call to flush method to ensure information is written to the started reporter
	}
	//When test case get failed this method is called
	public void onTestFailure(ITestResult Result) {
		System.out.println("Name of method failed : " + Result.getName());
		test= reports.createTest(Result.getName());// create entry in html report
		test.log(Status.FAIL, MarkupHelper.createLabel("Name of the Failed test case is :" + Result.getName(),ExtentColor.RED ));
		//failed test screenshot
		String screenShotPath=System.getProperty("user.dir") + "\\ScreenShot\\" +Result.getName() + ".png";
		File screenShotFile = new File(screenShotPath);
		if(screenShotFile.exists()) {
			test.fail("captured screenshot below :" + test.addScreenCaptureFromPath(screenShotPath));
		}
		//test.addScreenCaptureFromPath(null)

	}
	//When test case get skipped this method is called
	public void onTestSkipped(ITestResult Result) {
		System.out.println("Name of method skipped : " +Result.getName());
		test= reports.createTest(Result.getName());// create entry in html report
		test.log(Status.SKIP, MarkupHelper.createLabel("Name of the skipped test case is :" + Result.getName(),ExtentColor.YELLOW ));

	}
	//When test case get Started this method is called
	public void onTestStarted(ITestContext Result) {
		System.out.println("Name of method Started : " +Result.getName() );
	}
	//When test case get Passed this method is called
	public void onTestSuccess(ITestResult Result) {
		System.out.println("Name of method Successfully executed : " +Result.getName() );
		test= reports.createTest(Result.getName());// create entry in html report
		test.log(Status.PASS, MarkupHelper.createLabel("Name of the passed test case is :" + Result.getName(),ExtentColor.GREEN ));

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {

	}


}
