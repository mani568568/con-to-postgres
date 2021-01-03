package com.m.g.c2p.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TEXT", schema = "")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Text {

    @Id
    @Column(name = "TEXT_KEY")
    private String textKey;

    @Column(name = "TEXT_VALUE")
    private String textValue;
}

