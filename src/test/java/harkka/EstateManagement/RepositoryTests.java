package harkka.EstateManagement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import harkka.EstateManagement.domain.Estate;
import harkka.EstateManagement.domain.EstateRepository;
import harkka.EstateManagement.domain.Management;

@DataJpaTest
class RepositoryTests {

	@Autowired
	EstateRepository eRepository;


	@Test
	public void findEstatelistManagementShouldReturnOneManagement() {
		Management management = eRepository.findById((long) 6).get().getManagement();
		System.out.println("Haetaan id:llä 6 " + management);
		assertEquals(management.getManagementName(), "roskaa");
	}

	@Test
	public void findByManagementNameShouldReturnEstatelist() {
		List<Estate> estates = eRepository.findByManagementManagementName("asiaa");
		assertEquals(estates.size(), 3);
	}

	@Test
	public void addNewEstate() {
		Estate estate = new Estate("Pallomeri", "manalanportti", 1766);
		eRepository.save(estate);
		assertNotNull(estate.getEstate_id());
	}

}
