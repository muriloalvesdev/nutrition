package br.com.nutrition;

import java.time.LocalDate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.nutrition.datasource.model.Nutricionista;
import br.com.nutrition.repository.NutricionistaRepository;

@SpringBootTest
@RunWith(SpringRunner.class)
public class Teste {

    @Autowired
    private NutricionistaRepository nutricionistaRepository;

    @Test
    public void teste() {
        Nutricionista n = new Nutricionista();
        n.setCodigoRegistro("123");
        n.setId_paciente(123L);
        n.setIdade(LocalDate.parse("2019-01-04"));
        n.setNome("murilo");
        nutricionistaRepository.saveAndFlush(n);
    }

}
