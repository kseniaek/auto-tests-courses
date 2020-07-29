import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Text {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ksenia\\IdeaProjects\\test-selenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();//инициализировали драйвер
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        WebElement searchInput = driver.findElement(By.xpath("//input[@id='searchInput']"));
        System.out.println(searchInput);
        searchInput.sendKeys("Cat");

        WebElement searchButton = driver.findElement(By.xpath("//input[@id='searchButton']"));
        searchButton.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Kek");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        //выведем в консоль значение, которое мы ранее ввели в инпут
        System.out.println(driver.findElement(By.xpath("//input[@id='searchInput']")).getAttribute("value"));

        driver.findElement(By.xpath("//input[@id='searchInput']")).clear();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.quit();

    }
}
