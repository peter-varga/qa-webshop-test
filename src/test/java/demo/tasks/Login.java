package demo.tasks;

import demo.pages.LoginPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login {
	public static Performable withCredentials(String userName,String password) {
        return Task.where("{0} fills the userName field, password field and clicks on login",
                Clear.field(LoginPage.USERNAME_FIELD),
                Clear.field(LoginPage.PASSWORD_FIELD),
        		Enter.theValue(userName)
                	.into(LoginPage.USERNAME_FIELD),
                Enter.theValue(password)
                			.into(LoginPage.PASSWORD_FIELD))
                	.then(Click.on(LoginPage.LOGIN_BUTTON));
    }
}
