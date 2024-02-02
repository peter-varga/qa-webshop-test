package demo.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;

import demo.helper.TestData;
import demo.pages.LoginPage;
import demo.questions.AllAddItemToCartButtons;
import demo.questions.TheAddItemToCartButton;
import demo.questions.TheShoppingCartBadge;
import demo.tasks.AddItemToCart;
import demo.tasks.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;

public class AddItemStepdefinitions {
	
	@Given("{actor} is logged in as a standard user")
	public void actor_is_loggedin(Actor actor) {
		actor.attemptsTo(Open.browserOn().the(LoginPage.class));
		actor.attemptsTo(Login.withCredentials(TestData.STANDARD_USER_USERNAME, TestData.STANDARD_USER_PASSWORD));
	}
	
	@When("{actor} adds a {string} to the cart")
	public void actor_adds_item_to_cart(Actor actor, String itemName) {
		actor.attemptsTo(AddItemToCart.withName(itemName));
	}
	
	@When("{actor} adds all items to the cart")
	public void actor_adds_all_items_to_cart(Actor actor) {
		actor.attemptsTo(AddItemToCart.all());
	}
	
	@Then("{actor} sees the number of items in the cart is increased by {int}")
	public void actor_see_that_itemcount_increased(Actor actor, int expectedCount) {
		actor.should(seeThat(TheShoppingCartBadge.value(), equalTo(String.valueOf(expectedCount))));
	}
	
	@Then("{actor} sees there is {int} items in the cart")
	public void actor_see_full_cart(Actor actor, int itemCount) {
		actor.should(seeThat(TheShoppingCartBadge.value(), equalTo(String.valueOf(itemCount))));
	}
	
	@Then("{actor} sees that all items are removable.")
	public void actor_sees_items_are_available(Actor actor) {
		actor.should(seeThat(AllAddItemToCartButtons.value(), hasSize(0)));
	}
	
	@Then("{actor} sees the add item to cart button text of {string} changed to {string}.")
	public void actor_see_that_additembutton_changed(Actor actor, String itemName, String expectedText) {
		actor.should(seeThat(TheAddItemToCartButton.value(itemName), equalTo(expectedText)));
	}
}
