package business;
import  exceptions.AccountNotFoundException;
import  exceptions.BalanceNotSufficientException;

import java.util.List;
import java.util.function.Predicate;

import model.BankAccount;
/*
 
 * on utilse interface pour 
 * */
 
public interface BankAccountService {
   BankAccount addBankAccount(BankAccount account);
   /* La généricité en Java *depuis java5*
    * on declare une liste de bankaccount  list<bankaccount> aulieu de list<>
    * on prescise le type dans la liste
 
    * on utilise une liste generique pour stocker les bankaccount
    */
   List<BankAccount> getAllAccounts();
   
   BankAccount getAccountById(String id) throws AccountNotFoundException;
   
   void addRandomData(int size);
   
   void credit(String accountId, double amount) throws AccountNotFoundException;
   
   void debit(String accountId, double amount) throws AccountNotFoundException, BalanceNotSufficientException;
   
   void transfer(String accountSource, String accountDestination, double amount) throws AccountNotFoundException, BalanceNotSufficientException;
   
   List<BankAccount> getSavingAccounts();
   
      List<BankAccount> getCurrentsAccounts();
   
   double getTotalBalance();
   
   List<BankAccount> searchAccounts(Predicate<BankAccount> filter);
}
