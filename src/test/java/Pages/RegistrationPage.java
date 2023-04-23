package Pages;

import Pages.components.CalendarComponent;
import Pages.components.RegistrationResultsModal;
import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {
   CalendarComponent calendarComponent = new CalendarComponent();
   RegistrationResultsModal registrationResultsModal = new RegistrationResultsModal();
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
           submitButton = $("#submit");


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

   public RegistrationPage setDateBirth(String day, String month, String year) {
      dateBirthInput.click();
      calendarComponent.setDate(day, month, year);

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

   public RegistrationPage verifyResult(String key, String value) {
      registrationResultsModal.verifyResult(key, value);

      return this;
   }
}
