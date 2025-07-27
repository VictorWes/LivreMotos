package Rodrigues.dev.LivreMotos.Model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tb_ordem_vendas")
public class OrdemVendaModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private ClienteModel cliente;

    @ManyToOne
    @JoinColumn(name = "moto_id")
    private MotoModel motoVendida;

    @ManyToOne
    @JoinColumn(name = "vendedor_id")
    private VendedorModel vendedor;

    private LocalDate dataVenda;
    private Double valorTotal;



}
