public class Bank {
    private String bankName;
    private int bankCode;
    private BankAccount account1;
    private BankAccount account2;
    public Bank(String bankName,int bankCode){
        this.bankCode=bankCode;
        this.bankName=bankName;
    }
    public void setAccounts(BankAccount account1,BankAccount account2){
        this.account1=account1;
        this.account2=account2;
    }
    double getTotalBalance(){
        return account1.GetBalance()+account2.GetBalance();
    }
    void getBankInfo(){
        System.out.println("Name: "+bankName+" code: "+bankCode);
        account1.getAccountInfo();
        account2.getAccountInfo();
    }
    String getBankName(){
        return bankName;
    }

}
