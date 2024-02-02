package demo.questions;

import demo.pages.InventoryPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.annotations.Subject;

@Subject("the add item to cart button")
public class TheAddItemToCartButton implements Question<String> {

	private String itemName;

	public TheAddItemToCartButton(String itemName) {
		this.setItemName(itemName);
	}
	
	@Override
	public String answeredBy(Actor actor) {
		return BrowseTheWeb.as(actor).findBy(InventoryPage.ADD_ITEM_TO_CART_BUTTON.of(itemName).getCssOrXPathSelector()).getText();
	}
	
	public static Question<String> value(String itemName) { return new TheAddItemToCartButton(itemName);}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
}
