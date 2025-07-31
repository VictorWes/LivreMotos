package Rodrigues.dev.LivreMotos.Service;

import Rodrigues.dev.LivreMotos.DTO.MotoDTO;
import Rodrigues.dev.LivreMotos.Mapper.MotoMapper;
import Rodrigues.dev.LivreMotos.Model.MotoModel;
import Rodrigues.dev.LivreMotos.Repository.MotoRepository;
import Rodrigues.dev.LivreMotos.Utils.MergeUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MotoService {

    private final MotoRepository motoRepository;
    private final MotoMapper motoMapper;

    public MotoService(MotoRepository motoRepository, MotoMapper motoMapper) {
        this.motoRepository = motoRepository;
        this.motoMapper = motoMapper;
    }

    public List<MotoDTO> buscarTodasMotos(){
        List<MotoModel> motos = motoRepository.findAll();
        return motos.stream()
                .map(motoMapper::toDTO)
                .collect(Collectors.toList());
    }

    public MotoDTO criarMoto(MotoDTO motoDTO){
        MotoModel motoModel = motoMapper.toModel(motoDTO);
        motoModel = motoRepository.save(motoModel);
        return motoMapper.toDTO(motoModel);
    }

    public MotoDTO buscarMotoId(Long id){
        Optional<MotoModel> motoId = motoRepository.findById(id);
        return motoId.map(motoMapper::toDTO).orElse(null);
    }

    public void deletarMoto(Long id){
         motoRepository.deleteById(id);
    }

    public MotoDTO atualizarDadosParcial(Long id, MotoDTO motoDTO){
        MotoModel motoId = motoRepository.findById(id).orElseThrow(() -> new RuntimeException("ID não encontrado"));
        MergeUtils.copiaCampos(motoDTO, motoId);
        motoRepository.save(motoId);
        return motoMapper.toDTO(motoId);
    }
}
