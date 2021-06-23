package com.example1.demo1.entity;

import javax.persistence.*;


import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="stu")
@Getter
@Setter
public class Student { @Id @GeneratedValue(strategy = GenerationType.AUTO) private Long id;private String name;
    }


