// Generated by Selenium IDE
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
public class Caso6Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() throws MalformedURLException {
    driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void caso6() {
    // Test name: caso#6
    // Step # | name | target | value
    // 1 | open | http://automationpractice.com/index.php | 
    driver.get("http://automationpractice.com/index.php");
    // 2 | setWindowSize | 1376x744 | 
    driver.manage().window().setSize(new Dimension(1376, 744));
    // 3 | click | css=.sfHover > .sf-with-ul > font > font | 
    driver.findElement(By.cssSelector(".sfHover > .sf-with-ul > font > font")).click();
    // 4 | click | css=.sfHover > .sf-with-ul | 
    driver.findElement(By.cssSelector(".sfHover > .sf-with-ul")).click();
    // 5 | click | css=.sfHover:nth-child(1) font > font | 
    driver.findElement(By.cssSelector(".sfHover:nth-child(1) font > font")).click();
    // 6 | click | css=.sfHover > .sf-with-ul > font > font | 
    driver.findElement(By.cssSelector(".sfHover > .sf-with-ul > font > font")).click();
    // 7 | click | css=.sfHoverForce font > font | 
    driver.findElement(By.cssSelector(".sfHoverForce font > font")).click();
    // 8 | mouseOver | css=.sfHoverForce font > font | 
    {
      WebElement element = driver.findElement(By.cssSelector(".sfHoverForce font > font"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 9 | mouseOut | css=.sfHover > .sf-with-ul > font > font | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 10 | click | css=.submenu-container > .sfHover font > font | 
    driver.findElement(By.cssSelector(".submenu-container > .sfHover font > font")).click();
    // 11 | click | css=.breadcrumb | 
    driver.findElement(By.cssSelector(".breadcrumb")).click();
    // 12 | click | css=.sfHover font > font | 
    driver.findElement(By.cssSelector(".sfHover font > font")).click();
    // 13 | click | css=.sfHoverForce font > font | 
    driver.findElement(By.cssSelector(".sfHoverForce font > font")).click();
    // 14 | mouseOver | css=.sfHoverForce font > font | 
    {
      WebElement element = driver.findElement(By.cssSelector(".sfHoverForce font > font"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 15 | mouseOut | css=.sfHover > .sf-with-ul > font > font | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 16 | click | css=.sfHoverForce font > font | 
    driver.findElement(By.cssSelector(".sfHoverForce font > font")).click();
    // 17 | click | css=.sfHover > .sf-with-ul | 
    driver.findElement(By.cssSelector(".sfHover > .sf-with-ul")).click();
    // 18 | click | css=.sfHover:nth-child(3) > a | 
    driver.findElement(By.cssSelector(".sfHover:nth-child(3) > a")).click();
    // 19 | click | css=.content_scene_cat_bg | 
    driver.findElement(By.cssSelector(".content_scene_cat_bg")).click();
    // 20 | mouseOver | css=.last-item-of-tablet-line .replace-2x | 
    {
      WebElement element = driver.findElement(By.cssSelector(".last-item-of-tablet-line .replace-2x"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
  }
}
