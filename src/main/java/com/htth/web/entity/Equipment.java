package com.htth.web.entity;

import jakarta.persistence.Column;
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
    private Short clazz;
    private Integer typeequip;
    private Integer icon;
    private Integer level;
    private Short color;
    private Short typelock;
    @Column(name="numHoleDaDuc")
    private Short numHoleDaDuc;
    private Integer chetac;
    private Short ishoanmy;
    private Short valuekichan;
    private String op_1;
    private String op_2;
    private Short numlokham;
    private String mdakham;
    private Integer part;
    private Integer beri;
    private Integer ruby;
}
