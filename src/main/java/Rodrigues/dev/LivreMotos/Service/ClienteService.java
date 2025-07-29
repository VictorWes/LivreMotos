package Rodrigues.dev.LivreMotos.Service;

import Rodrigues.dev.LivreMotos.DTO.ClienteDTO;
import Rodrigues.dev.LivreMotos.Mapper.ClienteMapper;
import Rodrigues.dev.LivreMotos.Model.ClienteModel;
import Rodrigues.dev.LivreMotos.Repository.ClienteRepository;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;
    private final ClienteMapper clienteMapper;

    public ClienteService(ClienteRepository clienteRepository, ClienteMapper clienteMapper) {
        this.clienteRepository = clienteRepository;
        this.clienteMapper = clienteMapper;
    }


    public ClienteDTO criarCliente(ClienteDTO clienteDTO){
        ClienteModel cliente = clienteMapper.toModel(clienteDTO);
        cliente =clienteRepository.save(cliente);
        return clienteMapper.toDTO(cliente);
    }


}
