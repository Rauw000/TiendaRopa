package TiendaRopa.tienda.repository;

import TiendaRopa.tienda.domain.Carrito;
import TiendaRopa.tienda.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public interface CarritoRepository extends JpaRepository<Carrito, Long> {

    Optional<Carrito> findVyUsuarioAndTotalGreaterThan(Usuario usuario, Double total);

    List<Carrito> findByUsuario(Usuario usuario);
}
