package regtest;

import Pages.RegistrationPage;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBasic {

   RegistrationPage registrationPage = new RegistrationPage();

   @BeforeAll
   static void beforeAll() {
      Configuration.browserSize = "1680x1050";

   }
}
