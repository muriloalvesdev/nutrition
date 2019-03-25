package br.com.nutrition.model;

import java.math.BigDecimal;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID uuid;

    @Column(name = "nome")
    private String nome;

    @Column(name = "sobrenome")
    private String sobrenome;

    @Column(name = "peso")
    private BigDecimal peso;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "uuid_nutricionista")
    private UUID uuidNutricionista;

    @Column(name = "email")
    private String email;

    @Column(name = "idade")
    private String idade;

    public Cliente(String nome, String sobrenome, BigDecimal peso, String cpf,
            UUID uuidNutricionista, String email, String idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.peso = peso;
        this.cpf = cpf;
        this.uuidNutricionista = uuidNutricionista;
        this.email = email;
        this.idade = idade;
    }

    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public UUID getUuidNutricionista() {
        return uuidNutricionista;
    }

    public void setUuidNutricionista(UUID uuidNutricionista) {
        this.uuidNutricionista = uuidNutricionista;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Cliente [uuid=" + uuid + ", nome=" + nome + ", sobrenome="
                + sobrenome + ", peso=" + peso + ", cpf=" + cpf
                + ", uuidNutricionista=" + uuidNutricionista + ", email="
                + email + ", idade=" + idade + "]";
    }

}
