/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package GrupoMateria;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nicolas Castaño
 */
public class GrupoMateriaTest {
    @Test
    public void testPorcentajeQuePerdio() {
        GrupoMateria grupo = new GrupoMateria(2, "Nicolas", 3.5, 20, 10);
        double resultado = grupo.porcentajeQuePerdio();
        assertEquals(50.0, resultado, 0.01);
    }
    
    @Test
    public void testMostrar() {
        GrupoMateria grupo = new GrupoMateria(3, "Henry", 3.9, 12, 10);
        String resultado = grupo.mostrar();
        String esperado = "Grupo 3 | Prof: Henry | Prom: 3.9 | Est: 12 | Ganaron: 10";

        assertEquals(esperado, resultado);
    }

    
}
