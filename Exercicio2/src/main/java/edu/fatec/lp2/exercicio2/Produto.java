package edu.fatec.lp2.exercicio2;

import lombok.*;

@Data
@ToString
public class Produto {
    private String nome;
    private String unidade;
    private String descricao;
    private double preco;
    private double descontoMaximo;
    private Supermercado supermercado;

    public Produto(Supermercado supermercado){
        this.supermercado = supermercado;
    }

    @Override
    public String toString(){
        return nome;
    }
}
