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
public class Ranking{

    
    /*agora sempre que um "Ranking" novo for cadastrado nós armazenamos o objeto em um arrayList*/
    public ArrayList<Pontuacao> rankingGeral;
    public ArrayList<Pontuacao> getRanking(){
    
    /*Instanciando arrayList de rankingGeral*/
    rankingGeral = new ArrayList<>();
    /*Instancia de uma noova pontuacao para cada finalizar em um quiz*/
    /*Como fazer para pegar os valores dos atributos de Pontuacao*/
    /*Pontuacao p1 = new Pontuacao(Pontuacao.getNomeJogador(),Pontuacao.getPontuacaoJogador(),Pontuacao.getMediaJogador(),Pontuacao.getNomeQuizJogado());
  
    /*adicionando pontuacao do jogador no arrayList de rankingGeral*/       
    /*rankingGeral.add(p1);*/
    /*RETORNANDO ARRAYLIST DE QUIZ*/
        
    return rankingGeral;
    }
    
}
