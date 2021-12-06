package com.magazzino.inventario.Model;



import javax.persistence.*;

@Entity
@Table(name="prodotto")
public class Prodotto {

    @Id
    @Column(name="id_prodotto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_prodotto;

    @Column(name="ean_code")
    private String ean_code;

    @Column(name="nome")
    private String nome;

    @Column(name="id_brand")
    private Integer id_brand;

    @Column(name="id_categoria")
    private Integer id_categoria;

    //Getter & Setter


    public Integer getId_prodotto() {
        return id_prodotto;
    }

    public void setId_prodotto(Integer id_prodotto) {
        this.id_prodotto = id_prodotto;
    }

    public String getEan_code() {
        return ean_code;
    }

    public void setEan_code(String ean_code) {
        this.ean_code = ean_code;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId_brand() {
        return id_brand;
    }

    public void setId_brand(Integer id_brand) {
        this.id_brand = id_brand;
    }

    public Integer getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(Integer id_categoria) {
        this.id_categoria = id_categoria;
    }
}
