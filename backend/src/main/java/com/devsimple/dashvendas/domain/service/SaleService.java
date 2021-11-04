package com.devsimple.dashvendas.domain.service;

import com.devsimple.dashvendas.api.model.SaleDTO;
import com.devsimple.dashvendas.api.model.SaleSucessDTO;
import com.devsimple.dashvendas.api.model.SaleSumDTO;
import com.devsimple.dashvendas.domain.model.Sale;
import com.devsimple.dashvendas.domain.repository.SaleRepository;
import com.devsimple.dashvendas.domain.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SaleService {

    @Autowired
    SaleRepository saleRepository;

    @Autowired
    SellerRepository sellerRepository;

    @Transactional
    public Page<SaleDTO> findAll(Pageable pageable){
        sellerRepository.findAll();
        Page<Sale> result = saleRepository.findAll(pageable);
        return  result
                .map(x -> new SaleDTO(x));
    }

    @Transactional
    public List<SaleSumDTO> amountGroupedBySeller(){
        return saleRepository.amountGroupedBySeller();
    }

    @Transactional
    public List<SaleSucessDTO> sucessGroupedBySeller(){
        return saleRepository.sucessGroupedBySeller();
    }
}

