/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Materia;

import GrupoMateria.GrupoMateria;


/**
 *
 * @author Nicolas Castaño
 */
public class Materia {
    private String codMat;
    private String nomMat;
    private final int numGrupos;
    private final GrupoMateria[] grupos;
    private int indice = 0;

    public Materia(String codMat, String nomMat, int numGrupos) {
        this.codMat = codMat;
        this.nomMat = nomMat;
        this.numGrupos = numGrupos;
        this.grupos = new GrupoMateria[numGrupos];
    }


    public void agregaGrupo(GrupoMateria grupo) {
        if (indice < grupos.length) {
            grupos[indice] = grupo;
            indice++;
        }
    }

    public String getCodMat() { return codMat; }
    public String getNomMat() { return nomMat; }
    public int getNumGrupos() { return numGrupos; }
    public void setCodMat(String codMat) { this.codMat = codMat; }
    public void setNomMat(String nomMat) { this.nomMat = nomMat; }


    public String mostrar() {
    String texto = "Materia: " + codMat + " - " + nomMat +
                   " | Numero de Grupos: " + indice + "\n";
    for (int i = 0; i < indice; i++) {
        texto = texto + grupos[i].mostrar() + "\n";
    }
    return texto;
    }


    public String buscarGrupo(int codGrupo) {
        GrupoMateria g = obtenerGrupo(codGrupo);
        if (g == null) return "No existe un grupo con este código de grupo";
        return g.mostrar();
    }


    public GrupoMateria obtenerGrupo(int codGrupo) {
        for (int i = 0; i < indice; i++) {
            if (grupos[i].getCodGrupo() == codGrupo) return grupos[i];
        }
        return null;
    }


    public double mayorPromedioDeGrupo() {
        if (indice == 0) return 0.0;
        double mayor = grupos[0].getPromGrupo();
        for (int i = 1; i < indice; i++) {
            if (grupos[i].getPromGrupo() > mayor) mayor = grupos[i].getPromGrupo();
        }
        return mayor;
    }


    public void modificarProfesor(int codGrupo, String otroProfesor) {
        GrupoMateria g = obtenerGrupo(codGrupo);
        if (g != null) {
            g.setProfesor(otroProfesor);
        }
    }
}

    

