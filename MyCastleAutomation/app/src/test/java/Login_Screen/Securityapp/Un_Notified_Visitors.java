package Login_Screen.Securityapp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Un_Notified_Visitors {

    @FindBy(id = "com.mycastle.security:id/back")
    public WebElement visitorsbutton;

    @FindBy(id = "com.mycastle.security:id/nameedt")
    public WebElement name;

    @FindBy(id = "com.mycastle.security:id/flataddspi")
    public  WebElement flat;

    @FindBy(id ="com.mycastle.security:id/mobnoedt")
    public  WebElement mobilenumber;

    @FindBy(id="com.mycastle.security:id/num")
    public  WebElement numberofpersons;

    @FindBy(id = "com.mycastle.security:id/reson")
    public WebElement reason;

    @FindBy(id = "com.mycastle.security:id/addmembertxt")
    public  WebElement sendbutton;

    @FindBy(id = "com.mycastle.security:id/profileimg")
    public  WebElement profileimage;


    @Test
    public void visitors(AppiumDriver<MobileElement> driver) {

        visitorsbutton.click();
        name.sendKeys("siva");
        flat.sendKeys("103");
        mobilenumber.sendKeys("8989898989");
        numberofpersons.sendKeys("3");
        reason.sendKeys("games");
        sendbutton.click();
        profileimage.click();

    }
}
