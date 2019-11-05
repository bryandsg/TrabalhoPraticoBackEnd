package com.cotemig.EliFut.model;

public class Jogos {
    private Time visitante;
    private Time local;
    private int golsLocal;
    private int golsVisitante;
    private int vencedor;
    private String andamento;

    public Time getVisitante() {
        return visitante;
    }

    public void setVisitante(Time visitante) {
        this.visitante = visitante;
    }

    public Time getLocal() {
        return local;
    }

    public void setLocal(Time local) {
        this.local = local;
    }

    public int getGolsLocal() {
        return golsLocal;
    }

    public void setGolsLocal(int golsLocal) {
        this.golsLocal = golsLocal;
    }

    public int getGolsVisitante() {
        return golsVisitante;
    }

    public void setGolsVisitante(int golsVisitante) {
        this.golsVisitante = golsVisitante;
    }

    public int getVencedor() {
        return vencedor;
    }

    public void setVencedor(int vencedor) {
        this.vencedor = vencedor;
    }

    public String getAndamento() {
        return andamento;
    }

    public void setAndamento(String andamento) {
        this.andamento = andamento;
    }

    public Jogo(Time visitante, Time local, int golsLocal, int golsVisitante, int vencedor){
        this.visitante = visitante;
        this.local = local;
        this.golsLocal = golsLocal;
        this.golsVisitante = golsVisitante;
        this.vencedor = vencedor;
    }
    public void resultado(){
        int resulVisitante, resulLocal;
        String jogadas = "";

        for (int jogada = 1; jogada < 20; jogada++){

        }
    }


}
