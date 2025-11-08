package TiendaRopa.tienda.repository;

import TiendaRopa.tienda.domain.Producto;
import TiendaRopa.tienda.domain.Valoracion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValoracionRepository extends JpaRepository<Valoracion, Long> {

    List<Valoracion> findByProducto(Producto producto);
}
