package com.hendisantika.adminlte.model;

import java.io.Serializable;
import java.util.List;

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
import jakarta.persistence.Transient;
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

public class Opcion implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Basic(fetch = FetchType.EAGER)
	@Column(name = "OPCION", nullable = false)
	@JsonView
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer opcion;

	@Column(name = "RUTA", length = 255, nullable = false)
	@JsonView
	String ruta;

	@Column(name = "ETIQUETA", length = 128, nullable = false)
	@JsonView
	String etiqueta;

	@Column(name = "APPETIQUETA", length = 128, nullable = false)
	@JsonView
	String appetiqueta;

	@Column(name = "ESCREENID", length = 50, nullable = false)
	@JsonView
	String escreenid;

	@Column(name = "NAVIGATIONID", length = 50, nullable = false)
	@JsonView
	String navigationid;

	@Column(name = "ICONMOVIL", length = 128, nullable = false)
	@JsonView
	String iconmovil;

	@Column(name = "ORDEN", nullable = false)
	@JsonView
	Integer orden;

	@Column(name = "OPCION_PADRE_ID", nullable = true)
	@JsonView
	Integer opcionPadreId;

	@Column(name = "ESTATUSOPCION", nullable = true)
	@JsonView
	Integer estatusopcion;

	@Column(name = "WEBAPP", nullable = true)
	@JsonView
	Integer webapp;

	@Column(name = "APPMOVIL", nullable = true)
	@JsonView
	Integer appmovil;

	@Column(name = "TRANSLATE", length = 150, nullable = true)
	@JsonView
	String translate;

	@Column(name = "ICON", length = 50, nullable = true)
	@JsonView
	String icon;

	@Column(name = "ISNEW", nullable = true)
	@JsonView
	Integer isnew;

	@Transient
	@JsonView
	Integer opcionRolid;

	@Transient
	@JsonView
	String estatus;

	@Column(name = "DESCRIPCION", length = 100, nullable = false)
	@JsonView
	String descripcion;

	@OneToMany(mappedBy = "opcion", cascade = { CascadeType.REMOVE }, fetch = FetchType.EAGER)
	@JsonIgnore
	List<OpcionRol> opcionRols;
}
