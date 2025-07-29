package Rodrigues.dev.LivreMotos.DTO;

import Rodrigues.dev.LivreMotos.Model.ClienteModel;
import jakarta.persistence.*;

public class MotoDTO {


    private Long Id;

    private String nome;

    private int ano;

    private String modelo;

    private String fichaTecnica;

    private String cor;

    private Double valor;

    private String imgUrl;

    private ClienteModel cliente;


    public MotoDTO() {
    }

    public MotoDTO(String nome, int ano, String modelo, String fichaTecnica, String cor, Double valor, String imgUrl, ClienteModel cliente) {
        this.nome = nome;
        this.ano = ano;
        this.modelo = modelo;
        this.fichaTecnica = fichaTecnica;
        this.cor = cor;
        this.valor = valor;
        this.imgUrl = imgUrl;
        this.cliente = cliente;
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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFichaTecnica() {
        return fichaTecnica;
    }

    public void setFichaTecnica(String fichaTecnica) {
        this.fichaTecnica = fichaTecnica;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public ClienteModel getCliente() {
        return cliente;
    }

    public void setCliente(ClienteModel cliente) {
        this.cliente = cliente;
    }
}
