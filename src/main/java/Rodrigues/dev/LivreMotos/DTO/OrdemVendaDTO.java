package Rodrigues.dev.LivreMotos.DTO;

import Rodrigues.dev.LivreMotos.Enums.MeioDePagamento;
import Rodrigues.dev.LivreMotos.Enums.StatusOrdemVenda;
import Rodrigues.dev.LivreMotos.Model.ClienteModel;
import Rodrigues.dev.LivreMotos.Model.MotoModel;
import Rodrigues.dev.LivreMotos.Model.VendedorModel;

import java.time.LocalDate;

public class OrdemVendaDTO {

    private Long id;

    private ClienteModel cliente;

    private MotoModel motoVendida;

    private VendedorModel vendedor;

    private LocalDate dataVenda;
    private Double valorTotal;

    private StatusOrdemVenda status;

    private MeioDePagamento formaDePagamento;

    public OrdemVendaDTO() {
    }

    public OrdemVendaDTO(ClienteModel cliente, MotoModel motoVendida, VendedorModel vendedor, LocalDate dataVenda, Double valorTotal, StatusOrdemVenda status, MeioDePagamento formaDePagamento) {
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
