package StepObject;

import PageObject.RegistrationElements;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;

import java.time.Duration;

import static DataObject.RegistrationData.*;

public class RegistrationSteps extends RegistrationElements {
    @Step("შეტყობინების დახურვა")
    public RegistrationSteps messageclose(){
        messageclose.shouldBe(Condition.visible, Duration.ofMillis(5000)).click();

        return this;
    }
    @Step("დალოგინების ველზე გადასვლა")
    public RegistrationSteps logginn(){
        loginn.click();
        return this;
    }

    @Step("შეტყობინების დახურვა")
    public RegistrationSteps closemessage(){
        registerBtn.pressEscape();
        return this;
    }

    @Step("რეგისტრაციის ველზე გადასვლა")
    public RegistrationSteps registerr(){
        registerBtn.click();
        return this;
    }

    @Step("იმეილის ველზე გადასვლა")
    public RegistrationSteps onemailfield(){
        emailfield.click();
        return this;
    }
    @Step("იმეილის შეყვანა")
    public RegistrationSteps mail(String emailvalue){
        emailfield.setValue(emailvalue).shouldNotBe(Condition.empty);
        return this;
    }

    @Step("პაროლის ველზე შესვლა")
    public RegistrationSteps onpasswordfield(){
        passfield.click();
        return this;
    }
    @Step("პაროლის შეყვანა")
    public RegistrationSteps passwordd(String passwordvalue){
        passfield.setValue(passwordvalue).shouldNotBe(Condition.empty);
        return this;
    }

    @Step("პაროლის გამეორების ველზე შესვლა")
    public RegistrationSteps onrepetepassfield(){
        pass2field.click();
        return this;
    }
    @Step("პაროლის გამეორება")
    public RegistrationSteps repetepassword(String repetevalue){
        pass2field.setValue(repetevalue).shouldNotBe(Condition.empty);
        return this;
    }

    @Step("სქესის მონიშვნა")
    public RegistrationSteps genderfieldd(){
        genderr.click();
        return this;
    }
    @Step("დაბადების წელის ველზე გადასვლა")
    public RegistrationSteps onbirthdatefield(String birthdatevalue){
        birthdatefield.doubleClick();
        birthdayinput.setValue(birthdatevalue).pressEnter();
        return this;
    }

    @Step("მობილურის ნომრის ველზე გადასვლა")
    public RegistrationSteps onmobnumberfield(){
        phonenum.click();
        return this;
    }
    @Step("მობილურის ნომრის ჩაწერა")
    public RegistrationSteps mobnumber(String numbervalue){
        phonenum.setValue(numbervalue).shouldNotBe(Condition.empty);
        return this;
    }

    @Step("სმს კოდის ველზე გადასვლა")
    public RegistrationSteps onsmscodefield(){
        phonecodee.click();
        return this;
    }
    @Step("სმს კოდის ჩაწერა")
    public RegistrationSteps smscode(String codevalue){
        phonecodee.setValue(codevalue).shouldNotBe(Condition.empty);
        return this;
    }
    @Step("წესებზე და პირობებზე დათანხმება")
    public RegistrationSteps ruless(){
        rulesBtn.scrollIntoView(true).click();
        return this;
    }

    @Step("კონფიდენც. პირობებზე დათანხმება")
    public RegistrationSteps confidencial(){
        confBtn.scrollIntoView(true).click();
        return this;
    }
    @Step("იმეილის ველში გადაცემული მნიშვნელობის შემოწმება")
public RegistrationSteps emailvaluecheck(){
    String emailvaluee=emailfield.getValue();
    Assert.assertEquals(emailvaluee, email);
    System.out.println("იმეილში გადაცემული მნიშვნელობა სწორად ჩაიწერა");
    return this;
}
    @Step("პაროლის ველში გადაცემული მნიშვნელობის შემოწმება")
    public RegistrationSteps passvaluecheck(){
        String passwordvalue=passfield.getValue();
        Assert.assertEquals(passwordvalue, pass);
        System.out.println("პაროლში გადაცემული მნიშვნელობა სწორად ჩაიწერა");
        return this;
    }
    @Step("პაროლის გამეორების ველში გადაცემული მნიშვნელობის შემოწმება")
    public RegistrationSteps pass2valuecheck(){
        String password2value=pass2field.getValue();
        Assert.assertEquals(password2value, truepass);
        System.out.println("პაროლის გამეორების ველში გადაცემული მნიშვნელობა სწორად ჩაიწერა");
        return this;
    }

