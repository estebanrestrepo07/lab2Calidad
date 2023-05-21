package com.bancolombia.personas.calidad.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import java.text.Normalizer;

import static com.bancolombia.personas.calidad.shared.Constants.CREDIT_TITLE_TEXT;
import static com.bancolombia.personas.calidad.userInterfaces.UserPage.CREDIT_TEXT;

public class ValidateCreditPage implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String stringCreditPage = Text.of(CREDIT_TEXT).viewedBy(actor).asString();
        stringCreditPage = Normalizer.normalize(stringCreditPage , Normalizer.Form.NFD);
        stringCreditPage = stringCreditPage.replaceAll("[^\\p{ASCII}]", "");

        if(stringCreditPage.equals(CREDIT_TITLE_TEXT)) return true;

        return false;
    }

    public static ValidateCreditPage validateCreditPage(){
        return new ValidateCreditPage();
    }
}
