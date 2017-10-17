
package br.com.perguntado;

import java.util.ArrayList;
import java.util.Collections;

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
    Questao q1 = new Questao("Quiz - Perguntados","0","[FCC - 2016]", " Considere que uma expressão lógica envolva candidato C), cargo político P ), votos V), e G. Para avaliar se uma dada expressão é verdadeira ou não, um técnico deve usar uma Tabela da Verdade, que contêm uma lista exaustiva de situações possíveis envolvendo as 4 variáveis. A Tabela da Verdade deve ter 4 colunas e :" ,"16 linhas"," 4 linhas","8 linhas");
    
    Questao q2 = new Questao("Quiz - Perguntados","1","[UUFSM - 2017]", " Qual a alternativa que representa corretamente os diferentes elementos   que compôe a Arquitetura Von Neuman","Memória, unidade lógica e aritmética, unidade de controle, barramento, dispositivo de entrada e saída","Monitor, teclado, mouse","Memória, disco rígido, processador, unidades de entrada, unidades de saída");
    
    Questao q3 = new Questao("Quiz - Perguntados","2","[ESAF -  2012]", " São perspectivas importantes de modelagem em um projeto orientado a objetos:","Essencial de especificação de implementação","Essencial de composição de prototipação","compartimentação de endução de seguimentação");
    
    Questao q4 = new Questao("Quiz - Perguntados", "3", "[FCC - 2015]", " Usa-se um Framework de testes iniciais automatizados, para escrever os testes para uma nova funcionalidade antes que ela seja implementada, pois  acredita-se que escrever o teste de unidade antes do código que é escrito em pares, ajuda a escrever códigos com maior qualidade: ", "Streme Programing", "Scrum", "Feature drive Developer ");
    
    Questao q5 = new Questao("Quiz - Perguntados", "4", "[ESAF - 2012]", " Diagrama de Fluxo de Dados (DNF). Qual a opção correta relativa a DNF? ","Possibilita ao engenheiro de software, desenvolver modelos do domíneo da informação e do domíneo funcional", "Possibilita ao programador, desenvolver algoritmos de especificação de domíneo de informação e do domíneo convencional", "Possibilita ao engenheiro de hardware, desenvolver algoritmos operacionais dentro do domíneo de especificação da informação e das funções");
    
    Questao q6 = new Questao("Quiz - Perguntados", "5", "[FGV - 2016]", " O meta dados é um dos principais instrumentos do administrador de dados, porque descreve diversos atributos  necessários para  identificar , localizar, compreender e gerenciar dados. A esse respeito é correto afirmar que: ","Meta dados armazenam, estruturam e correlaciona preferencialmente em um repositório de meta dados, dotado de um meta modelo, para apoiar o controle, a divulgação e o consumo ", "Meta dados estruturais definem o sentido que se atribui a um elemento informacional para o seu entendimento, os contextos organizacionais, em que é produzido ou consumido  por exemplo: um meta dados estrutural, define que o campo data_efetivação_apólice será a data em que o corretor fez o registro oficial no sistema com a entrega a apólice ", "Meta dados semântico, definem como o dado é composto em partes menores, e detalha a sua  formação semântica por exemplo: o campo data_efetivação_apólice é formado por: dia, mês, ano, e uma marca de tempo (timestamp) como a hora, minuto e  segundo  ");
    
    Questao q7 = new Questao("Quiz - Perguntados", "6", "[FGV 2016]", " Considere uma Tabela Relacional R com atributos: A, B, C e D As dependências, A-> B, C, D e A, B, C, D -> B, C, D se verificam para R e a Chave primária de R foi definida sobre o atributo A isoladamente. Essa tabela não viola a FNBC por que ","A B C D -> B C D é uma dependência trivial", "A dependência A, B, C, D ->  A, B, C pode ser decomposta nas dependências A -> B, A ->  C e A -> D", "FNBC refere-se apenas as dependências multivaloradas");
    
    Questao q8 = new Questao("Quiz - Perguntados", "7", "[FCC - 2015]", " Em uma organização está sendo realizada uma avaliação do processo de gestão, no que se refere aos seus diversos aspectos, tais como: governança corporativa, gestão de riscos e procedimentos de aderência e normas regulatórias. Apontando eventuais desvios e vulnerabilidades, as quais a organização está sujeita. Essa avaliação é típica da auditoria de:", "Auditoria Interna", "Auditoria de Condição","Auditoria de Efeito");
    
    Questao q9 = new Questao("Quiz - Perguntados", "8", "[CESPE - SERPRO  - 2013]", " Acerca de conceitos relacionados à arquitetura e as tecnologias de sistemas de informação, Julgue: Defini-se arquitetura de um sistema, como um modelo relativamente pequeno e intelectualmente compreensível de estruturação do sistema e de trabalho em conjunto dos componentes do sistema.","Certo", "Errado", "Em partes");
    
    Questao q10 = new Questao("Quiz - Perguntados", "9", "[Consulplan- 2012]", " Um microcomputador pode ser visualizado como constituído de duas camadas Hardware e software, existindo um componente do sistema operacional que realiza a interação entre estas camadas,  representa o núcleo do SUE, gerencia os recursos do sistema, permitindo que os programas façam uso deles. Esse componente é conhecido pelo termo técnico:","Kernel", "Burst", "Bridge");
    
    Questao q11 = new Questao("Quiz - Perguntados", "10", "[VULNESPE - 2015]", " Considerando bancos de dados relacionais no modelo relacional, há os conceitos de Chave Candidata  Primária e Estrangeira, Sobre os quais, é correto afirmar que:","Relação pode ter mais de uma chave candidata", "Chave Estrangeira deve ser criptografada", "Chave Primária deve ser do tipo autoincremento");
    
    Questao q12 = new Questao("Quiz - Perguntados", "11", "[VUNESP - 2015]", " No contexto de passagem de parâmetros para uma subrotina,  existe à denominada passagem de parâmetro por valor. Nesse caso:","Uma cópia do parâmetro é fornecido para a subrotina", "Um ponteiro para o endereço onde se encontra o valor a ser passado como parâmetro é fornecido para a subrotin", "O endereço onde se encontra o valor a ser passado como parâmetro é fornecido para a subrotina");
     
    Questao q13 = new Questao("Quiz - Perguntados", "12", "[CESPE - 2013]", " Julgue os itens que se seguem relativos aos procedimentos de segurança da  informação e a utilização do Firewall: O Firewall,é um software que realiza análises do fluxo de pacotes de dados, filtragem e registros dentro de uma estrutura de rede e executa comando de filtragem previamente especificado com base nas necessidades de compartilhamento, acesso e proteção, Requeridas pela rede e pelas informações nela disponíveis. Uma das formas de um servidor público proteger as informações confidenciais de uma organização, é impedir que pessoas não autorizadas acessem seu ambiente de trabalho e utilizem seu computador:","As duas afirmações estão corretas", "A primeira afirmação está errada e a segunda certa", "A primeira afirmação está certa e a segunda afirmação errada.");
    
    Questao q14 = new Questao("Quiz - Perguntados", "13", "[UFPR - COPEL - 2015]", " Dois dos principais componentes dos sistemas de gerência de redes, baseados no protocolo  SNMP (Simple Network Managemennt Protocol) da internet são os agentes e os gerentes. O SNMP, é um protocolo de aplicação sobre um protocolo de transporte. Sobre esses componentes. É correto afirmar se as siglas TCP (Transmission Control Protocol)  - UDP (User Datagram Protocol):","O agente é um servidor UDP e o gerente um cliente UDP", "O agente é um cliente UDP e o gerente um servidor UDP", "O agente é um servidor TCP e o gerente um cliente UDP");
    
    Questao q15 = new Questao("Quiz - Perguntados", "14", "[UFPR - COPEL - 2015]", " Na computação em nuvem (CloudComputing), é comum o uso de SLA (Service Lavel Agrement). Sobre o assunto, assinale a alternativa correta:","Um SLA pode conter especificações, tanto de desempenho como de disponibilidade a ser mantidas pelo provedor", "SLAS são especificações informais dos direitos dos provedores de nuvem", "SLAS não podem conter informações sobre direitos dos usuários da nuvem");
    
    Questao q16 = new Questao("Quiz - Perguntados", "15", "[UFPR COPEL  - 2015]", " Um dos usos mais comuns dos algoritmos de HASH (resumo digital) é:","O armazenamento de senhas", "O processamento de e-mails com sigilo", "A transferência de arquivos com sigilo");
    
    Questao q17 = new Questao("Quiz - Perguntados", "16", "[UFPR - COPEL  - 2015]", " Sobre a linguagem Java, considere as seguintes afirmativas: 1. Treads são um recurso Java importante, que permite a execução concorrente de tarefas. 2. A serialização de objetos java, permite que um objeto qualquer seja representado como uma sequência de Bytes.  3. O Polimorfismo, permite utilizar objetos que se alteram a cada nova execução do programa.","Somente a primeira e a segunda afirmativas são verdadeiras", "Somente a primeira afirmativa está correta", "Somente as afirmativas segunda e terceira são verdadeiras");
    
    Questao q18 = new Questao("Quiz - Perguntados", "17", "[CESPE  - SERPRO  - 2013]", " Em um sistema distribuído pode se fazer a distinção entre a organização lógica do conjunto de componentes de software e a realização física propriamente dita.","Certo", "Errado", "Em partes");
    
    Questao q19 = new Questao("Quiz - Perguntados", "18", "[FCC - 2012]", " Não consta entre as diretrizes de usabilidade em governo eletrônico?","Documentação - O usuário deve ter acesso a um manual impresso, que descreva passo a passo,a forma correta de navegação no site, e as tecnologias utilizadas na sua  construção. Assim como cada um dos recursos disponíveis.", "Autonomia - Na internet qualquer tipo de controle não esperado, vindo por parte do site, é indesejado.", "Carga de Informação - Uma carga de informação alta e diversificada, confunde o usuário,  nestes casos, é mais provável a ocorrência de erros.");
    
    Questao q20 = new Questao("Quiz - Perguntados", "19", "[ESAF - 2012]", " Segundo o modelo de acessibilidade do governo eletrônico E-MAG, os elementos que devem estar em todas as páginas do governo federal são?","Página com a descrição dos recursos de acessibilidade, teclas de atalho / de acessibilidade, apresentação do mapa do sítio, apresentação de formulário, conteúdo alternativo para imagens, apresentação de documentos", "Página com a descrição dos recursos de acessibilidade, teclas de controle de hardware / de acessibilidade, apresentação do mapa de localização da instituição, apresentação de formulário, conteúdo alternativo para atalhos, apresentação  de documentos", "teclas de atalho / de usabilidade, apresentação do mapa do sítio, apresentação  de formulário, conteúdo para imagens de contexto, apresentação de documentos, identificação dos autores");
    
    Questao q21 = new Questao("Quiz - Perguntadados", "20", "[CESPE - 2012]", " Com relação a interface  de interação com usuário, julgue o item: Os landmarks, são pontos ou marcas de referência utilizados por leitores de tela específicos para pessoas com deficiência  como o JAWS. por meio desses pontos, é possível ajudar o usuário a localizar na página consultada, especificamente, o que ele busca como por exemplo: menu, conteúdo principal, campos de busca etc. Para criar esses pontos, deve se utilizar o atributo  \"role\", seguido do sinal de \"=\" e do valor da marca entre aspas com sua semântica.", "Certo", " Errado", "Em Partes");
    
    /*adicionando perguntas ao arrayList de quiz*/       
    quiz.add(q1);
    quiz.add(q2);
    quiz.add(q3);
    quiz.add(q4); 
    quiz.add(q5);
    quiz.add(q6);
    quiz.add(q7);
    quiz.add(q8);
    quiz.add(q8);
    quiz.add(q9);
    quiz.add(q10); 
    quiz.add(q11);
    quiz.add(q12);
    quiz.add(q13);
    quiz.add(q14);
    quiz.add(q15);
    quiz.add(q16);
    quiz.add(q17); 
    quiz.add(q18);
    quiz.add(q19);
    quiz.add(q20);

    /*RETORNANDO ARRAYLIST DE QUIZ*/
    
        Collections.shuffle(quiz);//Sorteia uma questao
    
    return quiz;
   
    }
    

    
        
}
