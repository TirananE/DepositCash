package th.ac.ku;

public class Account {
    private final boolean accountStatus;

    public Account(boolean accountStatus) {
        this.accountStatus = accountStatus;
    }

    public boolean isAccountStatus() {
        return accountStatus;
    }
}
