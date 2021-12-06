package com.magazzino.inventario.Controller;

import com.magazzino.inventario.Model.Categoria;
import com.magazzino.inventario.Service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class CategoriaController {
    @Autowired
    CategoriaService categoriaSer;

    @GetMapping("/categoria")
    public List<Categoria> getAll(){
        return categoriaSer.getAll();
    }

    @GetMapping("/categoria/{id}")
    public Categoria getById(@PathVariable int id){
        return categoriaSer.getById(id);
    }

    @PostMapping("/categoria/insert")
    public void insCategoria(@RequestBody Categoria c){
        categoriaSer.insert(c);
    }

}
