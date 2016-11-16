package ch.bbcag.GameXChangeEJB;

import java.util.List;
import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ch.bbc.gamexchange.model.Customer;

/**
 * Session Bean implementation class GameBean
 */
@Stateless
public class RegisterBean implements RegisterBeanLocal {
	
	private final static Logger LOGGER = Logger.getLogger(RegisterBean.class.getName());
	
	@PersistenceContext
	EntityManager em;
	
	/**
	 * Default constructor.
	 */
	public RegisterBean() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void save(Customer c) {
		try {
			em.persist(c);
		} catch (Exception e) {
			System.out.println("error");
		}
		LOGGER.info("User succesfully registered.");
	}

	public boolean login(Customer c) {
		LOGGER.info("User succesfully logged in.");
		return em.createNamedQuery("Customer.findByEmailAndPassword")
				.setParameter("custMail", c.getEmail())
				.setParameter("custPW", c.getPassword())
				.getResultList()
				.size() > 0;
				
	}
	@Override
	public List<Customer> getAllCustomer() {
		List<Customer> customer = em.createNamedQuery("Customer.findAll").getResultList();
		for (int i = 0; i < customer.size(); i++) {
			Customer c = customer.get(i);
			System.out.println(c.getEmail() + " | " + c.getPassword()  + " | " + c.getBalance());
		}
		return customer;
	}
}