package tests;

import pages.RegistrationPage;
import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

   RegistrationPage registrationPage = new RegistrationPage();
   Faker faker = new Faker();

   @BeforeAll
   static void beforeAll() {
      Configuration.browserSize = "1680x1050";
   }
}
