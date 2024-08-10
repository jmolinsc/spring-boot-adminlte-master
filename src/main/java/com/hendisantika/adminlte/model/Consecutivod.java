package com.hendisantika.adminlte.model;

import java.io.Serializable;

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
public class Consecutivod implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "IDLINEA", nullable = false)
    @JsonView
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    Integer idlinea;

    @Column(name = "CONSECUTIVO", nullable = true)
    @JsonView
    Integer consecutivon;


    @Column(name = "MOVID",length =20, nullable = true)
    @JsonView
    String movid;


    @Column(name = "REFERENCIA",length =100, nullable = true)
    @JsonView
    String referencia;


    @Column(name = "MOVD",length =20, nullable = true)
    @JsonView
    String movd;


    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    @JoinColumn(name = "ID", referencedColumnName = "ID")
    Consecutivo consecutivo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    @JoinColumn(name = "MODULO", referencedColumnName = "MODULO")
    Modulo modulo;




}

