package Login_Screen.Login_Base;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.DataProvider;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import Login_Screen.LoginWithSingleUser;
import Login_Screen.LoginwithMultiUsers;
import Login_Screen.Multiple_Guest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Login_Base {
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
        cap.setCapability("appPackage", "com.developeronrent.mycastle");
        cap.setCapability("appActivity", "com.developeronrent.mycastle.activity.SplashActivity");
//        cap.setCapability("appActivity", "com.developeronrent.mycastle.activity");
 //       cap.setCapability("appActivity", "com.developeronrent.mycastle.activity.LoginActivity");
//        cap.setCapability("appActivity", "com.developeronrent.mycastle.activity");

        driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);

       LoginWithSingleUser login=new LoginWithSingleUser();
       login.SingleUserLoginAndLogoutFuc(driver);


//        Checking ck=new Checking();
//        ck.elements(driver);

//        LoginwithMultiUsers loginmulti=new LoginwithMultiUsers();
//        loginmulti.LoginScreenWithDataSheetFun(driver);


//        Forgot_Password forgot_password=new Forgot_Password();
//        forgot_password.forgot(driver);

//        Guest_Screen gus= new Guest_Screen();
//        gus.singleaddguest(driver);

//        Multiple_Guest guest=new Multiple_Guest();
//        guest.addguest(driver);

////
//        Cab cb=new Cab();
//        cb.addnewcab(driver);
//        cb.cablist(driver);

//FoodDelivery fd=new FoodDelivery();
//fd.selectprovider(driver);

//     Parcel addparcel=new Parcel();
//     addparcel.parcelcreated(driver);

//        Vehicles vehiclesobj=new Vehicles();
//        vehiclesobj.addnewvehicle(driver);

//        My_Family family=new My_Family();
//        family.addmember(driver);




    }

}
