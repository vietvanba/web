package com.htth.web.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "item4")
public class Item {
    @Id
    private Integer id;
    private String name;
    private Integer icon;
    private Integer indexInfoPotion;
    private Integer price;
    private Integer priceruby;
    private Integer istrade;
    private Integer hpmpother;
    private Integer timedelay;
    private Integer value;
    private Integer timeactive;
    private String nameuse;
    private String description;
}
