package com.magazzino.inventario.Service;

import com.magazzino.inventario.Model.Magazzino;
import com.magazzino.inventario.Repository.MagazzinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MagazzinoService {
    @Autowired
    MagazzinoRepository magazzinoRep;

    public List<Magazzino> getAll(){
        return magazzinoRep.findAll();
    }

    public Magazzino getById(int id){
        return magazzinoRep.findById(id).orElse(new Magazzino());
    }

    public void insert(Magazzino m){
        magazzinoRep.save(m);
    }
}
