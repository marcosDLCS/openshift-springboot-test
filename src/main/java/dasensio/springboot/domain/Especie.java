package dasensio.springboot.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import org.springframework.data.jpa.domain.AbstractPersistable;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Especie extends AbstractPersistable<Long> {

	private static final long serialVersionUID = -8358755022646936654L;

	private String nombre;

	@OneToMany(mappedBy = "especie")
	@JsonIgnore
	private Set<Animal> animales;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(final String nombre) {
		this.nombre = nombre;
	}

	public Set<Animal> getAnimales() {
		return animales;
	}

	public void setAnimales(final Set<Animal> animales) {
		this.animales = animales;
	}

}
