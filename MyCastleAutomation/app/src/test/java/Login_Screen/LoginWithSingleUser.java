package Login_Screen;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class LoginWithSingleUser
{

    @Test
    public void SingleUserLoginAndLogoutFuc(AppiumDriver<MobileElement> driver) throws InterruptedException
    {
        try
        {
            System.out.println("Login and logout with valide single ueser");
            MobileElement PhoneOrGmail = driver.findElementById("com.developeronrent.mycastle:id/logineid");

            PhoneOrGmail.sendKeys("preethikalpana45122@gmail.com");

            MobileElement Pwd = driver.findElementById("com.developeronrent.mycastle:id/loginpwd");
            Pwd.sendKeys("secret");


            MobileElement passwordtogglebutton=driver.findElementById("com.developeronrent.mycastle:id/text_input_password_toggle");
            passwordtogglebutton.click();
            passwordtogglebutton.click();

            Thread.sleep(3000);
            MobileElement loginBtn = driver.findElementById("com.developeronrent.mycastle:id/loginbtn");
            loginBtn.click();


//            MobileElement mobilenumber=driver.findElementById("com.developeronrent.mycastle:id/mobno");
//            mobilenumber.sendKeys("9553271403");
//
//            MobileElement otpbutton=driver.findElementById("com.developeronrent.mycastle:id/otpreqtxt");
//            otpbutton.click();
//
//            MobileElement allow=driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
//            allow.click();

            Thread.sleep(10000);

//             MobileElement resend=driver.findElementById("com.developeronrent.mycastle:id/resendotp");
//            resend.click();

//             MobileElement verify=driver.findElementById("com.developeronrent.mycastle:id/otpverifytxt");
//             verify.click();



//            MobileElement loginBtn = driver.findElementById("com.developeronrent.mycastle:id/loginbtn");
//            loginBtn.click();

//            MobileElement apartment=driver.findElementById("com.developeronrent.mycastle:id/apartmentspi");
//            apartment.click();


              Thread.sleep(3000);
//            MobileElement el2 = (MobileElement) driver.findElementById("guestlay");
//            el2.click();



//            WebDriverWait wait = new WebDriverWait(driver, 30);
//            wait.until(ExpectedConditions.elementToBeClickable(By
//                    .xpath("//android.widget.FrameLayout[contains(@content desc, 'Settings')]")));

//            MobileElement settings=driver.findElementById("com.developeronrent.mycastle:id/navigation_setting");
//            settings.click();

//            System.out.println(driver.findElement(By.id("com.developeronrent.mycastle:id/navigation_setting")).getText());

//            MobileElement logout=driver.findElementById("com.developeronrent.mycastle:id/logoutbtn");
//            logout.click();
//
//            MobileElement confirmation=driver.findElementById("android:id/button1");
//            confirmation.click();
//
//            MobileElement no=driver.findElementById("android:id/button2");
//            no.click();
//
//            MobileElement home=driver.findElementById("com.developeronrent.mycastle:id/navigation_home");
//            home.click();




//            MobileElement backbutton=driver.findElementById("com.developeronrent.mycastle:id/back");
//            backbutton.click();

//            MobileElement mobilenumber=driver.findElementById("com.developeronrent.mycastle:id/mobno");
//            mobilenumber.sendKeys("9553271403");
//
//            MobileElement otpbutton=driver.findElementById("com.developeronrent.mycastle:id/otpreqtxt");
//            otpbutton.click();
//            MobileElement logoutmenu = driver.findElementById("com.thestarinme.app.android.thestarinme:id/menuIcon");
//            logoutmenu.click();


            // scroll up for Logout option
//            int ScrolUpStartX1 = 180;
//            int ScrollUpStartY1  = 1431;
//            int ScrollUpEndX1 = 847;
//            int ScrollUpEndY1 = 0;
//
//            TouchAction ScrollUpToLogOutBtn = new TouchAction((MobileDriver)driver).longPress(PointOption.point(ScrolUpStartX1,ScrollUpStartY1)).moveTo(PointOption.point(ScrollUpEndX1,ScrollUpEndY1)).release();
//            ScrollUpToLogOutBtn.perform();
//
//            MobileElement LogoutXpathElement = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.support.v7.widget.RecyclerView/android.view.ViewGroup[7]/android.widget.TextView");
//            LogoutXpathElement.click();
//            System.out.println("Logout completed");

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
