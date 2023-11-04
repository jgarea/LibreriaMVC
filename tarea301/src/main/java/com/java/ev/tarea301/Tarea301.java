/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.java.ev.tarea301;

import java.sql.SQLException;

/**
 *
 * @author Juan
 */
public class Tarea301 {

    public static void main(String[] args) throws SQLException {
        // el modelo:
        Modelo modelo = new Modelo();
        // la vista:
        Vista vista = new Vista();
        // y el control:
        Controlador control = new Controlador (vista, modelo);
        // y arranca la interfaz (vista):
        vista.arrancar();
        // configura la vista
        vista.setControlador(control);
    }
}
