package TiendaRopa.tienda.repository;

import TiendaRopa.tienda.domain.Devolucion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevolucionRepository extends JpaRepository<Devolucion, Long> {

    List<Devolucion> findByEstado(String estado);

}
