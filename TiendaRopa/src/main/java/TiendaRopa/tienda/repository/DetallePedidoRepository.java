package TiendaRopa.tienda.repository;

import TiendaRopa.tienda.domain.DetallePedido;
import TiendaRopa.tienda.domain.Pedido;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetallePedidoRepository extends JpaRepository<DetallePedido, Long> {

    List<DetallePedido> findByPedido(Pedido pedido);
}
