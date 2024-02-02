package demo.questions;

import demo.pages.InventoryPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.annotations.Subject;

@Subject("the shopping cart badge span")
public class TheShoppingCartBadge implements Question<String> {
	
	@Override
	public String answeredBy(Actor actor) {
		return BrowseTheWeb.as(actor).findBy(InventoryPage.SHOPPING_CART_BADGE.getCssOrXPathSelector()).getText();
	}
	
	public static Question<String> value() { return new TheShoppingCartBadge();}
}
