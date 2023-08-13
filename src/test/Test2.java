package test;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import model.BankAccount;
import model.CurrentAccount;
import model.SavingAccount;

public class Test2 {
	 
	public static void main(String[] args)   {
		
		BankAccount.print();
		/*
		 * Manipuler les compte bancaire avec des tableaux
		 * 
		 * les tableaux sont static on doit presciser le nombre de compte
		 * alors que utiliser les liste sera mieux
		 */
		 System.out.println("_________________________________________");
		 System.out.println();

		 System.out.println("Affichage des Compte avec  Tableaux");
		 System.out.println("_________________________________________|");
		BankAccount[] tableAccount=new BankAccount[3];
		tableAccount[0]=new CurrentAccount("dinars",23,31);
		tableAccount[1]=new CurrentAccount("dinars",123,1);
	tableAccount[2]=new SavingAccount("dinars",63,6);
	

	/*	
		for(int i=0;i<tableAccount.length ;i++) {
			 System.out.println("Affichage des Compte   Tableaux :  "+i);

			printAccount(tableAccount[i]);
			
		}*/
	
		for(BankAccount tb:tableAccount) {		
	        /*
	     
            if(tb instanceof CurrentAccount){
                System.out.println(((CurrentAccount)tb).getType());
            } else if(tb instanceof SavingAccount){
                System.out.println(((SavingAccount)tb).getType());
            }
            */
			BankAccount.printAccount(tb);
			
         //   System.out.println("compte : "+tb.toString());
            System.out.println("Type compte : "+tb.getType());
            if(tb instanceof SavingAccount){
                System.out.println("Rate="+ ((SavingAccount)tb).getInterestRate());
            }
            if(tb instanceof CurrentAccount){
                System.out.println("Overdraft="+ ((CurrentAccount)tb).getOverDraft());
            }  System.out.println("*****************************************");
        }
		// on declare une collection generique 
		//la taille dla liste n'est fix dynamique
		//
		//
		System.out.println("_________________________________________");
		 System.out.println();

		 System.out.println("Affichage des Compte aune liste");
		 System.out.println("_________________________________________|");
		 
		List<BankAccount> lbk=new ArrayList<BankAccount>();
		
		lbk.add(new CurrentAccount("dinars",736643,22));
		lbk.add(new SavingAccount("dinars",736643,23));
		lbk.add(new CurrentAccount("dinars",736643,3));
		lbk.add(new CurrentAccount("dinars",736643,62));
		lbk.add(new SavingAccount("dinars",736643,52));
		lbk.add(new SavingAccount("dinars",736643,72));
		
		int i=0;
			for (BankAccount bkAccount :lbk) {
			    
			     i=i+1;
			       System.out.println("compte numero : " +i);
				BankAccount.printAccount(bkAccount);
				
				
				
			}
			
			 System.out.println("_________________________________________");
			 System.out.println();

			 System.out.println("Affichage des Compte avec  Map");
			 System.out.println("_________________________________________|");
			
			Map<String,BankAccount> mapbank=new HashMap<String, BankAccount>();
			
			mapbank.put("a", new SavingAccount("dinars",76643,2));
			mapbank.put("b", new CurrentAccount("dinars",363,72));
			mapbank.put("c", new SavingAccount("dinars",7343,72));
		
			
			  BankAccount acc=mapbank.get("c");System.out.println(acc.toString());
			  for (String key : mapbank.keySet()){
		            System.out.println(mapbank.get(key));
		        }
		        System.out.println("============");
		        for (BankAccount ba:mapbank.values()){
		            try {
						System.out.println(toJson(ba));
					} catch (JsonProcessingException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		        }
		        	  
	}
		        
		  	  public static String toJson(Object o) throws JsonProcessingException {
				    ObjectMapper objectMapper=new ObjectMapper();
				     return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(o);
	
		        }
	
		}
		
	
	

	     


