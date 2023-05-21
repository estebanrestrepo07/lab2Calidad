package com.bancolombia.personas.calidad.tasks;

import com.bancolombia.personas.calidad.interactions.BancolombiaSimulationPage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class StartThe implements Task {

    public PageObject page;

    public StartThe(PageObject page){
        this.page = page;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        // todo interactions
        actor.attemptsTo(BancolombiaSimulationPage.go());
    }

    public static StartThe Simulation(PageObject page){
        return Tasks.instrumented(StartThe.class,page);
    }
}
