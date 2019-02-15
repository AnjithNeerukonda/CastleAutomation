package Login_Screen.Login_Base;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class My_Family {


    public void addmember(AppiumDriver<MobileElement> driver) throws InterruptedException {

        Thread.sleep(3000);
        driver.findElement(By.xpath("//android.widget.ImageButton[@index='2']")).click();

        MobileElement name=driver.findElementById("com.developeronrent.mycastle:id/nameedt");
        name.sendKeys("Anjith");

        MobileElement mbnumber=driver.findElementById("com.developeronrent.mycastle:id/mobnoedt");
        mbnumber.sendKeys("9515817773");

        MobileElement email=driver.findElementById("com.developeronrent.mycastle:id/emailidedt");
        email.sendKeys("abcd@gmail.com");

//        driver.findElement(By.xpath("//android.widget.TextView[@index='2']")).click();


        MobileElement role=driver.findElementById("android:id/text1");
        role.click();
        driver.findElement(By.xpath("//android.widget.TextView[@index='4']")).click();

       Thread.sleep(3000);

//        MobileElement flat=driver.findElementById("android:id/text1");
//        flat.click();

        driver.findElement(By.xpath("//android.widget.TextView[@text='101']")).click();

        driver.findElement(By.xpath("//android.widget.TextView[@text='108']")).click();


        MobileElement button=driver.findElementById("com.developeronrent.mycastle:id/addmembertxt");
        button.click();



//        MobileElement call=driver.findElementById("com.developeronrent.mycastle:id/calltxt");
//        call.click();


//        driver.findElement(By.xpath("//android.widget.TextView[@index='1']")).click();
//        MobileElement flat=driver.findElementById("android:id/text1");
//        flat.click();

//        MobileElement button=driver.findElementById("com.developeronrent.mycastle:id/addmembertxt");
//        button.click();


    }
}
