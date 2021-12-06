package com.magazzino.inventario.Controller;


import com.magazzino.inventario.Model.Prodotto;
import com.magazzino.inventario.Service.ProdottoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins= "*", allowedHeaders = "*")
@RestController
public class ProdottoController {
    @Autowired
    ProdottoService prodottoServ;

    @GetMapping("/prodotti")
    public List<Prodotto> getAll(){
        return prodottoServ.getAll();
    }
}
