package com.bancolombia.personas.calidad.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.bancolombia.personas.calidad.userInterfaces.UserPage.SIMULATE_CREDIT_BUTTON;

public class BancolombiaCreditPage implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SIMULATE_CREDIT_BUTTON));
    }

    public static BancolombiaCreditPage go(){
        return Tasks.instrumented(BancolombiaCreditPage.class);
    }
}
