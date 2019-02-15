package Login_Screen.Login_Base;

import org.openqa.selenium.interactions.touch.TouchActions;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class Vehicles {


    public void addnewvehicle(AppiumDriver<MobileElement> driver) {


        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        MobileElement vehicles=driver.findElementById("com.developeronrent.mycastle:id/myvehiclelay");
//        vehicles.click();

        TouchActions action=new TouchActions(driver);
        action.singleTap(vehicles);
        action.perform();

//        TouchAction circleTouch = new TouchAction(driver);
//        circleTouch.tap(PointOption.point(383,1387));

//        MobileElement vehicles=driver.findElementById("com.developeronrent.mycastle:id/myvehiclelay");
//        vehicles.click();

        MobileElement makeavehicle=driver.findElementById("com.developeronrent.mycastle:id/vehiclespi");
        makeavehicle.sendKeys("Bike");

        MobileElement type=driver.findElementById("com.developeronrent.mycastle:id/vehiclename");
        type.sendKeys("2 wheeler");

        MobileElement Rgno=driver.findElementById("com.developeronrent.mycastle:id/regnoedt");
        Rgno.sendKeys("KA-28-AC-2011");


        MobileElement button=driver.findElementById("com.developeronrent.mycastle:id/addvehicletxt");
        button.click();

    }
}
