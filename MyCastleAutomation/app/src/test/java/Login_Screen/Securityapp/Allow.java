package Login_Screen.Securityapp;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Allow {
    public void guest(AppiumDriver<MobileElement> driver) {

        MobileElement mobileno= driver.findElementById("com.securityguard.mycastlesecurityguard:id/logineid");
        mobileno.click();


        MobileElement login=driver.findElementById("com.securityguard.mycastlesecurityguard:id/loginbtn");
        login.click();

        MobileElement parcel=driver.findElementById("");
        login.click();





    }


    public void cabs(AppiumDriver<MobileElement> driver) {
    }


    public void fooddelivery(AppiumDriver<MobileElement> driver) {
    }


    public void parcels(AppiumDriver<MobileElement> driver) {
    }


}
