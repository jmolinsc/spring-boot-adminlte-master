package com.hendisantika.adminlte.model;

import java.io.Serializable;
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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class Consecutivo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", nullable = false)
    @JsonView
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "MOV", length = 30, nullable = true)
    @JsonView
    String mov;

    @Column(name = "USUARIO", length = 20, nullable = true)
    @JsonView
    String usuario;

    @Column(name = "RESOLUCION", length = 30, nullable = true)
    @JsonView
    String resolucion;

    @Column(name = "ESTATUS", length = 10, nullable = true)
    @JsonView
    String estatus;

    @Column(name = "AUTOMATICO", length = 10, nullable = true)
    @JsonView
    Integer automatico;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "FECHAAUTORIZACION", nullable = true)
    @JsonView
    Date fechaautorizacion;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "FECHACONCLUSION", nullable = true)
    @JsonView
    Date fechaconclusion;

    @Column(name = "CONSECUTIVOA", nullable = true)
    @JsonView
    Integer consecutivoa;

    @Column(name = "CONSECUTIVOD", nullable = true)
    @JsonView
    Integer consecutivod;

    @Column(name = "CONSECUTIVOU", nullable = true)
    @JsonView
    Integer consecutivou;

    @Column(name = "SERIE", length = 20, nullable = true)
    @JsonView
    String serie;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
        @JoinColumn(name = "CTADINERO", referencedColumnName = "CTADINERO")
    Ctadinero ctadinero;

    @OneToMany(mappedBy = "consecutivo", cascade = {CascadeType.REMOVE}, fetch = FetchType.LAZY)
    @JsonIgnore
    List<Consecutivod> consecutivods;

}
