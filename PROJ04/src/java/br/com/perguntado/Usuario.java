package br.com.perguntado;
import java.util.ArrayList;
/**
 *
 * @author vitoria
 */
public class Usuario {
   private String nome;
   
       /*Construtor de Usuarios*/
    
    public Usuario(String nome){
        this.nome = nome;
    }
   
   public static ArrayList<Usuario> listUsuarios;
   
   public static ArrayList<Usuario> getListUsuarios(){
        if(listUsuarios==null){
            listUsuarios = new ArrayList<>();
            Usuario u1 = new Usuario("Luciana");
            listUsuarios.add(u1);
            
            Usuario u2 =new Usuario("Luiz");
            listUsuarios.add(u2);
            
            Usuario u3 =new Usuario("Rodrigo");
            listUsuarios.add(u3);
            
            Usuario u4 =new Usuario("Vitoria");
            listUsuarios.add(u4);
        }
        return listUsuarios;
   }
   
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
   }