package Rodrigues.dev.LivreMotos.Repository;

import Rodrigues.dev.LivreMotos.Model.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteModel, Long> {
}
