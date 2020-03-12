package br.com.nutrition.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Objects;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import br.com.nutrition.datasource.model.Nutricionista;
import br.com.nutrition.repository.NutricionistaRepository;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
@Sql(scripts = "/sql/insert_nutri_buscar_todos_os_nutri.sql")
public class BuscarNutricionistasServiceImplTest {

  @Autowired
  private BuscarNutricionistasServiceImpl serviceImpl;

  @Autowired
  private NutricionistaRepository nutricionistaRepository;

  @Test
  public void buscarTodosOsNutricionistasTest() {
    List<Nutricionista> listaNutricionistas = serviceImpl.buscarTodosOsNutricionistas();

    List<Nutricionista> listaNutricionistasDatabase = nutricionistaRepository.findAll();

    Nutricionista nutricionistaService = listaNutricionistas.stream()
        .filter(nutri -> nutri.getNome().equals("Flavio")).findFirst().get();

    Nutricionista nutricionistaDatabase = listaNutricionistasDatabase.stream()
        .filter(nutri -> nutri.getNome().equals("Flavio")).findFirst().get();

    assertNotNull(Objects.nonNull(listaNutricionistas));
    assertEquals(nutricionistaDatabase.getNome(), nutricionistaService.getNome());
    assertEquals(nutricionistaDatabase.getCodigoRegistro(),
        nutricionistaService.getCodigoRegistro());
    assertEquals(nutricionistaDatabase.getId_paciente(), nutricionistaService.getId_paciente());
    assertEquals(nutricionistaDatabase.getIdade(), nutricionistaService.getIdade());
    assertEquals(listaNutricionistas.size(), listaNutricionistasDatabase.size());

  }

}
