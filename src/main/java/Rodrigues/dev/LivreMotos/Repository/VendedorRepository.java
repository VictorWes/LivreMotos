package Rodrigues.dev.LivreMotos.Repository;

import Rodrigues.dev.LivreMotos.Model.VendedorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendedorRepository extends JpaRepository<VendedorModel, Long> {
}
