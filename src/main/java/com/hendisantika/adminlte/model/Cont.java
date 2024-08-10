package com.hendisantika.adminlte.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
public class Cont implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", nullable = false)
    @JsonView
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")

    @Column(name = "FECHACANCELACION", nullable = true)
    @JsonView
    Date fechacancelacion;

    @Column(name = "EJERCICIO", nullable = true)
    @JsonView
    Integer ejercicio;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")

    @Column(name = "FECHACONCLUSION", nullable = true)
    @JsonView
    Date fechaconclusion;

    @Column(name = "MOVID", length = 20, nullable = true)
    @JsonView
    String movid;

    @Column(name = "USUARIO", length = 20, nullable = true)
    @JsonView
    String usuario;

    @Column(name = "PERIODO", nullable = true)
    @JsonView
    Integer periodo;

    @Column(name = "MOV", length = 20, nullable = false)
    @JsonView
    String mov;

    @Column(name = "CONTACTO", length = 10, nullable = true)
    @JsonView
    String contacto;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")

    @Column(name = "ULTIMOCAMBIO", nullable = true)
    @JsonView
    Date ultimocambio;

    @Column(name = "ORIGENTIPO", length = 10, nullable = true)
    @JsonView
    String origentipo;

    @Column(name = "CONTACTOTIPO", length = 20, nullable = true)
    @JsonView
    String contactotipo;

    @Column(name = "ESTATUS", length = 15, nullable = true)
    @JsonView
    String estatus;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")

    @Column(name = "FECHAEMISION", nullable = true)
    @JsonView
    Date fechaemision;

    @Column(name = "OBSERVACIONES", length = 100, nullable = true)
    @JsonView
    String observaciones;

    @Column(name = "REFERENCIA", length = 100, nullable = true)
    @JsonView
    String referencia;

    @Column(name = "ORIGENID", length = 20, nullable = true)
    @JsonView
    String origenid;

    @Column(name = "CONTACTOAPLICA", length = 10, nullable = true)
    @JsonView
    String contactoaplica;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "FECHACONTABLE", nullable = false)
    @JsonView
    Date fechacontable;

    @Column(name = "ORIGEN", length = 20, nullable = true)
    @JsonView
    String origen;

    @Column(name = "IMPORTE", scale = 4, precision = 18, nullable = true)
    @JsonView
    BigDecimal importe;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy hh:mm:ss a")
    @JsonFormat(pattern = "dd/MM/yyyy hh:mm:ss a", timezone = "America/El_Salvador")
    @Column(name = "FECHAREGISTRO", nullable = true)
    @JsonView

    Date fecharegistro;

    @Column(name = "CONCEPTO", length = 250, nullable = true)
    @JsonView
    String conceptoEnc;

    @OneToMany(mappedBy = "cont", cascade = {CascadeType.REMOVE}, fetch = FetchType.EAGER)
    @JsonIgnore
    List<Contd> Contds;


    @Override
	public Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException ex) {
            System.out.println(" no se puede duplicar");
        }
        return obj;
    }

}
