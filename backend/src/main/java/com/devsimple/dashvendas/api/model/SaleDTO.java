package com.devsimple.dashvendas.api.model;

import com.devsimple.dashvendas.domain.model.Sale;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class SaleDTO {

    private Long id;
    private Integer visited;
    private Integer deals;
    private Double amount;
    private LocalDate date;

    private SellerDTO sellerDTO;

    public SaleDTO(Sale model){
        id = model.getId();
        visited = model.getVisited();
        deals = model.getDeals();
        amount = model.getAmount();
        date = model.getDate();
        sellerDTO =  new SellerDTO(model.getSeller());
    }

}
