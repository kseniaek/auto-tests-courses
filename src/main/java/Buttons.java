import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Buttons {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ksenia\\IdeaProjects\\test-selenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();//инициализировали драйвер
        driver.get("https://en.wikipedia.org/wiki/Main_Page");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        WebElement searchButton = driver.findElement(By.xpath("//input[@id='searchButton']"));
        System.out.println(searchButton);
        searchButton.click();

        WebElement logInLink = driver.findElement(By.xpath("//li[@id='pt-login']/a"));
        System.out.println(logInLink);
        logInLink.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement submitButton = driver.findElement(By.xpath("//button[@id='wpLoginAttempt']"));


        if (submitButton.getText().equals("Log in")){
            System.out.println("Button text is " + "'" + submitButton.getText() + "'. Вы восхитительны!" );//позволяет получить текст с кнопки
        }
        else System.out.println("Fail");

        driver.navigate().back();
        WebElement logInButton = driver.findElement(By.xpath("//li[@id='pt-login']/a"));


        submitButton.submit();//только для кнопок? для подтверждения



        driver.quit();

    }


}
