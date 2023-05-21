package com.bancolombia.personas.calidad.tasks;

import com.bancolombia.personas.calidad.interactions.BancolombiaCreditPage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class NavigateTo implements Task {

    public PageObject page;

    public NavigateTo(PageObject page){
        this.page = page;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(BancolombiaCreditPage.go());
    }

    public static NavigateTo CreditPage(PageObject page){
        return Tasks.instrumented(NavigateTo.class,page);
    }
}
