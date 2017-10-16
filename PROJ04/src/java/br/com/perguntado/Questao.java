package br.com.perguntado;
/**
 * @author Rodrigo
 */
public class Questao {
    /*ATRIBUTO apontando o nome do quiz a qual a questão fará parte ao ser instanciada*/
    private String nomeQuiz;
    /*O id é só a identificação da questão*/
    private String id;
    private String sigla;
    private String pergunta;
    private String respostaCerta;
    private String errada1;
    private String errada2;
    
    /*Toda questão possui um enunciado,uma alternativa certa e duas erradas*/
    public Questao(String nomeQuiz, String id, String sigla, String pergunta,String respostaCerta, String errada1, String errada2){
        this.nomeQuiz = nomeQuiz;
        this.id = id;
        this.sigla = sigla;
        this.pergunta = pergunta;
        this.respostaCerta = respostaCerta;
        this.errada1 = errada1;
        this.errada2 = errada2;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getRespostaCerta() {
        return respostaCerta;
    }

    public void setRespostaCerta(String respostaCerta) {
        this.respostaCerta = respostaCerta;
    }

    public String getErrada1() {
        return errada1;
    }

    public void setErrada1(String errada1) {
        this.errada1 = errada1;
    }

    public String getErrada2() {
        return errada2;
    }

    public void setErrada2(String errada2) {
        this.errada2 = errada2;
    }

    public String getNomeQuiz() {
        return nomeQuiz;
    }

    public void setNomeQuiz(String nomeQuiz) {
        this.nomeQuiz = nomeQuiz;
    }
    
    
    
    
}
