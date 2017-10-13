/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.quiz;
import java.util.ArrayList;

/**
 *
 * @author vitoria
 */
public class Usuario {
   private String user;
   
   public static ArrayList<Usuario> list;
   
   public static ArrayList<Usuario> getList(){
        if(list==null){
            list = new ArrayList<>();
            Usuario u1 =new Usuario();
            u1.setUsuario("Luciana");
            list.add(u1);
            
            Usuario u2 =new Usuario();
            u2.setUsuario("Luiz");
            list.add(u2);
            
            Usuario u3 =new Usuario();
            u3.setUsuario("Rodrigo Topan");
            list.add(u3);
            
            Usuario u4 =new Usuario();
            u4.setUsuario("Vitória");
            list.add(u4);
        }
        return list;
   }
   
    public String getUsuario() {
        return user;
    }
    
    public void setUsuario(String user) {
        this.user = user;
    }
    
    
}
