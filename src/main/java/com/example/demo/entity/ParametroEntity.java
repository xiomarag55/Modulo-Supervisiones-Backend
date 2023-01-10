package com.example.demo.entity;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;

@Getter
@Data
@Entity
@Table(name = "t_param_estruc_metalicas")
public class ParametroEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "TIPO_PARAM")
    private String tipoParametro;
@Column(name = "def_parametro")
    private String defParametro;


    public void setId(Long id) {
        System.out.println("Entre");
        this.id = id;
    }


}
