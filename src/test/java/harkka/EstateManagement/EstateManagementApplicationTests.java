package harkka.EstateManagement;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import harkka.EstateManagement.web.EstateController;
import harkka.EstateManagement.web.ManagementController;

@SpringBootTest
class EstateManagementApplicationTests {
	
	@Autowired
	EstateController estateController;
	@Autowired
	ManagementController managementController;

	@Test
	void contextLoads() throws Exception {
		assertThat(estateController).isNotNull();
		assertThat(managementController).isNotNull();
	}

}
