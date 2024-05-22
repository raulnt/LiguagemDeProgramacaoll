package edu.fatec.lp2.exercicio1.mensagens;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MsgTexto extends Mensagem {
    private int numChar;

    @Override
    public MsgTexto sendMensagem(String conteudo) {
        return new MsgTexto();
    }

    @Override
    public String toString() {
        return "MsgTexto"
    }
}
