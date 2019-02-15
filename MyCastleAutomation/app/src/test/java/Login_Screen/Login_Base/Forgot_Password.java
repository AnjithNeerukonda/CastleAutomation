package Login_Screen.Login_Base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Forgot_Password {
    public void forgot(AppiumDriver<MobileElement> driver) throws InterruptedException {
        MobileElement fpswd=driver.findElementById("com.developeronrent.mycastle:id/forgetpwd");
        fpswd.click();

        MobileElement email=driver.findElementById("com.developeronrent.mycastle:id/emailidedt");
        email.sendKeys("anjithjjbytes@gmail.com");

        MobileElement sendbutton=driver.findElementById("com.developeronrent.mycastle:id/emailidsend");
        sendbutton.click();
        Thread.sleep(4000);
        MobileElement fpswd1=driver.findElementById("com.developeronrent.mycastle:id/forgetpwd");
        fpswd.click();

        MobileElement email1=driver.findElementById("com.developeronrent.mycastle:id/emailidedt");
        email.sendKeys("");

        MobileElement sendbutton1=driver.findElementById("com.developeronrent.mycastle:id/emailidsend");
        sendbutton.click();
        driver.navigate().back();


    }
}
