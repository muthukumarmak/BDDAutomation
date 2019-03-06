package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;


public class stepDefination {
	Hooks ca = new Hooks();
    AndroidDriver<AndroidElement> Android_Driver;
    AndroidDriver<AndroidElement> Android_Driver1;
    IOSDriver<IOSElement> iOS_Driver;
    MobileDriver<MobileElement> driver3;

    //Android Methods:
    
        //Launch Android app:
        @Given("^I launch the app$")
        public void i_login_to_the_app() throws Throwable        
            {
              ca.Android();
              Android_Driver = ca.AndroidgetDriver();   
              //System.out.println("AppLaunched Successfully");
            }
        
        //Tap items using resource ID:
        @Then("^I tap on identifier \"([^\"]*)\"$")
        public void i_tap_on_identifier(String arg1) throws Throwable
            {
        	   //System.out.println("Going to Tap on Button");
        	   //TouchAction action = new TouchAction(driver);
        	   //driver.findElementById(arg1).click();
        	Android_Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        	Android_Driver.findElement(By.id(arg1)).click();   
            }
        
        //Clear the Placeholder Text  
        @Then("^I Clear the text in the identifier \"([^\"]*)\"$")
        public void i_clear_the__text_in_identifier(String arg1) throws Throwable
            {
        	   //System.out.println("Going to Clear the Text");
        	   TouchAction action = new TouchAction(Android_Driver);
        	   Android_Driver.findElementById(arg1).clear();
        	}
        
        //Tap items using Xpath:
        @Then("^I tap on identifier with xpath \"([^\"]*)\"$")
        public void i_tap_on_identifier_with_xpath(String arg1) throws Throwable
            {
        	   //System.out.println("Going to Tap on Button");
        	   //TouchAction action = new TouchAction(driver);
        	   //driver.findElementById(arg1).click();
        	Android_Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        	Android_Driver.findElement(By.xpath(arg1)).click();
            }
        
        //Enter values in Text fields with Resource ID:
        @Then("^I enter \\\"([^\\\"]*)\\\" in identifier \"([^\"]*)\"$")
        public void I_enter_values_into_textfield(String arg1, String arg2) throws Throwable
            {
    	       //System.out.println("Going to Enter Value into Text field");
    	       TouchAction action =new TouchAction(Android_Driver);
    	       Android_Driver.findElement(By.id(arg2)).sendKeys(arg1);
            }
       
        //Short Wait for page to Load
        @Then("^I Wait for Page to Load$")
        public void I_Wait_for_Page_to_Load() throws Throwable
            {
               //System.out.println("Wait is starting");
               Thread.sleep(5000);    
               //System.out.println("Wait is ending");                
            }
       
        //Long Wait for page to Load
        @Then("^I Wait for Page to Load for long time$")
        public void I_Wait_for_Page_to_Load_long_time() throws Throwable
            {
               Thread.sleep(20000);            
            }
        
        //Assert for the element by Resource ID:
        @Then("^I assert for the element \"([^\"]*)\"$")
        public void i_assert_for_the_element(String arg1) throws Throwable
            {
        	   //System.out.println("Going to Find the Element");
        	Android_Driver.findElement(By.id(arg1)).isDisplayed();
            }
        
     
        //Assert for the element by Xpath:
        @Then("^With xpath I assert for the element \"([^\"]*)\"$")
        public void i_with_xpath_i_assert_for_the_element(String arg1) throws Throwable
            {
        	   //System.out.println("Going to Find the Element");
        	Android_Driver.findElement(By.xpath(arg1)).isDisplayed();
            }
        
        //Tap on Allow button in System Permission Pop up
        @Then("^I tap on Allow button in System Permission Pop up$")
        public void I_tap_on_Allow_button_in_System_Permission_Pop_up() throws Throwable
            {
        	while (Android_Driver.findElements(MobileBy.xpath("//*[@class='android.widget.Button'][2]")).size()>0) 
        	 {  
        		//System.out.println("Going to tap on Allow button in System Permission Pop up");
        		Android_Driver.findElement(MobileBy.xpath("//*[@class='android.widget.Button'][2]")).click();
        	 }
            }
        
