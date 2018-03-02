package io.github.epam.tests;

import io.github.epam.EpamGithubSite;
import io.github.epam.SimpleTestsInit;
import io.github.epam.enums.ColorsList;
import io.github.epam.enums.Metals;
import io.github.epam.enums.Navigation;
import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.github.epam.EpamGithubSite.*;
import static io.github.epam.entities.Users.DEFAULT_USER;
import static io.github.epam.entities.Users.USER_WITH_CONTACTS;
import static io.github.epam.enums.ColorsList.Green;
import static io.github.epam.enums.Metals.Gold;
import static io.github.epam.enums.Navigation.ComplexTable;
import static io.github.epam.enums.Navigation.ContactForm;
import static io.github.epam.enums.Navigation.Home;
import static io.github.epam.enums.Vegetables.Onion;
import static io.github.epam.enums.Vegetables.Tomato;
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
        metalAndColorsPage.colors.select(Green);
        metalAndColorsPage.metals.select(Gold);
        metalAndColorsPage.vegetables.select(Onion, Tomato);
        System.out.println("Set elements");
    }
    @Test
    public void navigationTest() {
        navigation.select(ContactForm);
        contactFormPage.checkOpened();
        navigation.select(Home);
        homePage.checkOpened();
        navigation.select(ComplexTable);
    }
}
