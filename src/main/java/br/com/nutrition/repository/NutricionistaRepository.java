package br.com.nutrition.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.nutrition.datasource.model.Nutricionista;

public interface NutricionistaRepository extends JpaRepository<Nutricionista, Long> {

}
