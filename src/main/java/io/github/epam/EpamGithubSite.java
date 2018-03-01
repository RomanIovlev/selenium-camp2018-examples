package io.github.epam;

import io.github.epam.pages.*;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.*;

@JSite("https://epam.github.io")
public class EpamGithubSite extends WebSite {
	@JPage(url = "/JDI/index.html", title = "Home Page")
	public static HomePage homePage;
	@JPage(url = "/JDI/contacts.html", title = "Contact Form")
	public static ContactFormPage contactFormPage;
	@JPage(url = "/JDI/metals-colors.html", title = "Metal and Colors")
	public static MetalAndColorsPage metalAndColorsPage;
}