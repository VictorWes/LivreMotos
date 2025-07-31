package Rodrigues.dev.LivreMotos.Controller;

import Rodrigues.dev.LivreMotos.DTO.ClienteDTO;
import Rodrigues.dev.LivreMotos.Service.ClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("cliente")
@RestController
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping("/criar")
    public ResponseEntity<String> criarCliente(@RequestBody ClienteDTO cliente){
        ClienteDTO clienteDTO = clienteService.criarCliente(cliente);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Cliente criado com sucesso"  + clienteDTO.getNome() + "\n" + clienteDTO.getCpf());
    }

   @GetMapping("/listar")
    public ResponseEntity<List<ClienteDTO>> buscarTodosClientes(){
        List<ClienteDTO> clientes = clienteService.buscarTodosClientes();
        return ResponseEntity.ok(clientes);
   }

   @GetMapping("/listar/{id}")
   public ResponseEntity<?> buscarClienteId(@PathVariable Long id){
        ClienteDTO cliente = clienteService.buscarClienteId(id);
        if (cliente != null){
            return ResponseEntity.ok(cliente);
        }else {
           return ResponseEntity.status(HttpStatus.NOT_FOUND).body("ID não foi localizado");
        }
   }

   @PatchMapping("/{id}")
    public ResponseEntity<?> atualizarDadosParcial(@PathVariable Long id, @RequestBody ClienteDTO clienteDTO){
        ClienteDTO cliente = clienteService.atualizarDadosParcial(id, clienteDTO);
        if (cliente != null){
            return ResponseEntity.ok(cliente);
        }else {
            return ResponseEntity.notFound().build();
        }
   }

   @DeleteMapping("/deletar/{id}")
    public ResponseEntity<?> deletarCliente(@PathVariable Long id){
        ClienteDTO clienteDeletar = clienteService.buscarClienteId(id);
        if (clienteDeletar != null){
            clienteService.deletarCliente(id);
            return ResponseEntity.ok(clienteDeletar);
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ninja ID não localizado");
        }
   }


}
