import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {
  private WebDriver driver;
  private StringBuffer verificationErrors = new StringBuffer();
  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitledTestCase() throws Exception {
    driver.get("https://www.paysera.lt/v2/en-LT/fees/currency-conversion-calculator#/");
    driver.findElement(By.xpath("//input[@type='text']")).click();
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("500");
    driver.findElement(By.xpath("//div[@id='currency-exchange-app']/div/div/div[2]/div/form/div[3]/input")).click();
    driver.findElement(By.xpath("//div[@id='currency-exchange-app']/div/div/div[2]/div/form/div[3]/input")).sendKeys("100");
    driver.findElement(By.xpath("//input[@type='text']")).click();
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("600");
    driver.findElement(By.xpath("//div[@id='currency-exchange-app']/div/div/div[2]/div/form/div[3]/input")).click();
    driver.findElement(By.xpath("//div[@id='currency-exchange-app']/div/div/div[2]/div/form/div[3]/input")).sendKeys("700");
    driver.findElement(By.cssSelector(".form-inline")).submit();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Documentation and API'])[1]/following::span[1]")).click();
    driver.findElement(By.id("countries-dropdown")).click();
    driver.findElement(By.linkText("United Kingdom")).click();
    driver.findElement(By.xpath("//div[@id='currency-exchange-app']/div/div/div[2]/div/form/div[3]/input")).click();
    driver.findElement(By.xpath("//div[@id='currency-exchange-app']/div/div/div[2]/div/form/div[3]/input")).sendKeys("200");
    driver.findElement(By.xpath("//input[@type='text']")).click();
    driver.findElement(By.xpath("//input[@type='text']")).clear();
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("600");
    driver.findElement(By.xpath("//div[@id='currency-exchange-app']/div/div/div[2]/div/form/div[3]/input")).click();
    driver.findElement(By.xpath("//div[@id='currency-exchange-app']/div/div/div[2]/div/form/div[3]/input")).sendKeys("200");
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }
}