    @Step("რეგისტრაციის დასრულება")
    public RegistrationSteps registrationapply(){
        finishregistration.scrollIntoView(true).click();
        return this;
    }
    @Step("იმეილის ცარიელი ველის შეტყობინების გამოტანა")
    public RegistrationSteps emailerrorcheck(){
        Assert.assertTrue(emailfield.is(Condition.empty));
        emailerror.shouldBe(Condition.visible);
        System.out.println("იმეილის ველს გამოაქვს შეტყობინება");
        return this;
    }
    @Step("პაროლის ცარიელი ველის შეტყობინების გამოტანა")
    public RegistrationSteps passworderrorcheck(){
        Assert.assertTrue(passfield.is(Condition.empty));
        passworderror.shouldBe(Condition.visible);
        System.out.println("პაროლის ველს გამოაქვს შეტყობინება");
        return this;
    }
    @Step("პაროლის გამეორების ცარიელი ველის შეტყობინების გამოტანა")
    public RegistrationSteps password2errorcheck(){
        Assert.assertTrue(pass2field.is(Condition.empty));
        repetepasserror.shouldBe(Condition.visible);
        System.out.println("პაროლის გამეორების ველს გამოაქვს შეტყობინება");
        return this;
    }
    @Step("სქესის არჩევის მოუნიშნავი ველის შეტყობინების გამოტანა")
    public RegistrationSteps gendererrorcheck(){
        Assert.assertTrue(gendercheckmark.is(Condition.not(Condition.checked)));
        gendererror.shouldBe(Condition.visible);
        System.out.println("სქესის არჩევის ველს გამოაქვს შეტყობინება");
        return this;
    }
    @Step("დაბადების წლის მოუნიშნავი ველის შეტყობინების გამოტანა")
    public RegistrationSteps birthdateerrorcheck(){
        Assert.assertTrue(birthdatefield.is(Condition.not(Condition.selected)));
        birthdateerror.shouldBe(Condition.visible);
        System.out.println("დაბადების წლის ველს გამოაქვს შეტყობინება");
        return this;
    }
    @Step("ტელეფონის ნომრის ველის შეტყობინების გამოტანა")
    public RegistrationSteps mobilenumbererrorcheck(){
        Assert.assertTrue(phonenum.is(Condition.empty));
        phonenumerror.shouldBe(Condition.visible);
        System.out.println("ტელეფონის ნომრის ველს გამოაქვს შეტყობინება");
        return this;
    }
    @Step("სმს კოდის ველის შეტყობინების გამოტანა")
    public RegistrationSteps smscodeerrorcheck(){
        Assert.assertTrue(phonecodee.is(Condition.empty));
        smscodeerror.shouldBe(Condition.visible);
        System.out.println("სმს კოდის ველს გამოაქვს შეტყობინება");
        return this;
    }
    @Step("წესებისა და პირობების ველის შეტყობინების გამოტანა")
    public RegistrationSteps ruleserrorcheck(){
        Assert.assertTrue(rulesBtn.is(Condition.not(Condition.checked)));
        ruleserror.shouldBe(Condition.visible);
        System.out.println("წესებისა და პირობების ველს გამოაქვს შეტყობინება");
        return this;
    }

    @Step("იმეილში არასწორი მნიშვნელობის ჩაწერისას შეტყობინების გამოტანა")
    public RegistrationSteps wrongemailcheck(){
        emailfield.setValue(wrongemail).shouldNotBe(Condition.empty).pressEnter();
        emailerror.shouldBe(Condition.visible);
        System.out.println("იმეილში არასწორი მნიშვნელობის ჩაწერისას გამოაქვს შეტყობინება");
        return this;
    }
    @Step("პაროლში არასწორი მნიშვნელობის ჩაწერისას შეტყობინების გამოტანა")
    public RegistrationSteps wrongpasswordcheck(){
        passfield.setValue(wrongpassword).shouldNotBe(Condition.empty).pressEnter();
        passworderror.shouldBe(Condition.visible);
        System.out.println("პაროლში არასწორი მნიშვნელობის ჩაწერისას გამოაქვს შეტყობინება");
        return this;
    }

    @Step("პაროლის და პაროლის გამეორების ველში განსხვავებული მნიშვნელობის შეტანისას შეტყობინების გამოტანა")
    public RegistrationSteps wrongpasswordrepetecheck(){
        passfield.setValue(pass).shouldNotBe(Condition.empty).pressEnter();
        pass2field.setValue(wrongpassword).shouldNotBe(Condition.empty).pressEnter();
        repetepasserror.shouldBe(Condition.visible);
        System.out.println("პაროლის და პაროლის გამეორების ველში განსხვავებული მნიშვნელობის შეტანისას გამოაქვს შეტყობინება");
        return this;
    }


}
