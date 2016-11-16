package ch.bbc.gamexchange.controller;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import ch.bbc.gamexchange.model.Customer;
import ch.bbcag.GameXChangeEJB.RegisterBeanLocal;

@Named
@RequestScoped
public class RegisterController implements Serializable {

	private static final long serialVersionUID = 1L;

	@EJB
	private RegisterBeanLocal registerBean;

	@Inject
	private Customer customer;

	public String save() {
		registerBean.save(customer);
		return "";
	}

	public String login() {
		registerBean.login(customer);
		return "";
	}
	
	public List<Customer> getAllCustomer() {
		List<Customer> customer = registerBean.getAllCustomer();
		return customer;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
