package country.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import country.dao.CountryDAO;
import country.model.Country;
import country.service.IServiceWorker;

@Service
public class ServiceWorkerImpl implements IServiceWorker {
	@Autowired
	private CountryDAO countryDAO;
	@Autowired
	private ApplicationContext applicationContext;

	@Override
	public void dealWithCountryByCode(String code) {
		Country pays = countryDAO.getByCode(code);
		// car c'est prototype
		System.out.print("*********************DEBUT : Pays informations********************\n");
		System.out.print(" -Nom: " + pays.getName() + "\r\n");
		System.out.print(" -Devise: " + pays.getDevise() + "\r\n");
		System.out.print(" -Greetings: " + pays.getGreetings() + "\r\n");
		System.out.print(" -Code: " + pays.getCode() + "\r\n");
		System.out.print("*********************FIN   : Pays informations********************\n");

	}
}
