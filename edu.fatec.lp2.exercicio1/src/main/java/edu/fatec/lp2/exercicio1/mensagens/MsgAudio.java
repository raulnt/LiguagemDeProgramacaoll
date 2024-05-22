package edu.fatec.lp2.exercicio1.mensagens;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MsgAudio extends Mensagem {
    private int duracao;
    @Override
    public MsgAudio sendMensagem(String conteudo){
        return new MsgAudio();
    }

    @Override
    public String toString(){
        return "MsgAudio"
    }
}
