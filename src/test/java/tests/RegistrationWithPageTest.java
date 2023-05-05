package tests;


import org.junit.jupiter.api.Test;


public class RegistrationWithPageTest extends TestBase {

   @Test
   void registrationFrom() {

      String firstName = faker.name().firstName(),
      String lastName = faker.name().lastName(),
      String userEmail = faker.internet().emailAddress(),
      String gender = ,
      String userPhone = "+7" + faker.phoneNumber().subscriberNumber(10),
      String dayOfBirth = ,
      String monthOfBirth = ,
      String yearOfBirth = ,
      String subject = ,
      String hobbies = ,
      String pictureName = "img/test.png",
      String address = faker.address().country(),
      String state = "NCR",
      String city = faker.address().city();

      registrationPage.openPage()
              .setFirstName(firstName)
              .setLastName(lastName)
              .setUserEmail(userEmail)
              .setGender(gender)
              .setPhone(userPhone)
              .setDateBirth(dayOfBirth, monthOfBirth, yearOfBirth)
              .setSubject("Maths")
              .setHobbies("Sports")
              .uploadPicture(pictureName)
              .setAddress(address)
              .setState(state)
              .setCity("Delhi")
              .setSubmitButton();

      registrationPage
              .verifyResult("Student Name", firstName + lastName)
              .verifyResult("Student Email", userEmail)
              .verifyResult("Gender", "Male")
              .verifyResult("Mobile", userPhone)
              .verifyResult("Date of Birth", "30 March,2023")
              .verifyResult("Subjects", "Maths")
              .verifyResult("Hobbies", "Sports")
              .verifyResult("Picture", "test.png")
              .verifyResult("Address", address)
              .verifyResult("State and City", state + city);
   }
}
