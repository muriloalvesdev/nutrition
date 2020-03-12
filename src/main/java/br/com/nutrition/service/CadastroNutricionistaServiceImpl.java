package br.com.nutrition.service;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.nutrition.datasource.model.Nutricionista;
import br.com.nutrition.exception.NutricionistaResourceException;
import br.com.nutrition.repository.NutricionistaRepository;
import br.com.nutrition.resource.model.NutricionistaResource;

@Service
public class CadastroNutricionistaServiceImpl {

  private static final Logger LOG = Logger.getLogger(CadastroNutricionistaServiceImpl.class);

  @Autowired
  private NutricionistaRepository nutricionistaRepository;

  @Autowired
  private NutricionistaConversor service;

  public void cadastro(NutricionistaResource nutricionistaResource) {

    try {
      Nutricionista nutricionista = service.conversor(nutricionistaResource);
      nutricionistaRepository.saveAndFlush(nutricionista);
    } catch (NutricionistaResourceException e) {
      LOG.error("Erro ao salvar o nutricionista: " + e.getMessage(), e);
    }
  }

}
