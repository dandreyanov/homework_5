import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

public class MethodTest {
    final BaseSteps steps = new BaseSteps();

    @Test
    void CheckGitHubIssueWithMethod() {
        Configuration.headless = true;
        steps.openMainPage();
        steps.goToIssue();
        steps.checkIssue();
    }

}
