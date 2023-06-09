// Generated by Selenium IDE
// Autores: Abril y Jorge
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class TestAlquiladoDevolución {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
	System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void test2() {
    // Test name: Test2
    // Step # | name | target | value | comment
    // 1 | open | http://localhost:3000/login |  | 
    driver.get("http://localhost:3000/login");
    // 2 | setWindowSize | 1552x840 |  | 
    driver.manage().window().setSize(new Dimension(1552, 840));
    // 3 | click | css=.inputsforms |  | 
    driver.findElement(By.cssSelector(".inputsforms")).click();
    // 4 | click | css=input:nth-child(1) |  | 
    // Iniciamos sesión con un usuario ya registrado en la base de datos
    driver.findElement(By.cssSelector("input:nth-child(1)")).click();
    // 5 | type | css=input:nth-child(1) | federicoperez@gmail.com | 
    driver.findElement(By.cssSelector("input:nth-child(1)")).sendKeys("federicoperez@gmail.com");
    // 6 | type | css=input:nth-child(2) | 12345 | 
    driver.findElement(By.cssSelector("input:nth-child(2)")).sendKeys("12345");
    // 7 | click | css=.loginEnter |  | 
    driver.findElement(By.cssSelector(".loginEnter")).click();
    // 8 | click | css=.boton:nth-child(1) > b |  | 
    driver.findElement(By.cssSelector(".boton:nth-child(1) > b")).click();
    // 9 | click | css=.boton:nth-child(1) > b |  | 
    driver.findElement(By.cssSelector(".boton:nth-child(1) > b")).click();
    // 10 | click | css=a:nth-child(3) > .loginEnter |  | 
    driver.findElement(By.cssSelector("a:nth-child(3) > .loginEnter")).click();
    // 11 | mouseOver | css=a:nth-child(3) > .loginEnter |  | 
    {
      WebElement element = driver.findElement(By.cssSelector("a:nth-child(3) > .loginEnter"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 12 | click | css=input |  | 
    driver.findElement(By.cssSelector("input")).click();
    // 13 | click | css=input |  | 
    driver.findElement(By.cssSelector("input")).click();
    // 14 | doubleClick | css=input |  | 
    {
      WebElement element = driver.findElement(By.cssSelector("input"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
	  
    //Añadimos los campos del alquiler de la herramienta
    // 15 | type | css=input | paula1@gmail.com | 
    driver.findElement(By.cssSelector("input")).sendKeys("paula1@gmail.com");
    // 16 | click | css=select:nth-child(6) |  | 
    driver.findElement(By.cssSelector("select:nth-child(6)")).click();
    // 17 | select | css=select:nth-child(6) | label=7 | 
    {
      WebElement dropdown = driver.findElement(By.cssSelector("select:nth-child(6)"));
      dropdown.findElement(By.xpath("//option[. = '7']")).click();
    }
    // 18 | click | css=select:nth-child(8) |  | 
    driver.findElement(By.cssSelector("select:nth-child(8)")).click();
    // 19 | select | css=select:nth-child(8) | label=12 | 
    {
      WebElement dropdown = driver.findElement(By.cssSelector("select:nth-child(8)"));
      dropdown.findElement(By.xpath("//option[. = '12']")).click();
    }
    // 20 | click | css=select:nth-child(8) |  | 
    driver.findElement(By.cssSelector("select:nth-child(8)")).click();
    // 21 | select | css=select:nth-child(8) | label=5 | 
    {
      WebElement dropdown = driver.findElement(By.cssSelector("select:nth-child(8)"));
      dropdown.findElement(By.xpath("//option[. = '5']")).click();
    }
    // 22 | click | css=.App > div:nth-child(2) |  | 
    driver.findElement(By.cssSelector(".App > div:nth-child(2)")).click();
    // 23 | click | css=select:nth-child(12) |  | 
    driver.findElement(By.cssSelector("select:nth-child(12)")).click();
    // 24 | select | css=select:nth-child(12) | label=7 | 
    {
      WebElement dropdown = driver.findElement(By.cssSelector("select:nth-child(12)"));
      dropdown.findElement(By.xpath("//option[. = '7']")).click();
    }
    // 25 | click | css=select:nth-child(14) |  | 
    driver.findElement(By.cssSelector("select:nth-child(14)")).click();
    // 26 | select | css=select:nth-child(14) | label=6 | 
    {
      WebElement dropdown = driver.findElement(By.cssSelector("select:nth-child(14)"));
      dropdown.findElement(By.xpath("//option[. = '6']")).click();
    }
    // 27 | click | css=button:nth-child(17) |  | 
    driver.findElement(By.cssSelector("button:nth-child(17)")).click();
    // 28 | click | css=.loginRegister:nth-child(1) |  | 
    driver.findElement(By.cssSelector(".loginRegister:nth-child(1)")).click();
    // 29 | click | css=button:nth-child(5) |  | 
    driver.findElement(By.cssSelector("button:nth-child(5)")).click();
  }
	//Se ha podido alquilar la herramienta de manera correcta y posteriormente marcarla como devuelta
}
