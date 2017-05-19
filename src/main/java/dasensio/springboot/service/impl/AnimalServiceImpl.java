package dasensio.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dasensio.springboot.domain.Animal;
import dasensio.springboot.jpa.AnimalRepository;
import dasensio.springboot.service.AnimalService;

@Service
public class AnimalServiceImpl implements AnimalService {

	private static final long serialVersionUID = -4569420219734611633L;

	@Autowired
	AnimalRepository animalRepository;

	@Override
	public Animal getAnimal(final Long id) {
		return animalRepository.findOne(id);
	}

	@Override
	public List<Animal> getAnimales() {
		return animalRepository.findAll();
	}

	@Override
	public void deleteAnimal(final Animal hero) {
		animalRepository.delete(hero);
	}

	@Override
	public void deleteAnimal(final Long id) {
		animalRepository.delete(id);
	}

	@Override
	public Animal updateAnimal(final Animal hero) {
		return animalRepository.save(hero);
	}

	@Override
	public Animal insertAnimal(final Animal hero) {
		return animalRepository.save(hero);
	}

	@Override
	public List<Animal> searchAnimales(final String crotal) {
		return animalRepository.findByCrotalContainingIgnoreCase(crotal);
	}

}
