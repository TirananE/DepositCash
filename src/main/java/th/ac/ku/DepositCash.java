package th.ac.ku;

public class DepositCash {

    private float Max_Deposit_Per_Time = 30000.00f;
    private float Max_Deposit_Per_Day = 50000.00f;
    private float Min_Deposit = 100.00f;
    private float One_Day_Deposit = 0;

    public boolean DepositPerTime(float amount){
        return amount <= Max_Deposit_Per_Time;
    }

    public boolean DepositPerDay(float amount){
        One_Day_Deposit += amount;
        return One_Day_Deposit <= Max_Deposit_Per_Day;
    }

    public boolean More_than_MinDeposit(float amount){
        return amount >= Min_Deposit;
    }
}