package com.ufrn.imd.terracota.terracota;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ato")
public class AtoRest {
	
	@Autowired
	public AtoRepository repository;
	
	@GetMapping
	public List<Ato> findAll() {
		return repository.findAll();
	}
	
	@PostMapping
	public Ato save(@Valid @RequestBody Ato ato) {
		return repository.save(ato);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer id) {
		Optional<Ato> ato = repository.findById(id);
		repository.delete(ato.get());
	}

}