        //Tap on Cancel button in System Permission Pop up
        @Then("^I tap on Cancel button in System Permission Pop up$")
        public void I_tap_on_Cancel_button_in_System_Permission_Pop_up() throws Throwable
            {
        	while (Android_Driver.findElements(MobileBy.xpath("//*[@class='android.widget.Button'][1]")).size()>0) 
        	 {  
        		//System.out.println("Going to tap on Allow button in System Permission Pop up");
        		Android_Driver.findElement(MobileBy.xpath("//*[@class='android.widget.Button'][1]")).click();
        	 }
            }
       
        @Then("^I assert for the text \\\"([^\\\"]*)\\\" in identifier \"([^\"]*)\"$")
        public void I_assert_for_the_text(String arg1, String arg2) throws Throwable
            {
    	       System.out.println("Going to validate Texts contents");
    	       String text1 = Android_Driver.findElementById(arg2).getText();
    	       String text2 = arg1;
    	       Assert.assertEquals(text1, text2);
    	       System.out.println("Text is matched");
            }
        
        //Tap on Device back button
        @Then("^I Tap on Device back button$")
        public void I_Tap_on_device_back_button() throws Throwable
            {
               //System.out.println("Tapping on device back button");
        	Android_Driver.navigate().back();
            }
        
        
        @Then("^I tap on identifier with try \"([^\"]*)\"$")
        public void i_tap_on_identifier_with_try(String arg1) throws Throwable
            {
        	Android_Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        	   try
        	   {
        		   System.out.println("Going to Tap on Button in TRY");
        		   Android_Driver.findElement(By.id(arg1)).click();    
        	   }
        	   catch (Exception e)
        	   {
        		   System.out.println("Going to Tap on Button in CATCH");
        		   Android_Driver.findElement(By.id(arg1)).click(); 
        	   }
            }
       
        //Hide the Device Keypad
        @Then("^I Hide the Device Keypad$")
        public void I_Hide_the_Device_Keypad() throws Throwable
            {
               Thread.sleep(20000);            
               Android_Driver.hideKeyboard();
            }
        
        //Swipe the Screen
        @Then("^I swipe the screen$")
        public void i_swipe_the_screen() throws Throwable
        
        {
               TouchAction action =new TouchAction(Android_Driver);
               action.press(PointOption.point(797, 1355)).moveTo(PointOption.point(166, 1366));
               action.release().perform();
        }
        
        //tap on identifiers with class name        
        @Then("^I tap on identifiers with class name \"([^\"]*)\"$")
        public void with_class_name_i_tap_on_identifier(String arg1) throws Throwable
            {
        	   System.out.println("Going to Tap on Button");
        	   Thread.sleep(10000);
        	   List<AndroidElement> a = Android_Driver.findElements(By.className(arg1));
        	   //String arg = arg2;
        	   a.get(0).click();
        	   System.out.println("Taped on Button");
        	   Thread.sleep(5000);
        	   a.get(1).sendKeys("muthumak@gmail.com");
            }
        
        public static void main (String[] args) throws MalformedURLException
            {
               stepDefination s= new stepDefination();
            }
   
