import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Condition.visible;

public class BaseSteps {

    @Step("Открываем страницу с проектом")
    public void openMainPage() {
        open("https://github.com/dandreyanov/sample-lambda-and-steps");
    }

    @Step("Переходим в Issues")
    public void goToIssue() {
        $(withText("Issues")).click();
    }

    @Step("Проверяем наличие нужного Issue")
    public void checkIssue(String checkText) {
        $(withText(checkText)).shouldBe(visible);
    }

}