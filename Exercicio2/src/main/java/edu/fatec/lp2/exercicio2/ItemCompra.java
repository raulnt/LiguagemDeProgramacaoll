package edu.fatec.lp2.exercicio2;

import lombok.Getter;
import lombok.Setter;

@Data
public class ItemCompra implements Calculavel{
    private int quantidade;
    private Produto produto;
    private double desconto;
    public ItemCompra(Produto produto, double desconto){
        this.produto = produto;
        setDesconto(desconto)
    }

    @Override
    public Double calcularPreco(){
        if(desconto > produto.getDescontoMaximo()){
            desconto = produto.getDescontoMaximo();
        }
        return (produto.getPreco()-(produto.getPreco()*desconto)) * quantidade;
    }
}
