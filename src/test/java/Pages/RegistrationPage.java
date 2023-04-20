package Pages;

import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {
   private SelenideElement
           firstNameInput = $("#firstName"),
           lastNameInput = $("#lastName"),
           emailInput = $("#userEmail"),
           genderInput = $("#genterWrapper"),
           userNumberInput = $("#userNumber"),
           dateBirthInput = $("#dateOfBirthInput"),
           dateInput = $(".react-datepicker__week > .react-datepicker__day--030"),
           subjectInput = $("#subjectsInput"),
           subjectChoseInput = $("#subjectsWrapper .subjects-auto-complete__option"),
           hobbiesInput = $("#hobbiesWrapper"),
           pictureUploadInput = $("#uploadPicture"),
           addressInput = $("#currentAddress"),
           stateInput = $("#state"),
           cityInput = $("#city"),
           submitButton = $("#submit"),
           popUp = $(".table-responsive");

   public RegistrationPage openPage() {
      open("https://demoqa.com/automation-practice-form");
      executeJavaScript("$('#fixedban').remove()");
      executeJavaScript("$('footer').remove()");

      return this;
   }

   public RegistrationPage setFirstName(String value) {
      firstNameInput.setValue(value);

      return this;
   }

   public RegistrationPage setLastName(String value) {
      lastNameInput.setValue(value);

      return this;
   }

   public RegistrationPage setUserEmail(String value) {
      emailInput.setValue(value);

      return this;
   }

   public RegistrationPage setGender(String value) {
      genderInput.$(byText(value)).click();

      return this;
   }

   public RegistrationPage setPhone(String value) {
      userNumberInput.setValue(value);

      return this;
   }

   public RegistrationPage setDateBirth() {
      dateBirthInput.click();
      dateInput.click();

      return this;
   }

   public RegistrationPage setSubject(String value) {
      subjectInput.sendKeys(value);
      subjectChoseInput.click();

      return this;
   }

   public RegistrationPage setHobbies(String value) {
      hobbiesInput.$(byText(value)).click();

      return this;
   }

   public RegistrationPage uploadPicture(String value) {
      pictureUploadInput.uploadFromClasspath(value);

      return this;
   }

   public RegistrationPage setAddress(String value) {
      addressInput.setValue(value);

      return this;
   }

   public RegistrationPage setState(String value) {
      stateInput.click();
      stateInput.$(byText(value)).click();

      return this;
   }

   public RegistrationPage setCity(String value) {
      cityInput.click();
      cityInput.$(byText(value)).click();

      return this;
   }

   public RegistrationPage setSubmitButton() {
      submitButton.click();

      return this;
   }

   public RegistrationPage verifyData() {
      popUp.shouldHave(text("Maxim"), //Check up test
              text("Evdokimov"),
              text("evdokimov@gmail.com"),
              text("Male"),
              text("9313859692"),
              text("30 March,2023"),
              text("Maths"),
              text("test.png"),
              text("Tbilisi"),
              text("NCR Delhi"));

      return this;
   }
}
