package test;
import java.util.Scanner;

import model.BankAccount;
import model.CurrentAccount;
import model.SavingAccount;

public class Test {
    public static void main(String[] args) {
    	
    	//on donne au utilisateur de taper les donnees
    	 	  Scanner sc = new Scanner(System.in);
    	 
           BankAccount account1=null;//par defaut l'objet est nul
           account1=new CurrentAccount();
           //account1.setAccountId("123-543");    
           //on utilise  le constructeur 
           //pour generer l'id
            //
          System.out.print("Entrer le Balance: ");
       
                   account1.setBalance(sc.nextDouble());

               	   System.out.println("=============================");


          System.out.print("Entrer le Currency ");  
           account1.setCurrency(sc.next()); //reads string before the space  
           System.out.println("=============================");
          System.out.print("VOUS AVEZ CHOISI LCURRRENCY SUIVANT : "+account1.getCurrency());             
  
          System.out.println("");

          System.out.println("==============================");


          System.out.print("Entrer le OverDraft: ");
      	  

          ((CurrentAccount) account1).setOverDraft(sc.nextDouble());

       

          sc.close();
          System.out.println("=============================");
          BankAccount.printAccount(account1);
          
       
//ici on utlise le polymorphiseme 
        //bankaccount est une classe abstraite impossible
        //de l'instanciéer donc la classe
       // bankacount peut Etre soit saving ou current account
        
        BankAccount account2=new CurrentAccount("Dinars",2546,11);
        
        BankAccount.printAccount(account2);
     
        BankAccount account3=new SavingAccount("DINARS",551200,6.6);
        BankAccount.printAccount(account3);
    
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

   
    
  
 
     } 