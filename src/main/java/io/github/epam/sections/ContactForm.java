package io.github.epam.sections;
import com.epam.jdi.uitests.web.selenium.elements.common.*;
import com.epam.jdi.uitests.web.selenium.elements.complex.*;
import com.epam.jdi.uitests.web.selenium.elements.composite.*;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects.*;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.*;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.FindBy;

public class ContactForm extends Form{
	@Css("select") public Dropdown gender;
	@XPath(".//button[@type='submit']") public Button submit;
	@Css("input[type=checkbox]#Passport") public CheckBox passport;
	@Css("input[type=checkbox]#accept-conditions") public CheckBox acceptConditions;
	@Css("input[type=text]#Name") public TextField name;
	@Css("input[type=text]#LastName") public TextField lastName;
	@Css("input[type=text]#Position") public TextField position;
	@Css("input[type=text]#Number") public TextField number;
	@Css("input[type=text]#Seria") public TextField seria;
	@Css("input[type=text]#Email") public TextField email;
	@Css("input[type=text]#Phone") public TextField phone;
	@Css("textarea") public TextArea description;
}