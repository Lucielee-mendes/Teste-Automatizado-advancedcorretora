package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class CadastroPagesPF {
    static WebDriver driver;

    public CadastroPagesPF(WebDriver driver){
        this.driver = driver;
    }

    public void preencherCampoPF(){

        WebElement pF = driver.findElement(By.id("PfButton"));
        pF.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        WebElement nome = driver.findElement(By.id("name"));
        nome.sendKeys("Ana");

        WebElement sobrenome = driver.findElement(By.id("lastname"));
        sobrenome.sendKeys("Sousa");

        WebElement data = driver.findElement(By.id("date"));
        data.sendKeys("10101997");

        WebElement cpf = driver.findElement(By.id("document"));
        cpf.sendKeys("368.674.530-58");

        WebElement ddi = driver.findElement(By.xpath("//body/div[@id='root-app']/div[1]/div[1]/form[1]/div[1]/div[3]/div[5]/div[1]/div[1]/a[1]/span[2]"));
        ddi.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebElement pesquisaDDIInput = driver.findElement(By.xpath("//body/div[6]/div[1]/input[1]"));
        pesquisaDDIInput.sendKeys("brasil");

        WebElement ddiSelecionado = driver.findElement(By.xpath(" //a[contains(text(),'Brasil - +55')]"));
        ddiSelecionado.click();

        WebElement ddd = driver.findElement(By.id("ddd"));
        ddd.sendKeys("51");

        WebElement telefone = driver.findElement(By.id("phone"));
        telefone.sendKeys("998547126");

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("anaSousa1@gmail.com");

        WebElement confEmail = driver.findElement(By.id("confEmail"));
        confEmail.sendKeys("anaSousa1@gmail.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        WebElement checkboxSouPEP = driver.findElement(By.xpath("//body/div[@id='root-app']/div[1]/div[1]/form[1]/div[1]/div[3]/div[10]/div[1]/div[1]/label[1]/span[1]"));
        checkboxSouPEP.click();

        WebElement checkboxLGPD = driver.findElement(By.xpath("//body/div[@id='root-app']/div[1]/div[1]/form[1]/div[1]/div[3]/div[12]/div[1]/div[1]/div[1]/label[1]/span[1]"));
        checkboxLGPD.click();

        WebElement cadastrar = driver.findElement(By.xpath("//body/div[@id='root-app']/div[1]/div[1]/form[1]/div[1]/div[3]/div[14]/button[1]"));
        cadastrar.click();




    }

    public void preencherCampoComCPFInvalido(){


        WebElement pF = driver.findElement(By.id("PfButton"));
        pF.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        WebElement nome = driver.findElement(By.id("name"));
        nome.sendKeys("Ana");

        WebElement sobrenome = driver.findElement(By.id("lastname"));
        sobrenome.sendKeys("Sousa");

        WebElement data = driver.findElement(By.id("date"));
        data.sendKeys("10101997");

        WebElement cpf = driver.findElement(By.id("document"));
        cpf.sendKeys("123.456.789-00");

        WebElement ddi = driver.findElement(By.xpath("//body/div[@id='root-app']/div[1]/div[1]/form[1]/div[1]/div[3]/div[5]/div[1]/div[1]/a[1]/span[2]"));
        ddi.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebElement ddiSelecionado = driver.findElement(By.xpath(" //a[contains(text(),'Brasil - +55')]"));
        ddiSelecionado.click();

        WebElement ddd = driver.findElement(By.id("ddd"));
        ddd.sendKeys("51");

        WebElement telefone = driver.findElement(By.id("phone"));
        telefone.sendKeys("998547126");

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("anaSousa1@gmail.com");

        WebElement confEmail = driver.findElement(By.id("confEmail"));
        confEmail.sendKeys("anaSousa1@gmail.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        WebElement checkboxSouPEP = driver.findElement(By.xpath("//body/div[@id='root-app']/div[1]/div[1]/form[1]/div[1]/div[3]/div[10]/div[1]/div[1]/label[1]/span[1]"));
        checkboxSouPEP.click();

        WebElement checkboxLGPD = driver.findElement(By.xpath("//body/div[@id='root-app']/div[1]/div[1]/form[1]/div[1]/div[3]/div[12]/div[1]/div[1]/div[1]/label[1]/span[1]"));
        checkboxLGPD.click();

        /*WebElement cadastrar = driver.findElement(By.xpath("//body/div[@id='root-app']/div[1]/div[1]/form[1]/div[1]/div[3]/div[14]/button[1]"));
        cadastrar.click();
*/
        /*WebElement errorMessage = driver.findElement(By.xpath("//span[contains(text(),'CPF inválido')]"));
        Assert.assertTrue(errorMessage.isDisplayed());*/


    }
    public void preencherCampoComDataNascimentoCompleta(){

        WebElement pF = driver.findElement(By.id("PfButton"));
        pF.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        WebElement nome = driver.findElement(By.id("name"));
        nome.sendKeys("Ana");

        WebElement sobrenome = driver.findElement(By.id("lastname"));
        sobrenome.sendKeys("Sousa");

        WebElement data = driver.findElement(By.id("date"));
        data.sendKeys("1010");

        WebElement cpf = driver.findElement(By.id("document"));
        cpf.sendKeys("368.674.530-58");

        WebElement ddi = driver.findElement(By.xpath("//body/div[@id='root-app']/div[1]/div[1]/form[1]/div[1]/div[3]/div[5]/div[1]/div[1]/a[1]/span[2]"));
        ddi.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebElement ddiSelecionado = driver.findElement(By.xpath(" //a[contains(text(),'Brasil - +55')]"));
        ddiSelecionado.click();

        WebElement ddd = driver.findElement(By.id("ddd"));
        ddd.sendKeys("51");

        WebElement telefone = driver.findElement(By.id("phone"));
        telefone.sendKeys("998547126");

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("anaSousa1@gmail.com");

        WebElement confEmail = driver.findElement(By.id("confEmail"));
        confEmail.sendKeys("anaSousa1@gmail.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        WebElement checkboxSouPEP = driver.findElement(By.xpath("//body/div[@id='root-app']/div[1]/div[1]/form[1]/div[1]/div[3]/div[10]/div[1]/div[1]/label[1]/span[1]"));
        checkboxSouPEP.click();

        WebElement checkboxLGPD = driver.findElement(By.xpath("//body/div[@id='root-app']/div[1]/div[1]/form[1]/div[1]/div[3]/div[12]/div[1]/div[1]/div[1]/label[1]/span[1]"));
        checkboxLGPD.click();

        /*WebElement cadastrar = driver.findElement(By.xpath("//body/div[@id='root-app']/div[1]/div[1]/form[1]/div[1]/div[3]/div[14]/button[1]"));
        cadastrar.click();
*/
        /*WebElement errorMessage = driver.findElement(By.xpath("//span[contains(text(),'CPF inválido')]"));
        Assert.assertTrue(errorMessage.isDisplayed());*/


    }


}
