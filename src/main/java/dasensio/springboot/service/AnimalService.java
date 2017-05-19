package dasensio.springboot.service;

import java.io.Serializable;
import java.util.List;

import dasensio.springboot.domain.Animal;

public interface AnimalService extends Serializable {

	public Animal getAnimal(Long id);

	public List<Animal> getAnimales();

	public List<Animal> searchAnimales(String crotal);

	public void deleteAnimal(Animal animal);

	public void deleteAnimal(Long id);

	public Animal updateAnimal(Animal animal);

	public Animal insertAnimal(Animal animal);
}
