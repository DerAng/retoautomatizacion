package co.com.choucair.certification.retoautomatizacion.userinterface;



import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GotoPage {

    public static final Target JOIN_TODAY = Target.the("button that allows us to go to the registration form")
            .located(By.xpath("//a[contains(@class, 'unauthenticated-nav-bar__sign-up') and contains(text(),'Join Today')]"));
}
