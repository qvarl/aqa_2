import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class PageShouldBeLoad {

    @Test
    void pageShouldBeLoad() {
        Configuration.holdBrowserOpen = true;

        open("https://github.com");
    }
}
