package com.devsimple.dashvendas.domain.repository;

import com.devsimple.dashvendas.api.model.SaleSucessDTO;
import com.devsimple.dashvendas.api.model.SaleSumDTO;
import com.devsimple.dashvendas.domain.model.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT new com.devsimple.dashvendas.api.model.SaleSumDTO(obj.seller, SUM(obj.amount))"+
    "FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSumDTO> amountGroupedBySeller();

    @Query("SELECT new com.devsimple.dashvendas.api.model.SaleSucessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals) )"+
            "FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSucessDTO> sucessGroupedBySeller();
}
