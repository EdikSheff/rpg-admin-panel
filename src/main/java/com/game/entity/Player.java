package com.game.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {
    private Long id;
    private String name;
    private String title;
    private Race race;
    private Profession profession;
    private Date birthday;
    private Boolean banned;
    private Integer level;

}