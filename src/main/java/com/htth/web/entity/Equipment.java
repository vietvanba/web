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
@Table(name = "item3")
public class Equipment {
    @Id
    private Integer id;
    private String name;
    private Integer clazz;
    private Integer typeequip;
    private Integer icon;
    private Integer level;
    private Integer color;
    private Integer typelock;
    private Integer numHoleDaDuc;
    private Integer chetac;
    private Integer ishoanmy;
    private Integer valuekichan;
    private String op_1;
    private String op_2;
    private Integer numlokham;
    private String mdakham;
    private Integer part;
    private Integer beri;
    private Integer ruby;
}
