package Rodrigues.dev.LivreMotos.DTO;

import Rodrigues.dev.LivreMotos.Model.MotoModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

public class ClienteDTO {

    private Long id;

    private String nome;

    private String cpf;

    private int idade;

    private String email;


    private List<MotoModel> motos;

    public ClienteDTO() {
    }

    public ClienteDTO(String nome, String cpf, int idade, String email, List<MotoModel> motos) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.email = email;
        this.motos = motos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<MotoModel> getMotos() {
        return motos;
    }

    public void setMotos(List<MotoModel> motos) {
        this.motos = motos;
    }
}
