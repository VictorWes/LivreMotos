package Rodrigues.dev.LivreMotos.Mapper;

import Rodrigues.dev.LivreMotos.DTO.ClienteDTO;
import Rodrigues.dev.LivreMotos.Model.ClienteModel;

public class ClienteMapper {


    public ClienteModel map(ClienteDTO clienteDTO){
        ClienteModel clienteModel = new ClienteModel();
        clienteModel.setCpf(clienteModel.getCpf());
        clienteModel.setEmail(clienteDTO.getEmail());
        clienteModel.setId(clienteDTO.getId());
        clienteModel.setIdade(clienteDTO.getIdade());
        clienteModel.setMotos(clienteDTO.getMotos());
        clienteModel.setNome(clienteDTO.getNome());
        return clienteModel;
    }

    public ClienteDTO map(ClienteModel clienteModel){
        ClienteDTO clienteDTO = new ClienteDTO();
        clienteDTO.setCpf(clienteModel.getCpf());
        clienteDTO.setEmail(clienteModel.getEmail());
        clienteDTO.setId(clienteModel.getId());
        clienteDTO.setIdade(clienteModel.getIdade());
        clienteDTO.setMotos(clienteModel.getMotos());
        clienteDTO.setNome(clienteModel.getNome());

        return clienteDTO;
    }
}
