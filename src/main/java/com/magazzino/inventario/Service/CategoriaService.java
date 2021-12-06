package com.magazzino.inventario.Service;

import com.magazzino.inventario.Model.Categoria;
import com.magazzino.inventario.Repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {
    @Autowired
    CategoriaRepository categoriaRep;

    public List<Categoria> getAll(){
        return categoriaRep.findAll();
    }

    public Categoria getById(int id){
        return categoriaRep.findById(id).orElse(new Categoria());
    }

    public void insert(Categoria c){
        categoriaRep.save(c);
    }
}
