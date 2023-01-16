package com.example.demoSat.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="codigo_postal1")
public class c_CodigoPostal1 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String codigopostal;
    @Column
    private Boolean status;
    
    @ManyToOne
    @JoinColumn(name="cEstado")
    private c_Estado estado;

    @ManyToOne
    @JoinColumn(name="c_municipio")
    private c_Municipio municipios;

    @ManyToOne
    @JoinColumn(name="c_localidad")
    private c_Localidad localidades;
}
