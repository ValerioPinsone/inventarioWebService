package com.magazzino.inventario.Service;

import com.magazzino.inventario.Model.Brand;
import com.magazzino.inventario.Repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandService {
    @Autowired
    BrandRepository brandRep;

    public List<Brand> getAll(){
        return brandRep.findAll();
    }

    public Brand getById(int id){
        return brandRep.findById(id).orElse(new Brand());
    }

    public void insert(Brand b){
        brandRep.save(b);
    }

}
