package Rodrigues.dev.LivreMotos.Controller;

import Rodrigues.dev.LivreMotos.DTO.VendedorDTO;
import Rodrigues.dev.LivreMotos.Service.VendedorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("vendedor")
@RestController
public class VendedorController {

    private final VendedorService vendedorService;

    public VendedorController(VendedorService vendedorService) {
        this.vendedorService = vendedorService;
    }

    @PatchMapping("/alterar/{id}")
    public ResponseEntity<?> alterarDadosVendedor(@PathVariable Long id, @RequestBody VendedorDTO vendedorDTO){
        VendedorDTO alterarVendedor = vendedorService.alterarDadosVendedor(id, vendedorDTO);
        if (alterarVendedor != null){
            return ResponseEntity.ok(alterarVendedor);
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("ID não localizada");
        }
    }

    @PostMapping("/criar")
    public ResponseEntity<?> criarVendedor(@RequestBody VendedorDTO vendedorDTO){
        VendedorDTO novoVendedor = vendedorService.criarVendedor(vendedorDTO);
        return ResponseEntity.ok(novoVendedor);
    }

    @GetMapping("/listar")
    public ResponseEntity<List<VendedorDTO>> listarVendedores(){
        List<VendedorDTO> vendedores = vendedorService.listarVendedor();
        return ResponseEntity.ok(vendedores);
    }

    @GetMapping("/listar/{id}")
    public ResponseEntity<?> listarVendedorId(@PathVariable Long id){
        VendedorDTO vendedorId = vendedorService.listarVendedorId(id);
        if (id != null){
            return ResponseEntity.ok(vendedorId);
        }else {
        return  ResponseEntity.status(HttpStatus.NOT_FOUND).body("Id não localizado");
        }
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<?> deletarVendedor(@PathVariable Long id){
        VendedorDTO vendedorId = vendedorService.listarVendedorId(id);
        if (vendedorId != null){
            vendedorService.deletarVendedor(id);
            return ResponseEntity.ok(vendedorId);
        }else {
           return ResponseEntity.status(HttpStatus.NOT_FOUND).body("ID não localziada");
        }
    }
}
