package day13_writeExcel_Screenshot;



import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase;

    public class  C06_JSExecutor extends TestBase {
        @Test
        public void test(){
            // amazona gidip
            driver.get("https://www.amazon.com");

            //sell linkine JS Executor kullanarak click yapin
            WebElement selllinki= driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_sell']"));

            JavascriptExecutor jse=(JavascriptExecutor) driver;

            jse.executeScript("arguments[0].click();",selllinki);

            jse.executeScript("alert('Bu is bu kadar')");
            ReusableMethods.bekle(3);




        }
    }

