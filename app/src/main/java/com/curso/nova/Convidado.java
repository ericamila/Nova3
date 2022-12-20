package com.curso.nova;

import android.support.annotation.NonNull;

public class Convidado {
    private final String nomeConvidado;
    private final String telConvidado;
    private final String emailConvidado;
    private final Integer acompanhantesConvidado;
    private static int qtdConvidados = 0;

    public Convidado(String nomeConvidado, String telConvidado, String emailConvidado,
                     Integer acompanhantesConvidado) {
        this.nomeConvidado = nomeConvidado;
        this.telConvidado = telConvidado;
        this.emailConvidado = emailConvidado;
        this.acompanhantesConvidado = acompanhantesConvidado;

        this.qtdConvidados += 1 + this.acompanhantesConvidado;
    }

    @NonNull
    @Override
    public String toString() {
        return nomeConvidado;
    }

    public static int getQtdConvidados() {
        return qtdConvidados;
    }

    public Integer convertInt(String x){
        return Integer.parseInt(x);
    }
}
