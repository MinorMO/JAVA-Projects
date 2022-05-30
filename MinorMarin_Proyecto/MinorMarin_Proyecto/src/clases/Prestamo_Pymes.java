
package clases;

/**
 *
 * @author Minor
 */
public class Prestamo_Pymes extends Prestamo {
    // Declaración de los atributos de la clase Préstamo Pymes.
private int cant_Empleados;

// Declaración de los constructores utilizados.

    public Prestamo_Pymes(String identificacion, String nombre, String primer_Apellido, String segundo_Apellido, int edad, double ingreso_mensual) {
        super(identificacion, nombre, primer_Apellido, segundo_Apellido, edad, ingreso_mensual);
    }
    

    public Prestamo_Pymes(int cant_Empleados, int id_Cotizacion, String fecha, double monto_Prestamo, int meses) {
        super(id_Cotizacion, fecha, monto_Prestamo, meses);
        this.cant_Empleados = cant_Empleados;
    }

    public Prestamo_Pymes() { // Constrcutor vacío.
    }
    
//Getter and setters de los atributos de la clase
    public int getCant_Empleados() {
        return cant_Empleados;
    }

    public void setCant_Empleados(int cant_Empleados) {
        this.cant_Empleados = cant_Empleados;
    }

    
       
   /// Métodos implementados.
    
    //Método para asignar la tasa de interés. 

    @Override
    public double Tasa_Interes(){
    return 0.08;
        
    }
    
     //Método que determina la cuota mensual aplicando el descuento.
    @Override
    public double Calcular_Renta_Total() {
    return Calcular_Renta_Base()-Cantidad_Descuento();     
    } 
    


    //Método que determina el porcentaje del descuento aplicado.
    public double Descuento_Aplicado() {
        if (this.cant_Empleados >= 1 && this.cant_Empleados < 5) {
            return 0.02;
        } else {
            return (this.cant_Empleados >= 5 && this.cant_Empleados < 10) ? 0.03 : 0.1;
        }
    }
     // Método que determina la cantidad en dinero del descuento que se aplicó.  
public double Cantidad_Descuento() {
    return Calcular_Renta_Base()*Descuento_Aplicado();
    
}
    // Método que calcula la renta base. 
@Override
    public double Calcular_Renta_Base() {
        return this.getMonto_Prestamo() * Tasa_Interes() / (1 - 1 / (1 + Tasa_Interes()) / this.getMeses());
    }
    //Anexo: Explicación de la formula.
    //R  = A * i / (1 – 1 / (1 + i)/n)
    /*R: es la renta, es decir, el monto de la cuota a pagar cada mes, y el cual hay que calcular.
      A: es el monto del crédito adquirido.
      i: es la tasa de interés mensual que se debe pagar por el crédito.
      n: es el número de meses durante los cuales se debe cancelar el crédito.*/
}

