import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.files.DownloadActions.click;
import static java.awt.SystemColor.control;

public class TestRegistration {

   @BeforeAll
   static void beforeAll() {
      Configuration.browserSize = "1680x1050";
   }

   @Test
   void registrationFrom() {

      open("https://demoqa.com/automation-practice-form");

      $("#firstName").setValue("Maxim"); //Name
      $("#lastName").setValue("Evdokimov"); //Last name
      $("#userEmail").setValue("evdokimov@gmail.com"); //Email
      $(".custom-radio:nth-child(1) > .custom-control-label").click(); //Gender
      $("#userNumber").setValue("9313859692"); //Mobile
      $("#dateOfBirthInput").setValue("05 Mar 2000"); //Date of Birth
      $("[id=subjectsContainer]").click(); //Subjects
      $("#react-select-2-option-0").click();
      $(".custom-checkbox:nth-child(1) > .custom-control-label").click(); //Hobbies
      $("#uploadPicture").sendKeys("/Users/dmitrijgrebenyuk/Documents/Difrent format files/test.png"); //Picture
      $("#currentAddress").setValue("Tbilisi"); //Current Address
      //$("#dateOfBirthInput").selectRadio("Hindi"); //State
     // $("#dateOfBirthInput").selectRadio("Hindi"); //City


      $("#submit").click(); //Click on the button



      $("#example-modal-sizes-title-lg").shouldHave(text("Maxim"), //Check up test
              text("Evdokimov"),
              text("evdokimov@gmail.com"),
              text("Male"),
              text("9313859692"));





   }
}
