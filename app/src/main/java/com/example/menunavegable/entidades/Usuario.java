package com.example.menunavegable.entidades;

public class Usuario {
    private String apellido;
    private String nombre;
    private String foto;
    private String password;
    private String mail;

    public Usuario(String apellido, String nombre, String foto, String password, String mail) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.foto = foto;
        this.password = password;
        this.mail = mail;
    }

    public Usuario() {   }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

}
