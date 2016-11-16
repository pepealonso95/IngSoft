
package dominio;

import java.util.ArrayList;

/**
 *
 * @author Guillermo
 */
public class Restaurante {
    private String nombre;
    private String direccion;
    private String horarioAbrir;
    private String horarioCerrar;
    private String tipoComida;
    private ArrayList evaluaciones;
    //sorteo? va aca o como clase separada?

    //Constructor para nuevo restaurante;
    public Restaurante(String nombre, String direccion, String horarioAbrir, String horarioCerrar, String tipoComida) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.horarioAbrir = horarioAbrir;
        this.horarioCerrar = horarioCerrar;
        this.tipoComida = tipoComida;
        this.evaluaciones = new ArrayList();
    }
    
    //Metodos Getters y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getHorarioAbrir() {
        return horarioAbrir;
    }

    public void setHorarioAbrir(String horarioAbrir) {
        this.horarioAbrir = horarioAbrir;
    }

    public String getHorarioCerrar() {
        return horarioCerrar;
    }

    public void setHorarioCerrar(String horarioCerrar) {
        this.horarioCerrar = horarioCerrar;
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public ArrayList getEvaluaciones() {
        return evaluaciones;
    }

    public void setEvaluaciones(ArrayList evaluaciones) {
        this.evaluaciones = evaluaciones;
    }
    
    
    
}
