package io.github.epam.steps;

import static io.github.epam.EpamGithubSite.homePage;
import static io.github.epam.entities.Users.DEFAULT_USER;

/**
 * Created by Roman_Iovlev on 3/1/2018.
 */
public class Preconditions {
    public static void loggedIn() {
        if (!homePage.header.piterChailovskii.displayedNow()) {
            homePage.header.userIcon.click();
            homePage.header.loginForm.loginAs(DEFAULT_USER);
        }
    }
    public static void loggedOut() {
        if (homePage.header.piterChailovskii.displayedNow()) {
            homePage.header.userIcon.click();
            homePage.header.logout.click();
        }
    }
}
