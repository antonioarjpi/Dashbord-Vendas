package com.devsimple.dashvendas.api.model;

import com.devsimple.dashvendas.domain.model.Seller;
import lombok.Data;

import java.io.Serializable;


@Data
public class SaleSucessDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String sellerName;
    private Long visited;
    private Long deals;

    public SaleSucessDTO(Seller seller, Long visited, Long deals){
        sellerName = seller.getName();
        this.visited = visited;
        this.deals = deals;
    }


}
