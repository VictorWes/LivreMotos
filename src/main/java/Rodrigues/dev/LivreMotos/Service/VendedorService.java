package Rodrigues.dev.LivreMotos.Service;

import Rodrigues.dev.LivreMotos.DTO.VendedorDTO;
import Rodrigues.dev.LivreMotos.Mapper.VendedorMapper;
import Rodrigues.dev.LivreMotos.Model.VendedorModel;
import Rodrigues.dev.LivreMotos.Repository.VendedorRepository;
import Rodrigues.dev.LivreMotos.Utils.MergeUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VendedorService {

    private final VendedorMapper vendedorMapper;
    private final VendedorRepository vendedorRepository;

    public VendedorService(VendedorMapper vendedorMapper, VendedorRepository vendedorRepository) {
        this.vendedorMapper = vendedorMapper;
        this.vendedorRepository = vendedorRepository;
    }

    public VendedorDTO criarVendedor(VendedorDTO vendedorDTO){
        VendedorModel vendedorCriar =  vendedorMapper.toModel(vendedorDTO);
        vendedorCriar = vendedorRepository.save(vendedorCriar);
        return vendedorMapper.toDTO(vendedorCriar);
    }

    public List<VendedorDTO> listarVendedor(){
        List<VendedorModel> vendedorLista = vendedorRepository.findAll();
        return vendedorLista.stream().map(vendedorMapper::toDTO)
                .collect(Collectors.toList());
    }
    public VendedorDTO listarVendedorId(Long id){
        Optional<VendedorModel> vendedorId = vendedorRepository.findById(id);
        return vendedorId.map(vendedorMapper::toDTO).orElse(null);
    }

    public VendedorDTO alterarDadosVendedor(Long id, VendedorDTO vendedorDTO){
        VendedorModel alterarVendedor = vendedorRepository.findById(id).orElseThrow(() -> new RuntimeException("ID não localizada"));
        MergeUtils.copiaCampos(alterarVendedor, vendedorDTO);
        vendedorRepository.save(alterarVendedor);
        return vendedorMapper.toDTO(alterarVendedor);
    }
    public void deletarVendedor(Long id){
        vendedorRepository.deleteById(id);
    }
}
