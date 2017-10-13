package br.com.perguntado;
/**
 * @author Rodrigo
 */
public class Questao {
    
    private String id;
    private String pergunta;
    private String respostaCerta;
    private String errada1;
    private String errada2;
    
    /*Toda questão possui um enunciado,uma alternativa certa e duas erradas*/
    public Questao(String id,String pergunta,String respostaCerta, String errada1, String errada2){
        this.id = id;
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
    
    
    
    
}
