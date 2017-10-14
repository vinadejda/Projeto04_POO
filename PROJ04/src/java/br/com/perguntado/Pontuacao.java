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

    public Date getHoraQuiz() {
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
    
    
    
    public static ArrayList<Pontuacao> gerarRanking(ArrayList<Pontuacao> list){
        
        Pontuacao temp;
        
        if (list.size()>1){
            for (int x=0; x < list.size(); x++){
                for (int i=0; i < list.size()-1;i++){
                    if (list.get(i).compareTo(list.get(i+1)) > 0) {
                        temp = list.get(i);
                        list.set(i,list.get(i+1));
                        list.set(i+1,temp);
                    }
                }
            }
        }
        /*public static void bubblesrt(ArrayList<Drinks> list)
  {
        Drink temp;
        if (list.size()>1) // check if the number of orders is larger than 1
        {
            for (int x=0; x<list.size(); x++) // bubble sort outer loop
            {
                for (int i=0; i < list.size()-i; i++) {
                    if (list.get(i).compareTo(list.get(i+1)) > 0)
                    {
                        temp = list.get(i);
                        list.set(i,list.get(i+1) );
                        list.set(i+1, temp);
                    }
                }
            }
        }

  }*/
        
        return list;
    }

    
}
