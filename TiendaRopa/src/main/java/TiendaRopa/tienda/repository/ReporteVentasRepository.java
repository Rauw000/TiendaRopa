package TiendaRopa.tienda.repository;

import TiendaRopa.tienda.domain.ReporteVentas;
import org.springframework.stereotype.Repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ReporteVentasRepository extends JpaRepository<ReporteVentas, Long> {

    List<ReporteVentas> findByAnio(Integer anio);
}
