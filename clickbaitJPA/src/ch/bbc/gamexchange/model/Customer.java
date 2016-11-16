package ch.bbc.gamexchange.model;

import java.io.Serializable;

import javax.inject.Named;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;


/**
 * The persistent class for the customer database table.
 * 
 */
@Named
@Entity
@NamedQueries({
       @NamedQuery(name="Customer.findAll", query="SELECT c FROM Customer c"),
       @NamedQuery(name="Customer.findByEmailAndPassword", query ="SELECT c FROM Customer c WHERE c.email = :custMail AND c.password = :custPW")
})

public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private double balance;

	private String email;

	private String password;

	public Customer() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password; 
	}

}