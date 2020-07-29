import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;

public class MainClass {

    public static void main(String[] args) {
        //инициализируем драйвер для браузера
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ksenia\\IdeaProjects\\test-selenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();//инициализировали драйвер

        driver.manage().window().maximize();//развертывает окно браузера на полный экран
        //driver.manage().window().setSize(new Dimension(900, 500));//задаем размер окна

        driver.get("https://pikabu.ru"); //указываем, какой сайт запустить
        //driver.navigate().to("https://pikabu.ru/best"); //альтернативный метод открытия сайта

        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//неявное ожидание 10 сек

        //поиск одного элемента с помощью класса BY
        //driver.findElement(By.linkText("Лучшее"));//поиск одного элемента по тексту ссылки

        //записываем значение, которое вернут метод findElement в переменную link с типом WebElement
        //WebElement link = driver.findElement(By.linkText("Горячее"));
        WebElement link2 = driver.findElement(By.partialLinkText("Луч"));//поиск элемента по части текста ссылки
        System.out.println(link2);
        WebElement nameOfElement = driver.findElement(By.name("q"));//поиск по name элемента
        System.out.println(nameOfElement);

        WebElement searchButton = driver.findElement(By.className("sprite"));//по названию класса
        driver.findElement(By.id("vk_groups"));//поиск по id
        driver.findElement(By.tagName("aside"));//по тегу
        driver.findElement(By.cssSelector("button.button"));//поиск по селектору (тэг button с классом button)
        //пример селектора div#p-namespace > h3 найдет элемент h3 внутри div с id=p-namespace
        driver.findElement(By.xpath("//div[@id = 'community_footer']/*"));//поиск по Xpath





        //driver.navigate().back();//возвращает на предыдущую страницу
        //driver.navigate().forward();//снова переход на следующую страницу
        //driver.navigate().refresh();//обновление страницы

        System.out.println(driver.getTitle());//получим и выведем тайтл страницы
        System.out.println(driver.getCurrentUrl());//получим и выведем в консоль текущий url страницы

        //после выполнения программы браузер автоматически не закрывается
        driver.quit();//закрывает браузер


    }


}
