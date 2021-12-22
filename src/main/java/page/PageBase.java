package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageBase {

    // create constructor
    public PageBase(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

}
