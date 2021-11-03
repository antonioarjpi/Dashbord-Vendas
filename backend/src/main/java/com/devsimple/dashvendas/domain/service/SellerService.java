package com.devsimple.dashvendas.domain.service;

import com.devsimple.dashvendas.api.model.SellerDTO;
import com.devsimple.dashvendas.domain.model.Seller;
import com.devsimple.dashvendas.domain.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {

    @Autowired
    SellerRepository sellerRepository;

    @Transactional
    public List<SellerDTO> findAll(){
        List<Seller> result = sellerRepository.findAll();
        return  result.stream()
                .map(x -> new SellerDTO(x)).collect(Collectors.toList());
    }

}
