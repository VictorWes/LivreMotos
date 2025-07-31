package Rodrigues.dev.LivreMotos.Controller;

import Rodrigues.dev.LivreMotos.DTO.OrdemVendaDTO;
import Rodrigues.dev.LivreMotos.Service.OrdemVendaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("ordem")
@RestController
public class OrdemVendaController {

    private final OrdemVendaService ordemVendaService;


    public OrdemVendaController(OrdemVendaService ordemVendaService) {
        this.ordemVendaService = ordemVendaService;
    }

    @GetMapping("/listar")
    public ResponseEntity<List<OrdemVendaDTO>> listarOrdens(){
        List<OrdemVendaDTO> listaOrdens = ordemVendaService.listarTodasOrdens();
        return ResponseEntity.ok(listaOrdens);
    }

    @GetMapping("/listar/{id}")
    public ResponseEntity<?> listarOrdemId(@PathVariable Long id){
        OrdemVendaDTO ordemId = ordemVendaService.listarOrdemId(id);
        if (ordemId != null){
            return ResponseEntity.ok(ordemId);
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("ID não localizada");
        }
    }

    @PostMapping("/criar")
    public ResponseEntity<?> criarOrdem(@RequestBody OrdemVendaDTO ordemVendaDTO){
        OrdemVendaDTO ordemCriar = ordemVendaService.criarOrdem(ordemVendaDTO);
        return ResponseEntity.ok(ordemCriar);
    }

    @PatchMapping("/alterar")
    public ResponseEntity<?> alterarDadosOrdem(@PathVariable Long id, @RequestBody OrdemVendaDTO ordemVendaDTO){
        OrdemVendaDTO ordemAlterar = ordemVendaService.alterarDadosOrdem(id, ordemVendaDTO);
        if (ordemAlterar != null){
            return ResponseEntity.ok(ordemAlterar);
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("ID não localizada");
        }
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<?> deletarOrdem(@PathVariable Long id){
       OrdemVendaDTO ordemVendaDTO = ordemVendaService.listarOrdemId(id);
       if (ordemVendaDTO != null){
           ordemVendaService.deletarOdem(id);
           return ResponseEntity.ok(ordemVendaDTO);
       }else {
           return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Id não localizada");
       }
    }

}
