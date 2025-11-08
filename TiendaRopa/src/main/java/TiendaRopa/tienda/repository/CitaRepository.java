package TiendaRopa.tienda.repository;

import TiendaRopa.tienda.domain.Cita;
import TiendaRopa.tienda.domain.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitaRepository extends JpaRepository<Cita, Long> {

    List<Cita> findByUsuario(Usuario usuario);

}
