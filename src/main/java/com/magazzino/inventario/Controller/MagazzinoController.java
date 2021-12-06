package com.magazzino.inventario.Controller;

import com.magazzino.inventario.Model.Magazzino;
import com.magazzino.inventario.Service.MagazzinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins= "*", allowedHeaders = "*")
@RestController
public class MagazzinoController {

    @Autowired
    MagazzinoService magazzinoServ;

    @GetMapping("/magazzino")
    public List<Magazzino> getAll(){
        return magazzinoServ.getAll();
    }

    @GetMapping("/magazzino/{id}")
    public Magazzino getById(@PathVariable int id){
        return magazzinoServ.getById(id);
    }

    @PostMapping("magazzino/insert")
    public void insMagazzino(@RequestBody Magazzino m){
        magazzinoServ.insert(m);
    }

    @PostMapping("/magazzino/insert/array")
    public void insMultMagazzino(@RequestBody List<Magazzino> m){
        magazzinoServ.insertAll(m);
    }

}
