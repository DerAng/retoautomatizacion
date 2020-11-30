package co.com.choucair.certification.retoautomatizacion.tasks;

import co.com.choucair.certification.retoautomatizacion.model.User;

import co.com.choucair.certification.retoautomatizacion.userinterface.FillPage;
import net.bytebuddy.asm.Advice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Fill implements Task {
     private User user;

    public Fill(User user) {
        this.user = user;
    }

    public static Fill theForm(User user) {

        return Tasks.instrumented(Fill.class,user);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {



        actor.attemptsTo(

                // Formulario de datos

                Enter.theValue(user.getFirstName()).into(FillPage.FIRST_NAME),
                Enter.theValue(user.getLastName()).into(FillPage.LAST_NAME),
                Enter.theValue(user.getEmail()).into(FillPage.EMAIL),
                SelectFromOptions.byVisibleText(user.getDateOfBirth().split("-")[0]).from(FillPage.SELECT_DATE_OF_BIRTH_MONTH),
                SelectFromOptions.byVisibleText(user.getDateOfBirth().split("-")[1]).from(FillPage.SELECT_DATE_OF_BIRTH_DAY),
                SelectFromOptions.byVisibleText(user.getDateOfBirth().split("-")[2]).from(FillPage.SELECT_DATE_OF_BIRTH_YEAR),
                Click.on(FillPage.BUTTON_NEXT_LOCATION),

                // Formulario de Localidad
                //WaitUntil.the(FillPage.SELECT_LIST_COUNTRY, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),

                WaitUntil.the(FillPage.CITY_SPAN, WebElementStateMatchers.isVisible()),
                Clear.field(FillPage.CITY),
                Enter.keyValues(user.getCity()).into(FillPage.CITY),
                Click.on(FillPage.CITY_SELECTED),
                Enter.theValue(user.getPostalCode()).into(FillPage.POSTAL_CODE),
                Click.on(FillPage.LIST_COUNTRY),
                Enter.theValue(user.getCountry()).into(FillPage.SELECT_LIST_COUNTRY).thenHit(Keys.ENTER),
                Click.on(FillPage.BUTTON_NEXT_DEVICES),

                // Formulario de Dispositivos

                Click.on(FillPage.LIST_COMPUTER),
                Enter.theValue(user.getComputer()).into(FillPage.SELECT_LIST_COMPUTER).thenHit(Keys.ENTER),
                Click.on(FillPage.LIST_VERSION),
                Enter.theValue(user.getVersion()).into(FillPage.SELECT_LIST_VERSION).thenHit(Keys.ENTER),
                Click.on(FillPage.LIST_LENGUAGE),
                Enter.theValue(user.getLenguage()).into(FillPage.SELECT_LIST_LENGUAGE).thenHit(Keys.ENTER),
                Click.on(FillPage.BUTTON_LAST_STEP),

                // Formulario De Contraseñas

                Enter.theValue(user.getPassword()).into(FillPage.PASSWORD),
                Enter.theValue(user.getConfirmPassword()).into(FillPage.CONFIRM_PASSWORD),
                Click.on(FillPage.ACCEPT_TERMS),
                Click.on(FillPage.ACCEPT_PRIVACY),
                Click.on(FillPage.BUTTON_COMPLETE_SETUP));



    }
}
