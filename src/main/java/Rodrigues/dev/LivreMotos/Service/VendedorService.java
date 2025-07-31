package Rodrigues.dev.LivreMotos.Service;

import Rodrigues.dev.LivreMotos.Mapper.VendedorMapper;
import Rodrigues.dev.LivreMotos.Repository.VendedorRepository;
import org.springframework.stereotype.Service;

@Service
public class VendedorService {

    private final VendedorMapper vendedorMapper;
    private final VendedorRepository vendedorRepository;

    public VendedorService(VendedorMapper vendedorMapper, VendedorRepository vendedorRepository) {
        this.vendedorMapper = vendedorMapper;
        this.vendedorRepository = vendedorRepository;
    }
}
