import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PageShouldBeLoad {

    @Test
    void pageShouldBeLoad() {
        Configuration.holdBrowserOpen = true;

        open("https://github.com");

        $(byText("Solutions")).hover();
        $(byText("Enterprise")).click();
        $(".enterprise-hero-heading").shouldHave(text("The AI Powered"));

    }
}
