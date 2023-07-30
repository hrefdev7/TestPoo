package test;
import model.BankAccount;
import model.CurrentAccount;
import model.SavingAccount;

public class Test {
    public static void main(String[] args) {

        System.out.println("=============================");
        BankAccount account1=null;//par defaut l'objet est nul
        account1=new CurrentAccount();
        //account1.setAccountId("123-543");    
        //on utilise  le constructeur 
        //pour generer l'id
         //
        account1.setCurrency("Dinars");
        account1.setBalance(7600);
        printAccount(account1);
//ici on utlise le polymorphiseme 
        //bankaccount est une classe abstraite impossible
        //de l'instanciéer donc la classe
       // bankacount peut Etre soit saving ou current account
        
        BankAccount account2=new CurrentAccount("Dinars",2546,11);
        
        printAccount(account2);
     
        BankAccount account3=new SavingAccount("DINARS",551200,6.6);
        printAccount(account3);
    
        account3.setAccountId(account2.getAccountId());
        account3.setBalance(account2.getBalance());
        account3.setStatus(account2.getStatus());
      
        
        System.out.println(account2);
        System.out.println(account3);
        System.out.println(".....................");
        
      //testet si les code hashpam sont egale qui on le meme etat
        if(account2.hashCode()==account3.hashCode()){
            System.out.println("les deux comptes ont le meme etat");
        } else {
            System.out.println("les deux comptes n'ont pas le meme etat");
        }
        account3.setCurrency("USD");
    
        
        
        if(account2.equals(account3)){
            System.out.println("les deux comptes ont le identificateur id");
        } else {
            System.out.println("les deux comptes n'ont pas le  meme id");
        }
        System.out.println(".....................");
        System.out.println(account2==account3);
        System.out.println(account2.equals(account3));
        System.out.println("================");
        
     
   
    }

    public static void printAccount(BankAccount account){
        System.out.println("*******************************");
        System.out.println("Account ID= "+account.getAccountId());
        System.out.println("Balance =  "+account.getBalance());
        System.out.println("Status= "+account.getStatus());
        System.out.println("Currency = "+account.getCurrency());
  
        hashcodeprint(account);
        
        System.out.println(account.equals(account));
        System.out.println("*******************************");}
   
     
    
  
public static  void hashcodeprint(BankAccount account ){
    System.out.println("*******************************");

    System.out.println("hash code du compte :  "+account.hashCode());

   

    System.out.println("*******************************");
}} 