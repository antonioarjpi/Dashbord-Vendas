package com.devsimple.dashvendas.api.model;

import com.devsimple.dashvendas.domain.model.Seller;
import lombok.Data;
import java.io.Serializable;

@Data
public class SaleSumDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private String sellerName;
    private Double sum;

    public SaleSumDTO(Seller seller,Double sum){
        this.sellerName = seller.getName();
        this.sum = sum;
    }


}
