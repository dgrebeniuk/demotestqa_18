import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class TestRegistration {

   @BeforeAll
   static void beforeAll() {
      Configuration.browserSize = "1680x1050";

   }

   @Test
   void registrationFrom() {

      open("https://demoqa.com/automation-practice-form");

      executeJavaScript("$('#fixedban').remove()");
      executeJavaScript("$('footer').remove()");

      $("#firstName").setValue("Maxim"); //Name
      $("#lastName").setValue("Evdokimov"); //Last name
      $("#userEmail").setValue("evdokimov@gmail.com"); //Email
      $(".custom-radio:nth-child(1) > .custom-control-label").click(); //Gender
      $("#userNumber").setValue("9313859692"); //Mobile

      $("#dateOfBirthInput").click(); //Date of Birth
      $(".react-datepicker__week > .react-datepicker__day--030").click(); //Date of Birth

      $("#subjectsInput").sendKeys("Maths");
      $("#subjectsWrapper .subjects-auto-complete__option").click();

      $("#hobbiesWrapper").$(byText("Sports")).click(); //Hobbies

      $("#uploadPicture").sendKeys("src/test/resources/test.png"); //Picture

      $("#currentAddress").setValue("Tbilisi"); //Current Address

      $("#state").click(); //State
      $("#state").$(byText("NCR")).click();

      $("#city").click(); //City
      $("#city").$(byText("Delhi")).click();

      $("#submit").click(); //Click on the button


      $(".table-responsive").shouldHave(text("Maxim"), //Check up test
              text("Evdokimov"),
              text("evdokimov@gmail.com"),
              text("Male"),
              text("9313859692"),
              text("30 March,2023"),
              text("Maths"),
              text("img/test.png"),
              text("Tbilisi"),
              text("NCR Delhi"));
   }
}
