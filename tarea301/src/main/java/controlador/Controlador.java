/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Ventana;
import vista.VentanaAlquilarLibro;
import vista.VentanaDevolverLibro;
import vista.VentanaLibrosAlquilados;
import vista.VentanaLibrosDisponibles;
import vista.VentanaPrincipal;
import vista.VentanaVerHistorico;
import vista.VentanaVerSocios;

public class Controlador implements ActionListener {

    private Ventana vista;
    private VentanaAlquilarLibro ventanaAlquilarLibro;
    private VentanaDevolverLibro ventanaDevolverLibro;
    private VentanaLibrosAlquilados ventanaLibrosAlquilados;
    private VentanaLibrosDisponibles ventanaLibrosDisponibles;
    private VentanaPrincipal ventanaPrincipal;
    private VentanaVerHistorico ventanaVerHistorico;
    private VentanaVerSocios ventanaVerSocios;
    private Modelo modelo;

    public Controlador(Ventana vista, Modelo modelo) {
        ventanaPrincipal = new VentanaPrincipal();
        this.vista = vista;
        this.modelo = modelo;
        ventanaPrincipal.agregarControlador(this);
    }

    public void ejecutar() {
        ventanaPrincipal.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
//        if(e.getActionCommand().equals("BUSCAR")){
//            String resultado = modelo.obtenerDatosEmpleado(vista.getNumero());
//            vista.datosAtabla(resultado);
//        }
        if(e.getSource().equals(ventanaPrincipal.getBotonDatos())){
        String g=modelo.obtenerDatosEmpleado("empleado");
        System.out.println(g);
        }
    }
    private void mostrarDatos(Ventana vista, Modelo modelo) {
        String datos = modelo.obtenerDatosEmpleado("sdad");
        //TODO //vista.mostrarDatos(datos);
    }

    private void limpiar(Ventana vista) {
        //TODO //vista.limpiar();
    }
}
