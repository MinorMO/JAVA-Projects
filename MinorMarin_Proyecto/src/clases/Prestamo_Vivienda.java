
package clases;

/**
 *
 * @author Minor
 */
public class Prestamo_Vivienda  extends Prestamo{
       //Declaración de los atributos de la clase préstamo vivienda.
    private int mts_cuadrados;

      // Declaración de los constructores utilizados.

    public Prestamo_Vivienda(String identificacion, String nombre, String primer_Apellido, String segundo_Apellido, int edad, double ingreso_mensual) {
        super(identificacion, nombre, primer_Apellido, segundo_Apellido, edad, ingreso_mensual);
    }
   

    public Prestamo_Vivienda(int mts_cuadrados, int id_Cotizacion, String fecha, double monto_Prestamo, int meses) {
        super(id_Cotizacion, fecha, monto_Prestamo, meses);
        this.mts_cuadrados = mts_cuadrados;
    }

    public Prestamo_Vivienda() { // Constructor vacío.
    }
    
    
//Getter and setter de los atributos de la clase
    public int getMts_cuadrados() {
        return mts_cuadrados;
    }

    public void setMts_cuadrados(int mts_cuadrados) {
        this.mts_cuadrados = mts_cuadrados;
    }
    
      /// Métodos implementados.
    
    //Método para asignar la tasa de interés. 

     @Override
    public double Tasa_Interes(){
    return 0.0525;
    
    }
    
   // Método que calcula la cuota mensual ya sea que se exceda de los metros establecidos. 
    @Override
    public double Calcular_Renta_Total() {
        if (this.mts_cuadrados>500){
            return Calcular_Renta_Base()+Mts_Cuadrados_Demas();
        } else {
            return Calcular_Renta_Base();
        }
    }
   
  // Método que determina cuánta es la cantidad en dinero que se excedió si se diera el caso.
    public int Mts_Cuadrados_Demas() {
        return this.mts_cuadrados*25;
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
