package StepObject;

import PageObject.SavedAppartmentsElements;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;

import java.time.Duration;

import static DataObject.SavedAppartmentsData.*;
import static com.codeborne.selenide.Selenide.$;

public class SavedAppartmentsSteps extends SavedAppartmentsElements {
    @Step("შეტყობინების დახურვა")
    public SavedAppartmentsSteps messageclose(){
        messageclose.shouldBe(Condition.visible, Duration.ofMillis(5000)).click();

        return this;
    }
    @Step("გადამოწმება, რომ რჩეულები ცარიელია")
    public SavedAppartmentsSteps favoritesisempty(){
       String saveditemsquantity=saveditemsnumber.getText();
        float quantity=Float.parseFloat(saveditemsquantity);
        Assert.assertTrue(quantity==0);
        return this;
    }
    @Step("ძებნის ველში მონაცემის ჩაწერა და მოძებნა")
    public SavedAppartmentsSteps searchisani(String value){
        searchinput.setValue(value).pressEnter();
        Assert.assertTrue(searchinput.is(Condition.not(Condition.empty)));
        return this;
    }
    @Step("მოძებნილი მონაცემებიდან 3 ბინის დამატება რჩეულებში")
    public SavedAppartmentsSteps addappartmentstofavorite(){
for(int i=0; i<3; i++){
    $(".save-to-favorites",i).scrollIntoView(true).click();
}
        return this;
    }
    @Step("რჩეულებში დამატებული ბინების რაოდენობის გადამოწმება")
    public SavedAppartmentsSteps findfavoritesquantity(){
        favoritesBtn.scrollIntoView(true);
        String saveditemsquantity=saveditemsnumber.getText();
        Assert.assertEquals(saveditemsquantity, "3");
        return this;
    }
    @Step("რჩეულების ველზე გადასვლა")
    public SavedAppartmentsSteps gotofavorites(){
        favoritesBtn.click();
        return this;
    }
    @Step("რჩეულებიდან მონაცემების წაშლა")
    public SavedAppartmentsSteps deletesaveditems(){
        for(int a=0; a<3; a++){
        deteleitem.click();
        }
        return this;
    }

    @Step("ინგლისურ ენაზე გადაყვანა")
    public SavedAppartmentsSteps translateintoenglish(){
        flag.click();
        english.click();
        messageclose.shouldBe(Condition.visible, Duration.ofMillis(5000)).click();
        return this;
    }
    @Step("ინგლისური ენის გადამოწმება")
    public SavedAppartmentsSteps checkenglish(){

        String text=translation.getText();
        Assert.assertEquals(text, englishtext);
        return this;
    }
    @Step("რუსულ ენაზე გადაყვანა")
    public SavedAppartmentsSteps translateintorussian(){
        flag.click();
        russian.click();
        messageclose.shouldBe(Condition.visible, Duration.ofMillis(5000)).click();
        return this;
    }
    @Step("რუსული ენის გადამოწმება")
    public SavedAppartmentsSteps checkrussian(){

        String text=translation.getText();
        Assert.assertEquals(text, russiantext);
        return this;
    }
    @Step("ქართულ ენაზე გადაყვანა")
    public SavedAppartmentsSteps translateintogeorgian(){
        flag.click();
        georgian.click();
        return this;
    }
    @Step("ქართული ენის გადამოწმება")
    public SavedAppartmentsSteps checkgeorgian(){

        String text=translation.getText();
        Assert.assertEquals(text, georgantext);
        return this;
    }

}
