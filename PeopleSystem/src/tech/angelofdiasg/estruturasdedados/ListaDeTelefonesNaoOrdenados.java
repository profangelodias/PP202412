package tech.angelofdiasg.estruturasdedados;

import tech.angelofdiasg.composicoes.Telefone;

public class ListaDeTelefonesNaoOrdenados {
    //Vetor de telefones
    private Telefone[] telefones;
    //controle do tamanho = quantidade de  elementos
    private int tamanho;
    //Capacidade "inicial" (pode ser alterado depois)
    private static final int CAPACIDADE_PADRAO = 7;

    //Contrutor da LISTA
    public ListaDeTelefonesNaoOrdenados() {
        this.telefones = new Telefone[CAPACIDADE_PADRAO];
        this.tamanho = 0;
    }
    public ListaDeTelefonesNaoOrdenados(Telefone[] lisTels) {
        this.telefones = lisTels;
        this.tamanho = lisTels.length;
    }

    public boolean isEmpty() {
        return this.tamanho == 0;
    }
    //Adicionar telefone com restrição de capacidade



}
