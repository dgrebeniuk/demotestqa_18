package tests;


import org.junit.jupiter.api.Test;

import static tests.TestData.months;
import static utils.RandomMethodsUtils.getRandomItemFromArray;


public class RegistrationWithPageTest extends TestBase {

   @Test
   void registrationFrom() {

      String firstName = faker.name().firstName(),
              lastName = faker.name().lastName(),
              userEmail = faker.internet().emailAddress(),
              gender = getRandomItemFromArray(TestData.gender),
              userPhone = 8 + faker.phoneNumber().subscriberNumber(9),
              dayOfBirth = String.format("%02d", faker.number().numberBetween(1, 28)),
              monthOfBirth = getRandomItemFromArray(months),
              yearOfBirth = String.format("%02d", faker.number().numberBetween(1970, 2000)),
              subject = getRandomItemFromArray(TestData.subjects),
              hobbies = getRandomItemFromArray(TestData.hobbies),
              pictureName = "img/test.png",
              address = faker.address().country(),
              state = "NCR",
              city = getRandomItemFromArray(TestData.cities);

      registrationPage.openPage()
              .setFirstName(firstName)
              .setLastName(lastName)
              .setUserEmail(userEmail)
              .setGender(gender)
              .setPhone(userPhone)
              .setDateBirth(dayOfBirth, monthOfBirth, yearOfBirth)
              .setSubject(subject)
              .setHobbies(hobbies)
              .uploadPicture(pictureName)
              .setAddress(address)
              .setState(state)
              .setCity(city)
              .setSubmitButton();

      registrationPage
              .verifyResult("Student Name", firstName + " " + lastName)
              .verifyResult("Student Email", userEmail)
              .verifyResult("Gender", gender)
              .verifyResult("Mobile", userPhone)
              .verifyResult("Date of Birth", dayOfBirth + " " + monthOfBirth + "," + yearOfBirth)
              .verifyResult("Subjects", subject)
              .verifyResult("Hobbies", hobbies)
              .verifyResult("Address", address)
              .verifyResult("State and City", state + " " + city);
   }
}
