package demo.stepdefinitions;

import static org.hamcrest.Matchers.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import demo.helper.LoginFailureMessage;
import demo.pages.LoginPage;
import demo.questions.TheLoginErrorButton;
import demo.tasks.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;

public class LoginStepDefinitions {
	
	@Given("{actor} navigates to the loginpage")
	public void actor_is_opening_saucelabs(Actor actor) {
		actor.attemptsTo(Open.browserOn().the(LoginPage.class));
	}
	
	@When("{actor} logs in with username:{string},password:{string}")
	public void actor_logs_in(Actor actor, String userName, String password) {
		actor.attemptsTo(Login.withCredentials(userName, password));
	}
	
	@Then("{actor} sees that the login process is unsuccessful with error type:{string}.")
	public void actor_try_to_login(Actor actor, String errorType) {
		actor.should(seeThat(TheLoginErrorButton.value(), equalTo(LoginFailureMessage.valueOf(errorType).getMessage())));
	}

	@Then("{actor} is redirected to the inventory.")
	public void actor_is_redirected(Actor actor) {
		actor.attemptsTo(
				Ensure.thatTheCurrentPage().currentUrl().isEqualTo("https://www.saucedemo.com/inventory.html"));
	}
}
