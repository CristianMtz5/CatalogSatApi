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
@Table(name="localidad")
public class c_Localidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idLocal;
    @Column
    private String cLocalidad;
    @Column
    private String descripcion;
    @Column
    private Boolean status;

    @ManyToOne
    @JoinColumn(name="c_estado")
    private c_Estado estado;
}
