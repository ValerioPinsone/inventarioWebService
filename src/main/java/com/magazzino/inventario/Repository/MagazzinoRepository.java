package com.magazzino.inventario.Repository;

import com.magazzino.inventario.Model.Magazzino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MagazzinoRepository extends JpaRepository<Magazzino,Integer> {
}
