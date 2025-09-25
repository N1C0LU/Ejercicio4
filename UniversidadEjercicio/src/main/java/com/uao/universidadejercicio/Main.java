/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uao.universidadejercicio;

import GrupoMateria.GrupoMateria;
import Materia.Materia;
import javax.swing.JOptionPane;

/**
 *
 * @author Nicolas Castaño
 */
public class Main {
    public static void main(String[] args) {

        String cod = JOptionPane.showInputDialog("Código de la materia:");
        String nom = JOptionPane.showInputDialog("Nombre de la materia:");
        int n = Integer.parseInt(JOptionPane.showInputDialog("Número de grupos (1-12):"));

        Materia materia = new Materia(cod, nom, n);


        for (int i = 0; i < n; i++) {
            int cg = Integer.parseInt(JOptionPane.showInputDialog("Código del grupo " + (i+1) + ":"));
            String prof = JOptionPane.showInputDialog("Profesor del grupo " + (i+1) + ":");
            double prom = Double.parseDouble(JOptionPane.showInputDialog("Promedio del grupo " + (i+1) + ":"));
            int est = Integer.parseInt(JOptionPane.showInputDialog("N° estudiantes del grupo " + (i+1) + ":"));
            int gan = Integer.parseInt(JOptionPane.showInputDialog("N° que ganaron el grupo " + (i+1) + ":"));

            GrupoMateria g = new GrupoMateria(cg, prof, prom, est, gan);
            materia.agregaGrupo(g);
        }


        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                "MENÚ\n" +
                "1) Reporte materia y grupos\n" +
                "2) % que perdió un grupo\n" +
                "3) Buscar grupo por código\n" +
                "4) Mayor promedio de grupo\n" +
                "5) Cambiar profesor de un grupo\n" +
                "6) Salir"));

            switch (op) {
                case 1:     
                    JOptionPane.showMessageDialog(null, materia.mostrar());
                    break;
                case 2: {
                    int codg = Integer.parseInt(JOptionPane.showInputDialog("Código del grupo:"));
                    GrupoMateria g = materia.obtenerGrupo(codg);
                    if (g == null) JOptionPane.showMessageDialog(null, "No existe un grupo con este código de grupo");
                    else JOptionPane.showMessageDialog(null, "Porcentaje que perdió: " + g.porcentajeQuePerdio() + "%");
                    break;
                }
                case 3: {
                    int codg = Integer.parseInt(JOptionPane.showInputDialog("Código del grupo:"));
                    JOptionPane.showMessageDialog(null, materia.buscarGrupo(codg));
                    break;
                }
                case 4:
                    JOptionPane.showMessageDialog(null, "Mayor promedio: " + materia.mayorPromedioDeGrupo());
                    break;
                case 5: {
                    int codg = Integer.parseInt(JOptionPane.showInputDialog("Código del grupo:"));
                    if (materia.obtenerGrupo(codg) == null) {
                        JOptionPane.showMessageDialog(null, "No existe un grupo con este código de grupo");
                    } else {
                        String nuevo = JOptionPane.showInputDialog("Nuevo profesor:");
                        materia.modificarProfesor(codg, nuevo);
                        JOptionPane.showMessageDialog(null, "Profesor actualizado.\n" + materia.buscarGrupo(codg));
                    }
                    break;
                }
            }
        } while (op != 6);
    }
}
