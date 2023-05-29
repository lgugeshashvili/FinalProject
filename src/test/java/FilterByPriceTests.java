import StepObject.FilterByPriceSteps;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import utils.ChromeRunner;

public class FilterByPriceTests extends ChromeRunner {
    @Test
    @Description("ტესტი უთითებს მაქსიმალურ ფასს და ამოწმებს შედეგს")
    @Severity(SeverityLevel.CRITICAL)
    public void myhome1(){
        FilterByPriceSteps filterByPriceSteps=new FilterByPriceSteps();
        filterByPriceSteps.realestate()
                .rent()
                .chooseappartments()
                .next()
                .tbilisi()
                .samgori()
                .varketili()
                .find()
                .sortprice()
                .inputprice("1000")
                .currency()
                .checkfilter();
    }


@Test
@Description("ტესტი ფილტრავს ფასის ზრდადობის მიხედვით და ამოწმებს შედეგს ")
@Severity(SeverityLevel.CRITICAL)
    public void myhome2(){
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
            .sortBtncheck()
            .currency()
            .checkSortBtn();
    }
}



