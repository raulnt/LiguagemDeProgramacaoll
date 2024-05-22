package edu.fatec.lp2.exercicio1;

import lombok.Data;

@Data
public abstract class Mensagem {
    private Contatinho destinatario;
    private String horaEnvio;
    private String conteudo;

    public abstract Mensagem sendMessage(String conteudo);

    @Override
    public abstract String toString();
}
