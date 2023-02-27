import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestRegistration {

   @BeforeAll
   static void beforeAll() {
      Configuration.browserSize = "1680x1050";
   }

   @Test
   void registrationFrom() {

      open("https://demoqa.com/automation-practice-form");

      $("#firstName").setValue("Maxim");
      $("#lastName").setValue("Evdokimov");
      $("#userEmail").setValue("evdokimov@gmail.com");
      $("#gender-radio-1").click();
      $("#gender-radio-1").selectRadio("Male");
      $("#userNumber").setValue("995 595 7689");


   }
}
