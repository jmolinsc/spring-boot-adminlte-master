package com.hendisantika.adminlte.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonView;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Ctasdineroabiertas implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", nullable = false)
    @JsonView
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", timezone = "GMT-6")
    @Column(name = "FECHA", nullable = true)
    @JsonView
    Date fecha;

    @Column(name = "USUARIO", length = 20, nullable = true)
    @JsonView
    String usuario;

    @Column(name = "MOV", length = 20, nullable = true)
    @JsonView
    String mov;

    @Column(name = "IDDINERO", nullable = true)
    @JsonView
    Integer iddinero;

    @Column(name = "IDCORTEZ", nullable = true)
    @JsonView
    Integer idcortez;

    @Column(name = "CTADINERO", length = 10, nullable = true)
    @JsonView
    String ctadinero;

    @Column(name = "ESTATUS", length = 10, nullable = true)
    @JsonView
    String estatus;

    @Column(name = "MOVID", nullable = true)
    @JsonView
    Integer movid;

}
