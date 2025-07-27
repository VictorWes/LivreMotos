package Rodrigues.dev.LivreMotos.Model;

import jakarta.persistence.*;

@Entity
@Table(name="tb_motos")
public class MotoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String nome;
    private int ano;
    private String modelo;
    private String fichaTecnica;
    private String cor;
    private Double valor;

    public MotoModel(Long id, String nome, int ano, String modelo, String fichaTecnica, String cor, Double valor) {
        Id = id;
        this.nome = nome;
        this.ano = ano;
        this.modelo = modelo;
        this.fichaTecnica = fichaTecnica;
        this.cor = cor;
        this.valor = valor;
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
}
