import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class ClearSelenideTest {


    @Test
    void CheckGitHubIssue() {
        Configuration.headless = true;
        //Открываем страницу с проектом
        open("https://github.com/dandreyanov/homework_5");

        //Переходим в Issues
        $(withText("Issues")).click();

        //Проверяем наличие нужного Issue
        $(withText("Issue #1")).shouldBe(visible);
    }

}
