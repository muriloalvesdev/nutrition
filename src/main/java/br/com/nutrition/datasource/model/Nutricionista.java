package br.com.nutrition.datasource.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "nutricionista")
public class Nutricionista {

    @Id
    private Long id;

    private String nome;
    private LocalDate idade;

    @Column(name = "codigo_registro")
    private String codigoRegistro;

    @Column(name = "id_paciente")
    private Long idPaciente;

    public Nutricionista(String nome, LocalDate idade, String codigoRegistro,
            Long idPaciente) {
        this.nome = nome;
        this.idade = idade;
        this.codigoRegistro = codigoRegistro;
        this.idPaciente = idPaciente;
    }

    @SuppressWarnings("unused")
    private Nutricionista() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getIdade() {
        return idade;
    }

    public void setIdade(LocalDate idade) {
        this.idade = idade;
    }

    public String getCodigoRegistro() {
        return codigoRegistro;
    }

    public void setCodigoRegistro(String codigoRegistro) {
        this.codigoRegistro = codigoRegistro;
    }

    public Long getId_paciente() {
        return idPaciente;
    }

    public void setId_paciente(Long idPaciente) {
        this.idPaciente = idPaciente;
    }

}
