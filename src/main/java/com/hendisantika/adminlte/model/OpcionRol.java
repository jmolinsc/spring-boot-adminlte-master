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
public class OpcionRol implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Basic(fetch = FetchType.EAGER)
	@Column(name = "OPCION_ROL", nullable = false)
	@JsonView
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer opcionRol;

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name = "ROL", referencedColumnName = "ROL")
	Rol rol;

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name = "OPCION", referencedColumnName = "OPCION")
	Opcion opcion;

}
