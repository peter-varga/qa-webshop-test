package demo.helper;

import java.util.List;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

public class ClickOn implements Interaction {

	private Target target;
	
	private ClickOn(Target target) {
		this.target = target;
	}
	
	public static ClickOn every(Target target) {
		return new ClickOn(target);
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		List<WebElementFacade> items = target.resolveAllFor(actor);
		items.forEach(item -> {
			item.click();
		});
	}

}
