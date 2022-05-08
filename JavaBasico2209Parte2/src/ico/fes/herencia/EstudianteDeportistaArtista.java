/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.herencia;

/**
 *
 * @author elies
 */
public class EstudianteDeportistaArtista extends Persona implements Deportista, Artista{
    private String carrera;
    private String numeroCuienta;
    private String disciplinaDeportiva;
    private String generoArtistico;

    public EstudianteDeportistaArtista() {
    }

    public EstudianteDeportistaArtista(String carrera, String numeroCuienta, String disciplinaDeportiva, String generoArtistico) {
        this.carrera = carrera;
        this.numeroCuienta = numeroCuienta;
        this.disciplinaDeportiva = disciplinaDeportiva;
        this.generoArtistico = generoArtistico;
    }

    public String getGeneroArtistico() {
        return generoArtistico;
    }

    public void setGeneroArtistico(String generoArtistico) {
        this.generoArtistico = generoArtistico;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNumeroCuienta() {
        return numeroCuienta;
    }

    public void setNumeroCuienta(String numeroCuienta) {
        this.numeroCuienta = numeroCuienta;
    }

    public String getDisciplinaDeportiva() {
        return disciplinaDeportiva;
    }

    public void setDisciplinaDeportiva(String disciplinaDeportiva) {
        this.disciplinaDeportiva = disciplinaDeportiva;
    }

    @Override
    public String toString() {
        return "EstudianteDeportistaArtista{" + "carrera=" + carrera + ", numeroCuienta=" + numeroCuienta + ", disciplinaDeportiva=" + disciplinaDeportiva + ", generoArtistico=" + generoArtistico + '}';
       
    }
    
    @Override
    public void entrenar() {
        System.out.println(this.nombre+" esta entrenando"+this.disciplinaDeportiva);
    }

    @Override
    public void jugar() {
        System.out.println(this.nombre+"esta jugando"+this.disciplinaDeportiva);
    }

    @Override
    public void ensayar() {
        System.out.println(this.nombre+"esta ensayando"+this.generoArtistico);
    }

    @Override
    public void presentar() {
        System.out.println(this.nombre+"esta presentando su obra de "+this.generoArtistico);
    }
    
    
    
}