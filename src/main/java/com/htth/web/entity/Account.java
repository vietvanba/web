package com.htth.web.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "accounts")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Accounts {
    @Id
    @Column(name="id")
    private Integer id;
    @Column(name="user")

    private String user;
    @Column(name="pass")

    private String pass;
    @Column(name = "char")
    private String character;
    @Column(name="onl")

    private Integer onl;
    @Column(name="phone")

    private String phone;
    @Column(name="coin")

    private Integer coin;
    @Column(name="kichhoat")

    private Integer kichhoat;
    @Column(name="lock")

    private Integer lock;
    @Column(name="naptuan")

    private Integer naptuan;
    @Column(name="tongnap")

    private Integer tongnap;

}
