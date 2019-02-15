package Login_Screen.Login_Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

public class Cab {

    public void addnewcab(AppiumDriver<MobileElement> driver) {

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

//        MobileElement cablay=driver.findElementById("com.developeronrent.mycastle:id/cablay");
//        cablay.click();

        driver.findElement(By.xpath("//android.widget.LinearLayout[contains(@resource-id,'cablay')]")).click();
       driver.getPageSource();



        MobileElement addreg1=driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'pin_first_edittext1')]"));
        addreg1.sendKeys("1");


        MobileElement addreg2=driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'pin_second_edittext1')]"));
        addreg2.sendKeys("2");

//        MobileElement addreg3=driver.findElementById("com.developeronrent.mycastle:id/pin_third_edittext1");
//        addreg3.sendKeys("3");
//
//        MobileElement addreg4=driver.findElementById("com.developeronrent.mycastle:id/pin_forth_edittext1");
//        addreg4.sendKeys("4");

        MobileElement time=driver.findElementById("com.developeronrent.mycastle:id/quantity_text_view1");
        time.click();

        MobileElement ok=driver.findElementById("android:id/button1");
        ok.click();

        MobileElement ola=driver.findElementById("com.developeronrent.mycastle:id/olaimg");
        ola.click();

        MobileElement provider=driver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'uberimg')]"));
        provider.click();
//        MobileElement selectprovider=driver.findElementByClassName("android.widget.ImageView");
////        selectprovider.click();
//
//        MobileElement image=driver.findElementByName("UBER");
//        image.click();


//        driver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'dismissbtn')]")).click();

        MobileElement allow=driver.findElementById("com.developeronrent.mycastle:id/caballowtxt");
        allow.click();

    }


    public void cablist(AppiumDriver<MobileElement> driver) {

        for (int i=1; i<=6;i++)
        {
            try
            {
                MobileElement experiences_list = driver.findElement( By.id("com.developeronrent.mycastle:id/pin_layout"));
                List<MobileElement> allexperiencesItems = experiences_list.findElements( MobileBy.id("com.developeronrent.mycastle:id/pin_first_edittext1"));
                int allExperiencesItemssize = allexperiencesItems.size();
                System.out.println("Size : "+ allExperiencesItemssize +" and ");

                for (int j= 0; allExperiencesItemssize>=0;)
                {
                    try
                    {
                        if(!allexperiencesItems.isEmpty())
                        {
                            System.out.println("Element index : "+j);

                            if(allExperiencesItemssize == j)
                            {
                                System.out.println("Inner loop if for break when size == to Eiditinds:"+allExperiencesItemssize +"Editindex"+j);
                                break;
                            }

                            MobileElement WorkIndexElement = allexperiencesItems.get(j);
                            WorkIndexElement.sendKeys("1");
//                            Edit_Work_Exp_Func(driver);
                            j++;
                        }
                    }
                    catch (Exception eee)
                    {
//                        ScrollUpAndDown.verticalScrollDown(driver);
                    }
                }
                break;
            }
            catch (Exception ee1)
            {
//                ScrollUpAndDown.verticalScrollDown(driver);
            }
        }
    }


    }

