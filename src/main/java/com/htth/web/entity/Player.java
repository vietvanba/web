package com.htth.web.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "players")
public class Player {
    @Id
    private Integer id;
    private String name;
    private String body;
    private String date;
    private String quest_daily;
    private Integer level;
    private Long exp;
    private String site;
    private Short clazz;
    private Long vang;
    private Long ngoc;
    private String bag3;
    private String box3;
    private String it_body;
    private String bag47;
    private String box47;
    private String potential;
    private String skill;
    private String rms;
    private String friend;
    private String enemy;
    private String eff;
    private String fashion;
}
