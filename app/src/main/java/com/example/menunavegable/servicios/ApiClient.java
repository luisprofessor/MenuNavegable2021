package com.example.menunavegable.servicios;

import com.example.menunavegable.entidades.Pelicula;
import com.example.menunavegable.entidades.Usuario;

import java.util.ArrayList;
import java.util.List;

public class ApiClient {
    private Usuario user;

    public ApiClient(){
        user=new Usuario("Lopez","Maria","http://www.secsanluis.com.ar/servicios/usuario.jpg","123","lopez@mail.com");

    }
    public Usuario login(String mail, String password){
        if(mail.equals(user.getMail())&&password.equals(user.getPassword())){
            return user;
        }
        return null;
    }

    public List<Pelicula> obtenerPeliculas(){
        ArrayList<Pelicula> lista=new ArrayList<>();

        lista.add(new Pelicula("Jumanji","La película empieza en 1869, cuando dos chicos entierran un cofre cerca de Brantford, Nueva Hampshire","http://www.secsanluis.com.ar/servicios/jumanji.jpg"));
        lista.add(new Pelicula("Sonic","Sonic es un pequeño erizo antropomórfico azul proveniente de otro mundo...","http://www.secsanluis.com.ar/servicios/sonic.jpg"));

        return lista;
    }
}

