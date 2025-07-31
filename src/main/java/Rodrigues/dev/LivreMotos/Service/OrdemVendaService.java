package Rodrigues.dev.LivreMotos.Service;

import Rodrigues.dev.LivreMotos.DTO.OrdemVendaDTO;
import Rodrigues.dev.LivreMotos.Mapper.OrdemVendaMapper;
import Rodrigues.dev.LivreMotos.Model.OrdemVendaModel;
import Rodrigues.dev.LivreMotos.Repository.OrdemVendaRepository;
import Rodrigues.dev.LivreMotos.Utils.MergeUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class OrdemVendaService {

    private final OrdemVendaMapper ordemVendaMapper;
    private final OrdemVendaRepository ordemVendaRepository;

    public OrdemVendaService(OrdemVendaMapper ordemVendaMapper, OrdemVendaRepository ordemVendaRepository) {
        this.ordemVendaMapper = ordemVendaMapper;
        this.ordemVendaRepository = ordemVendaRepository;
    }

    public List<OrdemVendaDTO> listarTodasOrdens(){
        List<OrdemVendaModel> ordemVendaModel = ordemVendaRepository.findAll();
        return ordemVendaModel.stream().
                map(ordemVendaMapper::toDTO).
                collect(Collectors.toList());
    }

    public OrdemVendaDTO alterarDadosOrdem(Long id, OrdemVendaDTO ordemVendaDTO){
        OrdemVendaModel ordemDados = ordemVendaRepository.findById(id).orElseThrow(() -> new RuntimeException("Id não localizado"));
        MergeUtils.copiaCampos(ordemDados, ordemVendaDTO);
        ordemVendaRepository.save(ordemDados);
        return ordemVendaMapper.toDTO(ordemDados);
    }

    public OrdemVendaDTO criarOrdem(OrdemVendaDTO ordemVendaDTO){
        OrdemVendaModel ordemVendaModel = ordemVendaMapper.toModel(ordemVendaDTO);
        ordemVendaModel = ordemVendaRepository.save(ordemVendaModel);
        return ordemVendaMapper.toDTO(ordemVendaModel);
    }

    public OrdemVendaDTO listarOrdemId(Long id){
        Optional<OrdemVendaModel> ordemId = ordemVendaRepository.findById(id);
        return ordemId.map(ordemVendaMapper::toDTO).orElse(null);
    }

    public void deletarOdem(Long id){
       ordemVendaRepository.deleteById(id);
    }
}
