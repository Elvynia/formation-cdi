package fr.gtm.proxibanque.web;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import fr.gtm.proxibanque.business.ClientService;

@Path("hello")
public class TestWebService {

	@Inject
	private ClientService service;

	@GET
	public String sayHello() {
		return "Hello from Jersey through servlet-container !";
	}
}
