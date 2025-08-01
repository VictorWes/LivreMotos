package Rodrigues.dev.LivreMotos.Controller;


import Rodrigues.dev.LivreMotos.DTO.MotoDTO;
import Rodrigues.dev.LivreMotos.Model.MotoModel;
import Rodrigues.dev.LivreMotos.Service.MotoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("moto")
@RestController
public class MotoController {

    private final MotoService motoService;

    public MotoController(MotoService motoService) {
        this.motoService = motoService;
    }

    @GetMapping("/listar")
    public ResponseEntity<List<MotoDTO>> buscarTodasMotos(){
        List<MotoDTO> motos = motoService.buscarTodasMotos();
        return ResponseEntity.ok(motos);
    }

    @PostMapping("/criar")
    public ResponseEntity<?> criarMoto(@RequestBody MotoDTO motoDTO){
        MotoDTO motoCriar = motoService.criarMoto(motoDTO);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Moto criada");
    }

    @PatchMapping("/alterar/{id}")
    public ResponseEntity<?> alterarDadosMoto(@PathVariable Long id, @RequestBody MotoDTO motoDTO){
        MotoDTO motoAlterar = motoService.atualizarDadosParcial(id, motoDTO);
        if (motoAlterar != null){
            return ResponseEntity.ok(motoAlterar);
        }else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/listar/{id}")
    public ResponseEntity<?> buscarMotoId(Long id){
        MotoDTO motoId = motoService.buscarMotoId(id);
        if (motoId != null){
            return ResponseEntity.ok(motoId);
        }else {
           return ResponseEntity.status(HttpStatus.NOT_FOUND).body("ID não localizada");
        }
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<?> deletarMotoId(@PathVariable Long id){
        MotoDTO motoId = motoService.buscarMotoId(id);
        if (motoId != null){
            motoService.deletarMoto(id);
            return ResponseEntity.ok(motoId);
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("ID não localizada");
        }

    }

}
