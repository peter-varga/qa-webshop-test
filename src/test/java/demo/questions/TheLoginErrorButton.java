package demo.questions;

import demo.pages.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.annotations.Subject;

@Subject("the login error button")
public class TheLoginErrorButton implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		return BrowseTheWeb.as(actor).findBy(LoginPage.ERROR_DATA.getCssOrXPathSelector()).getText();
	}
	
	public static Question<String> value() { return new TheLoginErrorButton();}
}
