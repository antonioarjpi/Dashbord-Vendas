package com.devsimple.dashvendas.domain.model;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "tb_sellers")
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "seller")
    private List<Sale> sales = new ArrayList<>();


}
