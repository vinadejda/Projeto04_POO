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
import javax.swing.JOptionPane;

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
            Pontuacao p2 = new Pontuacao("Luiz", 9, 100.00, 20, "Quiz do Rodrigo");
            Pontuacao p3 = new Pontuacao("Rodrigo", 8, 100.00, 20, "Quiz do Rodrigo");
            Pontuacao p4 = new Pontuacao("Luiz", 7, 100.00, 20, "Quiz do Rodrigo");
            Pontuacao p5 = new Pontuacao("Vitoria", 6, 100.00, 20, "Quiz do Rodrigo");
            Pontuacao p6 = new Pontuacao("Luciana", 11, 100.00, 20, "Quiz do Rodrigo");
            Pontuacao p7 = new Pontuacao("Luciana", 13, 100.00, 20, "Quiz do Rodrigo");
            Pontuacao p8 = new Pontuacao("Luciana", 10, 100.00, 20, "Quiz do Rodrigo");
            Pontuacao p9 = new Pontuacao("Luciana", 5, 100.00, 20, "Quiz do Rodrigo");
            Pontuacao p10 = new Pontuacao("Luciana", 4, 100.00, 20, "Quiz do Rodrigo");
            Pontuacao p11 = new Pontuacao("Luciana", 2, 100.00, 20, "Quiz do Rodrigo");
            Pontuacao p12 = new Pontuacao("Luciana", 1, 100.00, 20, "Quiz do Rodrigo");
            listPontuacao.add(p1);
            listPontuacao.add(p2);
            listPontuacao.add(p3);
            listPontuacao.add(p4);
            listPontuacao.add(p5);
            listPontuacao.add(p6);
            listPontuacao.add(p7);
            listPontuacao.add(p8);
            listPontuacao.add(p9);
            listPontuacao.add(p10);
            listPontuacao.add(p11);
            listPontuacao.add(p12);

        }
        return listPontuacao;
    }

    public static ArrayList<Pontuacao> listaRanking; // ArrayList exclusivo para o Ranking
    /**
     * Recebe os objetos do listPontuacao, ordena eles de forma decrescente,
     * depois verifica se o tamanho da listaRanking é maior que 10, sempre
     * removendo os valures subsequentes.
     * @return ArrayList listaRanking de objetos do tipo Pontuacao
     */
    public static ArrayList<Pontuacao> getListaRanking() {
        
        listaRanking = new ArrayList<>();   //Instancia o listaRanking
        listaRanking = getListPontuacao(); /*Copia as referências dos objetos
        da atual lista de Pontuação "listPontuacao" para o listaRanking
        */
        Pontuacao temp; //objeto do tipo Pontuacao auxiliar, para ordenar
        
        /*Bubble Sort do java
        for(i = 0; i<5; i++){
		for(int j = 0; j<4; j++){
			if(vet[j] > vet[j + 1]){
				aux = vet[j];
				vet[j] = vet[j+1];
				vet[j+1] = aux;
			}
		}
	}
         */
        
        for (Pontuacao listaRanking1 : listaRanking) { //inicio foreach
            for (int y = 0; y < listaRanking.size()-1; y++) { 
                if (listaRanking.get(y).getPontuacaoJogador() < listaRanking.get(y + 1).getPontuacaoJogador()) {
                    temp = listaRanking.get(y);
                    listaRanking.set(y, listaRanking.get(y + 1));
                    listaRanking.set(y + 1, temp);
                }
                
            }
        }
        
        /*Enquanto a lista de ranking tiver mais que 10 elementos, vai remover
        os últimos elementos do ArrayList
        */
        while (listaRanking.size()>10) {
            listaRanking.remove(listaRanking.size()-1);
        } 
        
         //JOptionPane.showMessageDialog(null, listaRanking.get(0).getPontuacaoJogador());
         
         return listaRanking;
        
    }
    
    /*public static void main(String[] args) {
        getListaRanking();
    }*/

    

}
