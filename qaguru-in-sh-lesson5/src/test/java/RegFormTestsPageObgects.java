import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class RegFormTestsPageObgectsTests {

      @Test

    void successfulRegistrationTest() {

        registrationPage.open()
                .setFirstName("Ivan")
                .setLastName("Petrov")
                .setEmail("test1@test2.com")
                .setGender("Female")
                .setUserNumber("1234567890")
                .setDateOfBirth("04", "November", "1990")
                .setSubjectsInput("English")
                .setHobbies("Reading")
                .uploadAttachment("filepicture.jpg")
                .setAddress("город Москва, улица Ленина")
                .setState("Haryana")
                .setCity("Panipat")
                .submit();

        registrationPage.checkResultTitle("Thanks for submitting the form")
                .checkResultCells("Student Name", "Ivan Petrov")
                .checkResultCells("Student Email", "test1@test2.com")
                .checkResultCells("Gender", "Female")
                .checkResultCells("Mobile", "1234567890")
                .checkResultCells("Date of Birth", "04 November,1990")
                .checkResultCells("Subjects", "English")
                .checkResultCells("Hobbies", "Reading")
                .checkResultCells("Picture", "filepicture.jpg")
                .checkResultCells("Address", "город Москва, улица Ленина")
                .checkResultCells("State and City", "Haryana Panipat");



    }
}


