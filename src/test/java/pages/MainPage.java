package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends Page {

    @FindBy(xpath = "//a[@title='Contact Us']")
    private WebElement contactUsButton;

    public MainPage(final WebDriver driver) {
        super(driver);
    }

    public String checkTitle() {
        return driver.getTitle();
    }

    public ContactUsPage clickOnContactUsButton() {
        contactUsButton.click();
        return new ContactUsPage(driver);
    }
}
