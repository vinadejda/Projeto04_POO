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
public class Usuario {
    private String nome;
    private String login;
    private double media;
    
    
    /*Construtor de Usuarios*/
    
    public Usuario(String nome, String login){
        this.nome = nome;
        this.login = login;
        /*A media começa com 0*/
        this.media = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
    
    /*Metódo de cadastro dos usuarios no arrayList*/
    public static ArrayList<Usuario> usuarios;
    public static ArrayList<Usuario> getUsu(){
    /*Instanciando arrayList de usuarios*/
    usuarios = new ArrayList<>();
    /*Lista de usuarios já cadastrados. Usuarios Default*/
    Usuario rodrigo = new Usuario("Rodrigo Garcia","rodrigo");
    Usuario luiz = new Usuario("Luiz Henrique","luiz");

    
    /*adicionando USUARIOS ao arrayList de usuarios*/       
    usuarios.add(rodrigo);
    usuarios.add(luiz); 
    
    /*RETORNANDO ARRAYLIST DE USUARIOS*/
    return usuarios;
    }
    
}
