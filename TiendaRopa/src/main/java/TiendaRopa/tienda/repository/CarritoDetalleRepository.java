package TiendaRopa.tienda.repository;

import TiendaRopa.tienda.domain.Carrito;
import TiendaRopa.tienda.domain.CarritoDetalle;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarritoDetalleRepository extends JpaRepository<CarritoDetalle, Long> {

    List<CarritoDetalle> findByCarrito(Carrito carrito);
}
