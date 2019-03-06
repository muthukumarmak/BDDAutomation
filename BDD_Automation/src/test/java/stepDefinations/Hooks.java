package stepDefinations;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.Before;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Hooks
{
    AndroidDriver<AndroidElement> Android_driver;
    AndroidDriver<AndroidElement> Android_driver1;
    public IOSDriver<IOSElement> iOS_driver;
    String destDir;
    DateFormat dateFormat;
    //@Before
    public String Android() throws MalformedURLException
     {
        File file= new File ("/Users/Muthukumar/Documents/Automation_New/Loreal/src/test/java/stepDefinations/CorporateToken.apk");
        DesiredCapabilities cap =new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Moto G4 Plus");
        cap.setCapability(MobileCapabilityType.APP, file.getAbsolutePath());
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7");
        cap.setCapability(MobileCapabilityType.FULL_RESET, "false");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
        cap.setCapability("appActivity", "com.yml.frbsofttoken.ui.splash.SplashActivity");
        Android_driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
        Android_driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.quit();
        return "pass";
     }
    
    public AndroidDriver<AndroidElement> AndroidgetDriver()
     {
        return Android_driver;
     }

    public String iPhone() throws MalformedURLException {

    	 DesiredCapabilities  capability = new DesiredCapabilities();
    	 capability.setCapability(MobileCapabilityType.DEVICE_NAME, "YIP_49");
    	 capability.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
    	 capability.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.4.1");
    	 capability.setCapability(MobileCapabilityType.APP, "/Users/Muthukumar/Documents/Automation_New/Loreal/src/test/java/stepDefinations/FRBSoftToken.ipa");
    	 capability.setCapability(MobileCapabilityType.NO_RESET, true);
    	 capability.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
    	 capability.setCapability("useNewWDA", false);
    	 capability.setCapability("updatedWDABundleId", "com.ymedialabs.enterprise.softtoken");
    	 capability.setCapability(MobileCapabilityType.UDID, "1f27e87d8dfd1b4f357ef0d9d54c0dc217017895");
    	 //URL url = new URL("http://0.0.0.0:4723/wd/hub");
    	 iOS_driver = new IOSDriver<IOSElement>(new URL ("http://0.0.0.0:4723/wd/hub"),capability);
    	 //iOS_driver.toString();   	
    	 String sessionId = iOS_driver.getSessionId().toString();
    	 return "iOS_driver";
    	}

    	public IOSDriver<IOSElement> iOSgetDriver()
    	{
    	    return iOS_driver;
    	}
    	
    public void CalculatorApp() throws MalformedURLException
    	 {
    	        DesiredCapabilities capabilities = DesiredCapabilities.android();
    	        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
    	        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
    	        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "YIP_49");
    	        capabilities.setCapability("APP_PACKAGE", "calculatorAppPackageName");
    	        capabilities.setCapability("appActivity", "calculatorAppActivityName");
    	        Android_driver1 = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
    	        Android_driver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    	 }	
    
    public AndroidDriver<AndroidElement> AndroidgetDriver1()
    {
       return Android_driver1;
    }
    /*	
     public void takeScreenShot() 
       {
    	  // Set folder name to store screenshots.
    	  destDir = "screenshots";
    	  // Capture screenshot.
    	  File scrFile = ((TakesScreenshot) Android_driver).getScreenshotAs(OutputType.FILE);
    	  // Set date format to set It as screenshot file name.
    	  dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
    	  // Create folder under project with name "screenshots" provided to destDir.
    	  new File(destDir).mkdirs();
    	  // Set file name using current date time.
    	  String destFile = dateFormat.format(new Date(0)) + ".png";
    	  try {
    		   // Copy paste file at destination folder location
    		   FileUtils.copyFile(scrFile, new File(destDir + "/" + destFile));
    		  } catch (IOException e) {
    		   e.printStackTrace();
    		  }
    	}
    */

}