package Main;

import Ventanas.Solicitar_Datos;

 //Tarea 1 Programación Intermedia.
 //Programa que calcula el monto mensual de un posible financiamiento.
 //@author Minor Marin Obando.
 // Ced: 604310748.
 
public class Main {

    public static void main(String[] args) {
        //Se crea el objeto del respectivo JFrameForm para posteriormente mostrarlo al usuario.
        Solicitar_Datos Ventana_Datos = new Solicitar_Datos();
        Ventana_Datos.setVisible(true);
    }
}
