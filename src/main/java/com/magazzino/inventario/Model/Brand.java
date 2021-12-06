package com.magazzino.inventario.Model;

import javax.persistence.*;

@Entity
@Table(name="brand")
public class Brand {

    @Id
    @Column(name="id_brand")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_brand;

    @Column(name="nome")
    private String nome;

    //Getter & Setter

    public Integer getId_brand() {
        return id_brand;
    }

    public void setId_brand(Integer id_brand) {
        this.id_brand = id_brand;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
