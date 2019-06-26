package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends Page {

    @FindBy(id = "message")
    private WebElement messageInput;

    protected ContactUsPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkIsMessageIsDisplayed() {
        return checkIfElementIsDisplayed(messageInput);
    }
}
