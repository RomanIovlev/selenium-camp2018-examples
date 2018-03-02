package io.github.epam.tests;

import io.github.epam.SimpleTestsInit;
import org.testng.annotations.Test;

import static io.github.epam.EpamGithubSite.contactFormPage;
import static io.github.epam.EpamGithubSite.homePage;
import static io.github.epam.entities.Users.DEFAULT_USER;
import static io.github.epam.entities.Users.USER_WITH_CONTACTS;
import static io.github.epam.steps.Preconditions.loggedIn;
import static io.github.epam.steps.Preconditions.loggedOut;

public class FormsTests extends SimpleTestsInit {

    @Test
    public void loginTest() {
        loggedOut();
        homePage.header.userIcon.click();
        homePage.header.loginForm.loginAs(DEFAULT_USER);
        homePage.checkOpened();
    }
    @Test
    public void fillContactFormTest() {
        loggedIn();
        contactFormPage.shouldBeOpened();
        contactFormPage.checkOpened();
        contactFormPage.main.contactForm.submit(USER_WITH_CONTACTS);
        contactFormPage.main.contactForm.verify(USER_WITH_CONTACTS);
    }
}