        //Long Tap items using resource ID:
        @Then("^I long tap on identifier \"([^\"]*)\"$")
        public void i_long_tap_on_identifier(String arg1) throws Throwable
            {
        	TouchAction action =new TouchAction(Android_Driver);
            action.press(PointOption.point(310, 430)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(5000)));
            action.release().perform();
            }
        
        @Then("^I Minimize the application$")
        public void i_minimize_the_app() throws Throwable {
            //((AndroidDriver)driver).closeApp();
            ((AndroidDriver)Android_Driver).runAppInBackground(Duration.ofSeconds(20));//put app in background for 10 seconds
            //((AndroidDriver)driver).launchApp();
            //((StartsActivity)driver).currentActivity();
            System.out.println("App closed successfully");
        }
        
      //Launch Calculator Android app:
        @Given("^I launch the Calculator app$")
        public void i_launch_calculator_the_app() throws Throwable        
            {
              ca.CalculatorApp();
              Android_Driver1 = ca.AndroidgetDriver1();   
              //System.out.println("AppLaunched Successfully");
            }
        
        
    // iPhone Methods:
        
        //Launch iphone app
        @Given("^I launch the iPhone app$")
        public void i_login_to_the_iphone_app() throws Throwable        
            {
              ca.iPhone();
              iOS_Driver = ca.iOSgetDriver();   
              if(iOS_Driver == null) {
            	   System.out.println("driver 2 is null after initializing");
              }
              System.out.println("iPhone AppLaunched Successfully @@");
             
            }
        
        //Tap items using resource ID:
        @Then("^I tap on Identifier \"([^\"]*)\"$")
        public void i_tap_on_Identifier(String arg1) throws Throwable
            {
        	   //System.out.println("Going to Tap on Button");
        	   TouchAction action = new TouchAction(iOS_Driver);
               //System.out.println("Before find element by id" + driver2.toString());
        	   iOS_Driver.findElementById(arg1).click();  	
               //driver2.findElementById(arg1).clear();
        	}
	
        //Clear the Placeholder Text  
        @Then("^I Clear the text in the Identifier \"([^\"]*)\"$")
        public void i_clear_the__text_in_Identifier(String arg1) throws Throwable
            {
        	   //System.out.println("Going to Clear the Text");
        	   TouchAction action = new TouchAction(iOS_Driver);
        	   iOS_Driver.findElementById(arg1).clear();
        	}

        //Tap items using Xpath:
        @Then("^I tap on identifier with Xpath \"([^\"]*)\"$")
        public void i_tap_on_identifier_with_Xpath(String arg1) throws Throwable
            {
        	   System.out.println("Going to Tap on Button");
        	   //TouchAction action = new TouchAction(driver);
        	   //driver.findElementById(arg1).click();
        	   iOS_Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        	   iOS_Driver.findElement(By.xpath(arg1)).click();
            }
        
        //Enter values in Text fields with Resource ID:
        @Then("^I enter \\\"([^\\\"]*)\\\" in Identifier \"([^\"]*)\"$")
        public void I_enter_values_into_Textfield(String arg1, String arg2) throws Throwable
            {
    	       System.out.println("Going to Enter Value into Text field");
    	       TouchAction action =new TouchAction(iOS_Driver);
    	       iOS_Driver.findElement(By.id(arg2)).sendKeys(arg1);
            }
        
        //Assert for the element by Resource ID:
        @Then("^I assert for the Element \"([^\"]*)\"$")
        public void i_assert_for_the_Element(String arg1) throws Throwable
            {
        	   System.out.println("Going to Find the Element");
        	   iOS_Driver.findElement(By.id(arg1)).isDisplayed();
            }
        
        //Assert for the element by Xpath:
        @Then("^With xpath I assert for the Element \"([^\"]*)\"$")
        public void i_with_xpath_i_assert_for_the_Element(String arg1) throws Throwable
            {
        	   //System.out.println("Going to Find the Element");
        	iOS_Driver.findElement(By.xpath(arg1)).isDisplayed();
            }
        
        //Swipe the Screen
        @Then("^I Swipe the screen$")
        public void i_Swipe_the_screen() throws Throwable
        {
               TouchAction action =new TouchAction(iOS_Driver);
               action.press(PointOption.point(292, 466)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).moveTo(PointOption.point(103, 469));
               action.release().perform();
        }
    	
        @Then("^I Tap on the screen with XY$")
        public void Tap_on_the_Screen() throws Throwable
        {
               TouchAction action =new TouchAction(iOS_Driver);
               action.tap(PointOption.point(132, 394)).perform();
               iOS_Driver.getKeyboard().sendKeys("5");     
        }
        
        //Long Tap items using resource ID:
        @Then("^I long tap on Identifier \"([^\"]*)\"$")
        public void i_long_tap_on_Identifier(String arg1) throws Throwable
            {
        	TouchAction action =new TouchAction(iOS_Driver);
            action.press(PointOption.point(310, 430)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(5000)));
            action.release().perform();
            }
}
