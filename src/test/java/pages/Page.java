package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {

    private static final int TIME_TO_WAIT = 5;

    protected final WebDriver driver;
    protected final WebDriverWait wait;


    protected Page(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, TIME_TO_WAIT);
    }

    protected boolean checkIfElementIsDisplayed(final WebElement element) {
        try {
            return wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        return false;
    }

}
