package com.exercicioMercado.model;

public class Produto {
    private String codBarra;
    private String nome;
    private String fornecedor;
    private double valorUnitario;
    private String tipo;
    private int quantidade;
    
    public Produto(String codBarra, String nome, String fornecedor, double valorUnitario, String tipo, int quantidade) {
        this.codBarra = codBarra;
        this.nome = nome;
        this.fornecedor = fornecedor;
        this.valorUnitario = valorUnitario;
        this.tipo = tipo;
        this.quantidade = quantidade;
    }

    public String getCodBarra() {
        return codBarra;
    }

    public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" + "codBarra=" + codBarra + ", nome=" + nome + ", fornecedor=" + fornecedor + ", valorUnitario=" + valorUnitario + ", tipo=" + tipo + ", quantidade=" + quantidade + '}';
    }
    
}
