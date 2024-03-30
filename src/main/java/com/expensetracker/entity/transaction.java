package com.expensetracker.entity;





import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table
@Entity
public class transaction {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String topic;
	private String desp;
	private int amount;
	private long transaction_id;
	private String transaction_date;
	
	
	
	public transaction() {
		
	}

	

	public transaction(int id, String topic, String desp, int amount, long transaction_id, String transaction_date) {
		super();
		this.id = id;
		this.topic = topic;
		this.desp = desp;
		this.amount = amount;
		this.transaction_id = transaction_id;
		this.transaction_date = transaction_date;
	}




	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getDesp() {
		return desp;
	}

	public void setDesp(String desp) {
		this.desp = desp;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}


	public long getTransaction_id() {
		return transaction_id;
	}


	public void setTransaction_id(long transaction_id) {
		this.transaction_id = transaction_id;
	}


	public String getTrasaction_date() {
		return transaction_date;
	}


	public void setTrasaction_date(String transaction_date) {
		this.transaction_date = transaction_date;
	}


	
	
	
	
}
