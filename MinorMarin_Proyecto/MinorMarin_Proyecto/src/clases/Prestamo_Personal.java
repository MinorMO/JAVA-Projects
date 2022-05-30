package clases;

/**
 *
 * @author Minor
 */
public class Prestamo_Personal extends Prestamo {
    //Declaración de los atributos de la clase préstamo personal.
 private boolean estado_Cliente;
 private int cant_Productos;

 // Declaración de los constructores utilizados.

    public Prestamo_Personal(String identificacion, String nombre, String primer_Apellido, String segundo_Apellido, int edad, double ingreso_mensual) {
        super(identificacion, nombre, primer_Apellido, segundo_Apellido, edad, ingreso_mensual);
    }
  

    public Prestamo_Personal(boolean estado_Cliente, int cant_Productos, int id_Cotizacion, String fecha, double monto_Prestamo, int meses) {
        super(id_Cotizacion, fecha, monto_Prestamo, meses);
        this.estado_Cliente = estado_Cliente;
        this.cant_Productos = cant_Productos;
    }

    public Prestamo_Personal() { // constructor vacío.
    }
    
    
    
    
//Getter and setter de los atributos de la clase
    public boolean isEstado_Cliente() {
        return estado_Cliente;
    }

    public void setEstado_Cliente(boolean estado_Cliente) {
        this.estado_Cliente = estado_Cliente;
    }

    public int getCant_Productos() {
        return cant_Productos;
    }

    public void setCant_Productos(int cant_Productos) {
        this.cant_Productos = cant_Productos;
    }
    
     /// Métodos implementados.
    
    //Método para asignar la tasa de interés. 
    @Override
    public double Tasa_Interes(){
    return 0.31;
        
    }
// Método que calcula la cuota mensual aplicando el descuento si es necesario.
    @Override
    public double Calcular_Renta_Total() {

        if (this.estado_Cliente == true) {
            return Calcular_Renta_Base() - Cantidad_Descuento();
        } else {
            return Calcular_Renta_Base();
        }
    }
   
// Método que determina el porcentaje de descuento que se le va a aplicar.
    public double Descuento_Aplicado() {
        return (this.cant_Productos >= 1 && this.cant_Productos <= 5) ? 0.01 : 0.03;
    }
// Método que calcula a cuánto en dinero equivale el descuento aplicado.
    public double Cantidad_Descuento() {
        if (this.estado_Cliente == true) {
            return Calcular_Renta_Base() * Descuento_Aplicado();
        } else {
            return 0;
        }
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