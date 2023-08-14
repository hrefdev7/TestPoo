package businessimp;

import java.util.List;
import java.util.function.Predicate;

import business.BankAccountService;
import exceptions.AccountNotFoundException;
import exceptions.BalanceNotSufficientException;
import model.BankAccount;

public class BankImp implements BankAccountService{

	@Override
	public BankAccount addBankAccount(BankAccount account) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BankAccount> getAllAccounts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BankAccount getAccountById(String id) throws AccountNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addRandomData(int size) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void credit(String accountId, double amount) throws AccountNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void debit(String accountId, double amount) throws AccountNotFoundException, BalanceNotSufficientException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transfer(String accountSource, String accountDestination, double amount)
			throws AccountNotFoundException, BalanceNotSufficientException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<BankAccount> getSavingAccounts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BankAccount> getCurrentsAccounts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getTotalBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<BankAccount> searchAccounts(Predicate<BankAccount> filter) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
