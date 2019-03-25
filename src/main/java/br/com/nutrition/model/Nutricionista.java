package br.com.nutrition.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "nutricionista")
public class Nutricionista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID uuid;

    @Column(name = "nutricionista")
    private String name;

    @Column(name = "sobrenome")
    private String sobrenome;

    @Column(name = "idade")
    private String idade;

    @Column(name = "crn")
    private String crn;

    public Nutricionista(String name, String sobrenome, String idade,
            String crn) {
        this.name = name;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.crn = crn;
    }

    public Nutricionista() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getCrn() {
        return crn;
    }

    public void setCrn(String crn) {
        this.crn = crn;
    }

    public UUID getId() {
        return uuid;
    }

    public void setId(UUID uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return "Nutricionista [id=" + uuid + ", name=" + name + ", sobrenome="
                + sobrenome + ", idade=" + idade + ", crn=" + crn + "]";
    }

}
