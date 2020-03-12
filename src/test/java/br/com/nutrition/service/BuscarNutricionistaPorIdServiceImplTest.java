package br.com.nutrition.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import br.com.nutrition.datasource.model.Nutricionista;
import br.com.nutrition.exception.NutricionistaNotFoundException;
import br.com.nutrition.repository.NutricionistaRepository;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
@Sql(scripts = "/sql/insert_nutri_para_test_buscar_por_id.sql")
public class BuscarNutricionistaPorIdServiceImplTest {

  @Autowired
  private BuscarNutricionistaPorIdServiceImpl serviceImpl;

  @Autowired
  private NutricionistaRepository nutricionistaRepository;

  @Test
  public void buscarPorIdTest() throws NutricionistaNotFoundException {

    Nutricionista nutricionista = serviceImpl.buscarPorId(11L);

    assertEquals("123", nutricionista.getCodigoRegistro());
    assertEquals("123", String.valueOf(nutricionista.getId_paciente()));
    assertEquals("murilo", nutricionista.getNome());
  }

  @Test
  public void deletarPorIdTest() throws NutricionistaNotFoundException {
    serviceImpl.deletarPorId(11L);

    Optional<Nutricionista> optionalNutricionista = nutricionistaRepository.findById(11L);

    assertFalse(optionalNutricionista.isPresent());
  }

}
