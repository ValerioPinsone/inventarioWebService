package com.magazzino.inventario.Repository;

import com.magazzino.inventario.Model.Prodotto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdottoRepository extends JpaRepository<Prodotto,Integer> {
}
