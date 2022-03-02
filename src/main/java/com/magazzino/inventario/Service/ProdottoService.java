package com.magazzino.inventario.Service;

import com.magazzino.inventario.Model.Prodotto;
import com.magazzino.inventario.Repository.ProdottoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdottoService {
    @Autowired
    ProdottoRepository prodottoRep;

    public List<Prodotto> getAll() { return prodottoRep.findAll(); }

    public Prodotto getById(int id){ return prodottoRep.findById(id).orElse(new Prodotto());  }

    public void insert(Prodotto p){ prodottoRep.save(p);}

    public void insertAll(List<Prodotto> lp){
        prodottoRep.saveAll(lp);
    }



}
