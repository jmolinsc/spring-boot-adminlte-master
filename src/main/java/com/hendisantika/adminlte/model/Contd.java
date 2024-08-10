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
public class Contd implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "IDLINEA", nullable = false)
	@JsonView
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer idlinea;

	@Column(name = "CONCEPTO", length = 500, nullable = true)
	@JsonView
	String concepto;

	@Column(name = "SUBCUENTA", length = 50, nullable = true)
	@JsonView
	String subcuenta;

	@Column(name = "DEBE", scale = 4, precision = 18, nullable = true)
	@JsonView
	BigDecimal debe;

	@Column(name = "EJERCICIO", nullable = true)
	@JsonView
	Integer ejercicio;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@JsonFormat(pattern = "dd/MM/yyyy")

	@Column(name = "FECHACONTABLE", nullable = true)
	@JsonView
	Date fechacontable;

	@Column(name = "PERIODO", nullable = true)
	@JsonView
	Integer periodo;

	@Column(name = "HABER", scale = 4, precision = 18, nullable = true)
	@JsonView
	BigDecimal haber;

	@Column(name = "RENGLON", nullable = false)
	@JsonView
	Integer renglon;

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name = "CUENTA", referencedColumnName = "CUENTA")
	Cta cta;

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name = "ID", referencedColumnName = "ID")
	Cont cont;

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
