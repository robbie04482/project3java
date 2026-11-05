//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("me",-100);
        BankAccount acc2 = new BankAccount("robert",1000);
        acc1.getAccountInfo();
        acc2.getAccountInfo();
        acc1.deposit(500);
        acc2.withdraw(200);
        acc1.transferTo(acc2,300);
        acc1.withdraw(1000);
        acc1.getAccountInfo();
        acc2.getAccountInfo();
        System.out.println(BankAccount.NextAccountId());
        BankAccount acc3 = new BankAccount("kes",5000);
        acc3.getAccountInfo();
        System.out.println(BankAccount.getTotalAccounts());
        acc3.deposit(-1000);
        acc3.transferTo(acc3,10000);
        Bank bank = new Bank("bank",123);
        bank.setAccounts(acc1,acc2);
        bank.getBankInfo();
        System.out.println(bank.getTotalBalance());
    }
}
