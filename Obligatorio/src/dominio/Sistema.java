/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.ArrayList;
import javax.swing.JOptionPane;

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
    
    public void agregarRestaurante(String nombre, String direccion, String horarioApertura, String horarioCierre, String tipoComida){
        //crea y agrega un nuevo restaurante al sistema si es que no se encuentra ya en el sistema
        Restaurante restaurante = new Restaurante(nombre, direccion, horarioApertura, horarioCierre, tipoComida);
        if(!restaurantes.contains(restaurante)){
            //no existe, entonces se agrega
            restaurantes.add(restaurante);
        }else{
            //ya existe, no se agrega y se avisa al usuario 
            JOptionPane.showMessageDialog(null, "Ya se encuentra creado el restaurante");
        }
    }
    
    
}
