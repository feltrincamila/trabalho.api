package br.senai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity(name = "Comida")
public class Comida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Size(max = 100)
    private String nome ;

    @Size(max = 80)
    private String tipo;

    @Size(max = 40)
    private String descriçao;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescriçao() {
        return descriçao;
    }
    public void setDescriçao(String descriçao) {
        this.descriçao = descriçao;
    }

    @Override
    public String toString() {
        return "Comida" +
                "id" + id +
                "nome" + nome +
                "tipo" + tipo +
                "descriçao" + descriçao ;
    }
}
