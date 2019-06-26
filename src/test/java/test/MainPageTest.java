package test;

import core.SetUpTests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.MainPage;

import static org.assertj.core.api.Assertions.assertThat;

public class MainPageTest extends SetUpTests {

    private MainPage mainPage;

    @BeforeClass
    private void setupTest() {
        mainPage = openMainPage();
    }

    @Test
    public void checkTitle() {
        assertThat(mainPage.checkTitle()).isEqualTo("Dzięki Kamil za Code Review");
    }

    @Test
    public void shouldGoToContactUsPage() {
        assertThat(mainPage.clickOnContactUsButton().checkIsMessageIsDisplayed()).isTrue();
    }

}
