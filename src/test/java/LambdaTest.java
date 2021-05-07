import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

import io.qameta.allure.selenide.AllureSelenide;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class LambdaTest {


    @Test
    void CheckGitHubIssueWithLambda() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        Configuration.headless = true;
        step("Открываем страницу с проектом", () -> {
            open("https://github.com/dandreyanov/sample-lambda-and-steps");
        });

        step("Переходим в Issues", () -> {
            $(withText("Issues")).click();
        });

        step("Проверяем наличие нужного Issue", () -> {
            $(withText("Issue #1")).shouldBe(visible);
        });

    }
}