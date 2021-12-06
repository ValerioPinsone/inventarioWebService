package com.magazzino.inventario.Controller;

import com.magazzino.inventario.Model.Brand;
import com.magazzino.inventario.Service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class BrandController {
    @Autowired
    BrandService brandSer;

    @GetMapping("/brand")
    public List<Brand> getAll(){
        return brandSer.getAll();
    }

    @GetMapping("/brand/{id}")
    public Brand getById(@PathVariable int id){
        return brandSer.getById(id);
    }

    @PostMapping("/brand/insert")
    public void insBrand(@RequestBody Brand b){
        brandSer.insert(b);
    }
}
