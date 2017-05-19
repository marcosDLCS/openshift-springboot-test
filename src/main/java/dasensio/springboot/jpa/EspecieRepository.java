package dasensio.springboot.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import dasensio.springboot.domain.Especie;

public interface EspecieRepository extends JpaRepository<Especie, Long> {

}
