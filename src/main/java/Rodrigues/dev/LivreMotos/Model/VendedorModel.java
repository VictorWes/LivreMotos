package Rodrigues.dev.LivreMotos.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_vendedor")
public class VendedorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;
    private String nome;

    @Column(unique = true)
    private String email;


    @OneToMany(mappedBy = "vendedor", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<OrdemVendaModel> ordensVenda = new ArrayList<>();

    public VendedorModel() {
    }

    public VendedorModel(String nome, String email, List<OrdemVendaModel> ordensVenda) {
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
