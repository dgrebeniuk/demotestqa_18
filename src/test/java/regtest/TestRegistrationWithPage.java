package regtest;


import org.junit.jupiter.api.Test;


public class TestRegistrationWithPage extends TestBasic {

   @Test
   void registrationFrom() {


      registrationPage.openPage()
              .setFirstName("Maxim")
              .setLastName("Evdokimov")
              .setUserEmail("evdokimov@gmail.com")
              .setGender()
              .setPhone("9313859692")
              .setDateBirth()
              .setSubject("Maths")
              .setHobbies("Sports")
              .uploadPicture()
              .setAddress("Tbilisi")
              .setState("NCR")
              .setCity("Delhi")
              .setSubmitButton()
              .verifyData();
   }
}
