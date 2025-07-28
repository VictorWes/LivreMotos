package Rodrigues.dev.LivreMotos.Repository;

import Rodrigues.dev.LivreMotos.Model.MotoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotoRepository extends JpaRepository<MotoModel, Long> {
}
