import java.io.Serializable;

public class BankAccount implements Serializable {
	private String accountId;
	transient private String accountPassword;//ignore this data in the process of serialization
	private String accountHolderName;
	private double accountBalance;
	public BankAccount(String accountId, String accountPassword, String accountHolderName, double accountBalance) {
		super();
		this.accountId = accountId;
		this.accountPassword = accountPassword;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
//	public String getAccountPassword() {
//		return accountPassword;
//	}
	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	@Override
	public String toString() {
		return "BankAccount [accountId=" + accountId + ", accountPassword=" + accountPassword + ", accountHolderName="
				+ accountHolderName + ", accountBalance=" + accountBalance + "]";
	}
	
	
	

}
