package dasensio.springboot.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dasensio.springboot.domain.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Long> {

	List<Animal> findByCrotal(String crotal);

	List<Animal> findByCrotalContainingIgnoreCase(String crotal);
}
