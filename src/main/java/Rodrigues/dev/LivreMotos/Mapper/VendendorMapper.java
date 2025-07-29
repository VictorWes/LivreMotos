package Rodrigues.dev.LivreMotos.Mapper;

import Rodrigues.dev.LivreMotos.DTO.VendedorDTO;
import Rodrigues.dev.LivreMotos.Model.VendedorModel;
import org.springframework.stereotype.Component;

@Component
public class VendendorMapper {

    public VendedorModel map(VendedorDTO vendedorDTO) {
        VendedorModel vendedorModel = new VendedorModel();
        vendedorModel.setId(vendedorDTO.getId());
        vendedorModel.setNome(vendedorDTO.getNome());
        vendedorModel.setEmail(vendedorDTO.getEmail());
        vendedorModel.setOrdensVenda(vendedorDTO.getOrdensVenda());
        return vendedorModel;
    }

    public VendedorDTO map(VendedorModel vendedorModel) {
        VendedorDTO vendedorDTO = new VendedorDTO();
        vendedorDTO.setId(vendedorModel.getId());
        vendedorDTO.setNome(vendedorModel.getNome());
        vendedorDTO.setEmail(vendedorModel.getEmail());
        vendedorDTO.setOrdensVenda(vendedorModel.getOrdensVenda());
        return vendedorDTO;
    }
}
