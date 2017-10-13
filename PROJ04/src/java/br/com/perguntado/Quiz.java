
package br.com.perguntado;

import java.util.ArrayList;

public class Quiz {
/**
 * Instanciando um objeto do tipo Quiz e alimentando o de perguntas
     * @param args
 */
    /*Quantidade de Vezes que realizou o quiz*/
    public static int quantidade=0;
    /*Acertos*/
    public static int acertos=0;
    
    
    public static ArrayList<Questao> quiz;
    public static ArrayList<Questao> montarQuiz(){
    /*Instanciando arrayList de questões*/
    quiz = new ArrayList<>();
    /*Lista de questões do quiz*/
    Questao q1 = new Questao("1","Qual o meu nome?","Rodrigo","Rafael","Isabela");
    Questao q2 = new Questao("2","Qual o meu tipo de música favorita?","Jazz","Rock","Samba");
    Questao q3 = new Questao("3","Eu toco violão?","Sim","Não","Mais ou menos");
    
    /*adicionando perguntas ao arrayList de quiz*/       
    quiz.add(q1);
    quiz.add(q2);
    quiz.add(q3); 
    
    /*RETORNANDO ARRAYLIST DE QUIZ*/
    return quiz;
    }
        
}
