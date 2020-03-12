package br.com.nutrition.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.nutrition.datasource.model.Nutricionista;
import br.com.nutrition.exception.NutricionistaNotFoundException;
import br.com.nutrition.repository.NutricionistaRepository;

@Service
public class BuscarNutricionistaPorIdServiceImpl {

  @Autowired
  private NutricionistaRepository nutricionistaRepository;

  public Nutricionista buscarPorId(Long id) throws NutricionistaNotFoundException {
    Optional<Nutricionista> optionalNutricionista = getOptional(id);
    Nutricionista nutricionista = null;
    if (!optionalNutricionista.isPresent()) {
      throw new NutricionistaNotFoundException("Nutricionista nao encontrado atraves do ID: " + id);
    } else {
      nutricionista = optionalNutricionista.get();
    }
    return nutricionista;
  }

  private Optional<Nutricionista> getOptional(Long id) {
    Optional<Nutricionista> optionalNutricionista = nutricionistaRepository.findById(id);
    return optionalNutricionista;
  }

  public void deletarPorId(Long id) throws NutricionistaNotFoundException {
    Optional<Nutricionista> optionalNutricionista = getOptional(id);
    if (!optionalNutricionista.isPresent()) {
      throw new NutricionistaNotFoundException("Nutricionista nao encontrado atraves do ID: " + id);
    } else {
      nutricionistaRepository.delete(optionalNutricionista.get());
    }

  }

}
