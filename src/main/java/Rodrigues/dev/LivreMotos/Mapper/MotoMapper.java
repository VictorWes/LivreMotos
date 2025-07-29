package Rodrigues.dev.LivreMotos.Mapper;

import Rodrigues.dev.LivreMotos.DTO.MotoDTO;
import Rodrigues.dev.LivreMotos.Model.MotoModel;
import org.springframework.stereotype.Component;

@Component
public class MotoMapper {

    public MotoModel toModel(MotoDTO motoDTO){
        MotoModel motoModel = new MotoModel();
        motoModel.setAno(motoDTO.getAno());
        motoModel.setCor(motoDTO.getCor());
        motoModel.setId(motoDTO.getId());
        motoModel.setModelo(motoDTO.getModelo());
        motoModel.setValor(motoDTO.getValor());
        motoModel.setFichaTecnica(motoDTO.getFichaTecnica());
        motoModel.setNome(motoDTO.getNome());
        motoModel.setCliente(motoDTO.getCliente());
        motoModel.setImgUrl(motoDTO.getImgUrl());
        return motoModel;
    }

    public MotoDTO toDTO(MotoModel motoModel){
        MotoDTO motoDTO = new MotoDTO();
        motoDTO.setAno(motoModel.getAno());
        motoDTO.setCliente(motoModel.getCliente());
        motoDTO.setCor(motoModel.getCor());
        motoDTO.setId(motoModel.getId());
        motoDTO.setImgUrl(motoModel.getImgUrl());
        motoDTO.setModelo(motoModel.getModelo());
        motoDTO.setFichaTecnica(motoModel.getFichaTecnica());
        motoDTO.setNome(motoModel.getNome());
        motoDTO.setValor(motoModel.getValor());
       return motoDTO;

    }

}
