package Classes;
//Importación de las librerías utilizadas.

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author Minor
 */
public class Prestamo {

    //Método que se encarga de obtener la fecha actual del sistema y retornarla.
    public static String Fecha_Actual() {
        java.util.Date Fecha_Actual = new Date(); //Se crea un objeto del tipo Date.
        SimpleDateFormat Fecha = new SimpleDateFormat("dd/MM/yyyy");//Se le da el formato.
        return Fecha.format(Fecha_Actual);// Se retorna la fecha con el formato que se le dio.
    }
    //Método que se encarga de obtener un número aleatorio entre 0 y 1000 y retornarlo.
    public static int ID_Aleatorio() {
        Random Aleatario = new Random(); //se crea un objeto del tipo Radom.
        int id_cot = 0 + Aleatario.nextInt(1000); //Se limita el rango del número radom del objeto y se le asigna a una variable del tipo entero.
        return id_cot;// Se retorna el número random.
    }

    //Método que se encarga de calcular la renta mensual del posible financiamiento y retornarlo.
    public static double Calcular_Renta_Total(double MontoPrestamo, int Meses) {
        return (MontoPrestamo * 0.31 / (1 - 1 / (1 + 0.31) / Meses));
    }
    //Anexo: Explicación de la formula.
    //R  = A * i / (1 – 1 / (1 + i)/n)
    /*R: es la renta, es decir, el monto de la cuota a pagar cada mes, y el cual hay que calcular.
      A: es el monto del crédito adquirido.
      i: es la tasa de interés mensual que se debe pagar por el crédito.
      n: es el número de meses durante los cuales se debe cancelar el crédito.*/
}
