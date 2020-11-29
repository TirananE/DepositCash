package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumDepositTest {

    @Test
    void deposit_Less_Than_Minimum_Deposit_Should_Return_False(){

        Boolean expectedResult = false;
        float depositCashAmount = 60.00f;

        DepositCash depositCash = new DepositCash();
        Boolean actualResult =  depositCash.More_than_MinDeposit(depositCashAmount);
        assertEquals(expectedResult,actualResult);

    }

    @Test
    void deposit_Exceed_Minimum_Deposit_Should_Return_True(){

        Boolean expectedResult = true;
        float depositCashAmount = 500.00f;

        DepositCash depositCash = new DepositCash();

        Boolean actualResult =  depositCash.More_than_MinDeposit(depositCashAmount);
        assertEquals(expectedResult,actualResult);

    }

    @Test
    void deposit_Equal_To_Minimum_Deposit_Should_Return_True(){

        Boolean expectedResult = true;
        float depositCashAmount = 100.00f;

        DepositCash depositCash = new DepositCash();

        Boolean actualResult =  depositCash.More_than_MinDeposit(depositCashAmount);
        assertEquals(expectedResult,actualResult);

    }
}
