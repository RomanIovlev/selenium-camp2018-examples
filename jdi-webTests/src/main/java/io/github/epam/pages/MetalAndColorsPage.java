package io.github.epam.pages;

import io.github.epam.enums.ColorsList;
import io.github.epam.enums.Metals;
import io.github.epam.enums.Vegetables;
import io.github.epam.sections.*;
import com.epam.jdi.uitests.web.selenium.elements.common.*;
import com.epam.jdi.uitests.web.selenium.elements.complex.*;
import com.epam.jdi.uitests.web.selenium.elements.composite.*;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects.*;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.*;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.FindBy;

public class MetalAndColorsPage extends WebPage {
	@Css("header") public Header header;
	@Css("footer") public Footer footer;
	@Css(".uui-side-bar[name='navigation-sidebar']") public NavigationSidebar navigationSidebar;
	@Css(".uui-side-bar[name='log-sidebar']") public LogSidebar logSidebar;
	@JDropdown(
		root = @FindBy(css ="[ui=dropdown]"),
		value = @FindBy(css = "[value]"),
		list = @FindBy(css = "li"),
		expand = @FindBy(css = ".caret")
	) public Dropdown<ColorsList> colors;
	@JComboBox(
		root = @FindBy(css ="[ui=combobox]"),
		value = @FindBy(css = "[value]"),
		list = @FindBy(css = "li"),
		expand = @FindBy(css = ".caret")
	) public ComboBox<Metals> metals;
	@JDropList(
		root = @FindBy(css ="[ui=droplist]"),
		value = @FindBy(css = "[value]"),
		list = @FindBy(css = "li"),
		expand = @FindBy(css = ".caret")
	) public DropList<Vegetables> vegetables;
	@XPath(".//button[@type='submit' and contains(.,'Calculate')]") public Button calculate;
	@XPath(".//button[@type='submit' and contains(.,'Submit')]") public Button submit;
}