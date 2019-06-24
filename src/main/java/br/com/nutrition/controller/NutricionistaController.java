package br.com.nutrition.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.nutrition.datasource.model.Nutricionista;
import br.com.nutrition.repository.NutricionistaRepository;

@RestController
@RequestMapping(value = "/api")
public class NutricionistaController {

    @Autowired
    private NutricionistaRepository nutricionistaRepository;

    @GetMapping(path = "/nutricionistas")
    public List<Nutricionista> buscarNutricionistas() {
        return nutricionistaRepository.findAll();
    }

    @GetMapping(path = "/nutricionista/id/{id}")
    public Optional<Nutricionista> buscarNutricionistasPorId(
            @PathVariable(name = "id", required = true) Long id) {
        return nutricionistaRepository.findById(id);
    }

    @PostMapping(path = "nutricionista/save")
    public void salvarNutricionista(@RequestBody Nutricionista nutricionista) {
        nutricionistaRepository.save(nutricionista);
    }
}
