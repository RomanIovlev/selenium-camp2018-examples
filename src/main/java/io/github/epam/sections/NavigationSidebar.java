package io.github.epam.sections;
import com.epam.jdi.uitests.web.selenium.elements.common.*;
import com.epam.jdi.uitests.web.selenium.elements.complex.*;
import com.epam.jdi.uitests.web.selenium.elements.composite.*;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects.*;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.*;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.FindBy;

public class NavigationSidebar extends Section{
	@XPath(".//*[contains(@class,'sidebar-menu')]//li//span[contains(.,'Home')]") public Label home;
	@XPath(".//*[contains(@class,'sidebar-menu')]//li//span[contains(.,'Contact form')]") public Label contactForm;
	@XPath(".//*[contains(@class,'sidebar-menu')]//li//span[contains(.,'Service')]") public Label service;
	@XPath(".//*[contains(@class,'sidebar-menu')]//li//span[contains(.,'Support')]") public Label support;
	@XPath(".//*[contains(@class,'sidebar-menu')]//li//span[contains(.,'Dates')]") public Label dates;
	@XPath(".//*[contains(@class,'sidebar-menu')]//li//span[contains(.,'Complex Table')]") public Label complexTable;
	@XPath(".//*[contains(@class,'sidebar-menu')]//li//span[contains(.,'Simple Table')]") public Label simpleTable;
	@XPath(".//*[contains(@class,'sidebar-menu')]//li//span[contains(.,'User Table')]") public Label userTable;
	@XPath(".//*[contains(@class,'sidebar-menu')]//li//span[contains(.,'Table with pages')]") public Label tableWithPages;
	@XPath(".//*[contains(@class,'sidebar-menu')]//li//span[contains(.,'Different elements')]") public Label differentElements;
	@XPath(".//*[contains(@class,'sidebar-menu')]//li//span[contains(.,'Metals & Colors')]") public Label metalsColors;
}