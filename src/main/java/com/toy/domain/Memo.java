package com.toy.domain;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Table(name = "memo")
@Entity
public class Memo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 200)
    private String memo;
}
