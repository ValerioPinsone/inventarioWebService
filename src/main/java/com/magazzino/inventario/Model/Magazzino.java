package com.magazzino.inventario.Model;

import javax.persistence.*;


@Entity
@Table(name="magazzino")
public class Magazzino {

    @Id
    @Column(name="id_stock")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_stock;

    @Column(name="id_prodotto")
    private Integer id_prodotto;

    @Column(name="quantita")
    private Integer quantita;

    //Getter & Setter

    public Integer getId_stock() {
        return id_stock;
    }

    public void setId_stock(Integer id_stock) {
        this.id_stock = id_stock;
    }

    public Integer getId_prodotto() {
        return id_prodotto;
    }

    public void setId_prodotto(Integer id_prodotto) {
        this.id_prodotto = id_prodotto;
    }

    public Integer getQuantita() {
        return quantita;
    }

    public void setQuantita(Integer quantita) {
        this.quantita = quantita;
    }
}
