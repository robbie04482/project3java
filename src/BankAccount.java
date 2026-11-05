public class BankAccount {
    private int accountId;
    private String ownerName;
    private double balance;
    private boolean isActive=true;
    private static int nextId=1000;
    public BankAccount(String ownerName){
        this.accountId = nextId++;
        this.ownerName=ownerName;
    }
   public BankAccount(String ownerName, double initialBalance){
       this.accountId = nextId++;
       this.ownerName=ownerName;
       if(initialBalance>0)this.balance = initialBalance;
       else this.balance=0;
   }
   void deposit(double amount){
        if(isActive&&isValidAmount(amount)){
            this.balance+=amount;
        }

   }
    void withdraw(double amount){
        if(isActive&&isValidAmount(amount)){
            this.balance-=amount;
        }

    }
    void transferTo(BankAccount destination, double amount){
        if(destination.isActive&&isActive&&isValidAmount(amount)) {
            this.balance -= amount;
            destination.balance += amount;
        }
    }
    void closeAccount(){
        if(this.isActive&&this.balance==0){
            this.isActive=false;
        }
    }
    void getAccountInfo(){
        System.out.println("Id: "+ accountId + " owners name: " + ownerName + " balance: "+ balance+ " active: "+ isActive);
    }
     void setOwnerName(String ownerName) {
        if (ownerName != null && !ownerName.isBlank()){
            this.ownerName = ownerName;
        }
     }
     public static boolean isValidAmount(double amount){
         return amount > 0;
     }
     public static int getTotalAccounts(){
        return nextId-1000;
     }
    public static  int NextAccountId(){
        return nextId;
    }
    double GetBalance(){
        return this.balance;
    }
}
