package br.edu.infnet.pedido.model.entidade;

public class Fornecedor {

    private long id;
    private String nome;
    private long cnpjCpf;
    private String endereco;
    private long numeroEndereco;
    private String complementoEndereco;
    private String bairro;
    private long numeroCep;
    private String nomeCidade;

    public Fornecedor(String nome, long cnpjCpf, String endereco, long numeroEndereco, String complementoEndereco, String bairro, long numeroCep, String nomeCidade) {
        this.nome = nome;
        this.cnpjCpf = cnpjCpf;
        this.endereco = endereco;
        this.numeroEndereco = numeroEndereco;
        this.complementoEndereco = complementoEndereco;
        this.bairro = bairro;
        this.numeroCep = numeroCep;
        this.nomeCidade = nomeCidade;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public long getCnpjCpf() {
        return cnpjCpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public long getNumeroEndereco() {
        return numeroEndereco;
    }

    public String getComplementoEndereco() {
        return complementoEndereco;
    }

    public String getBairro() {
        return bairro;
    }

    public long getNumeroCep() {
        return numeroCep;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

}
