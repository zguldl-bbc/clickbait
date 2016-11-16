package ch.bbcag.GameXChangeEJB;

import java.util.List;

import javax.ejb.Local;

import ch.bbc.gamexchange.model.Customer;

@Local
public interface RegisterBeanLocal {
	
	public void save(Customer c);
	
	public boolean login(Customer c);
	
	public List<Customer> getAllCustomer();
}
