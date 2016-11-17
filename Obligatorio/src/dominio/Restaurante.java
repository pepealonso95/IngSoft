package dominio;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

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
    //Aqui se guardan todas las evaluaciones del restaurante
    private ArrayList<Evaluacion> evaluaciones;
    //Aqui se guardan todos los clientes que pueden participar del sorteo
    private ArrayList<Cliente> participantes;
    private boolean estaDefinidoSorteo;
    private int cantidadGanadores;
    private String descripcionPremio;

    //Constructor para nuevo restaurante;
    public Restaurante(String nombre, String direccion, String horarioAbrir, String horarioCerrar, String tipoComida) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.horarioAbrir = horarioAbrir;
        this.horarioCerrar = horarioCerrar;
        this.tipoComida = tipoComida;
        this.evaluaciones = new ArrayList();
        this.participantes = new ArrayList();
        this.estaDefinidoSorteo = false;
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

    public void setEvaluaciones(ArrayList<Evaluacion> evaluaciones) {
        this.evaluaciones = evaluaciones;
    }

    public ArrayList getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Cliente> participantes) {
        this.participantes = participantes;
    }

    public boolean isEstaDefinidoSorteo() {
        return estaDefinidoSorteo;
    }

    public void setEstaDefinidoSorteo(boolean estaDefinidoSorteo) {
        this.estaDefinidoSorteo = estaDefinidoSorteo;
    }

    public int getCantidadGanadores() {
        return cantidadGanadores;
    }

    public void setCantidadGanadores(int cantidadGanadores) {
        this.cantidadGanadores = cantidadGanadores;
    }

    public String getDescripcionPremio() {
        return descripcionPremio;
    }

    public void setDescripcionPremio(String descripcionPremio) {
        this.descripcionPremio = descripcionPremio;
    }

    //Override de metodo Eguals, define que dos Restaurantes son iguales con igual nombre y direccion
    @Override
    public boolean equals(Object obj) {
        boolean retorno = false;
        if (this.getNombre().equals(((Restaurante) obj).getNombre())) {
            retorno = true;
        }
        return retorno;
    }

    public void agregarEvaluacion(String nombre, String mail, int puntuacion, String resena) {
        //crea el cliente y si eligio no ser anonimo se guarda en la lista de clientes para participar en la rifa
        //crea la evaluacion y la guarda en la lista
        Cliente cliente = new Cliente(nombre, mail);
        Evaluacion evaluacion = new Evaluacion(cliente, puntuacion, resena);
        evaluaciones.add(evaluacion);
        if (!participantes.contains(cliente) && cliente.noEsAnonimo() && !resena.equals("")) {
            //cliente y resena valido para participar del sorteo, entonces lo agrego a la lista de participantes
            participantes.add(cliente);
        }
    }

    public void definirSorteo(int cantidadGanadores, String premio) {
        //define los parametros del sorteo
        this.estaDefinidoSorteo = true;
        this.cantidadGanadores = cantidadGanadores;
        this.descripcionPremio = premio;
    }

    public ArrayList<Cliente> realizarSorteo() {
        ArrayList<Cliente> retorno = new ArrayList();
        if (estaDefinidoSorteo) {
            if (participantes.size() == 0) {
                JOptionPane.showMessageDialog(null, "No hay clientes participantes del sorteo");
            } else {
                //me defino los numeros de los participantes ganadores
                Random rand = new Random();
                int cantParticipantes = participantes.size();
                int cantGanadores = Math.min(cantidadGanadores, cantParticipantes);
                ArrayList<Integer> numerosGanadores = new ArrayList(cantGanadores);
                if (cantParticipantes <= cantGanadores) {
                    //ganan todos
                    for (int i = 0; i < cantGanadores; i++) {
                        numerosGanadores.add(i);
                    }
                } else {
                    //ganan algunos al azar
                    for (int i = 0; i < cantGanadores; i++) {
                        int numeroAzar = rand.nextInt(cantParticipantes);
                        while (numerosGanadores.contains(numeroAzar)) {
                            numeroAzar = rand.nextInt(cantParticipantes);
                        }
                        numerosGanadores.add(numeroAzar);
                    }
                }
                //aviso a ganadores
                for (int i = 0; i < cantGanadores; i++) {
                    int numero = numerosGanadores.get(i);
                    Cliente ganador = participantes.get(numero);
                    //lo agrego a la lista de retorno
                    retorno.add(ganador);
                    //mandar mail a ganador
                    
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Este restaurante no tiene definido ningun sorteo");
        }
        return retorno;
    }
}
