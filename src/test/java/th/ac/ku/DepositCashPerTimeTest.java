package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepositCashPerTimeTest {

    @Test
    void deposit_Less_Than_30000_Per_Time_Result_Should_Be_True(){
        Boolean expectedResult = true;
        float depositCashAmount = 5000.00f;

        DepositCash depositCash = new DepositCash();

        Boolean actualResult =  depositCash.DepositPerTime(depositCashAmount);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void deposit_Equal_To_30000_Per_Time_Result_Should_Be_True(){
        Boolean expectedResult = true;
        float depositCashAmount = 30000.00f;

        DepositCash depositCash = new DepositCash();

        Boolean actualResult =  depositCash.DepositPerTime(depositCashAmount);
        assertEquals(expectedResult,actualResult);

    }

    @Test
    void deposit_More_Than_30000_Per_Time_Result_Should_Be_False(){
        Boolean expectedResult = false;
        float depositCashAmount = 35000.00f;

        DepositCash depositCash = new DepositCash();

        Boolean actualResult =  depositCash.DepositPerTime(depositCashAmount);
        assertEquals(expectedResult,actualResult);

    }

}