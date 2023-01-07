package day06_assertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

import java.time.Duration;

public class s1 {


    //Gerekli yapiyi olusturun ve aşağıdaki görevi tamamlayın.
    //  a. Verilen web sayfasına gidin.
    //       https://the-internet.herokuapp.com/checkboxes
    //  b. Checkbox1 ve checkbox2 elementlerini locate edin.
    //  c. Checkbox1 seçili değilse onay kutusunu tıklayın ve secili oldugunu test edin
    //  d. Checkbox2 seçili değilse onay kutusunu tıklayın ve secili oldugunu test edin
   WebDriver driver;



   @Before
   public  void setUp(){
       WebDriverManager.chromedriver().setup();
       driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


   }
    @After
    public  void treadown(){
       driver.close();
    }
@Test
//       https://the-internet.herokuapp.com/checkboxes
//  b. Checkbox1 ve checkbox2 elementlerini locate edin.
//  c. Checkbox1 seçili değilse onay kutusunu tıklayın ve secili oldugunu test edin
  public void test01(){
    driver.get(" https://the-internet.herokuapp.com/checkboxes");

    WebElement cekbast=driver.findElement(By.id(""));

}

    }






