package com.example.demoSat.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name="impuesto")
public class c_Impuesto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String cImpuesto;
    @Column
    private String descripcion;
    @Column
    private String retencion;
    @Column
    private String traslado;
    @Column
    private String localFederal;
    @Column
    private Boolean status;
}   
