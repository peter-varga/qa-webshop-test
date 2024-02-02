package demo.pages;

import demo.helper.TestData;
import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl(TestData.INVENTORY_URL)
public class InventoryPage extends PageObject {
	public static Target ADD_ITEM_TO_CART_BUTTON = Target.the(" add {0} to cart button")
			.locatedBy("//button[contains(@id,'-sauce-labs-{0}')]");
	public static Target ADD_ITEM_TO_CART_BUTTON_ALL = Target.the(" all add item to cart buttons")
			.locatedBy("//button[contains(@id,'add-to-cart-')]");
	public static Target SHOPPING_CART_BADGE = Target.the(" shopping cart badge span")
			.locatedBy("//div[contains(@id,'shopping_cart_container')]//span");
	public static Target FOOTER = Target.the(" footer").locatedBy("//footer");
}
