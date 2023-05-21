package com.bancolombia.personas.calidad.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.bancolombia.personas.calidad.shared.Constants.*;
import static com.bancolombia.personas.calidad.userInterfaces.UserPage.*;

public class BancolombiaSimulationPage implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CONTINUE_SIMULATE_CREDIT_BUTTON));
        actor.attemptsTo(Click.on(YES_OPTION));
        actor.attemptsTo(Enter.theValue(AMOUNT).into(AMOUNT_INPUT_NUMBER));
        actor.attemptsTo(Enter.theValue(MONTHS).into(MONTHS_INPUT_NUMBER));
        actor.attemptsTo(Click.on(BIRTH_INPUT_DATE));
        actor.attemptsTo(Click.on(SELECT_YEAR_DATE));
        actor.attemptsTo(Click.on(SELECT_MONTH_DATE));
        actor.attemptsTo(Click.on(SELECT_DAY_DATE));
        actor.attemptsTo(Click.on(SIMULATE_BUTTON));
    }

    public static BancolombiaSimulationPage go(){
        return Tasks.instrumented(BancolombiaSimulationPage.class);
    }
}
