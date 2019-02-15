package Login_Screen.Login_Base;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Guest_Screen {
@Test
    public void singleaddguest(AppiumDriver<MobileElement> driver) throws InterruptedException {


      driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);



//        MobileElement guest=driver.findElementById("com.developeronrent.mycastle:id/navigation_ticket");
//        guest.click();
//
//    MobileElement guest1=driver.findElementById("com.developeronrent.mycastle:id/navigation_home");
//    guest1.click();


//    MobileElement el2 = (MobileElement) driver.findElements(By.id("guestlay"));         //findElementById("guestlay");
//    el2.click();

//        MobileElement guest=driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]");
//        guest.click();
//    MobileElement guest=driver.findElementByClassName("android.widget.LinearLayout");
//    guest.click();

        driver.findElement(By.xpath("//android.widget.LinearLayout[contains(@resource-id,'guestlay')]")).click();

//        driver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'dismissbtn')]")).click();


        MobileElement addname=driver.findElementById("com.developeronrent.mycastle:id/name");
        addname.sendKeys("Anjith");

        MobileElement mobilenumber=driver.findElementById("com.developeronrent.mycastle:id/mobno");
        mobilenumber.sendKeys("9553217403");

        MobileElement button=driver.findElementById("com.developeronrent.mycastle:id/butincrement1");
        button.click();

        MobileElement date=driver.findElementById("com.developeronrent.mycastle:id/datetxt");
        date.click();

        MobileElement ok=driver.findElementById("android:id/button1");
        ok.click();

        driver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'dismissbtn')]")).click();




//        MobileElement send=driver.findElementById("com.developeronrent.mycastle:id/guestinvite");
//        send.click();

//        MobileElement dismissbutton=driver.findElementById("com.developeronrent.mycastle:id/dismissbtn");
//        dismissbutton.click();







    }
}
