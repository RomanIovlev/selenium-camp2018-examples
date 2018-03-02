package io.github.epam;

import com.epam.jdi.uitests.web.selenium.elements.complex.Menu;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.Css;
import io.github.epam.enums.Navigation;
import io.github.epam.pages.*;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.*;

@JSite("https://epam.github.io/JDI")
public class EpamGithubSite extends WebSite {
	@JPage(url = "/index.html", title = "Home Page")
	public static HomePage homePage;
	@JPage(url = "/contacts.html", title = "Contact Form")
	public static ContactFormPage contactFormPage;
	@JPage(url = "/metals-colors.html", title = "Metal and Colors")
	public static MetalAndColorsPage metalAndColorsPage;

	@Css("[ui=label]")
	public static Menu<Navigation> navigation;
}