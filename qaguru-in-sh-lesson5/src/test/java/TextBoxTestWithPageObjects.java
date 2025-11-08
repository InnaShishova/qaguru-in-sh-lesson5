package tests;

import org.junit.jupiter.api.Test;
import pages.TextBoxPage;

public class RegistrationTests extends TestBase{

    TextBoxPage textBoxPage = new TextBoxPage();

    @Test

    void fillFormTest() {

        textBoxPage.openPage()
                .deleteAds()
                .setName("Masha")
                .setUserEmail("test1@test2.com")
                .setCurrentAddress("Samara, Lenina street")
                .setPermanentAddress("Lenina street")
                .submit()
                .checkNameField("Masha")
                .checkEmailField("test1@test2.com")
                .checkCurrentAddressField("Samara, Lenina street")
                .checkPermanentAddressField("Lenina street");
    }
}


