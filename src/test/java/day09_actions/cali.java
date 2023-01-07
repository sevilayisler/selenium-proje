package day09_actions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;
import utilities.TestBase;

public class cali extends TestBase {
    @Test
    public  void test01(){
        //1- Yeni bir class olusturalim: MouseActions1
        //2- https://the-internet.herokuapp.com/context_menu sitesine gidin
        //3- Cizili alan uzerinde sag click yapin
        //4- Alert’te cikan yazinin “You selected a context menu” oldugunu test edin.
        //5- Tamam diyerek alert’i kapatalim
        //6- Elemental Selenium linkine tiklayalim
        //7- Acilan sayfada h1 taginda “Elemental Selenium” yazdigini test edelim

        driver.get("https://the-internet.herokuapp.com/context_menu");
        Actions actions=new Actions(driver);
        WebElement cizgiliAlan =driver.findElement(By.xpath("//div[@id='content']"));
cizgiliAlan.click();
actions.contextClick(cizgiliAlan).perform();

ReusableMethods.bekle(5);
    }



}
