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
public class Rol implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(fetch = FetchType.EAGER)
    @Column(name = "ROL", nullable = false)
    @JsonView
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer rol;

    @Column(name = "NOMBRE", length = 30, nullable = false)
    @JsonView
    String nombre;

    @Column(name = "DESCRIPCION", length = 100, nullable = false)
    @JsonView
    String descripcion;

    @Column(name = "MOVIMIENTOS_EDICION", length = 4000)
    @JsonView
    String movimientosEdicion;

    @Column(name = "MOVIMIENTOS_CONSULTA", length = 4000)
    @JsonView
    String movimientosConsulta;

    @Column(name = "ALMACENES", length = 4000)
    @JsonView
    String almacenes;

    @Column(name = "CLIENTES_EDICION", length = 4000)
    @JsonView
    String clientesEdicion;

    @Column(name = "CLIENTES_CONSULTA", length = 4000)
    @JsonView
    String clientesConsulta;

    @Column(name = "ALMACEN_PREDETERMINADO", length = 10)
    @JsonView
    String almacenPredeterminado;

    @Column(name = "ALMACEN_SUGERIDO", length = 10)
    @JsonView
    String almacenSugerido;

    @Column(name = "CTADINERO_PREDETERMINADA", length = 10)
    @JsonView
    String ctadineroPredeterminada;

    @Column(name = "GRUPOCLIENTESPREDETERMINADO", length = 20)
    @JsonView
    String grupoclientespredeterminado;

    @Column(name = "MODIFICA_PRECIOS")
    @JsonView
    Integer modificaPrecios;

    @Column(name = "MODIFICA_REFERENCIAS")
    @JsonView
    Integer modificaReferencias;

    @Column(name = "ABRE_CUENTAS")
    @JsonView
    Integer abreCuentas;

    @Column(name = "MODIFICAIMPUESTOSCXP")
    @JsonView
    Integer modificaimpuestoscxp;

    @Column(name = "MODIFICAIMPUESTOSCOMPRA")
    @JsonView
    Integer modificaimpuestoscompra;

    @Column(name = "MODIFICAFECHA_FACTURACION")
    @JsonView
    Integer modificafechaFacturacion;

    @Column(name = "ABRE_CAJA")
    @JsonView
    Integer abreCaja;

    @Column(name = "CANCELA_PLANTARES")
    @JsonView
    Integer cancelaPlantares;

    @Column(name = "CANCELA_INVENTARIO")
    @JsonView
    Integer cancelaInventario;

    @Column(name = "CANCELA_VENTAS")
    @JsonView
    Integer cancelaVentas;

    @Column(name = "CANCELA_CXC")
    @JsonView
    Integer cancelaCXC;

    @Column(name = "CANCELA_TESORERIA")
    @JsonView
    Integer cancelaTesoreria;

    @Column(name = "CANCELA_CXP")
    @JsonView
    Integer cancelaCXP;

    @Column(name = "CANCELA_AF")
    @JsonView
    Integer cancelaAF;

    @Column(name = "CANCELA_INGRESO")
    @JsonView
    Integer cancelaIngreso;

    @Column(name = "CANCELA_COMPRAS")
    @JsonView
    Integer cancelaCompras;

    @Column(name = "CANCELA_RH")
    @JsonView
    Integer cancelaRH;

    @Column(name = "CANCELA_CONTABILIDAD")
    @JsonView
    Integer cancelaContabilidad;

    @Column(name = "CANCELA_GASTO")
    @JsonView
    Integer cancelagasto;

    @Column(name = "COMPARTE_CAJA")
    @JsonView
    Integer comparteCaja;

    @Column(name = "PERMITECONTABILIZAR")
    @JsonView
    Integer permitecontabilizar;

    @Column(name = "MODIFICAIMPORTE")
    @JsonView
    Integer modificaimporte;

    @Column(name = "MODIFICAPROVEEDORCXP")
    @JsonView
    Integer modificaproveedorcxp;

    @Column(name = "PERMITECOPIAR")
    @JsonView
    Integer permiteCopiar;

    @Column(name = "MODIFICAESTATUSACTIVOS")
    @JsonView
    Integer modificaestatusactivos;

    @Column(name = "LIQUIDACIONOC")
    @JsonView
    Integer liquidacionoc;

    @Column(name = "MODIFICA_ESTATUS_CLIENTES")
    @JsonView
    Integer modificaEstatusClientes;

    @Column(name = "MODIFICAIMPUESTOSGASTOS")
    @JsonView
    Integer modificaImpuestosGastos;

    @Column(name = "IMPORTAPRECIOS")
    @JsonView
    Integer importaPrecios;

    @Column(name = "IMPORTAINV")
    @JsonView
    Integer importainv;

    @Column(name = "IMPORTAPARTIDA")
    @JsonView
    Integer importaPartida;

    @Column(name = "MONTOMAXIMOOC")
    @JsonView
    Integer montoMaximoOc;

    @Column(name = "CENTROCOSTOSPREDETERMINADO", length = 20)
    @JsonView
    String centrocostospredeterminado;

    @Column(name = "PRECIOSSOLOFM")
    @JsonView
    Integer preciossolofm;

    @Column(name = "CONCLUYEINGRESOS")
    @JsonView
    Integer concluyeingresos;

    @Column(name = "MUESTRAEXISTENCIACOMPRAS")
    @JsonView
    Integer muestraexistenciacompras;

    @Column(name = "MUESTRAEXISTENCIAINVENTARIO")
    @JsonView
    Integer muestraexistenciainventario;

    @Column(name = "MUESTRAEXISTENCIAVENTAS")
    @JsonView
    Integer muestraexistenciaventas;

    @Column(name = "MODIFICAULTIMOCONSECUTIVO")
    @JsonView
    Integer modificaultimoconsecutivo;

    @Column(name = "AFECTAREMISIONENCONFIRMAR")
    @JsonView
    Integer afectaremisionenconfirmar;

    @Column(name = "AFECTAREMISIONENPENDIENTE")
    @JsonView
    Integer afectaremisionenpendiente;

    @Column(name = "AFECTAORDENESENPENDIENTE")
    @JsonView
    Integer afectaordenesenpendiente;

    @Column(name = "DASHBOARD")
    @JsonView
    Integer dashboard;

    @Column(name = "MODIFICAACCIONISTA")
    @JsonView
    Integer modificaaccionista;

    @Column(name = "LIQUIDAINGRESOS")
    @JsonView
    Integer liquidaingresos;

    @Column(name = "TRABAJASOLOSERVICIOS")
    @JsonView
    Integer trabajasoloservicios;

    @Column(name = "LIQUIDAHONORARIOS")
    @JsonView
    Integer liquidahonorarios;

    @Column(name = "EDITARECETA")
    @JsonView
    Integer editareceta;

    @Column(name = "OCULTABTNGUARDARVTAS")
    @JsonView
    Integer ocultabtnguardarvtas;

    @Column(name = "MUESTRACOSTORECETA")
    @JsonView
    Integer muestracostoreceta;

    @Column(name = "AUTORIZAREQUERIMIENTO")
    @JsonView
    Integer autorizarequerimiento;

    @Column(name = "FIRMASOLICITANTEREQUERIMIENTO")
    @JsonView
    Integer firmaSolicitanteRequerimiento;

    @Column(name = "MODIFICANOMINACONCEPTO", length = 18, nullable = true)
    @JsonView
    String modificanominaconcepto;

    @Column(name = "MODIFICAREFERENCIAREMISIONES")
    @JsonView
    Integer modificareferenciaremisiones;

    @OneToMany(mappedBy = "rol", cascade = {CascadeType.REMOVE}, fetch = FetchType.LAZY)
    @JsonIgnore
    List<TecnicoRol> tecnicoRols;

    @OneToMany(mappedBy = "rol", cascade = {CascadeType.REMOVE}, fetch = FetchType.LAZY)
    @JsonIgnore
    List<OpcionRol> opcionRols;

}
