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
    }

    @Test
    public void cadastroPfAnoNascimentoInvalido(){
        cadastroPagesPF.preencherCampoComDataNascimentoCompleta();
    }

    @Test
    public void cadastroPjEmailInvalido(){
        cadastroPagesPJ.EmailInvalido();
    }

    @Test
    public void cadastroPjNomeSobrenomeObrigatorio(){
        cadastroPagesPJ.nomeSobrenomeObrigatorios();
    }


    @AfterClass
    public static void tearDownAfterClass() throws Exception{
        // driver.quit();
    }
}


/*
       ok 1 teste: cadastro pagina pf
       ok 2 teste: cadastro pagina pj

       ok 3 teste: cpf invalido pagina pf
       ok 4 teste: data nascimento completa obrigatoria pagina pf
       ok 5 teste: email invalido pagina pj
       ok 6 teste: prenchimento de nome e sobrenome obrigatorio pagina pj
        */
