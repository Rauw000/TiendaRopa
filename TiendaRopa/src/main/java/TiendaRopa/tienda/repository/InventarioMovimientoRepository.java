package TiendaRopa.tienda.repository;

import TiendaRopa.tienda.domain.InventarioMovimiento;
import TiendaRopa.tienda.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface InventarioMovimientoRepository extends JpaRepository<InventarioMovimiento, Long> {

    List<InventarioMovimiento> findByProducto(Producto producto);
}
