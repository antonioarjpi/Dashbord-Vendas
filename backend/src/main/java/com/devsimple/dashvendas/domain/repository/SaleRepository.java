package com.devsimple.dashvendas.domain.repository;

import com.devsimple.dashvendas.domain.model.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {
}
