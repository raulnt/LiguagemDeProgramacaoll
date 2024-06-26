package edu.fatec.lp2.exercicio1.mensagens;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MsgFoto extends Mensagem {
    private int tamanho;
    @Override
    public MsgFoto sendMensagem(String conteudo) {
        return new MsgFoto();
    }

    @Override
    public String toString(){
        return "MsgFoto"
    }
}
