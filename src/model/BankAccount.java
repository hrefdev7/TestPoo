package model;

import java.util.UUID;
/*
 * une classe abstraite est une classe qu'on peut pas l'instanci�
 * on utilise abstract classs pour utilis� l'heritage
 * */
public abstract class BankAccount {
    private String accountId;
    private double balance;
    private String currency;
    private AccountStatus status;

    public BankAccount(){
        this.accountId= UUID.randomUUID().toString();
        this.status=AccountStatus.CREATED;
    }

    public BankAccount(String currency, double initialBalance){
        this();
        this.currency=currency;
        this.balance=initialBalance;
       
    }

    public String getAccountId() {
        return accountId;
    }


    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "BankAccount{" +"accountId='" + accountId 
        		+ '\'' + ", balance=" + balance +
                ", currency='" + currency + '\'' +
                ", status=" + status +
                '}';
    }  
    //ON UTILISE The java equals() par defaut  is a method of lang.Object class, 
    //and it is used to compare two objects.
   // To compare two objects that whether they are the same, 
    //it compares the values of both the object's attributes.
    //compare  L' ETAT DE LOBJET(les attribut)
    
    /*
    @Override 
    
    //ici par exemple on veut  voir si seulement lid sont egale
     * 
    public boolean equals(Object acc) {
        BankAccount account=(BankAccount) acc;
        if(this.accountId==account.accountId){
            return true;
        } else {
            return false;
        }
    }
*/

     

     /*
@Override
    public int hashCode() {
        return Objects.hashCode(this.accountId)+
                Objects.hashCode(this.balance)+
                Objects.hashCode(this.status)+
                Objects.hashCode(this.currency);
    }
  */
   
    public abstract String getType();
    
	 public static void printAccount(BankAccount account){
	   
	        System.out.println("Account ID= "+account.getAccountId());
	        System.out.println("Balance =  "+account.getBalance());
	        System.out.println("Status= "+account.getStatus());
	        System.out.println("Currency = "+account.getCurrency());
	        System.out.println("Type compte : "+account.getType());
            
	        if(account instanceof SavingAccount){
                System.out.println("Rate="+ ((SavingAccount)account).getInterestRate());
            }
            if(account instanceof CurrentAccount){
      System.out.println("Overdraft="+ ((CurrentAccount)account).getOverDraft());
            } 
          
	       
            hashcodeprint(account);
	        
	      }
	    
	    public static  void hashcodeprint(BankAccount account ){
	        System.out.println("*******************************");

	        System.out.println("hash code du compte :  "+account.hashCode());

	       

	        System.out.println("*******************************");
	    }
    public final static void print(){
    	System.out.println();
        System.out.println("----------- Application Gestion compte BANK -----------------");
    }
}
