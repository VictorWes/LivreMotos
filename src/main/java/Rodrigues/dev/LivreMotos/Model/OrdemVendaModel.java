package Rodrigues.dev.LivreMotos.Model;

import Rodrigues.dev.LivreMotos.Enums.MeioDePagamento;
import Rodrigues.dev.LivreMotos.Enums.StatusOrdemVenda;
import com.fasterxml.jackson.annotation.JsonFormat;
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


    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate dataVenda;
    private Double valorTotal;

    @Enumerated(EnumType.STRING)
    private StatusOrdemVenda status;

    @Enumerated(EnumType.STRING)
    private MeioDePagamento formaDePagamento;

    public OrdemVendaModel() {
    }

    public OrdemVendaModel(ClienteModel cliente, MotoModel motoVendida, VendedorModel vendedor, LocalDate dataVenda, Double valorTotal, StatusOrdemVenda status, MeioDePagamento formaDePagamento) {
        this.cliente = cliente;
        this.motoVendida = motoVendida;
        this.vendedor = vendedor;
        this.dataVenda = dataVenda;
        this.valorTotal = valorTotal;
        this.status = status;
        this.formaDePagamento = formaDePagamento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ClienteModel getCliente() {
        return cliente;
    }

    public void setCliente(ClienteModel cliente) {
        this.cliente = cliente;
    }

    public MotoModel getMotoVendida() {
        return motoVendida;
    }

    public void setMotoVendida(MotoModel motoVendida) {
        this.motoVendida = motoVendida;
    }

    public VendedorModel getVendedor() {
        return vendedor;
    }

    public void setVendedor(VendedorModel vendedor) {
        this.vendedor = vendedor;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public StatusOrdemVenda getStatus() {
        return status;
    }

    public void setStatus(StatusOrdemVenda status) {
        this.status = status;
    }

    public MeioDePagamento getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(MeioDePagamento formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }
}
