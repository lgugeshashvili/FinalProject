import PageObject.RegistrationElements;
import StepObject.RegistrationSteps;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ChromeRunner;

import static DataObject.RegistrationData.*;

public class RegistrationTests extends ChromeRunner {

    @Test
    @Description("ტესტი აკეთებს მომხმარებლის რეგისტრაციას სწორი მნიშვნელობებით")
    @Severity(SeverityLevel.CRITICAL)
    public void myhome3(){
        RegistrationElements registrationElements=new RegistrationElements();
        RegistrationSteps registrationSteps=new RegistrationSteps();
        registrationSteps.logginn()
                .closemessage()
                .registerr()
                .onemailfield()
                .mail(email);
        Assert.assertTrue(registrationElements.emailfield.is(Condition.not(Condition.empty)));
        registrationSteps.onpasswordfield()
                .passwordd(pass);
        Assert.assertTrue(registrationElements.emailfield.is(Condition.not(Condition.empty)));
        registrationSteps.onrepetepassfield()
                .repetepassword(truepass);
        Assert.assertTrue(registrationElements.pass2field.is(Condition.not(Condition.empty)));
        registrationSteps.genderfieldd()
                .onbirthdatefield(birthdate)
                .onmobnumberfield()
                .mobnumber(mobilenumber);
        Assert.assertTrue(registrationElements.phonenum.is(Condition.not(Condition.empty)));
        registrationSteps.onsmscodefield()
                .smscode(code);
        Assert.assertTrue(registrationElements.phonecodee.is(Condition.not(Condition.empty)));
        registrationSteps.ruless()
                .confidencial()
                .emailvaluecheck()
                .passvaluecheck()
                .pass2valuecheck();
    }

    @Test
    @Description("ტესტი ამოწმებს რეგისტრაციისას ცარიელი ველებისა და არასწორად შეყვანილი ინფორმაციის გამოტანას")
    @Severity(SeverityLevel.CRITICAL)
    public void myhome4(){
        RegistrationElements registrationElements=new RegistrationElements();
        RegistrationSteps registrationSteps=new RegistrationSteps();
        registrationSteps.logginn()
                .closemessage()
                .registerr()
                .registrationapply();
        Assert.assertTrue(registrationElements.emailfield.is(Condition.empty));
        registrationSteps.emailerrorcheck();
        Assert.assertTrue(registrationElements.passfield.is(Condition.empty));
        registrationSteps.passworderrorcheck();
        Assert.assertTrue(registrationElements.pass2field.is(Condition.empty));
        registrationSteps.password2errorcheck();
        Assert.assertTrue(registrationElements.gendercheckmark.is(Condition.not(Condition.checked)));
        registrationSteps.gendererrorcheck();
        Assert.assertTrue(registrationElements.birthdatefield.is(Condition.not(Condition.selected)));
        registrationSteps.birthdateerrorcheck();
        Assert.assertTrue(registrationElements.phonenum.is(Condition.empty));
        registrationSteps.mobilenumbererrorcheck();
        Assert.assertTrue(registrationElements.phonecodee.is(Condition.empty));
        registrationSteps.smscodeerrorcheck();
        Assert.assertTrue(registrationElements.rulesBtn.is(Condition.not(Condition.checked)));
        registrationSteps.ruleserrorcheck()
                .wrongemailcheck()
                .wrongpasswordcheck()
                .wrongpasswordrepetecheck();
    }
}
