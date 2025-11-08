package TiendaRopa.tienda.repository;

import TiendaRopa.tienda.domain.Pedido;
import TiendaRopa.tienda.domain.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

    List<Pedido> findVyUsuario(Usuario usuario);

    List<Pedido> findByEstado(String estado);

}
