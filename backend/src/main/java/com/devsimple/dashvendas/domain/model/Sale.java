package com.devsimple.dashvendas.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;


@Data
@Entity
@Table(name = "tb_sales")
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer visited;
    private Integer deals;
    private Double amount;
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "seller_id")
    private Seller seller;

}
