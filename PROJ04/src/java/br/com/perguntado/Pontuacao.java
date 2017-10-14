/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.perguntado;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

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
    private Date horaQuiz;
    DateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    /*Criar arrayList de Pontuação dos jogadores que finalizarem determinado quiz*/
 /*O ranking são vários rankings das pontuações dos usuarios*/
 /*O ranking é instanciado e nos passamos os atributos do jogador e de sua pontuação para ele*/
    public Pontuacao(String nomeJogador, int pontuacaoJogador, Double mediaJogador, int qtPerguntas, String nomeQuizJogado) {
        this.nomeJogador = nomeJogador;
        this.pontuacaoJogador = pontuacaoJogador;
        this.mediaJogador = mediaJogador;
        this.qtPerguntas = qtPerguntas;
        this.nomeQuizJogado = nomeQuizJogado;

        this.horaQuiz = new Date();
    }
    
    public Pontuacao (){
        
    }
    
    
    public Pontuacao (Pontuacao p) {
        this.nomeJogador = p.nomeJogador;
        this.pontuacaoJogador = p.pontuacaoJogador;
        this.mediaJogador = p.mediaJogador;
        this.qtPerguntas = p.qtPerguntas;
        this.nomeQuizJogado = p.nomeQuizJogado;

        this.horaQuiz = new Date();
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
    
    public Date getHoraQuiz(){
        return horaQuiz;
    }

    public String getHoraQuizFormatado() {
        return formatoData.format(horaQuiz);
    }

    /*Fazendo arrayList de Pontuacoes dos Jogadores*/
    
    public static ArrayList<Pontuacao> listPontuacao;

    public static ArrayList<Pontuacao> getListPontuacao() {
        if (listPontuacao == null) {
            listPontuacao = new ArrayList<>();

            Pontuacao p1 = new Pontuacao("Rodrigo", 3, 100.00, 20, "Quiz do Rodrigo");
            Pontuacao p2 = new Pontuacao("Rodrigo", 9, 100.00, 20, "Quiz do Rodrigo");
            Pontuacao p3 = new Pontuacao("Rodrigo", 8, 100.00, 20, "Quiz do Rodrigo");
            Pontuacao p4 = new Pontuacao("Rodrigo", 7, 100.00, 20, "Quiz do Rodrigo");
            Pontuacao p5 = new Pontuacao("Rodrigo", 6, 100.00, 20, "Quiz do Rodrigo");
            Pontuacao p6 = new Pontuacao("Rodrigo", 5, 100.00, 20, "Quiz do Rodrigo");
            listPontuacao.add(p1);
            listPontuacao.add(p2);
            listPontuacao.add(p3);
            listPontuacao.add(p4);
            listPontuacao.add(p5);
            listPontuacao.add(p6);

        }
        return listPontuacao;
    }
    
    public static ArrayList<Pontuacao> listaRanking;
    
    public static ArrayList<Pontuacao> getListaRanking() {
        if (listaRanking == null) {
            listaRanking = new ArrayList<>();
            
            gerarRanking();
        }
        
        return listaRanking;
    }

    public static void gerarRanking() {
        for(int i = 0; i<listPontuacao.size();i++)
        {
            listaRanking.add(listPontuacao.get(i));
        }
        

        for (int i = 0; listaRanking.size() >= i; i++) {
            for (int j = 0; j < listaRanking.size() - 1; j++) {
                if (listaRanking.get(j).getPontuacaoJogador() > listaRanking.get(j + 1).getPontuacaoJogador()) {
                    Pontuacao aux;
                    aux = new Pontuacao(listaRanking.get(j));
                    
                    
                    listaRanking.set(j, listaRanking.get(i + 1));
                    listaRanking.set(j + 1, aux);
                }
            }
        }

        /*public void ultimosJogados(){
        
    }*/
    }

}
