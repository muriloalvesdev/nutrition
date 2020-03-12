package br.com.nutrition.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import br.com.nutrition.datasource.model.Nutricionista;
import br.com.nutrition.repository.NutricionistaRepository;
import br.com.nutrition.resource.model.NutricionistaResource;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
@Sql(scripts = "/sql/delete_nutricionistas.sql")
public class CadastroNutricionistaServiceImplTest {

  @Autowired
  private CadastroNutricionistaServiceImpl serviceImpl;

  @Autowired
  private NutricionistaRepository nutricionistaRepository;

  private NutricionistaResource resource;

  @Before
  public void setUp() {
    resource = new NutricionistaResource();
    resource.setCodigoRegistro("987654");
    resource.setIdade("1980-01-01");
    resource.setIdPaciente("9876543");
    resource.setNome("Murilo");
  }

  @Test
  public void cadastroTest() {
    serviceImpl.cadastro(resource);

    Nutricionista nutricionista = nutricionistaRepository.findAll().stream()
        .filter(nutri -> nutri.getNome().equals("Murilo")).findFirst().get();

    assertEquals("987654", nutricionista.getCodigoRegistro());
    assertEquals("Murilo", nutricionista.getNome());
    assertEquals("9876543", String.valueOf(nutricionista.getId_paciente()));
    assertEquals("1980-01-01", String.valueOf(nutricionista.getIdade()));
  }

}
