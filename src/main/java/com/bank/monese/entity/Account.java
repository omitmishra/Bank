package com.bank.monese.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account")
	public class Account {
	    @Id
	    @GeneratedValue
	    private long accountNumber;

	    private double currentBalance;
	    private String ownerName;


	     public Account() {}
	    public Account( long accountNumber, double currentBalance, String ownerName) {
	        this.accountNumber = accountNumber;
	        this.currentBalance = currentBalance;
	        this.ownerName = ownerName;
	    }
	   
	    public long getAccountNumber() {
	        return accountNumber;
	    }
	    public void setAccountNumber(long accountNumber) {
	        this.accountNumber = accountNumber;
	    }
	    public double getCurrentBalance() {
	        return currentBalance;
	    }
	    public void setCurrentBalance(double currentBalance) {
	        this.currentBalance = currentBalance;
	    }
	    public String getOwnerName() {
	        return ownerName;
	    }
	    public void setOwnerName(String ownerName) {
	        this.ownerName = ownerName;
	    }
	  
		@Override
		public String toString() {
			return "Account [ accountNumber=" + accountNumber + ", currentBalance=" + currentBalance
					+ ", ownerName=" + ownerName + "]";
		}
	    
	    

	
}
