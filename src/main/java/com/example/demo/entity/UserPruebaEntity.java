package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Data
@Entity
@Table(name = "prueba")
public class UserPruebaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "username")
    private String username;

    @Column(name = "passwordUser")
    private String password;

    public void setId(Long id) {
        System.out.println("Entre");
        this.id = id;
    }

}
