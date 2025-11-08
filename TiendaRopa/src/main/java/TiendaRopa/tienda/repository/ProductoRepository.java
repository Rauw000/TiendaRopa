package TiendaRopa.tienda.repository;

import TiendaRopa.tienda.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

    List<Producto> findByCategoriaNombre(String nombre);
    List<Producto> findByActivoTrue();
    List<Producto> findByNombreContainingIgnoreCase(String nombre);// Busca productos cuyo nombre contenga el texto dado, sin importar mayúsculas o minúsculas.

}
