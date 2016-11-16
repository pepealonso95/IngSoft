/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.ArrayList;

/**
 *
 * @author Guillermo
 */
public class Sistema {
    private ArrayList<Restaurante> restaurantes;

    //Metodo Constructor de Sistema
    public Sistema() {
        this.restaurantes = new ArrayList();
    }

    //Metodos Getters y Setters
    public ArrayList<Restaurante> getRestaurantes() {
        return restaurantes;
    }

    public void setRestaurantes(ArrayList<Restaurante> restaurantes) {
        this.restaurantes = restaurantes;
    }
    
    
    
}
