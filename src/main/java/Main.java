import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe"); // путь до файла хром драйвера необходимой версии
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize(); // Открывает браузер в полном окне

driver.get("http://develop.git-rus.ru:8081/PortalDB/");

        Thread.sleep(3000);

        WebElement input = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div/div/div[2]/div/div/div"));

        input.click();
        Thread.sleep(3000);
        WebElement input1 = driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/table/tbody/tr[2]/td"));

        input1.click();
        Thread.sleep(2000);
        WebElement input2 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div/div/div[3]/div/div/span"));

        input2.click();
        Thread.sleep(2000);

        WebElement input3 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div/div/div/div[1]/div/div/fieldset/div[1]/div/table/tbody/tr[1]/td[3]/input"));
        input3.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div/div/div/div[1]/div/div/fieldset/div[1]/div/table/tbody/tr[1]/td[3]/input")).sendKeys("zotkinly");

        WebElement input4 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div/div/div/div[1]/div/div/fieldset/div[1]/div/table/tbody/tr[2]/td[3]/input"));
        input4.click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div/div/div/div[1]/div/div/fieldset/div[1]/div/table/tbody/tr[2]/td[3]/input")).sendKeys("25111999ly");

        WebElement input5 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div/div/div/div[1]/div/div/fieldset/div[3]/div/div/div[1]/div/div/span"));
        input5.click();

        Thread.sleep(2000);

        WebElement input6 = driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/div[1]/div/div/div/div[3]/div/div/input"));
        input6.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/div[1]/div/div/div/div[3]/div/div/input")).sendKeys("СМП");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/div[1]/div/div/div/div[3]/div/div/input")).sendKeys(Keys.ENTER);

        Thread.sleep(4000);
        WebElement input7 = driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/div[2]/div/div/div[1]/div[10]/div[1]/div"));
        input7.click();




    driver.get("http://develop.git-rus.ru/ext03_5/arm_callreceive_mordovia.html?key=98508d1b246a65233fa34bde1f8483c35d36ccc0f74d67991efcf42d058e978a5931a36315b2ceae48c23f817ee4a6abc3dfa198514dca23572dddb4c186a6b2&session=31321");
            Thread.sleep(7000);

    WebElement button = driver.findElement(By.id("btn_new_call"));
    button.click();
    Thread.sleep(4000);
            WebElement povod = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div/div/div[3]/div/div/div/div/div/div/div[1]/div/div/div[1]/div/div/div[1]/div/div/div[1]/div/div[1]/div[2]"));
            povod.click();

    driver.findElement((By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div/div/div[3]/div/div/div/div/div/div/div[1]/div/div/div[1]/div/div/div[1]/div/div/div[1]/div/div[1]/div[1]/input"))).sendKeys("Аллергия");
    driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div/div/div[3]/div/div/div/div/div/div/div[1]/div/div/div[1]/div/div/div[1]/div/div/div[1]/div/div[1]/div[1]/input")).sendKeys(Keys.ENTER);
            Thread.sleep(4000);

    driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div/div/div[3]/div/div/div/div/div/div/div[1]/div/div/div[1]/div/div/div[2]/div/div/div/div/div[1]/div/input")).sendKeys("Тест");

    driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div/div/div[3]/div/div/div/div/div/div/div[3]/div/div/div[2]/div/div/div[1]/div/div[1]/div[1]/input")).sendKeys("Глазунова");
    driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div/div/div[3]/div/div/div/div/div/div/div[3]/div/div/div[2]/div/div/div[1]/div/div[1]/div[1]/input")).sendKeys(Keys.ENTER);

    driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div/div/div[3]/div/div/div/div/div/div/div[3]/div/div/div[3]/div/div/div[1]/div/div[1]/div[1]/input")).sendKeys("Квартира");

    driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div/div/div[3]/div/div/div/div/div/div/div[3]/div/div/div[2]/div/div/div[3]/div/div/div[2]/div/div[1]/div/input")).sendKeys("7");

    driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div/div/div[3]/div/div/div/div/div/div/div[3]/div/div/div[2]/div/div/div[3]/div/div/div[4]/div/div[1]/div/input")).sendKeys("180");

    driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div/div/div[3]/div/div/div/div/div/div/div[3]/div/div/div[5]/div/div/div[1]/div/div[1]/div[1]/input")).sendKeys("Арбеково");

    driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div/div/div[3]/div/div/div/div/div/div/div[6]/div/div/div[1]/div/div/div[1]/div/div/div/div/div[1]/div/input")).sendKeys("Тестович");

    driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div/div/div[3]/div/div/div/div/div/div/div[6]/div/div/div[1]/div/div/div[3]/div/div/div[1]/div/div[1]/div[1]/input")).sendKeys("Тест");

    driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div/div/div[3]/div/div/div/div/div/div/div[6]/div/div/div[1]/div/div/div[3]/div/div/div[2]/div/div[1]/div[1]/input")).sendKeys("Тестикс");

    driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div/div/div[3]/div/div/div/div/div/div/div[6]/div/div/div[1]/div/div/div[4]/div/div/div[2]/div/div[1]/div/input")).sendKeys("12");
    driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div/div/div[3]/div/div/div/div/div/div/div[6]/div/div/div[2]/div/div/div[3]/div/div[1]/div/input")).sendKeys("89374212144");

    driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div/div/div[3]/div/div/div/div/div/div/div[6]/div/div/div[1]/div/div/div[4]/div/div/div[4]/div/div[1]/div[1]/input")).sendKeys("М");

    driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div/div/div[3]/div/div/div/div/div/div/div[8]/div/div/div[1]/div/div[1]/div/input")).sendKeys("Тест");

    WebElement zavershit = driver.findElement(By.id("button-1277-btnInnerEl"));
    zavershit.click();

    Thread.sleep(4000);
    driver.findElement(By.xpath("/html/body/div[20]/div[3]/div/div/a")).sendKeys(Keys.F8);

    }
}
