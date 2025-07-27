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
    private String email;


    @OneToMany(mappedBy = "vendedor", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<OrdemVendaModel> ordensVenda = new ArrayList<>();

}
