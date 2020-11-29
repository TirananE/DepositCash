package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepositCashPerDayTest {

    @Test
    void deposit_Less_Than_50000_Per_Day_Result_Should_Be_True(){
        Boolean expectedResult = true;
        float amount1 = 5000.00f;
        float amount2 = 5000.00f;

        DepositCash depositCash = new DepositCash();

        Boolean actualResult =  depositCash.DepositPerDay(amount1);
        assertEquals(expectedResult,actualResult);
        actualResult =  depositCash.DepositPerDay(amount2);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void deposit_Equal_To_50000_Per_Day_Result_Should_Be_True(){
        Boolean expectedResult = true;
        float amount1 = 10000.00f;
        float amount2 = 40000.00f;

        DepositCash depositCash = new DepositCash();

        Boolean actualResult =  depositCash.DepositPerDay(amount1);
        assertEquals(expectedResult,actualResult);
        actualResult =  depositCash.DepositPerDay(amount2);
        assertEquals(expectedResult,actualResult);

    }

    @Test
    void deposit_More_Than_50000_Per_Day_Result_Should_Be_False(){
        Boolean expectedResult_true = true;
        Boolean expectedResult_false = false;
        float amount1 = 30000.00f;
        float amount2 = 35000.00f;

        DepositCash depositCash = new DepositCash();

        Boolean actualResult =  depositCash.DepositPerDay(amount1);
        assertEquals(expectedResult_true,actualResult);
        actualResult =  depositCash.DepositPerDay(amount2);
        assertEquals(expectedResult_false,actualResult);

    }
}