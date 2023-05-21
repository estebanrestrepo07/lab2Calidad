package com.bancolombia.personas.calidad.userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UserPage extends PageObject {

    public static final Target BUTTON_CLOSE_PROMPT = Target.the("Close prompt button").locatedBy("//*[@id=\"closeModalBtn\"]");
    public static final Target PRODUCTS_SERVICES_MENU = Target.the(" PRODUCSTS AND SERVICES MENU button").locatedBy("//*[@id=\"menu-productos\"]");
    public static final Target CREDIT_LINK = Target.the("CREDIT LINK").locatedBy("//*[@id=\"header-productos-creditos\"]");
    public static final Target CREDIT_TEXT = Target.the("TEXT IN CREDIT PAGE").locatedBy("//*[@id=\"dy-wcm-btti-9d343092\"]/div/div/div/div/div[1]/div/h1");

    public static final Target SIMULATE_CREDIT_BUTTON = Target.the("Button simulate credit").locatedBy("//*[@id=\"creditos\"]/div/div[1]/div[4]/div/div[2]/div/a[1]");

    public static final Target SIMULATE_CREDIT_TEXT = Target.the("Button simulate credit").locatedBy("//*[@id=\"layoutContainers\"]/div/div[2]/div/div[2]/section/div[3]/div[2]/app-root/div/app-solicitud-informacion/section/div[1]/h1");
    public static final Target CONTINUE_SIMULATE_CREDIT_BUTTON = Target.the("continue simulate credit").locatedBy("//*[@id=\"boton-seleccion-tarjeta\"]");
    public static final Target YES_OPTION = Target.the("yes option").locatedBy("//*[@id=\"opcion-si\"]/label");

    public static final Target AMOUNT_INPUT_NUMBER = Target.the("amount input number").locatedBy("//*[@id=\"valor-simulacion\"]");

    public static final Target MONTHS_INPUT_NUMBER = Target.the("months input number").locatedBy("//*[@id=\"valor-plazo\"]");

    public static final Target BIRTH_INPUT_DATE = Target.the("Birth Date input").locatedBy("//*[@id=\"campo-fecha\"]");

    public static final Target SELECT_YEAR_DATE = Target.the("year option").locatedBy("//*[@id=\"mat-datepicker-0\"]/div/mat-multi-year-view/table/tbody/tr[4]/td[3]/div[1]");
    public static final Target SELECT_MONTH_DATE = Target.the("month option").locatedBy("//*[@id=\"mat-datepicker-0\"]/div/mat-year-view/table/tbody/tr[3]/td[3]/div[1]");
    public static final Target SELECT_DAY_DATE = Target.the("day option").locatedBy("//*[@id=\"mat-datepicker-0\"]/div/mat-month-view/table/tbody/tr[5]/td[5]/div[1]");
    public static final Target SIMULATE_BUTTON = Target.the("Simulate button").locatedBy("//*[@id=\"boton-simular\"]");

    public static final Target CREDIT_OPTIONS_TEXT = Target.the("Simulate button").locatedBy("//*[@id=\"layoutContainers\"]/div/div[2]/div/div[2]/section/div[3]/div[2]/app-root/div/app-resultado-simulacion/section[1]/span");

}

