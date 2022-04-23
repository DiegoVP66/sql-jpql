package diego.example.uri2603.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import diego.example.uri2603.entities.Customer;
import diego.example.uri2603.projections.CustomerMinProjection;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
	
	@Query(nativeQuery = true, value = "SELECT customers.name, customers.street "
			+ "FROM customers "
			+ "WHERE LOWER(customers.city) = LOWER(:name)")
	List<CustomerMinProjection> search1(String name);
}
