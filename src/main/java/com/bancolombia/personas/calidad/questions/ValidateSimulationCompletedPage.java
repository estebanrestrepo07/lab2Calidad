package com.bancolombia.personas.calidad.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.text.Normalizer;

import static com.bancolombia.personas.calidad.shared.Constants.SIMULATE_COMPLETED_TEXT;
import static com.bancolombia.personas.calidad.userInterfaces.UserPage.CREDIT_OPTIONS_TEXT;

public class ValidateSimulationCompletedPage implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String stringCreditPage = Text.of(CREDIT_OPTIONS_TEXT).viewedBy(actor).asString();
        stringCreditPage = Normalizer.normalize(stringCreditPage , Normalizer.Form.NFD);
        stringCreditPage = stringCreditPage.replaceAll("[^\\p{ASCII}]", "");

        if(stringCreditPage.equals(SIMULATE_COMPLETED_TEXT)) return true;

        return false;
    }

    public static ValidateSimulationCompletedPage validateSimulationCompletedPage(){
        return new ValidateSimulationCompletedPage();
    }
}
