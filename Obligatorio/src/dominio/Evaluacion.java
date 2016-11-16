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
public class Evaluacion {
    private Cliente cliente;
    private int puntuacion;
    private String resena;
    
    //Constructor para nueva evaluacion
    public Evaluacion(Cliente cliente, int puntuacion, String resena) {
        this.cliente = cliente;
        this.puntuacion = puntuacion;
        this.resena = resena;
    }

    //Getters y Setters
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getResena() {
        return resena;
    }

    public void setResena(String resena) {
        this.resena = resena;
    }
    
    
}
