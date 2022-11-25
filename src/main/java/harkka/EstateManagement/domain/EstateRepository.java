package harkka.EstateManagement.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface EstateRepository extends CrudRepository<Estate, Long> {
	
	List<Estate> findByManagementManagementName(String managementName);

}
