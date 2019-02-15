import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
//import Login_Screen.LoginWithSingleUser;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Home_Base {

    public AppiumDriver<MobileElement> driver;

@Test
    public void Nexus6Pcapability() throws MalformedURLException, Exception {

        File app = new File("D:\\mycastle\\app-debug (4).apk");
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platformName", "Android");
        cap.setCapability("deviceName", "Pixel");
        cap.setCapability("unicodeKeyboard", true);
        cap.setCapability("resetKeyboard", false);
        cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

        cap.setCapability("appPackage", "com.developeronrent.mycastle");
        cap.setCapability("appActivity", "com.developeronrent.mycastle.activity.LoginActivity");
        driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);

//        LoginWithSingleUser login=new LoginWithSingleUser(driver);
//
//        LoginwithMultiUsers login=new LoginwithMultiUsers();


    }
@Test
        public void SingleUserLoginAndLogoutFuc()
        {
            try
            {
                System.out.println("Login and logout with valide single ueser");
                MobileElement PhoneOrGmail = driver.findElementById("com.developeronrent.mycastle:id/logineid");
                PhoneOrGmail.sendKeys("itishree.mjjbyte@gmail.com");

                MobileElement Pwd = driver.findElementById("com.developeronrent.mycastle:id/loginpwd");
                Pwd.sendKeys("secret");

                MobileElement passwordtogglebutton=driver.findElementById("com.developeronrent.mycastle:id/text_input_password_toggle");
                passwordtogglebutton.click();
                passwordtogglebutton.click();

                MobileElement loginBtn = driver.findElementById("com.developeronrent.mycastle:id/loginbtn");
                loginBtn.click();

                MobileElement mobilenumber=driver.findElementById("com.developeronrent.mycastle:id/mobno");
                mobilenumber.sendKeys("9553271403");

                MobileElement otpbutton=driver.findElementById("com.developeronrent.mycastle:id/otpreqtxt");
                otpbutton.click();


//            MobileElement logoutmenu = driver.findElementById("com.thestarinme.app.android.thestarinme:id/menuIcon");
//            logoutmenu.click();


                // scroll up for Logout option
//            int ScrolUpStartX1 = 180;
//            int ScrollUpStartY1  = 1431;
//            int ScrollUpEndX1 = 847;
//            int ScrollUpEndY1 = 0;
//
//            TouchAction ScrollUpToLogOutBtn = new TouchAction((MobileDriver)driver).longPress(PointOption.point(ScrolUpStartX1,ScrollUpStartY1)).moveTo(PointOption.point(ScrollUpEndX1,ScrollUpEndY1)).release();
//            ScrollUpToLogOutBtn.perform();
//
//            MobileElement LogoutXpathElement = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.support.v7.widget.RecyclerView/android.view.ViewGroup[7]/android.widget.TextView");
//            LogoutXpathElement.click();
//            System.out.println("Logout completed");

            }
            catch (Exception e)
            {
                e.printStackTrace();
            }

        }
//public  void Otp(){
//
//    driver.startActivity(new Activity("com.example", "ActivityName"));
//
//
//
//}


    }
