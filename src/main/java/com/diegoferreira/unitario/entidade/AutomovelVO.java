package com.diegoferreira.unitario.entidade;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_AUTOMOVEL")
public class AutomovelVO {
    
    private Long id;
    private String nome;
    private String marca;
    private Integer anoFabricacao;

    public AutomovelVO() {
    }

    public AutomovelVO(Long id, String nome, String marca, Integer anoFabricacao) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
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
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Column(name = "ANO_FABRICACAO")
    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }
    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }



}
