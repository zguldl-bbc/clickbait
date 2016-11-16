//package ch.bbc.gamexchange.controller;
//
//import java.io.Serializable;
//import java.util.logging.Logger;
//
//import javax.annotation.Resource;
//import javax.enterprise.context.SessionScoped;
//import javax.inject.Inject;
//import javax.inject.Named;
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.transaction.UserTransaction;
//
//import ch.bbc.gamexchange.model.Customer;
//
//@Named
//@SessionScoped
//public class LoginController implements Serializable {
//
//	private final static long serialVersionUID = 1L;
//	private final static Logger LOGGER = Logger.getLogger(LoginController.class.getName());
//
//	@PersistenceContext
//	private EntityManager em;
//
//	@Resource
//	private UserTransaction ut;
//
//	@Inject
//	private Customer customer;
//
//	public String login() {
//
//		try {
//			ut.begin();
//			em.contains(customer);
//			ut.commit();
//			if(em.contains(customer));
//		} catch (Exception e) {
//			LOGGER.warning("Customer could not log in: " + e);
//		}
//		LOGGER.info("Customer " + customer.getEmail() + " successfully logged in.");
//		return "";
//	}
//
//	public Customer getCustomer() {
//		return customer;
//	}
//
//	public void setCustomer(Customer customer) {
//		this.customer = customer;
//	}
//}