package dasensio.springboot.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import dasensio.springboot.domain.Animal;
import dasensio.springboot.service.AnimalService;

@RestController
@RequestMapping("/animal")
public class AnimalController {

	@Autowired
	AnimalService animalService;

	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	public Animal getAnimal(@PathVariable final Long id) {
		return animalService.getAnimal(id);
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<Animal> getAnimales() {
		return animalService.getAnimales();
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public Animal insertAnimal(@RequestBody final Animal animal) {
		return animalService.insertAnimal(animal);
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteAnimal(@PathVariable final Long id) {
		animalService.deleteAnimal(id);
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.PATCH)
	public Animal updateAnimal(@PathVariable final Long id, @RequestBody final Animal animal) {
		return animalService.updateAnimal(animal);
	}

	@RequestMapping(path = "/search", method = RequestMethod.GET)
	public List<Animal> searchAnimales(@RequestParam final String crotal) {
		return animalService.searchAnimales(crotal);
	}

}
