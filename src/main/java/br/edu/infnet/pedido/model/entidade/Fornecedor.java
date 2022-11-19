package br.edu.infnet.pedido.model.entidade;

public class Fornecedor {

    private long id;
    private String nome;
    private String cnpjCpf;
    private String endereco;
    private long numeroEndereco;
    private String complementoEndereco;
    private String bairro;
    private long numeroCep;
    private String nomeCidade;

    public Fornecedor() {

    }

    public Fornecedor(String nome, String cnpjCpf, String endereco, long numeroEndereco, String complementoEndereco, String bairro, long numeroCep, String nomeCidade) {
        this.nome = nome;
        this.cnpjCpf = cnpjCpf;
        this.endereco = endereco;
        this.numeroEndereco = numeroEndereco;
        this.complementoEndereco = complementoEndereco;
        this.bairro = bairro;
        this.numeroCep = numeroCep;
        this.nomeCidade = nomeCidade;
    }

    public Fornecedor(long id, String nome, String cnpjCpf, String endereco, long numeroEndereco, String complementoEndereco, String bairro, long numeroCep, String nomeCidade) {
        this.id = id;
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

    public String getCnpjCpf() {
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
