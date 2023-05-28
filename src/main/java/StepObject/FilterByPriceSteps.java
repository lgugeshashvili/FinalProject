package StepObject;

import PageObject.FilterByPriceElements;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class FilterByPriceSteps extends FilterByPriceElements {
    @Step("შეტყობინების დახურვა")
    public FilterByPriceSteps messageclose(){
        messageclose.shouldBe(Condition.visible, Duration.ofMillis(5000)).click();

        return this;
    }
    @Step("უძრავი ქონების კატალოგი")
    public FilterByPriceSteps realestate(){
        selectrealestate.scrollIntoView(true).click();
        return this;
    }
@Step("გაქირავების ველი")
    public FilterByPriceSteps rent(){
        forrent.scrollIntoView(true).click();
        return this;
    }
    @Step("ბინების ველი")
    public FilterByPriceSteps chooseappartments(){
        appartments.scrollIntoView(true).click();
        return this;
    }
    @Step("ღილაკი შემდეგი")
    public FilterByPriceSteps next(){
        nextclick.scrollIntoView(true).click();
        return this;
    }
    @Step("ქალაქის არჩევა: თბილისი")
    public FilterByPriceSteps tbilisi(){
        tbilisicity.scrollIntoView(true).click();
        return this;
    }
    @Step("რაიონის არჩევა, ირჩევს სამგორს")
    public FilterByPriceSteps samgori(){
        samgoridistrict.scrollIntoView(true).click();
        return this;
    }
    @Step("უბნის არჩევა, ირჩევს ვარკეთილს")
    public FilterByPriceSteps varketili(){
        varketiliBtn.scrollIntoView(true).click();
        return this;
    }
    @Step("ღილაკი ძებნა")
    public FilterByPriceSteps find(){
        findBtn.scrollIntoView(true).click();
        return this;
    }
@Step("ფასის მიხედვით გაფილტვრა")
    public FilterByPriceSteps sortprice(){
        pricefilter.scrollIntoView(true).click();
        return this;
    }
    @Step("მაქსიმალური ფასის მითითება")
    public FilterByPriceSteps inputprice(String saboloofasi){
        priceInput.setValue(saboloofasi).pressEnter();
        return this;
    }
    @Step("ლარის ვალუტაზე გადართვა")
    public FilterByPriceSteps currency(){
       currencyBtn.click();
        return this;
    }
@Step("ფასის ფილტრის შემოწმება")
    public FilterByPriceSteps checkfilter(){
        int count=appartmentfields.size();
        System.out.println("appartments quantity on the page "+count);
        for(int i=0; i<count; i++){
            String price=$(".card-body", i).$(".item-price").getText();
            String beforereplace = price.replace(",", "");
            float pricefloat=Float.parseFloat(beforereplace);
            System.out.println(pricefloat);

            Assert.assertTrue(pricefloat<=1000);
        }
        return this;
    }
@Step("გასაყიდი")
    public FilterByPriceSteps sale(){
        forsale.click();
        return this;
    }
@Step("ქალაქის არჩევა: ბათუმი")
    public FilterByPriceSteps batumi(){
        batumiCity.scrollIntoView(true).click();
        return this;
    }
    @Step("ყველა უბნის მონიშვნა")
    public FilterByPriceSteps alldistrictss(){
        alldistricts.scrollIntoView(true).click();
        return this;
    }
@Step("სორტირების ღილაკი")
    public FilterByPriceSteps sort(){
        sortBtn.scrollIntoView(true).click();
        return this;
    }
    @Step("ფასის ზრდადობით დალაგება")
    public FilterByPriceSteps sortopt(){
        sortoption.scrollIntoView(true).click();
        return this;
    }
@Step("სორტირების ღილაკის ფუნქციონირების შემოწმება")
    public FilterByPriceSteps checkSortBtn(){
        int count=appartmentfields.size();
        pricefield.scrollIntoView(true);
        String price=appartprice.getText();
        System.out.println(count);

        String beforereplace = price.replace(",", "");
        float price1=Float.parseFloat(beforereplace);
        System.out.println(price1);
        for(int i=1; i<count; i++){
            String secondprice=$(".card-body", i).$(".item-price").getText();
            String beforereplace2 = secondprice.replace(",", "");
            float price2=Float.parseFloat(beforereplace2);
            System.out.println(price2);
            if (price2>price1){
                price1=price2;}

        }
        return this;
}
    @Step("მოწმდება, ნამდვილად მოინიშნა თუ არა ფასი ზრდადობით მოსანიშნ ველზე")
    public FilterByPriceSteps sortBtncheck(){
        Assert.assertTrue(sortoption.is(Condition.visible));
        return this;
    }
}
