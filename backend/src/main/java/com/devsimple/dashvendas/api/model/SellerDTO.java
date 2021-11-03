package com.devsimple.dashvendas.api.model;

import com.devsimple.dashvendas.domain.model.Seller;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class SellerDTO implements Serializable {

    private static final Long serialVersionUID = 1L;

    private Long id;
    private String name;

    public SellerDTO(Seller model){
        id = model.getId();
        name = model.getName();
    }
}
