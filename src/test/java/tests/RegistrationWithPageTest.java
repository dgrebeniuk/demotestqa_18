package tests;


import org.junit.jupiter.api.Test;


public class RegistrationWithPageTest extends TestBase {

   @Test
   void registrationFrom() {

      registrationPage.openPage()
              .setFirstName("Maxim")
              .setLastName("Evdokimov")
              .setUserEmail("evdokimov@gmail.com")
              .setGender("Male")
              .setPhone("9313859692")
              .setDateBirth("30", "March", "2023")
              .setSubject("Maths")
              .setHobbies("Sports")
              .uploadPicture("img/test.png")
              .setAddress("Tbilisi")
              .setState("NCR")
              .setCity("Delhi")
              .setSubmitButton();

      registrationPage
              .verifyResults("Student Name", "Maxim Evdokimov")
              .verifyResults("Student Email", "evdokimov@gmail.com")
              .verifyResults("Gender", "Male")
              .verifyResults("Mobile", "9313859692")
              .verifyResults("Date of Birth", "30 March,2023")
              .verifyResults("Subjects", "Maths")
              .verifyResults("Hobbies", "Sports")
              .verifyResults("Picture", "img/test.png")
              .verifyResults("Address", "Tbilisi")
              .verifyResults("State and City", "NCR Delhi");
   }
}
