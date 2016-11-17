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
    
    public boolean agregarRestaurante(String nombre, String direccion, String horarioApertura, String horarioCierre, String tipoComida){
        //crea y agrega un nuevo restaurante al sistema si es que no se encuentra ya en el sistema
        Restaurante restaurante = new Restaurante(nombre, direccion, horarioApertura, horarioCierre, tipoComida);
        if(!restaurantes.contains(restaurante)){
            //no existe, entonces se agrega
            restaurantes.add(restaurante);
            return true;
        }else{
            //ya existe, no se agrega y se avisa al usuario 
            JOptionPane.showMessageDialog(null, "Ya se encuentra creado el restaurante");
            return false;
        }
    }
    
     public void editarRestaurante(String original, String nombre, String direccion, String horarioApertura, String horarioCierre, String tipoComida){
        //edita los datos de un restaurante previamente ingresado al sistema
        Restaurante restaurante = buscarRestaurantePorNombre(original);
        restaurante.setNombre(nombre);
        restaurante.setDireccion(direccion);
        restaurante.setHorarioAbrir(horarioApertura);
        restaurante.setHorarioCerrar(horarioCierre);
        restaurante.setTipoComida(tipoComida);
    }
    
    //Este metodo busca un restaurante en la lista por su nombre y en caso de encontrarlo devuelve toda la informacion de este
    public Restaurante buscarRestaurantePorNombre(String Nombre) {
        Restaurante ret = null;
        for(int i = 0; i < restaurantes.size(); i++){
            if(restaurantes.get(i).getNombre()==Nombre){
                ret = restaurantes.get(i);
            }
        }
        return ret;
    }
    
    
}
