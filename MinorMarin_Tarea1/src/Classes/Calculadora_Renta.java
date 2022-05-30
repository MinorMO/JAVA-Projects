package Classes;

/**
 *
 * @author Minor
 */
public class Calculadora_Renta {

    //Declaración de los atributos del cliente. 
    private String identificacion;
    private String nombre;
    private int edad;
    private double ingreso_mensual;

    // Declaración de los atributos del préstamo.
    private int id_Cotizacion;
    private String fecha;
    private double monto_Prestamo;
    private int meses;

    //Constructor del objeto con los atributos del cliente.
    public Calculadora_Renta(String identificacion, String nombre, int edad, double ingreso_mensual) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.edad = edad;
        this.ingreso_mensual = ingreso_mensual;
    }
    
    //Constructor del objeto con los atributos del Préstamo.
    public Calculadora_Renta(int id_Cotizacion, String fecha, double monto_Prestamo, int meses) {
        this.id_Cotizacion = id_Cotizacion;
        this.fecha = fecha;
        this.monto_Prestamo = monto_Prestamo;
        this.meses = meses;
    }
    
    //Constructor vacio.
    public Calculadora_Renta() {
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

}
