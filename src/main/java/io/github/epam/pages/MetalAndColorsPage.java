package io.github.epam.pages;

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
	) public Dropdown colors;
	@JComboBox(
		root = @FindBy(css ="[ui=combobox]"),
		value = @FindBy(css = "[value]"),
		list = @FindBy(css = "li"),
		expand = @FindBy(css = ".caret")
	) public ComboBox metals;
	@JDropList(
		root = @FindBy(css ="[ui=droplist]"),
		value = @FindBy(css = "[value]"),
		list = @FindBy(css = "li"),
		expand = @FindBy(css = ".caret")
	) public DropList vegetables;
	@XPath(".//button[@type='submit' and contains(.,'Calculate')]") public Button calculate;
	@XPath(".//button[@type='submit' and contains(.,'Submit')]") public Button submit;
	@Css("input[type=checkbox]#g1") public CheckBox g1;
	@Css("input[type=checkbox]#g2") public CheckBox g2;
	@Css("input[type=checkbox]#g3") public CheckBox g3;
	@Css("input[type=checkbox]#g4") public CheckBox g4;
	@Css("input[type=checkbox]#g5") public CheckBox g5;
	@Css("input[type=checkbox]#g6") public CheckBox g6;
	@Css("input[type=checkbox]#g7") public CheckBox g7;
	@Css("input[type=checkbox]#g8") public CheckBox g8;
}