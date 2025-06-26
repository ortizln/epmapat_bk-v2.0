package com.erp.comercializacion.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name= "suspensiones")
public class Suspensiones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idsuspension;
    private Long tipo;
    private Long iddocumento_documentos;
    private String numdoc;
    private String observa;
    private Long usucrea;
    private LocalDate feccrea;
    private Long usumodi;
    private LocalDate fecmodi;
    private Long total;
}
