package dasensio.springboot.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Animal extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 5978117015185213526L;

	private String crotal;
	private Date fechaNacimiento;

	@ManyToOne
	@JoinColumn(name = "especie_id")
	private Especie especie;

	@ManyToOne
	@JoinColumn(name = "explotacion_id")
	private Explotacion explotacion;

	public String getCrotal() {
		return crotal;
	}

	public void setCrotal(final String crotal) {
		this.crotal = crotal;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(final Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Especie getEspecie() {
		return especie;
	}

	public void setEspecie(final Especie especie) {
		this.especie = especie;
	}

	public Explotacion getExplotacion() {
		return explotacion;
	}

	public void setExplotacion(final Explotacion explotacion) {
		this.explotacion = explotacion;
	}
}
