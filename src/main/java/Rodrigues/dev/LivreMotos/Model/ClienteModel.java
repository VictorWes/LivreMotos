package Rodrigues.dev.LivreMotos.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="tb_cliente")
public class ClienteModel {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int cpf;
    private int idade;
    private String email;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<MotoModel> motos;


    public ClienteModel(Long id, String nome, int cpf, int idade, String email, List<MotoModel> motos) {
        this.id = id;
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

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
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
