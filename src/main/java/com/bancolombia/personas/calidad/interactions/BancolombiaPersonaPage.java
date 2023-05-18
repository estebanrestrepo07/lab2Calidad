package com.bancolombia.personas.calidad.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.bancolombia.personas.calidad.userInterfaces.UserPage.BUTTON_CLOSE_PROMPT;
import static com.bancolombia.personas.calidad.userInterfaces.UserPage.BUTTON_WANT_A_CREDIT_BANCOLOMBIA_PEOPLE;

public class BancolombiaPersonaPage implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
//     escribir en un field
//        actor.attemptsTo(Enter.theValue("U de A").into(BUTTON_WANT_A_CREDIT_BANCOLOMBIA_PEOPLE).thenHit());
//        if(BUTTON_CLOSE_PROMPT != null){
            actor.attemptsTo(Click.on(BUTTON_CLOSE_PROMPT));
//        }
//        actor.attemptsTo(Click.on(BUTTON_WANT_A_CREDIT_BANCOLOMBIA_PEOPLE));
    }

    public static BancolombiaPersonaPage go(){
        return Tasks.instrumented(BancolombiaPersonaPage.class);
    }
}
