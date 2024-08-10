package com.hendisantika.adminlte.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Auxiliaru implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(fetch = FetchType.EAGER)
    @Column(name = "ID", nullable = false)
    @JsonView
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy hh:mm:ss a")
    @JsonFormat(pattern = "dd/MM/yyyy hh:mm:ss a", timezone = "America/El_Salvador")
    @Column(name = "FECHA", nullable = true)
    @JsonView
    Date fecha;

    @Column(name = "ABONO", scale = 4, precision = 18, nullable = true)
    @JsonView
    BigDecimal abono;


    @Column(name = "EJERCICIO", nullable = false)
    @JsonView
    Integer ejercicio;


    @Column(name = "PERIODO", nullable = false)
    @JsonView
    Integer periodo;

    @Column(name = "ESCANCELACION", nullable = true)
    @JsonView
    Integer escancelacion;


    @Column(name = "MOV", length = 20, nullable = false)
    @JsonView
    String mov;

    @Column(name = "ABONOU", scale = 8, precision = 18, nullable = true)
    @JsonView
    BigDecimal abonou;


    @Column(name = "MODULO", length = 5, nullable = false)
    @JsonView
    String modulo;

    @Column(name = "RENGLON", scale = 8, precision = 18, nullable = true)
    @JsonView
    BigDecimal renglon;

    @Column(name = "APLICAID", length = 20, nullable = true)
    @JsonView
    String aplicaid;

    @Column(name = "CARGO", scale = 4, precision = 18, nullable = true)
    @JsonView
    BigDecimal cargo;

    @Column(name = "MOVID", length = 20, nullable = false)
    @JsonView
    String movid;

    @Column(name = "CARGOU", scale = 8, precision = 18, nullable = true)
    @JsonView
    BigDecimal cargou;

    @Column(name = "APLICA", length = 20, nullable = true)
    @JsonView
    String aplica;

    @Column(name = "CLIENTEPROVEEDOR", length = 20, nullable = true)
    @JsonView
    String clienteproveedor;

    @Column(name = "REFERENCIA", length = 20, nullable = true)
    @JsonView
    String referencia;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
        @JoinColumn(name = "ARTICULO", referencedColumnName = "ARTICULO")
    Art art;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    @JoinColumn(name = "ALMACEN", referencedColumnName = "ALMACEN")
    Alm alm;



}
