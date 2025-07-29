package Rodrigues.dev.LivreMotos.DTO;

import Rodrigues.dev.LivreMotos.Model.OrdemVendaModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

public class VendedorDTO {

    Long Id;
    private String nome;

    private String email;

    private List<OrdemVendaModel> ordensVenda = new ArrayList<>();

    public VendedorDTO() {
    }

    public VendedorDTO(String nome, String email, List<OrdemVendaModel> ordensVenda) {
        this.nome = nome;
        this.email = email;
        this.ordensVenda = ordensVenda;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<OrdemVendaModel> getOrdensVenda() {
        return ordensVenda;
    }

    public void setOrdensVenda(List<OrdemVendaModel> ordensVenda) {
        this.ordensVenda = ordensVenda;
    }
}
