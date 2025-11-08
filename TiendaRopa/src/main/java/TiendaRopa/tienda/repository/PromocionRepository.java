package TiendaRopa.tienda.repository;

import TiendaRopa.tienda.domain.Promocion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromocionRepository extends JpaRepository<Promocion, Long> {

    List<Promocion> findByActivaTrue();
}
