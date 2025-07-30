package Rodrigues.dev.LivreMotos.Mapper;

import Rodrigues.dev.LivreMotos.DTO.OrdemVendaDTO;
import Rodrigues.dev.LivreMotos.Model.OrdemVendaModel;
import org.springframework.stereotype.Component;

@Component
public class OrdemVendaMapper {

    public OrdemVendaModel toModel(OrdemVendaDTO ordemVendaDTO) {
        OrdemVendaModel ordemVendaModel = new OrdemVendaModel();
        ordemVendaModel.setId(ordemVendaDTO.getId());
        ordemVendaModel.setCliente(ordemVendaDTO.getCliente());
        ordemVendaModel.setMotoVendida(ordemVendaDTO.getMotoVendida());
        ordemVendaModel.setVendedor(ordemVendaDTO.getVendedor());
        ordemVendaModel.setDataVenda(ordemVendaDTO.getDataVenda());
        ordemVendaModel.setValorTotal(ordemVendaDTO.getValorTotal());
        ordemVendaModel.setStatus(ordemVendaDTO.getStatus());
        ordemVendaModel.setFormaDePagamento(ordemVendaDTO.getFormaDePagamento());
        return ordemVendaModel;
    }

    public OrdemVendaDTO toDTO(OrdemVendaModel ordemVendaModel) {
        OrdemVendaDTO ordemVendaDTO = new OrdemVendaDTO();
        ordemVendaDTO.setId(ordemVendaModel.getId());
        ordemVendaDTO.setCliente(ordemVendaModel.getCliente());
        ordemVendaDTO.setMotoVendida(ordemVendaModel.getMotoVendida());
        ordemVendaDTO.setVendedor(ordemVendaModel.getVendedor());
        ordemVendaDTO.setDataVenda(ordemVendaModel.getDataVenda());
        ordemVendaDTO.setValorTotal(ordemVendaModel.getValorTotal());
        ordemVendaDTO.setStatus(ordemVendaModel.getStatus());
        ordemVendaDTO.setFormaDePagamento(ordemVendaModel.getFormaDePagamento());
        return ordemVendaDTO;
    }
}
