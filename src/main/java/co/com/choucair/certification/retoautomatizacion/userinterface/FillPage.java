package co.com.choucair.certification.retoautomatizacion.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FillPage extends PageObject {


        public static final Target FIRST_NAME = Target.the("Name field")
                .located(By.id("firstName"));

        public static final Target LAST_NAME = Target.the("Last name field")
                .located(By.id("lastName"));

        public static final Target EMAIL = Target.the("Email field")
                .located(By.id("email"));

        public static final Target SELECT_DATE_OF_BIRTH_DAY = Target.the("List to select the day")
                .located(By.id("birthDay"));

        public static final Target SELECT_DATE_OF_BIRTH_MONTH = Target.the("List to select the month")
                .located(By.id("birthMonth"));

        public static final Target SELECT_DATE_OF_BIRTH_YEAR = Target.the("List to select the year")
                .located(By.id("birthYear"));

        public static final Target BUTTON_NEXT_LOCATION = Target.the("Button Next")
                .located(By.xpath("//a[contains(@class,'btn btn-blue')]"));

        public static final Target CITY_SPAN = Target.the("Wait in City")
                .located(By.xpath("//span[contains(@ng-show,'autoDetectAddress.city')]"));

        public static final Target CITY = Target.the("City field")
                .located(By.name("city"));

        public static final Target CITY_SELECTED = Target.the("City selected")
                .located(By.xpath("/html/body/div[2]/div[1]/span[2]/span"));

        public static final Target POSTAL_CODE = Target.the("Postal Code field")
                .located(By.name("zip"));

        public static final Target BUTTON_NEXT_DEVICES = Target.the("Button Next")
                .located(By.xpath("//a[contains(@class,'btn btn-blue pull-right')]/span"));

        public static final Target BUTTON_LAST_STEP = Target.the("Button Next")
                .located(By.xpath("//a[contains(@class,'btn btn-blue pull-right')]/span"));

        public static final Target PASSWORD = Target.the("Password field")
                .located(By.id("password"));

        public static final Target CONFIRM_PASSWORD = Target.the("Confirm password field")
                .located(By.id("confirmPassword"));

        public static final Target ACCEPT_TERMS = Target.the("Accept terms checkbox")
                .located(By.id("termOfUse"));

        public static final Target ACCEPT_PRIVACY = Target.the("Accept privacy checkbox")
                .located(By.id("privacySetting"));

        public static final Target BUTTON_COMPLETE_SETUP = Target.the("Button Complete Setup")
                .located(By.xpath("//a[contains(@class,'btn btn-blue')]/span"));



    }
