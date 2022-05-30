package clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Minor
 */
public class Leer_Escribir_Archivos {

    // Variables que se usarán en toda la clase .
    private BufferedWriter writer;
    String LineaModificar = "";
    public List<Prestamo> ListaCliente = new <Prestamo> ArrayList();

    //Método para escribir en los archivos.
    public void Escribir(String Mensaje, boolean Clientes_Prestamos) {
        String nombre_Archivo;
        // si el parámetro que le mandó  al método es false entonces va a escribir sobre el archivo con el registro de los clientes.
        if (Clientes_Prestamos == false) {
            nombre_Archivo = "clientes_prestamos.txt";
        } else {// pero si es true entonces va a escribir sobre el archivo con el registro de los préstamos aprobados.
            nombre_Archivo = "prestamos_aprobados.txt";
        }

        try {
            // se crea un objeto de la clase file el cual representa un archivo
            File file = new File(nombre_Archivo);
            // si el archivo existe  y tiene información entonces escribe al final del archivo los datos que le mandó por parametro al metodo. 
            if (file.exists()) {
                FileWriter writer = new FileWriter(file, true);
                writer.write(Mensaje + "\n");
                writer.close();// se cierra el archivo.
            } else {
                // si el archivo no existe entonces lo crea y le guarda los datos que le mande por parámetro.
                FileWriter writer = new FileWriter(file);
                writer.write(Mensaje + "\n");
                writer.close();// se cierra el archivo
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error guardando los datos del cliente o del prestamo: " + e.getMessage());

        }
    }

    //Método para verificar las cédulas de los clientes.
    public String Verificar_ID(String ID, boolean archivo) {

        String nombre_archivo = "";
        //si el parámetro de archivo es false entonces el nombre del archivo donde va a buscar es clientes prestamos.
        if (archivo == false) {
            nombre_archivo = "clientes_prestamos.txt";
        } else { // si es true entonces nombre del archivo donde va a buscar es prestamos aprobados
            nombre_archivo = "prestamos_aprobados.txt";
        }
        // se crea un objeto de la clase file el cual representa un archivo.
        File file = new File(nombre_archivo);

        try {
            //si el archivo existe entra en el if 
            if (file.exists()) {
                // se crea un objeto del archivo para lectura
                BufferedReader Archivo = new BufferedReader(new FileReader(file));

                String linea;
                LineaModificar = "";

                boolean Linea_Encontrada = false;
                // se recorre el archivo linea a linea, mientras no sea el final del archivo y mientras la línea con el ID no se haya encontrado

                while (((linea = Archivo.readLine()) != null) && Linea_Encontrada == false) {

                    if (linea.contains(ID)) { // si se encuentra una linea que contenga el ID se copia los datos de la linea para retornarlos y se sale del while
                        LineaModificar = linea;

                        Linea_Encontrada = true;

                    } else {   // si no se encuentra ninguna línea con el ID que se buscaba entonces se retorna únicamente el ID

                        LineaModificar = ID;

                    }
                }

                Archivo.close(); // se cierra el archivo 
            }

        } catch (IOException ex) {

            JOptionPane.showMessageDialog(null, " Archivo sin datos ", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        return LineaModificar;
    }

    //Método para actualizar los datos en los archivos
    public void ActualizarDatos(String LineaModificar) {
        // se crean dos objetos de la clase file con los nombres de clientes_prestamos y uno temporal
        File file = new File("clientes_prestamos.txt");
        File inFile = new File("Temporal.txt");

        try {
            // si el archivo de clientes prestamos existe entonces entra en el if
            if (file.exists()) {
                // se crean dos objetos uno para la lectura del archivo y otro para escribir en el archivo temporal
                BufferedReader Arch_Clientes = new BufferedReader(new FileReader(file));
                PrintWriter Arch_Temporal = new PrintWriter(new FileWriter(inFile));

                String line = null;

                //se recorre el archivo linea a linea mientras no sea el final del archivo
                while ((line = Arch_Clientes.readLine()) != null) {
                    //si la línea es diferente a los datos del cliente que se le quieren modificar y los cuales se mandan al método por parámetro entonces entra en el if
                    if (!line.trim().equals(LineaModificar)) {
                        // se copian en el archivo temporal las líneas que sean diferentes a la línea con los datos que se quieran actualizar

                        Arch_Temporal.println(line);
                        Arch_Temporal.flush();
                    }
                }
                // se cierran los archivos
                Arch_Temporal.close();
                Arch_Clientes.close();

                file.delete(); // se borral el archivo de clientes prestamos 
                //y el archivo temporal se renombra a clientes prestamos
                inFile.renameTo(new File("clientes_prestamos.txt"));

            }

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, " Archivo No encontrado ", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    //Método para sumar las cuotas de los préstamos activos del cliente
    public double sumarcuotas(String ID) {
        //declaracion de variables locales del método
        String[] datos;
        String LineaModificar;
        double cuotas = 0;

        // se crea un objeto de la clase file el cual representa un archivo.
        File file = new File("prestamos_aprobados.txt");
       
        if (file.exists()){
        try {
            BufferedReader Arch_Prestamos = new BufferedReader(new FileReader(file));
           
            String linea;
            LineaModificar = "";

            
            //se recorre linea a linea el archivo mientras no sea el final del archivo
            while ((linea = Arch_Prestamos.readLine()) != null) {
                
                //si la línea contiene la cédula del cliente que está cotizando es porque tiene préstamos previamente activados por eso entra en el if
                if (linea.contains(ID)) {
                    //se guarda los datos de los préstamos aprobados del cliente
                    LineaModificar = linea;
                    datos = LineaModificar.split("/");
                    // voy sumando las cuotas de todos los préstamos que tenia el cliente previamente aprobados
                    cuotas = cuotas + Double.parseDouble(datos[5]);
                }
            }
            Arch_Prestamos.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, " Archivo No Encontrado ", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        }
        return cuotas; // retorno la suma de las couotas
    }

}//fin clase

