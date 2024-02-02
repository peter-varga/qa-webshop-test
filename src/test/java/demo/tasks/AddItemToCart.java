package demo.tasks;

import demo.pages.InventoryPage;
import demo.helper.ClickOn;
import demo.helper.Scroll;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AddItemToCart {
	
	public static Performable withName(String itemName) {
		return Task.where("{0} adds an item with name:" + itemName + " to the cart",
				Click.on(InventoryPage.ADD_ITEM_TO_CART_BUTTON.of(itemName.toLowerCase())));
	}
	
	public static Performable all() {
		return Task.where("{0} adds all items to the cart",
				ClickOn.every(InventoryPage.ADD_ITEM_TO_CART_BUTTON_ALL)
				);
	}
}
