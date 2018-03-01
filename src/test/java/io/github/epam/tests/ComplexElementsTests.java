package io.github.epam.tests;

import io.github.epam.EpamGithubSite;
import io.github.epam.SimpleTestsInit;
import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.github.epam.EpamGithubSite.contactFormPage;
import static io.github.epam.EpamGithubSite.homePage;
import static io.github.epam.EpamGithubSite.metalAndColorsPage;
import static io.github.epam.entities.Users.DEFAULT_USER;
import static io.github.epam.entities.Users.USER_WITH_CONTACTS;
import static io.github.epam.steps.Preconditions.loggedIn;
import static java.util.Arrays.asList;
import static org.junit.Assert.*;


public class ComplexElementsTests extends SimpleTestsInit {

    @BeforeMethod
    public void before() {
        loggedIn();
        metalAndColorsPage.shouldBeOpened();
    }
    @Test
    public void complexTest() {
        metalAndColorsPage.colors.select("Green");
        metalAndColorsPage.metals.select("Gold");
        metalAndColorsPage.vegetables.select("Onion", "Tomato");
        System.out.println("Set elements");
    }
}
