package Login_Screen;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Logger;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class LoginwithMultiUsers {
    static File scr;
    static XSSFWorkbook wb;
    static XSSFSheet sheet1;
    static FileInputStream fis;

    public static Logger Log = Logger.getLogger( LoginwithMultiUsers.class.getName());
    @org.junit.Test
    public static void LoginScreenWithDataSheetFun(AppiumDriver<MobileElement> driver) throws IOException, InterruptedException {

        scr = new File("C:\\excel\\Mycastle.xlsx");
        fis = new FileInputStream(scr);
        wb = new XSSFWorkbook(fis);
        String data0;

        try {
            sheet1= wb.getSheetAt(0);
            int rowCount = sheet1.getLastRowNum();
            Log.info( "=======Multiple  data passing to the LoginFunctionality=====" );
            System.out.println("Total Number of User : " + rowCount);
            Log.info( "Total Number of user : "+rowCount );


            for (int row=0; row<=rowCount; row++)
            {

                MobileElement PhoneOrGmail = driver.findElementById("com.developeronrent.mycastle:id/logineid");
                String username = sheet1.getRow(row).getCell(0).getStringCellValue();
                PhoneOrGmail.sendKeys(username);
                Log.info( "  Phone or Email  Details Sent. " );


                MobileElement Pwd = driver.findElementById("com.developeronrent.mycastle:id/loginpwd");
                String password = sheet1.getRow(row).getCell(1).getStringCellValue();
                Pwd.sendKeys(password);
                Log.info( "  Password  Details  Sent. " );

                MobileElement loginbtn = driver.findElementById("com.developeronrent.mycastle:id/loginbtn");
                loginbtn.click();

                /* login button is still diplaying? then clear data else login buuton not displaying then go to else part to perform logout */
                if(loginbtn.isDisplayed())
                {
                    //System.out.println("=====Invalid User user detailes not exist ======");
                    //System.out.println("Invalid User name : "+username+" And Password :"+password);
                    //System.out.println("=======Please use valid User details======");
                    Log.info( "  Invalid user not registered. " );
                    Log.info( "  Invalid user name: "+username +" And Password: "+password );
                    PhoneOrGmail.clear();
                    Pwd.clear();
                    Log.info( " User Details cleared. " );
                    Log.info("***************");
                }
                else
                {

                    /* valid user block and Logout. */
                    //System.out.println("==== Valid user loged in ====== ");
                    //System.out.println("User name : "+username+"And Password :"+password);

                    Log.info( "  Valid User Login "+username + "And password "+password);
                    MobileElement phonenumber  = driver.findElementById("com.developeronrent.mycastle:id/mobno");
                    phonenumber.sendKeys("955321703");
                    phonenumber.isDisplayed();

                    // scroll up for Logout option
                    Dimension dim1 = driver.manage().window().getSize();
                    int height1 = dim1.getHeight();
                    int width1 = dim1.getWidth();
                    int x1 = height1 / 2;
                    int starty1 = (int) (height1 * 0.80);
                    int endy1 = (int) (height1 * 0.20);

                    TouchAction scrollToLogout = new TouchAction((MobileDriver) driver).longPress(PointOption.point(x1, starty1)).moveTo(PointOption.point(0, endy1)).release();
                    scrollToLogout.perform();


                    MobileElement LogoutXpathElement = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.support.v7.widget.RecyclerView/android.view.ViewGroup[7]/android.widget.TextView");
                    LogoutXpathElement.click();
                    Log.info(  "==========Log out ====== " );

                }

            } // for loop end


        } // method end
        catch(Exception e){

            e.printStackTrace();
        }
    }
}
