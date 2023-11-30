package com.htth.web.entity;

import jakarta.persistence.*;
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
public class Account {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user")
    private String user;

    @Column(name = "pass")
    private String pass;
    @Column(name = "`char`")
    private String character;

    @Column(name = "onl")
    private Short onl;

    @Column(name = "phone")
    private String phone;

    @Column(name = "coin")
    private Integer coin;

    @Column(name = "kichhoat")
    private Integer kichhoat;

    @Column(name = "lock_status")
    private Integer lock_status;

    @Column(name = "naptuan")
    private Long naptuan;

    @Column(name = "tongnap")
    private Long tongnap;

    public Account(String user, String pass, String character, short onl, String phone, int coin, int kichhoat, int lock_status, Long naptuan, long tongnap) {
        this.user = user;
        this.pass = pass;
        this.character = character;
        this.onl = onl;
        this.phone = phone;
        this.coin = coin;
        this.kichhoat = kichhoat;
        this.lock_status = lock_status;
        this.naptuan = naptuan;
        this.tongnap = tongnap;
    }
}


