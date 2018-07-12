package fr.gtm.proxibanque.persistence;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import fr.gtm.proxibanque.domain.Client;

/**
 * Bean CDI déclaré avec Named par le "Default" Qualifier et de scope
 * "singleton" grâce à ApplicationScoped.
 * 
 * @author Adminl
 *
 */
@Named
@ApplicationScoped
public class ClientDao extends Repository<Client> implements Serializable {

	private static final long serialVersionUID = 1L;

	@Override
	public List<Client> findAll() {
		return this.findAll(Client.class);
	}

	@Override
	public Client findOne(Integer id) {
		return this.findOne(new Client(), id);
	}

}
