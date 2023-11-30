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
@Table(name = "item7")
public class MaterialItem {
    @Id
    private Integer id;
    private String name;
    private Integer icon;
    private Short type;
    private Integer price;
    private Integer priceruby;
    private Integer istrade;
}
