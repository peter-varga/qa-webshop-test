package demo.pages;

import demo.helper.TestData;
import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl(TestData.DEFAULT_URL)
public class LoginPage extends PageObject {
	public static Target USERNAME_FIELD = Target.the(" username field").locatedBy("//input[contains(@id,'user-name')]");
	public static Target PASSWORD_FIELD = Target.the(" password field").locatedBy("//input[contains(@id,'password')]");
	public static Target LOGIN_BUTTON = Target.the(" login button").locatedBy("//input[contains(@id,'login-button')]");
	public static Target ERROR_DATA = Target.the(" error data").locatedBy("//*[contains(@class,'error-message-container')]");

}
