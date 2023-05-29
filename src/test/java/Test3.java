import StepObject.SavedAppartmentsSteps;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import utils.ChromeRunner;

import static DataObject.SavedAppartmentsData.searchoption;

public class Test3 extends ChromeRunner {
    @Test
    @Description("ტესტი ეძებს ბინებს, ამატებს რჩეულებში, ამოწმებს რაოდენობას და შლის რჩეულებიდან")
    @Severity(SeverityLevel.CRITICAL)
    public static void myhome5(){
        SavedAppartmentsSteps savedAppartmentsSteps=new SavedAppartmentsSteps();
        savedAppartmentsSteps.favoritesisempty()
                .searchisani(searchoption)
                .addappartmentstofavorite()
                .findfavoritesquantity()
                .gotofavorites()
                .deletesaveditems()
                .favoritesisempty();
    }
    @Test
    @Description("ტესტს გადაყავს საიტი სხვადასხვა ენაზე და ამოწმებს ენას")
    @Severity(SeverityLevel.CRITICAL)
    public static void myhome6() {
        SavedAppartmentsSteps savedAppartmentsSteps=new SavedAppartmentsSteps();
        savedAppartmentsSteps.translateintoenglish()
                .checkenglish()
                .translateintorussian()
                .checkrussian()
                .translateintogeorgian()
                .checkgeorgian();
    }
}
