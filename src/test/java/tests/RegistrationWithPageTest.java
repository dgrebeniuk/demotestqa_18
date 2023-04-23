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
              .verifyResult("Student Name", "Maxim Evdokimov")
              .verifyResult("Student Email", "evdokimov@gmail.com")
              .verifyResult("Gender", "Male")
              .verifyResult("Mobile", "9313859692")
              .verifyResult("Date of Birth", "30 March,2023")
              .verifyResult("Subjects", "Maths")
              .verifyResult("Hobbies", "Sports")
              .verifyResult("Picture", "test.png")
              .verifyResult("Address", "Tbilisi")
              .verifyResult("State and City", "NCR Delhi");
   }
}
