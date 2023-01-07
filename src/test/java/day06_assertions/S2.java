package day06_assertions;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class S2{
        //1) Bir class oluşturun: BestBuyAssertions
    //2) https://www.bestbuy.com/ Adresine gidin farkli test method’lari olusturarak
    //   asagidaki testleri yapin
    //      ○ Sayfa URL’inin https://www.bestbuy.com/ ‘a esit oldugunu test edin
    //      ○ titleTest => Sayfa başlığının “Rest” içermediğini(contains) test edin
    //      ○ logoTest => BestBuy logosunun görüntülendigini test edin
    //      ○ FrancaisLinkTest => Fransizca Linkin görüntülendiğini test edin

    static WebDriver driver;
 @BeforeClass
 public static void setUp(){
     WebDriverManager.chromedriver().setup();
     driver= new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));




    }

@AfterClass
    public  static void treadown(){
        driver.close();



}


@Test
 public void test01(){
   driver.get( "https://www.bestbuy.com/") ;
}
@Test
    public void test02(){
  //  Sayfa URL’inin https://www.bestbuy.com/ ‘a esit oldugunu test edin

   String exectedUrl= "https://www.bestbuy.com/";

    String actualUrl= driver.getCurrentUrl();

   Assert.assertEquals(exectedUrl,actualUrl);

}
@Test
    public void test03() {
    //     ○ titleTest => Sayfa başlığının “Rest” içermediğini(contains) test edin

    String expectedicermeyenkelime = "Rest";
    String actualTitle = driver.getTitle();

    Assert.assertFalse(actualTitle.contains(expectedicermeyenkelime));

}
@Test
    public void test04(){
     //     ○ logoTest => BestBuy logosunun görüntülendigini test edin

    WebElement besbuyLogo= driver.findElement(By.xpath("https://www.bestbuy.com/"));

    Assert.assertTrue(besbuyLogo.isDisplayed());

}
    @Test
    public void logoTest(){
        //      ○ logoTest => BestBuy logosunun görüntülendigini test edin
        WebElement logoElementi= driver.findElement(By.xpath("(//img[@class='logo'])[1]"));
        Assert.assertTrue(logoElementi.isDisplayed());
    }

@Test
    public void test05(){
      //   ○ FrancaisLinkTest => Fransizca Linkin görüntülendiğini test edin
}
}








