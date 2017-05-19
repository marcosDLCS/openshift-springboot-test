package dasensio.springboot.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import dasensio.springboot.domain.Explotacion;

public interface ExplotacionRepository extends JpaRepository<Explotacion, Long> {

}
