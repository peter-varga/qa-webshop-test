package demo.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Switch;

public class Alert {
	public static Performable accept() {
        return Task.where("{0} accepts alert dialog",
        			Switch.toAlert().andAccept()
                );
    }
}
