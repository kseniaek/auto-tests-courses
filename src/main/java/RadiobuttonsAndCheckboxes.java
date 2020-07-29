import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadiobuttonsAndCheckboxes {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ksenia\\IdeaProjects\\test-selenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();//инициализировали драйвер
        driver.get("https://market.yandex.ru/catalog--umnye-chasy-i-braslety/56034/list?hid=10498025&glfilter=10768929%3A12113449%2C12113450&onstock=1&local-offers-first=0");
        WebElement checkbox1 = driver.findElement(By.xpath("//input[@id='7893318_15083752']//ancestor::label"));
        checkbox1.click();

    }

}
