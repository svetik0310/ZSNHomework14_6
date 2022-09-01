package demoqa.com.test;

import demoqa.com.data.ZSNPageObjectData;
import demoqa.com.pages.RegistrationPage;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ZSNHomeworkPageObjectTest {
    @BeforeAll
    static void setup() {
        Configuration.browserSize = "1500x840";
        Configuration.browserPosition = "0x0";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void fillAutomationPracticeForm() {
        ZSNPageObjectData testPerson = new ZSNPageObjectData("Ivanov", "Ivan", "iviv1@mail.ru", "Male", "7890890898", "12.12.1980", "Reading", "test.jpg", "Canal Street", "NCR", "Noida");
        new RegistrationPage()
                .openPage()
                .setDataToForm(testPerson)
                .clickSubmitButton()
                .assertData(testPerson);
    }
}
