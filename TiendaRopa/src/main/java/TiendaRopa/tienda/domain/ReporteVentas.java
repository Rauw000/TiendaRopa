package TiendaRopa.tienda.domain;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "reportes_ventas")
public class ReporteVentas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReporte;

    private Integer mes;
    private Integer anio;

    @Column(name = "total_ventas", precision = 12, scale = 2)
    private Double totalVentas;

    @Column(name = "total_pedidos")
    private Integer totalPedidos;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaGeneracion = new Date();

    // Getters y Setters
    public Long getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(Long idReporte) {
        this.idReporte = idReporte;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Double getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(Double totalVentas) {
        this.totalVentas = totalVentas;
    }

    public Integer getTotalPedidos() {
        return totalPedidos;
    }

    public void setTotalPedidos(Integer totalPedidos) {
        this.totalPedidos = totalPedidos;
    }

    public Date getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(Date fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }
}
