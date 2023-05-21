package com.bancolombia.personas.calidad.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.bancolombia.personas.calidad.userInterfaces.UserPage.*;

public class BancolombiaPersonaPage implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUTTON_CLOSE_PROMPT));
        actor.attemptsTo(Click.on(PRODUCTS_SERVICES_MENU));
        actor.attemptsTo(Click.on(CREDIT_LINK));
    }

    public static BancolombiaPersonaPage go(){
        return Tasks.instrumented(BancolombiaPersonaPage.class);
    }
}
