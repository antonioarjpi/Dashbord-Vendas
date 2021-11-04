package com.devsimple.dashvendas.api.controller;


import com.devsimple.dashvendas.api.model.SaleDTO;
import com.devsimple.dashvendas.api.model.SaleSucessDTO;
import com.devsimple.dashvendas.api.model.SaleSumDTO;
import com.devsimple.dashvendas.api.model.SellerDTO;
import com.devsimple.dashvendas.domain.service.SaleService;
import com.devsimple.dashvendas.domain.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sales")
public class SaleController {

    @Autowired
    private SaleService saleService;

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){
        Page<SaleDTO> list = saleService.findAll(pageable);
        return ResponseEntity.ok(list);
    }
    @GetMapping("/sum-by-seller")
    public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller(){
        List<SaleSumDTO> list = saleService.amountGroupedBySeller();
        return ResponseEntity.ok(list);
    }
    @GetMapping("/sucess-by-seller")
    public ResponseEntity<List<SaleSucessDTO>> sucessGroupedBySeller(){
        List<SaleSucessDTO> list = saleService.sucessGroupedBySeller();
        return ResponseEntity.ok(list);
    }
}
