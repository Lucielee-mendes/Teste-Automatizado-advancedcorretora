package test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CadastroPagesPF;
import pages.CadastroPagesPJ;

import java.time.Duration;

public class CadastroTest {
    static WebDriver driver;

    static CadastroPagesPF cadastroPagesPF;
    static CadastroPagesPJ cadastroPagesPJ;


    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://cliente.advancedcorretora.com.br/signup");

        cadastroPagesPF = new CadastroPagesPF(driver);
        cadastroPagesPJ = new CadastroPagesPJ(driver);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement aceitarCookies = driver.findElement(By.id("onetrust-accept-btn-handler"));
        aceitarCookies.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void cadastroPF() {
         cadastroPagesPF.preencherCampoPF();
    }

    @Test
    public void cadastroPJ(){
        cadastroPagesPJ.preencherCampoPJ();
    }

    @Test
    public void cadastroPfCPFInvalido(){
        cadastroPagesPF.preencherCampoComCPFInvalido();
        cadastroPagesPF.verificarMensagemCpfInvalido();
    }

    @Test
    public void cadastroPfCampoComDataNascimentoCompleta(){
        cadastroPagesPF.preencherCampoComDataNascimentoCompleta();
        cadastroPagesPF.verificarMensagemDataNascimentoCompleta();
    }

    @Test
    public void cadastroPjEmailInvalido(){
        cadastroPagesPJ.EmailInvalido();
        cadastroPagesPJ.verificarMensagemEmailInvalido();
        cadastroPagesPJ.verificarMensagemConfEmailInvalido();
    }

    @Test
    public void cadastroPjNomeSobrenomeObrigatorio(){
        cadastroPagesPJ.nomeSobrenomeObrigatorios();
        cadastroPagesPJ.verificarMensagemSobrenomeObrigatorio();
    }


    @AfterClass
    public static void tearDownAfterClass() throws Exception{
        // driver.quit();
    }
}


