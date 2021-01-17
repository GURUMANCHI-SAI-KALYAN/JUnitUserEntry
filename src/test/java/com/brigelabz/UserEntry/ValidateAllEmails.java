package com.brigelabz.UserEntry;
import static org.junit.Assert.assertEquals;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Before;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ValidateAllEmails {
    private String allEmails;
    private boolean resultexp;

    public ValidateAllEmails(String allEmails, boolean resultexp) {
        this.allEmails = allEmails;
        this.resultexp = resultexp;
    }
    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList (new Object[][]  { { "abc", false },
                                                { "abc@.com.my", false },
                                                { "abc123@gmail.a", false },
                                                { "abc123@.com", false },
                                                { "abc123@.com.com", false },
                                                { ".abc@abc.com", false },
                                                {"abc()*@gmail.com", false},
                                                {"abc@%*.com", false},
                                                {"abc..2002@gmail.com", false},
                                                { "abc.@gmail.com", false },
                                                { "abc@abc@gmail.com", false },
                                                { "abc@gmail.com", true },
                                                { "abc111@abc.com",true},
                                                { "abc@1.com", true },
                                                { "abc+100@gmail.com", true },
                                                { "abc@gmail.com.com", true },
                                                {"abc100@abc.net", true },
                                                { "abc-100@yahoo.com",true } } );
        }
    @Test
            public void givenEmailAsVar_ShouldReturnAsPerParametrizedResult() {
            UserValidator validator = new UserValidator();
            boolean Result = validator.validateEmail(this.allEmails);
            Assert.assertEquals(this.resultexp, Result);
        }
}
