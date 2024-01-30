package demo.tasks;

import demo.pages.LoginPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
	public static Performable theInventorPage() {
        return Task.where("{0} opens the Todo list page",
                Open.browserOn().the(LoginPage.class));
    }
}
