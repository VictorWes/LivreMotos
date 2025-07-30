package Rodrigues.dev.LivreMotos.Service;

import Rodrigues.dev.LivreMotos.DTO.ClienteDTO;
import Rodrigues.dev.LivreMotos.Mapper.ClienteMapper;
import Rodrigues.dev.LivreMotos.Model.ClienteModel;
import Rodrigues.dev.LivreMotos.Repository.ClienteRepository;
import Rodrigues.dev.LivreMotos.Utils.MergeUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


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

    public ClienteDTO buscarClienteId(Long id){
        Optional<ClienteModel> clienteId = clienteRepository.findById(id);
        return clienteId.map(clienteMapper::toDTO).orElse(null);
    }

    public List<ClienteDTO> buscarTodosClientes(){
        List<ClienteModel> clientes = clienteRepository.findAll();
        return clientes.stream()
                .map(clienteMapper::toDTO)
                .collect(Collectors.toList());
    }

    public ClienteDTO atualizarDadosParcial(Long id, ClienteDTO clienteDTO){
        ClienteModel cliente = clienteRepository.findById(id).orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
        MergeUtils.copiaCampos(clienteDTO, cliente);
        clienteRepository.save(cliente);
        return clienteMapper.toDTO(cliente);
    }

    public void deletarCliente(Long id){
       clienteRepository.deleteById(id);
    }


}
