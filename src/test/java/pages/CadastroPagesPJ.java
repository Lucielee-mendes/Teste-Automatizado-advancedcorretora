package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class CadastroPagesPJ {
    static WebDriver driver;

    public CadastroPagesPJ(WebDriver driver) {
        this.driver = driver;
    }


    public void abrirPJ(){
        WebElement pJ = driver.findElement(By.id("PjButton"));
        pJ.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }
    public void preencherCampoPJ(){
        abrirPJ();

        WebElement nome = driver.findElement(By.id("name"));
        nome.sendKeys("Ana");

        WebElement sobrenome = driver.findElement(By.id("lastname"));
        sobrenome.sendKeys("Sousa");

        WebElement razaoSocial = driver.findElement(By.id("companyName"));
        razaoSocial.sendKeys("Ana Sousa Estetica");

        WebElement data = driver.findElement(By.id("date"));
        data.sendKeys("10101997");

        WebElement cnpj = driver.findElement(By.id("document"));
        cnpj.sendKeys("39.874.006/0001-23");

        WebElement ddi = driver.findElement(By.xpath("//body/div[@id='root-app']/div[1]/div[1]/form[1]/div[1]/div[3]/div[6]/div[1]/div[1]/a[1]/span[2]"));
        ddi.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebElement ddiSelecionado = driver.findElement(By.xpath(" //a[contains(text(),'Brasil - +55')]"));
        ddiSelecionado.click();

        WebElement ddd = driver.findElement(By.id("ddd"));
        ddd.sendKeys("51");

        WebElement telefone = driver.findElement(By.id("phone"));
        telefone.sendKeys("998547126");

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("anaSousa2@gmail.com");

        WebElement confEmail = driver.findElement(By.id("confEmail"));
        confEmail.sendKeys("anaSousa2@gmail.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        WebElement checkboxLGPD = driver.findElement(By.xpath("//body/div[@id='root-app']/div[1]/div[1]/form[1]/div[1]/div[3]/div[11]/div[1]/div[1]/div[1]/label[1]/span[1]"));
        checkboxLGPD.click();


    }

    public void EmailInvalido(){

        abrirPJ();

        WebElement nome = driver.findElement(By.id("name"));
        nome.sendKeys("Ana");

        WebElement sobrenome = driver.findElement(By.id("lastname"));
        sobrenome.sendKeys("Sousa");

        WebElement razaoSocial = driver.findElement(By.id("companyName"));
        razaoSocial.sendKeys("Ana Sousa Estetica");

        WebElement data = driver.findElement(By.id("date"));
        data.sendKeys("10101997");

        WebElement cnpj = driver.findElement(By.id("document"));
        cnpj.sendKeys("39.874.006/0001-23");

        WebElement ddi = driver.findElement(By.xpath("//body/div[@id='root-app']/div[1]/div[1]/form[1]/div[1]/div[3]/div[6]/div[1]/div[1]/a[1]/span[2]"));
        ddi.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebElement ddiSelecionado = driver.findElement(By.xpath(" //a[contains(text(),'Brasil - +55')]"));
        ddiSelecionado.click();

        WebElement ddd = driver.findElement(By.id("ddd"));
        ddd.sendKeys("51");

        WebElement telefone = driver.findElement(By.id("phone"));
        telefone.sendKeys("998547126");

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("anaSousa2@");

        WebElement confEmail = driver.findElement(By.id("confEmail"));
        confEmail.sendKeys("anaSousa2@gmail.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        WebElement checkboxLGPD = driver.findElement(By.xpath("//body/div[@id='root-app']/div[1]/div[1]/form[1]/div[1]/div[3]/div[11]/div[1]/div[1]/div[1]/label[1]/span[1]"));
        checkboxLGPD.click();


    }

    public void nomeSobrenomeObrigatorios(){
        
      abrirPJ();

        WebElement nome = driver.findElement(By.id("name"));
        nome.sendKeys("Ana Sousa");

        WebElement sobrenome = driver.findElement(By.id("lastname"));
        sobrenome.sendKeys("");

        WebElement razaoSocial = driver.findElement(By.id("companyName"));
        razaoSocial.sendKeys("Ana Sousa Estetica");

        WebElement data = driver.findElement(By.id("date"));
        data.sendKeys("10101997");

        WebElement cnpj = driver.findElement(By.id("document"));
        cnpj.sendKeys("39.874.006/0001-23");

        WebElement ddi = driver.findElement(By.xpath("//body/div[@id='root-app']/div[1]/div[1]/form[1]/div[1]/div[3]/div[6]/div[1]/div[1]/a[1]/span[2]"));
        ddi.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebElement ddiSelecionado = driver.findElement(By.xpath(" //a[contains(text(),'Brasil - +55')]"));
        ddiSelecionado.click();

        WebElement ddd = driver.findElement(By.id("ddd"));
        ddd.sendKeys("51");

        WebElement telefone = driver.findElement(By.id("phone"));
        telefone.sendKeys("998547126");

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("anaSousa2@gmail.com");

        WebElement confEmail = driver.findElement(By.id("confEmail"));
        confEmail.sendKeys("anaSousa2@gmail.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        WebElement checkboxLGPD = driver.findElement(By.xpath("//body/div[@id='root-app']/div[1]/div[1]/form[1]/div[1]/div[3]/div[11]/div[1]/div[1]/div[1]/label[1]/span[1]"));
        checkboxLGPD.click();


    }
    public void verificarMensagemEmailInvalido(){
        WebElement mensagemErroEmailInvalido = driver.findElement(By.xpath("//span[contains(text(),'Digite um email válido')]"));
        String mensagemErro = mensagemErroEmailInvalido.getText();
        String mensagemErroEsperada = "Digite um email válido";
        assertEquals( mensagemErroEsperada, mensagemErro);
    }
    public void verificarMensagemConfEmailInvalido(){
        WebElement mensagemErroConfirmaEmail = driver.findElement(By.xpath("//p[contains(text(),'E-mail informado não confere, por favor verifique ')]"));
        String mensagemErro = mensagemErroConfirmaEmail.getText();
        String mensagemErroEsperada = "E-mail informado não confere, por favor verifique o e-mail informado.";
        assertEquals( mensagemErroEsperada, mensagemErro);
    }
    public void verificarMensagemSobrenomeObrigatorio(){
        WebElement mensagemErroSobrenomeObrigtorio = driver.findElement(By.xpath("//span[contains(text(),'Obrigatório')]"));
        String mensagemErro = mensagemErroSobrenomeObrigtorio.getText();
        String mensagemErroEsperada = "Obrigatório.";
        assertEquals( mensagemErroEsperada, mensagemErro);
    }



}
