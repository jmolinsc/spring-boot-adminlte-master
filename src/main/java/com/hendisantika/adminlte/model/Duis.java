package com.hendisantika.adminlte.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonView;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
public class Duis implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(fetch = FetchType.EAGER)
    @Column(name = "DUI", length = 10, nullable = false)
    @JsonView
    String dui;

    @Column(name = "APELLIDO", length = 50, nullable = true)
    @JsonView
    String apellido;

    @Column(name = "MUNICIPIO", length = 50, nullable = true)
    @JsonView
    String municipio;

    @Column(name = "NOMBRE", length = 50, nullable = true)
    @JsonView
    String nombre;

    @Column(name = "DEPARTAMENTO", length = 50, nullable = true)
    @JsonView
    String departamento;
}
