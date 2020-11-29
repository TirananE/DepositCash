package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidAccountTest {

    @Test
    void account_Permit_Status_Should_Be_True() {

        Boolean expectedResult = true;
        Account account = new Account(true);

        Boolean actualResult =  account.isAccountStatus();
        assertEquals(expectedResult,actualResult);

    }

    @Test
    void account_Permit_Status_Should_Be_False() {

        Boolean expectedResult = false;
        Account account = new Account(false);

        Boolean actualResult =  account.isAccountStatus();
        assertEquals(expectedResult,actualResult);

    }
}