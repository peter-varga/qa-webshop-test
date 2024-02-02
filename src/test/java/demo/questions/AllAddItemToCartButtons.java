package demo.questions;

import java.util.List;

import demo.pages.InventoryPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

@Subject("the add item to cart button")
public class AllAddItemToCartButtons implements Question<List<String>> {
	@Override
	public List<String> answeredBy(Actor actor) {
		return InventoryPage.ADD_ITEM_TO_CART_BUTTON_ALL.resolveAllFor(actor).texts();
	}
	public static Question<List<String>> value() {return new AllAddItemToCartButtons();}
}
