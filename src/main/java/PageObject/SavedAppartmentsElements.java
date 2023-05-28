package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class SavedAppartmentsElements {
    public SelenideElement  messageclose= $(byAttribute("onclick", "rentVoteClose()")),
    favoritesBtn=$(byId("favoritesDropdown")),
    searchinput=$(byId("searchfield")),
    saveditemsnumber=$(".number-badge"),
    deteleitem=$(byAttribute("onclick", "return product.removeFav(this, event);")),



    flag=$(".active-flag"),
english=$(byText("English")),
    russian=$(byText("русский")),
    georgian=$(byText("ქართული")),
    translation=$(".searchblock-text");




}
