package com.hendisantika.adminlte.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
public class Listaprecios implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(fetch = FetchType.EAGER)
    @Column(name = "ID", nullable = false)
    @JsonView
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "NOMBRE", length = 100, nullable = false)
    @JsonView
    String nombre;

    @Column(name = "ESTATUS", length = 30, nullable = true)
    @JsonView
    String estatus;
//
//    @OneToMany(mappedBy = "listaprecios", fetch = FetchType.LAZY)
//    @JsonIgnore
//    List<Venta> ventas;

    @OneToMany(mappedBy = "listaprecios", fetch = FetchType.LAZY)
    @JsonIgnore
    List<Cte> clientes;



}
