package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import java.util.logging.Level;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TestCases {
    ChromeDriver driver;
    public TestCases()
    {
        System.out.println("Constructor: TestCases");

        WebDriverManager.chromedriver().timeout(30).setup();
        ChromeOptions options = new ChromeOptions();
        LoggingPreferences logs = new LoggingPreferences();

        // Set log level and type
        logs.enable(LogType.BROWSER, Level.ALL);
        logs.enable(LogType.DRIVER, Level.ALL);
        options.setCapability("goog:loggingPrefs", logs);

        // Set path for log file
        System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "chromedriver.log");

        driver = new ChromeDriver(options);

        // Set browser to maximize and wait
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    
    public  void testCase01() throws InterruptedException{
        System.out.println("Start Test case: testCase01");
        driver.get("https://www.google.com");
        String actualResult = driver.getCurrentUrl();
        String expectedResult = "https://www.google.com";
        if(actualResult.equals(expectedResult)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        Thread.sleep(3000);
        WebElement searchbox = driver.findElement(By.id("APjFqb"));
        searchbox.sendKeys("calculator");
        searchbox.sendKeys(Keys.ENTER);
        Thread.sleep(4000);
        WebElement displayZero = driver.findElement(By.id("cwos"));
        String zeroText = displayZero.getText();
        System.out.println("The value is: " +zeroText);
        System.out.println("end Test case: testCase01");
    }

    public  void testCase02() throws InterruptedException{
        System.out.println("Start Test case: testCase02");
        driver.get("https://www.google.com");
        Thread.sleep(3000);
        //send "Calculator" text to search box
        WebElement searchbox = driver.findElement(By.id("APjFqb"));
        searchbox.sendKeys("calculator");
        searchbox.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        //perform add operation
        //click on "5"
        WebElement five = driver.findElement(By.xpath("//div[text()='5']"));
        five.click();
        Thread.sleep(3000);
        //click on "+"
        WebElement add = driver.findElement(By.xpath("//div[text()='+']"));
        add.click();
        Thread.sleep(3000);
        //click 0n "7"
        WebElement seven = driver.findElement(By.xpath("//div[text()='7']"));
        seven.click();
        Thread.sleep(3000);
        //click on "="
        WebElement equal = driver.findElement(By.xpath("//div[text()='=']"));
        equal.click();
        Thread.sleep(3000);
        //printing result
        WebElement result = driver.findElement(By.xpath("//span[@class='qv3Wpe']"));
        String resultText = result.getText();
        System.out.println("The result of add operation is: "+resultText);
        //perform substraction operation
        //click on "AC"
        WebElement ac = driver.findElement(By.xpath("//div[text()='AC']"));
        ac.click();
        Thread.sleep(3000);
        //click on "1"
        WebElement one = driver.findElement(By.xpath("//div[text()='1']"));
        one.click();
        Thread.sleep(3000);
        //click on "5"
        WebElement five1 = driver.findElement(By.xpath("//div[text()='5']"));
        five1.click();
        Thread.sleep(3000);
        //click on "-"
        WebElement sub = driver.findElement(By.xpath("//div[@aria-label='minus']"));
        sub.click();
        Thread.sleep(3000);
        //click 0n "8"
        WebElement eight = driver.findElement(By.xpath("//div[text()='8']"));
        eight.click();
        Thread.sleep(3000);
        //click on "="
        WebElement equal1 = driver.findElement(By.xpath("//div[text()='=']"));
        equal1.click();
        Thread.sleep(3000);
        //printing result
        WebElement result1 = driver.findElement(By.xpath("//span[@class='qv3Wpe']"));
        String resultText1 = result1.getText();
        System.out.println("The result of sub operation is: "+resultText1);
        System.out.println("end Test case: testCase02");
    }


    public  void testCase03() throws InterruptedException{
        System.out.println("Start Test case: testCase03");
        driver.get("https://www.google.com");
        Thread.sleep(3000);
        //send "Calculator" text to search box
        WebElement searchbox = driver.findElement(By.id("APjFqb"));
        searchbox.sendKeys("calculator");
        searchbox.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        //perform mul operation
        //click on "1"
        WebElement one = driver.findElement(By.xpath("//div[text()='1']"));
        one.click();
        Thread.sleep(3000);
        //click on "0"
        WebElement zero = driver.findElement(By.xpath("//div[text()='0']"));
        zero.click();
        Thread.sleep(3000);
        //click on "*"
        WebElement mul = driver.findElement(By.xpath("//div[@aria-label='multiply']"));
        mul.click();
        Thread.sleep(3000);
        //click 0n "3"
        WebElement three = driver.findElement(By.xpath("//div[text()='3']"));
        three.click();
        Thread.sleep(3000);
        //click on "="
        WebElement equal = driver.findElement(By.xpath("//div[text()='=']"));
        equal.click();
        Thread.sleep(3000);
        //printing result
        WebElement result = driver.findElement(By.xpath("//span[@class='qv3Wpe']"));
        String resultText = result.getText();
        System.out.println("The result of mul operation is: "+resultText);
        //perform substraction operation
        //click on "AC"
        WebElement ac = driver.findElement(By.xpath("//div[text()='AC']"));
        ac.click();
        Thread.sleep(3000);
        //ensure that display is clear
        WebElement displayZero = driver.findElement(By.id("cwos"));
        String zeroText = displayZero.getText();
        System.out.println("The value is: " +zeroText);
        System.out.println("Display is clear");
        System.out.println("end Test case: testCase03");
    }


    public  void testCase04() throws InterruptedException{
        System.out.println("Start Test case: testCase04");
        driver.get("https://www.google.com");
        Thread.sleep(3000);
        //send "Calculator" text to search box
        WebElement searchbox = driver.findElement(By.id("APjFqb"));
        searchbox.sendKeys("calculator");
        searchbox.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        //perform div operation
        //click on "2"
        WebElement two = driver.findElement(By.xpath("//div[text()='2']"));
        two.click();
        Thread.sleep(3000);
        //click on "0"
        WebElement zero = driver.findElement(By.xpath("//div[text()='0']"));
        zero.click();
        Thread.sleep(3000);
        //click on "/"
        WebElement mul = driver.findElement(By.xpath("//div[@aria-label='divide']"));
        mul.click();
        Thread.sleep(3000);
        //click 0n "4"
        WebElement four = driver.findElement(By.xpath("//div[text()='4']"));
        four.click();
        Thread.sleep(3000);
        //click on "="
        WebElement equal = driver.findElement(By.xpath("//div[text()='=']"));
        equal.click();
        Thread.sleep(3000);
        //printing result
        WebElement result = driver.findElement(By.xpath("//span[@class='qv3Wpe']"));
        String resultText = result.getText();
        System.out.println("The result of div operation is: "+resultText);
        System.out.println("end Test case: testCase04");
    }


}
