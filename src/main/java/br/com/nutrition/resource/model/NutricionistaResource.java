package br.com.nutrition.resource.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NutricionistaResource implements Serializable {

  private static final long serialVersionUID = 6030862910379069667L;

  @JsonProperty("nome_nutricionista")
  private String nome;

  @JsonProperty("idade")
  private String idade;

  @JsonProperty("codigo_registro")
  private String codigoRegistro;

  @JsonProperty("id_paciente")
  private String idPaciente;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getIdPaciente() {
    return idPaciente;
  }

  public void setIdPaciente(String idPaciente) {
    this.idPaciente = idPaciente;
  }

  public String getIdade() {
    return idade;
  }

  public void setIdade(String idade) {
    this.idade = idade;
  }

  public String getCodigoRegistro() {
    return codigoRegistro;
  }

  public void setCodigoRegistro(String codigoRegistro) {
    this.codigoRegistro = codigoRegistro;
  }

  @Override
  public String toString() {
    return "NutricionistaResource [nome=" + nome + ", idade=" + idade + ", codigoRegistro="
        + codigoRegistro + ", idPaciente=" + idPaciente + "]";
  }

}
