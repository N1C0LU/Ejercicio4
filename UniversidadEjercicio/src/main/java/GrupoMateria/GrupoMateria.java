/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GrupoMateria;

/**
 *
 * @author Nicolas Castaño
 */
public class GrupoMateria {
    private final int codGrupo;
    private String profesor;
    private final double promGrupo;
    private final int numEstudiantes;
    private final int ganaron;

    public GrupoMateria(int codGrupo, String profesor, double promGrupo, int numEstudiantes, int ganaron) {
        this.codGrupo = codGrupo;
        this.profesor = profesor;
        this.promGrupo = promGrupo;
        this.numEstudiantes = numEstudiantes;
        this.ganaron = ganaron;
    }

    public int getCodGrupo() { return codGrupo; }
    public String getProfesor() { return profesor; }
    public double getPromGrupo() { return promGrupo; }
    public int getNumEstudiantes() { return numEstudiantes; }
    public int getGanaron() { return ganaron; }


    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }


    public double porcentajeQuePerdio() {
        if (numEstudiantes == 0) return 0.0;
        int perdieron = numEstudiantes - ganaron;
        return (perdieron * 100.0) / numEstudiantes;
    }


    public String mostrar() {
        return "Grupo " + codGrupo +
               " | Prof: " + profesor +
               " | Prom: " + promGrupo +
               " | Est: " + numEstudiantes +
               " | Ganaron: " + ganaron;
    }
}

