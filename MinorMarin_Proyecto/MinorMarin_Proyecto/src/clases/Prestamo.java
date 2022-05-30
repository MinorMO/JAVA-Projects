package clases;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
/**
 *
 * @author Minor
 */
public  class Prestamo {

    //Declaración de los atributos del cliente. 
    protected String identificacion;
    protected String nombre;
    protected String primer_Apellido;
    protected String segundo_Apellido;
    protected int edad;
    protected double ingreso_mensual;

    // Declaración de los atributos del préstamo.
    protected int id_Cotizacion;
    protected String fecha;
    protected double monto_Prestamo;
    protected int meses;

    //Constructor del objeto con los atributos del cliente.

    public Prestamo(String identificacion, String nombre, String primer_Apellido, String segundo_Apellido, int edad, double ingreso_mensual) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.primer_Apellido = primer_Apellido;
        this.segundo_Apellido = segundo_Apellido;
        this.edad = edad;
        this.ingreso_mensual = ingreso_mensual;
    }

   

  
    
    
    //Constructor del objeto con los atributos del Préstamo.
    public Prestamo(int id_Cotizacion, String fecha, double monto_Prestamo, int meses) {
        this.id_Cotizacion = id_Cotizacion;
        this.fecha = fecha;
        this.monto_Prestamo = monto_Prestamo;
        this.meses = meses;
    }
    
    //Constructor vacio.
    public Prestamo() {
        this.identificacion = "";
        this.nombre = "";
        this.edad = 0;
        this.ingreso_mensual = 0;
        this.id_Cotizacion = 0;
        this.fecha = "";
        this.monto_Prestamo = 0;
        this.meses = 0;
    }

    //Declaración de los getter and setters de los atributos.

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimer_Apellido() {
        return primer_Apellido;
    }

    public void setPrimer_Apellido(String primer_Apellido) {
        this.primer_Apellido = primer_Apellido;
    }

    public String getSegundo_Apellido() {
        return segundo_Apellido;
    }

    public void setSegundo_Apellido(String segundo_Apellido) {
        this.segundo_Apellido = segundo_Apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getIngreso_mensual() {
        return ingreso_mensual;
    }

    public void setIngreso_mensual(double ingreso_mensual) {
        this.ingreso_mensual = ingreso_mensual;
    }

    public int getId_Cotizacion() {
        return id_Cotizacion;
    }

    public void setId_Cotizacion(int id_Cotizacion) {
        this.id_Cotizacion = id_Cotizacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getMonto_Prestamo() {
        return monto_Prestamo;
    }

    public void setMonto_Prestamo(double monto_Prestamo) {
        this.monto_Prestamo = monto_Prestamo;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }
    
    
    
    
    
    
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

    
    
    // Métodos abstractos utilizados en las clases hijas.
    public  double Calcular_Renta_Total(){
     return 0;   
    } 
    public double Tasa_Interes(){
        return 0;
    }
    public double Calcular_Renta_Base(){
       return 0; 
    }

}
