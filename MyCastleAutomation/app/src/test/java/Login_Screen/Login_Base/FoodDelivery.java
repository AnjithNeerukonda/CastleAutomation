package Login_Screen.Login_Base;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class FoodDelivery {


    public void selectprovider(AppiumDriver<MobileElement> driver) throws InterruptedException {

        Thread.sleep(10000);

        driver.findElement(By.xpath("//android.widget.LinearLayout[contains(@resource-id,'fooddeliverylay')]")).click();

        Thread.sleep(3000);
        MobileElement selectimage=driver.findElementById("com.developeronrent.mycastle:id/zomatoimg");
        selectimage.click();
//        selectimage.click();
        MobileElement selectimage2=driver.findElementById("com.developeronrent.mycastle:id/ubereatimg");
        selectimage.click();


        MobileElement time=driver.findElementById("com.developeronrent.mycastle:id/quantity_text_view1");
        time.click();
        MobileElement ok=driver.findElementById("android:id/button1");
        ok.click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'dismissbtn')]")).click();

        MobileElement allow=driver.findElementByXPath("//android.widget.TextView[@index='5']");
        allow.click();

//        MobileElement button=driver.findElementById("com.developeronrent.mycastle:id/allowentryfood");
//        button.click();
//        MobileElement button=driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[3]");
//        button.click();

//        MobileElement button2=driver.findElementByClassName("android.widget.TextView");
//        button2.click();
//
//        MobileElement text=driver.findElementByPartialLinkText("Allow Entry");
//        text.click();

    }

}
