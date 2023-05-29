package PageObject;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class FilterByPriceElements {
    public SelenideElement
    messageclose= $(byAttribute("onclick", "rentVoteClose()")),
    selectrealestate=$(".p-absolute"),
    forrent=$(byAttribute("data-adtypes", "3")),
    appartments=$(byAttribute("for", "cat1")),
    nextclick=$(byId("NextInput")),
    tbilisicity= $(byAttribute("for","city_1996871")),
    samgoridistrict=$(byAttribute("onclick", "search.locs.load.districts(688330506, false, true)")),
    varketiliBtn=$(byAttribute("for", "loc411355289")),
    findBtn=$(byText("მოძებნე")),
    pricefilter=$(byText("ფასი")),
    priceInput=$(byId("price-to")),
    currencyBtn=$(".switcher-circle"),
            forsale=$(byAttribute("data-adtypes", "1")),
            batumiCity=$(byAttribute("for","city_8742159")),
            alldistricts=$(byText("ყველა უბანი")),
            sortBtn=$(byText("თარიღი კლებადი")),
            sortoption=$(byText("ფასი ზრდადი")),
            pricefield=$(".item-price", 0),
            appartprice=$(".card-body", 0).$(".item-price");

    public ElementsCollection appartmentfields=$$(byClassName("card-body"));




}
