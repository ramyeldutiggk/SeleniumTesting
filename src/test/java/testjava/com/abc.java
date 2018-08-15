package testjava.com;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class abc {

    @Test
    public void startWebDriver() throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");

        //System.setProperty("webdriver.ie.driver","C:\\Users\\Administrator\\Downloads\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
        //System.setProperty("webdriver.firefox.driver","C:\\Program Files\\Internet Explorer\\iexplore.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://mycutebaby.in/contest/participant/?n=5b69685489a79");
        Thread.sleep(5000);
        WebElement inputname;
        inputname = driver.findElement(By.id("v"));
        inputname.sendKeys("Ramakrishna Y");
        Thread.sleep(10000);
        WebElement btn;
        btn = driver.findElement(By.id("vote_btn"));
        btn.click();
        Thread.sleep(60000);
        driver.close();

    }
}
