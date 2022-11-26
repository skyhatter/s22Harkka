package harkka.EstateManagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import harkka.EstateManagement.domain.AppUser;
import harkka.EstateManagement.domain.AppUserRepository;
import harkka.EstateManagement.domain.Estate;
import harkka.EstateManagement.domain.EstateRepository;
import harkka.EstateManagement.domain.Management;
import harkka.EstateManagement.domain.ManagementRepository;

@SpringBootApplication
public class EstateManagementApplication implements CommandLineRunner{
	private static final Logger log = LoggerFactory.getLogger(EstateManagementApplication.class);
	
	@Autowired
	AppUserRepository aRepository;
	
	@Autowired	
	EstateRepository eRepository;
	
	@Autowired	
	ManagementRepository mRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(EstateManagementApplication.class, args);
	}

	
	@Override
	public void run(String... args) throws Exception {
		
		Management management1 = new Management ("roskaa", "thrash@man");
		mRepository.save(management1);
		mRepository.save(new Management("asiaa", "righton@yeah"));
		mRepository.save(new Management("timanttii", "coalis@diamond"));
		
		log.info("kiinteist");
		eRepository.save(new Estate("Hotelli", "hotellikatu1", 1989, management1));
		eRepository.save(new Estate("Poliisilaitos", "kuja1", 1990, mRepository.findByManagementName("roskaa").get(0)));
		eRepository.save(new Estate("Vankila", "katu1", 1989, mRepository.findByManagementName("timanttii").get(0)));	
		log.info("Kiinteistöö");
		for (Estate estate : eRepository.findAll()) {
			log.info(estate.toString());
		}
		
		log.info("tehdään käyttäjiä");
		
		aRepository.save(new AppUser("Timo", "Timorr", "USER", "user", 
				"$2a$10$bfFbGozfOlEjFqoyWDCNfuzx2McVx.LxZrkYUiY.QnvYjhQiCjhIi"));
		
		aRepository.save(new AppUser("Jookko", "Jooka", "ADMIN", "admin", 
				"$2a$10$bC0Qtk676vAPGDhAkGBKOOFCd/JS2NSbmmfouHinjlMGSlbuSREnm"));
		
		for (AppUser AppUser : aRepository.findAll()) {
			log.info(AppUser.toString());
		
		}
	}
}