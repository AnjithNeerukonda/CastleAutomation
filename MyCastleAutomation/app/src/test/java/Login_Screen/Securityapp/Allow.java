package Login_Screen.Securityapp;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Allow {


    public void guest(AppiumDriver<MobileElement> driver) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//        MobileElement mobileno= driver.findElementById("com.securityguard.mycastlesecurityguard:id/logineid");
//        mobileno.click();

        MobileElement login=driver.findElementById("com.securityguard.mycastlesecurityguard:id/loginbtn");
        login.click();
//        MobileElement  elements = (MobileElement) driver.findElements(By.id("com.securityguard.mycastlesecurityguard:id/parcel_flatNo"));
//
//        String string = elements.getText();
//
//        System.out.println(string);
//        MobileElement otp=driver.findElementById("com.securityguard.mycastlesecurityguard:id/parcel_flatNo");
//        otp.getText();
//        System.out.println(otp.getText());
//        MobileElement vistors = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout");
//        vistors.click();
//        Thread.sleep(2000);
//
//        driver.navigate().back();
//        MobileElement back=driver.findElementById("com.securityguard.mycastlesecurityguard:id/back");
//        back.click();


//        MobileElement parcel=driver.findElementById("");
//        login.click();





    }


    public void cabs(AppiumDriver<MobileElement> driver) throws InterruptedException {

        MobileElement cabs  = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout");
        cabs.click();

        MobileElement textElement = driver.findElement(By.id("id/vis_otp"));
       String text = textElement.getAttribute("text");
       System.out.println(text);
        Thread.sleep(2000);
//        driver.navigate().back();
//        MobileElement back=driver.findElementById("com.securityguard.mycastlesecurityguard:id/back");
//        back.click();

    }


    public void fooddelivery(AppiumDriver<MobileElement> driver) throws InterruptedException {

        Thread.sleep(3000);
        MobileElement fooddelivery = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout");
        fooddelivery.click();

        driver.navigate().back();
//        MobileElement back=driver.findElementById("com.securityguard.mycastlesecurityguard:id/back");
//        back.click();

    }


    public void parcels(AppiumDriver<MobileElement> driver) throws InterruptedException {

        MobileElement parcels = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout");
        parcels.click();

        MobileElement textElement = driver.findElement(By.id("com.securityguard.mycastlesecurityguard:id/parcel_flatNo"));
        String text = textElement.getAttribute("text");
        System.out.println(text);

        Thread.sleep(2000);
//        MobileElement back=driver.findElementById("com.securityguard.mycastlesecurityguard:id/back");
//        back.click();

//        MobileElement idcard=driver.findElementById("com.securityguard.mycastlesecurityguard:id/card");
//        idcard.click();

//
//        driver.findElement(By.xpath("//android.view.ViewGroup[@index='0']")).click();
//        MobileElement yesbutton=driver.findElementById("android:id/button1");
//        yesbutton.click();
//        driver.navigate().back();

    }


}
