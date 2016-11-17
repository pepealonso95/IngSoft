/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author pepe1
 */
public class Cliente {
    private String nombre;
    private String email;

    //Constructor de Cliente
    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + ", email: " + email;
    }
    
    public boolean noEsAnonimo(){
        //retorna true si se posee informacion del cliente
        boolean retorno = true;
        if(this.nombre == "" && this.email == ""){
            retorno = false;
        }
        return retorno;
    }
}
