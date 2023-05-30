import PageObject.FilterByPriceElements;
import StepObject.FilterByPriceSteps;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ChromeRunner;


public class FilterByPriceTests extends ChromeRunner {
    @Test
    @Description("ტესტი უთითებს მაქსიმალურ ფასს და ამოწმებს შედეგს")
    @Severity(SeverityLevel.CRITICAL)
    public void myhome1(){
        FilterByPriceElements filterByPriceElements=new FilterByPriceElements();
        FilterByPriceSteps filterByPriceSteps=new FilterByPriceSteps();
        filterByPriceSteps.realestate()
                .rent()
                .chooseappartments()
                .next()
                .tbilisi()
                .samgori()
                .varketili()
                .find()
                .sortprice();
                Assert.assertTrue(filterByPriceElements.takepricevalue.is(Condition.enabled));
        filterByPriceSteps.inputprice("1000")
                .currency()
                .checkfilter();
    }


@Test
@Description("ტესტი ფილტრავს ფასის ზრდადობის მიხედვით და ამოწმებს შედეგს ")
@Severity(SeverityLevel.CRITICAL)
    public void myhome2(){
    FilterByPriceElements filterByPriceElements=new FilterByPriceElements();
    FilterByPriceSteps filterByPriceSteps=new FilterByPriceSteps();
    filterByPriceSteps.realestate()
            .sale()
            .chooseappartments()
            .next()
            .batumi()
            .alldistrictss()
            .find()
            .sort()
            .sortopt()
            .scrolltosortopt();
    Assert.assertTrue(filterByPriceElements.sortoption.is(Condition.visible));
    filterByPriceSteps.currency()
            .checkSortBtn();
    }
}



