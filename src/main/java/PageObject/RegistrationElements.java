package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationElements {
    public SelenideElement
                        loginn=$(byText("შესვლა")),
            registerBtn=$(".black-hover"),
            emailfield=$(byId("Email")),
            passfield=$(byId("Password")),
            pass2field=$(byId("PasswordRetype")),
            genderr=$(".radio-checkmark-wrap", 1),
            gendercheckmark=$(".radio-checkmark"),
            birthdatefield=$(byText("აირჩიე დაბადების წელი")),
            birthdayinput=$(".select2-search__field"),
            phonenum=$(byId("Phone")),
            phonecodee=$(byId("PhoneCode")),
            rulesBtn=$(".checkmark", 0),
            confBtn=$(".checkmark", 1),

    finishregistration=$(byId("registrationBtn")),
    emailerror=$(byId("input-error-Email")),
    passworderror=$(byId("input-error-Password")),
    repetepasserror=$(byId("input-error-PasswordRetype")),
    gendererror=$(byId("input-error-GenderValidation")),
    birthdateerror=$(byId("input-error-BirthYear")),
    phonenumerror=$(byId("input-error-Phone")),
    smscodeerror=$(byId("input-error-PhoneCode")),
    ruleserror=$(byId("input-error-AgreeTerms"));




}
