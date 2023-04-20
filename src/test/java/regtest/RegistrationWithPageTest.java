package regtest;


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
              .setDateBirth()
              .setSubject("Maths")
              .setHobbies("Sports")
              .uploadPicture("src/test/resources/test.png")
              .setAddress("Tbilisi")
              .setState("NCR")
              .setCity("Delhi")
              .setSubmitButton()
              .verifyData();
   }
}