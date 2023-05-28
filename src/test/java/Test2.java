import StepObject.RegistrationSteps;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import utils.ChromeRunner;

import static DataObject.RegistrationData.*;

public class Test2 extends ChromeRunner {

    @Test
    @Description("ტესტი აკეთებს მომხმარებლის რეგისტრაციას სწორი მნიშვნელობებით")
    @Severity(SeverityLevel.CRITICAL)
    public void myhome3(){
        RegistrationSteps registrationSteps=new RegistrationSteps();
        registrationSteps.messageclose()
                .logginn()
                .closemessage()
                .registerr()
                .onemailfield()
                .mail(email)
                .onpasswordfield()
                .passwordd(pass)
                .onrepetepassfield()
                .repetepassword(truepass)
                .genderfieldd()
                .onbirthdatefield(birthdate)
                .onmobnumberfield()
                .mobnumber(mobilenumber)
                .onsmscodefield()
                .smscode(code)
                .ruless()
                .confidencial()
                        .emailvaluecheck()
                .passvaluecheck()
                .pass2valuecheck();
    }

    @Test
    @Description("ტესტი ამოწმებს რეგისტრაციისას ცარიელი ველებისა და არასწორად შეყვანილი ინფორმაციის გამოტანას")
    @Severity(SeverityLevel.CRITICAL)
    public void myhome4(){
        RegistrationSteps registrationSteps=new RegistrationSteps();
        registrationSteps.messageclose()
                .logginn()
                .closemessage()
                .registerr()
                .registrationapply()
                .emailerrorcheck()
                .passworderrorcheck()
                .password2errorcheck()
                .gendererrorcheck()
                .birthdateerrorcheck()
                .mobilenumbererrorcheck()
                .smscodeerrorcheck()
                .ruleserrorcheck()
                .wrongemailcheck()
                .wrongpasswordcheck()
                .wrongpasswordrepetecheck();
    }
}
