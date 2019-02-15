package Login_Screen.Login_Base;

import com.gargoylesoftware.css.parser.Locatable;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;

public class Parcel {
    public void parcelcreated(AppiumDriver driver) {


        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

//        MobileElement parce1l= (MobileElement) driver.findElements(By.id("deliverypar"));
//        parce1l.click();


        driver.findElement(By.xpath("//android.widget.LinearLayout[contains(@resource-id,'parcellay')]")).click();


        driver.findElement(By.xpath("//android.widget.LinearLayout[@index='0']")).click();
//        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and @index='3']")).click();
        WebElement delivery=driver.findElementById("com.developeronrent.mycastle:id/deliverypar");
        delivery.click();

        driver.findElement(By.xpath("//android.widget.CheckedTextView[@index='4']")).click();
        driver.findElementsById("com.developeronrent.castle/id='home'");

//        driver.findElement(By.xpath("//android.widget.TextView[@index='0']")).click();
//        MobileElement ok=driver.findElementById("android:id/button1");
//        ok.click();

//        driver.findElement(By.xpath("//android.widget.TextView[@index='1']")).click();

        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and @index='1']")).click();

//        MobileElement partr=driver.findElement(By.id("android:id/text1"));
//        partr.click();


//        MobileElement date=driver.findElementById("com.developeronrent.mycastle:id/dateparceltxt");
//        date.click();

//        MobileElement name= (MobileElement) driver.findElements(By.name("Door Step"));
//        name.click();


//        MobileElement doorstep=driver.findElementById("com.developeronrent.mycastle:id/doorsteptxt");
//        doorstep.click();
//         driver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'dismissbtn')]")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@index='5']")).click();
//        MobileElement allow= (MobileElement) driver.findElements(By.id("com.developeronrent.mycastle:id/allowentryparcel"));
//        allow.click();



    }
}
