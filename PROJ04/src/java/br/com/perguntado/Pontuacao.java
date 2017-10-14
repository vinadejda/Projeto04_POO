/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.perguntado;

import java.util.ArrayList;

/**
 *
 * @author Laércio
 */
public class Pontuacao {
    
    
        
    private String nomeJogador;
    private int pontuacaoJogador;
    private Double mediaJogador;
    private int qtPerguntas;
    private String nomeQuizJogado;
    
    /*Criar arrayList de Pontuação dos jogadores que finalizarem determinado quiz*/
    /*O ranking são vários rankings das pontuações dos usuarios*/
    /*O ranking é instanciado e nos passamos os atributos do jogador e de sua pontuação para ele*/
    
    
    public Pontuacao(String nomeJogador, int pontuacaoJogador, Double mediaJogador, int qtPerguntas, String nomeQuizJogado) {
        this.nomeJogador = nomeJogador;
        this.pontuacaoJogador = pontuacaoJogador;
        this.mediaJogador = mediaJogador;
        this.qtPerguntas = qtPerguntas;
        this.nomeQuizJogado = nomeQuizJogado;
    }

    
    
    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public int getPontuacaoJogador() {
        return pontuacaoJogador;
    }

    public void setPontuacaoJogador(int pontuacaoJogador) {
        this.pontuacaoJogador = pontuacaoJogador;
    }

    public Double getMediaJogador() {
        return mediaJogador;
    }

    public void setMediaJogador(Double mediaJogador) {
        this.mediaJogador = mediaJogador;
    }

    public String getNomeQuizJogado() {
        return nomeQuizJogado;
    }

    public void setNomeQuizJogado(String nomeQuizJogado) {
        this.nomeQuizJogado = nomeQuizJogado;
    }

    public int getQtPerguntas() {
        return qtPerguntas;
    }

    public void setQtPerguntas(int qtPerguntas) {
        this.qtPerguntas = qtPerguntas;
    }
    
    


/*Fazendo arrayList de Pontuacoes dos Jogadores*/
    
    public static ArrayList<Pontuacao> listPontuacao;
    public static ArrayList<Pontuacao> getListPontuacao(){
        if(listPontuacao==null){
            listPontuacao = new ArrayList<>();
            
            Pontuacao p1 = new Pontuacao("Rodrigo",10,100.00,20,"Quiz do Rodrigo");
            listPontuacao.add(p1);
            

        }
        return listPontuacao;
    }
    
    
}
