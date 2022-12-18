package qa.guru.allure;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class LabelsTest {

    private static final String REPOSITORY = "eroshenkoam/allure-example";
    private static final int ISSUE = 80;

    @Test
    @Feature("Issue в репозитории")
    @Story("Создание issue")
    @Owner("Gusenkov Ilia")
    @Severity(SeverityLevel.BLOCKER)
    @Link(value = "Testing" , url = "https://github.com/")
    @DisplayName("Создание issue для авторизованного пользователя")
    public void testStaticLabels() {

    }

    @Test
    public void testDynamicLabels(){

    }
}
