package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

    @FindBy(id = "flash")
    public WebElement errorMsg;
    @FindBy(id = "username")
    private WebElement userName;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(xpath = "//*[@id=\"login\"]/button")
    public WebElement loginBt;
    @FindBy(xpath = "//*[@id=\"content\"]/div/a")
    public WebElement logoutBt;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void AddUserName (String value){
        userName.sendKeys(value);
    }
    public void AddPassWord (String value){
        password.sendKeys(value);
    }
    public void clickLogin (){
        loginBt.click();
    }
    public void clickLogout (){
        logoutBt.click();
    }
}