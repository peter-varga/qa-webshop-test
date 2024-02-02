package demo.helper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;

public class Scroll implements Interaction {

	private WebElementFacade facade;
	
	private Scroll(WebElementFacade facade) {
		this.facade = facade;
	}

	public static Scroll to(WebElementFacade facade) {
		return new Scroll(facade);
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		WebElement element = (WebElement) facade;
				new Actions(BrowseTheWeb.as(actor).getDriver())
                .scrollToElement(element)
                .perform();
	}
}
