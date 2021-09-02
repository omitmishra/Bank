package com.bank.monese.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "transaction")

//@SequenceGenerator(name = "transaction_seq", sequenceName = "transaction_sequence", schema = "online_bank", initialValue = 5)
public class Transaction {

	@Id
	//strategy = GenerationType.SEQUENCE, generator = "transaction_seq"
	@GeneratedValue()
	private long id;

	private long sourceAccountId;

	private long targetAccountId;

	private String targetOwnerName;

	private double amount;

	private LocalDateTime initiationDate;

	private LocalDateTime completionDate;

	public Transaction() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getSourceAccountId() {
		return sourceAccountId;
	}

	public void setSourceAccountId(long sourceAccountId) {
		this.sourceAccountId = sourceAccountId;
	}

	public long getTargetAccountId() {
		return targetAccountId;
	}

	public void setTargetAccountId(long targetAccountId) {
		this.targetAccountId = targetAccountId;
	}

	public String getTargetOwnerName() {
		return targetOwnerName;
	}

	public void setTargetOwnerName(String targetOwnerName) {
		this.targetOwnerName = targetOwnerName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDateTime getInitiationDate() {
		return initiationDate;
	}

	public void setInitiationDate(LocalDateTime initiationDate) {
		this.initiationDate = initiationDate;
	}

	public LocalDateTime getCompletionDate() {
		return completionDate;
	}

	public void setCompletionDate(LocalDateTime completionDate) {
		this.completionDate = completionDate;
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", sourceAccountId=" + sourceAccountId + ", targetAccountId=" + targetAccountId
				+ ", targetOwnerName=" + targetOwnerName + ", amount=" + amount + ", initiationDate=" + initiationDate
				+ ", completionDate=" + completionDate + "]";
	}

}