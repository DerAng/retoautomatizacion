package co.com.choucair.certification.retoautomatizacion.userinterface;



import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class SearchMessagePage {

    public static final Target NAME_MESSAGE = Target.the("Extract Message")
            .located(By.xpath("//span[contains(text(),'The last step')]"));
}
