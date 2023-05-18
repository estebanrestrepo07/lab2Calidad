package com.bancolombia.personas.calidad.userInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UserPage extends PageObject {

    public static final Target BUTTON_CLOSE_PROMPT = Target.the("Close prompt button").located(By.id("closeModalBtn"));
    public static final Target BUTTON_WANT_A_CREDIT_BANCOLOMBIA_PEOPLE = Target.the("want a credit bancolombia people button").located(By.buttonText("Quiero ver mi crédito"));
//    public static final Target PANEL_RECOMENDATION2 = Target.the("").located(By.id("test"));


}
