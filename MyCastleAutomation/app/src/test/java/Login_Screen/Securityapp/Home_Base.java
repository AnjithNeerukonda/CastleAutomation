package Login_Screen.Securityapp;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Home_Base {

    public AppiumDriver<MobileElement> driver;

    @org.junit.Test
    public void Nexus6Pcapability() throws MalformedURLException, Exception {

        File app = new File("D:\\mycastle\\app-debug (4).apk");
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platformName", "Android");
        cap.setCapability("deviceName", "Pixel");
        cap.setCapability("unicodeKeyboard", true);
        cap.setCapability("norest", true);
        cap.setCapability("resetKeyboard", false);
//        cap.setCapability("appnorest",value"");
        cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        cap.setCapability("appPackage", "com.securityguard.mycastlesecurityguard");
        cap.setCapability("appActivity", "com.securityguard.mycastlesecurityguard.activity.SplashActivity");
//        cap.setCapability("appActivity", "com.developeronrent.mycastle.activity");
        //       cap.setCapability("appActivity", "com.developeronrent.mycastle.activity.LoginActivity");
//        cap.setCapability("appActivity", "com.developeronrent.mycastle.activity");

        driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);

       Allow allinone=new Allow();
       allinone.guest(driver);
//       allinone.cabs(driver);
//       allinone.fooddelivery(driver);
//       allinone.parcels(driver);


    }
}