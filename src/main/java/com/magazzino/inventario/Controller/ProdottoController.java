package com.magazzino.inventario.Controller;


import com.magazzino.inventario.Model.Prodotto;
import com.magazzino.inventario.Service.ProdottoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins= "*", allowedHeaders = "*")
@RestController
public class ProdottoController {
    @Autowired
    ProdottoService prodottoServ;


    @GetMapping("/prodotto")
    public List<Prodotto> getAll(){
        return prodottoServ.getAll();
    }

    @GetMapping("/prodotto/{id}")
    public Prodotto getById(@PathVariable int id){
        return prodottoServ.getById(id);
    }

    @PostMapping("/prodotto/insert")
    public void insProdotto(@RequestBody Prodotto p){
        prodottoServ.insert(p);
    }

    @PostMapping("/prodotto/insert/array")
    public void insMultProdotto(@RequestBody List<Prodotto> p){
        prodottoServ.insertAll(p);
    }


}
