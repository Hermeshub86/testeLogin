import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testeLogin {

    private WebDriver driver;

    @Before
    public void abrir() {
        System.setProperty("webdriver.gecko.driver","C:/Users/hiden/Downloads/quality_Assurance/testeLogin/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");
    }

    @After
    public void sair() {
        driver.quit();
    }

    @Test
    public void loginTest() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div[3]/form/table/tbody/tr[1]/td/input")).sendKeys("hermesB2909");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div[3]/form/table/tbody/tr[2]/td/input")).sendKeys("29292909");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div[3]/form/table/tbody/tr[3]/td/textarea")).sendKeys("testando a caixa de login do site do cliente.");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div[3]/form/table/tbody/tr[5]/td/input[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div/div[3]/form/table/tbody/tr[6]/td/input[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div/div[3]/form/table/tbody/tr[7]/td/select/option[3]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div/div[3]/form/table/tbody/tr[9]/td/input[2]")).click();
        Thread.sleep(3000);
        Assert.assertEquals("Submitted Values",driver.findElement(By.xpath("/html/body/div/div[3]/h2")).getText());
        Thread.sleep(3000);
    }
}
