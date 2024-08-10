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

public class Acum implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Basic(fetch = FetchType.EAGER)
	@Column(name = "ID", nullable = false)
	@JsonView
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;

	@Column(name = "CARGOS", scale = 4, precision = 18, nullable = true)
	@JsonView
	BigDecimal cargos;

	@Column(name = "EJERCICIO", nullable = false)
	@JsonView
	Integer ejercicio;

	@Column(name = "SUBCUENTA", length = 50, nullable = true)
	@JsonView
	String subcuenta;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@JsonFormat(pattern = "dd/MM/yyyy")

	@Column(name = "ULTIMOCAMBIO", nullable = true)
	@JsonView
	Date ultimocambio;

	@Column(name = "MODULO", length = 5, nullable = false)
	@JsonView
	String modulo;

	@Column(name = "ABONOS", scale = 4, precision = 18, nullable = true)
	@JsonView
	BigDecimal abonos;

	@Column(name = "PERIODO", nullable = false)
	@JsonView
	Integer periodo;

	@Column(name = "RAMA", length = 50, nullable = true, insertable = false, updatable = false)
	@JsonView
	public String rama;

	@ManyToOne(fetch = FetchType.EAGER)
	@JsonIgnore
	@JoinColumn(name = "CUENTA", referencedColumnName = "CUENTA")
	Cta cta;

}
