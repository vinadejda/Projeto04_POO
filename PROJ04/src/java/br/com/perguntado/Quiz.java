
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
    Questao q1 = new Questao("Quiz - Perguntados","1","<b>[FCC - Tribunal Regional Eleitoral-São Paulo 2016]</b> Considere que uma expressão lógica envolva candidato C), cargo político P ), votos V), e G. \n" +
"Para avaliar se uma dada expressão é verdadeira ou não, um técnico deve usar uma Tabela da Verdade, que contêm uma lista exaustiva de situações possíveis envolvendo as 4 variáveis. A Tabela da Verdade deve ter 4 colunas e \n" ,"a) 16 linhas<br>","b) 4 linhas<br>","c) 8 linhas<br>");
    Questao q2 = new Questao("Quiz - Perguntados","2","<b>[Universidade Federal de Santa Maria (UFSM) 2017]</b> Qual a alternativa que representa corretamente os diferentes elementos   que compôe a Arquitetura Von Neuman","a) Memória, unidade lógica e aritmética, unidade de controle, barramento, dispositivo de entrada e saída<br>","b) Monitor, teclado, mouse<br>","c) Memória, disco rígido, processador, unidades de entrada, unidades de saída");
    Questao q3 = new Questao("Quiz - Perguntados","3","<b>[Escola de Administração Fazendária (ESAF)</b> Departamento Nacional de Infraestrutura de Transportes (DNIT) 2012] São perspectivas importantes de modelagem em um projeto orientado a objetos:","a) Essencial de especificação de implementação<br>","b) Essencial de composição de prototipação<br>","c) compartimentação de endução de seguimentação<br>");
    
    /*adicionando perguntas ao arrayList de quiz*/       
    quiz.add(q1);
    quiz.add(q2);
    quiz.add(q3); 
    
    /*RETORNANDO ARRAYLIST DE QUIZ*/
    return quiz;
    }
        
}
