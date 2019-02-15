package Login_Screen.Login_Base;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class Checking {
    public void elements(AppiumDriver<MobileElement> driver) throws InterruptedException {

          driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);



          //List<MobileElement> allMenus  = driver.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout");

        MobileElement lll = (MobileElement) driver.findElement(By.xpath("[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout"));
        lll.click();
        lll.click();

         // int MenuSize = allMenus.size();
          //System.out.println("Menu size: "+MenuSize );

         // System.out.println("Gest index"+ allMenus.get(0));
          //allMenus.get(0).click();












//          MobileElement innerframe=driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout");
//          innerframe.click();
//
//
//        MobileElement frame=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]"));
//frame.click();


//          driver.findElementsById("com.developeronrent.mycastle:id/remove_lay");

//        String tagname=driver.findElement(By.id("com.developeronrent.mycastle:id/homenotification")).getTagName();

//        MobileElement noti= (MobileElement) driver.findElementsById("com.developeronrent.mycastle:id/remove_lay");
//        noti.click();

//        MobileElement call=driver.findElementById("android:id/button1");
//        call.click();
//        MobileElement more=driver.findElementById("com.developeronrent.mycastle:id/moretxt");
//        more.click();
         Thread.sleep(5000);
//         driver.findElement(By.xpath("//android.widget.Spinner[contains(@resource-id,'apartmentspi']")).click();
//

//        MobileElement spinner= driver.findElement(By.id("com.developeronrent.mycastle:id/apartmentspi"));
//        spinner.click();

//        driver.findElementByClassName("android.widget.FrameLayout").click();
//        driver.findElementByName("Tickets").click();



//        Thread.sleep(3000);
//          driver.findElement(By.xpath("//android.widget.LinearLayout[@index='4']"));

//
//        driver.findElement(By.xpath("//android.widget.TextView[@index='1']")).click();
//        driver.findElement(By.xpath("//android.widget.TextView[@index='2']")).click();



//        driver.findElement(By.xpath("//android.widget.FrameLayout[contains(@resource-id,'navigation_ticket')]")).click();

//        driver.findElement(By.xpath("//android.widget.TextView[@resource-id,'homenotification']")).click();



//       MobileElement family=driver.findElementById("com.developeronrent.mycastle:id/myfamilylay");
//       family.click();
//        MobileElement vehicles=driver.findElementById("com.developeronrent.mycastle:id/myvehiclelay");
//        vehicles.click();
//        Actions action = new Actions(driver);
//        action.moveTo(Vehicles);
//        action.click();
//        action.perform();



//         MobileElement ele= driver.findElementById("com.developeronrent.mycastle:id/fab_myvehicle");
//        TouchAction circleTouch = new TouchAction(driver);
//        circleTouch.tap(PointOption.point(383,1387)).perform();
//        circleTouch.tap(driver.findElementById("com.developeronrent.mycastle:id/fab_myvehicle"));
       // circleTouch.press(PointOption.point(1244,2133)).perform().release();



//        driver.findElement(By.xpath("//android.widget.TextView[@index='8']")).click();
//
//        driver.findElement(By.xpath("//android.widget.Button[@index='1']")).click();



       // driver.findElement(By.xpath("//*[@class='android.widget.ImageView' and @index='8']")).click();
//        MobileElement addvehicle=driver.findElementById("com.developeronrent.mycastle:id/fab_myvehicle");
//        addvehicle.click();
//        Thread.sleep(5000);

//        driver.findElement(By.xpath("//android.widget.ImageView[@resource-id,'twowheimg']")).click();


//        MobileElement makeavehicle=driver.findElementById("com.developeronrent.mycastle:id/vehiclespi");
//        makeavehicle.sendKeys("Bike");
//
//        MobileElement type=driver.findElementById("com.developeronrent.mycastle:id/vehiclename");
//        type.sendKeys("2 wheeler");
//
//        MobileElement Rgno=driver.findElementById("com.developeronrent.mycastle:id/regnoedt");
//        Rgno.sendKeys("KA-28-AC-2011");
//
//
//        MobileElement button=driver.findElementById("com.developeronrent.mycastle:id/addvehicletxt");
//        button.click();




























//        MobileElement e12=driver.findElementById("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]");
//        e12.click();






//        driver.findElement(By.xpath("//android.widget.LinearLayout[contains(@resource-id,'guestlay')]")).click();
//
//        driver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'dismissbtn')]")).click();
//
//        Thread.sleep(5000);
//
//        driver.findElement(By.xpath("//android.widget.LinearLayout[contains(@resource-id,'cablay')]")).click();
//
//        driver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'dismissbtn')]")).click();
//
//        Thread.sleep(3000);
//
//        driver.findElement(By.xpath("//android.widget.LinearLayout[contains(@resource-id,'fooddeliverylay')]")).click();
//        driver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'dismissbtn')]")).click();
//        Thread.sleep(3000);


        //android.widget.FrameLayout[contains(@resource-id,'cardview')]
//        Thread.sleep(2000);
//        if(driver.findElement(By.name("Tickets")).isDisplayed())
//            System.out.println("test passed");
//        driver.findElement(By.name("Tickets")).click();


//        Thread.sleep(2000);
//        if(driver.findElement(By.name("Tickets")).isDisplayed())
//            System.out.println("test passed");
//        driver.findElement(By.name("Tickets")).click();
//        driver.navigate().refresh();
//        driver.find_element_by_xpath(’//*[contains(@content-desc,“Email”)]’)

//        Thread.sleep(5000);
//        driver.navigate().refresh();
//        driver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']")).click();
//        driver.findElementByName("Tickets").click();

//        driver. findElement(By.name("Tickets")).click();



//        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and @index='1']")).click();


    }
}
