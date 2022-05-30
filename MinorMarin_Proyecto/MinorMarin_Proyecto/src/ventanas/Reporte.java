package ventanas;
//Importación de las librerías utilizadas en esta ventana.

import clases.Leer_Escribir_Archivos;
import java.awt.Color;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Minor
 */
public class Reporte extends javax.swing.JFrame {

    // variables que se van a utilizar por toda la clase
    boolean Aceptar_Prestamo;

  
    public Reporte() {
        initComponents();
        // Estas lineas le asigan un nombre a la ventana que se muestra y la centra en la pantalla.
        this.setTitle("Tarea 1 Minor Marin Obando");
        this.setLocationRelativeTo(null);
        //Esto le brinda a los JPanel el color deseado y la transparencia inmediatamente cuando se abre esta ventana.
        Panel_Datos_Prestamo.setBackground(new Color(246, 235, 241, 140));
        Panel_Datos_Tipo_Prestamo.setBackground(new Color(246, 235, 241, 140));
        Panel_Detalles.setBackground(new Color(246, 235, 241, 140));
        Panel_Titulo.setBackground(new Color(246, 235, 241, 140));
        this.Panel_Reporte_Boton.setBackground(new Color(246, 235, 241, 140));

        // se pone invisible el label del prestamo aprobado
        Valido_Invalido1.setVisible(false);
        Valido_Invalido2.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Datos_Prestamo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel_Reporte_Monto_Prestamo = new javax.swing.JLabel();
        jLabel_Reporte_Nombre = new javax.swing.JLabel();
        jLabel_Reporte_Meses = new javax.swing.JLabel();
        jLabel_Reporte_Edad = new javax.swing.JLabel();
        jLabel_Reporte_Identificacion = new javax.swing.JLabel();
        jLabel_Reporte_Ingreso = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel_Reporte_Primer_Apellido = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel_Reporte_Segundo_Apellido = new javax.swing.JLabel();
        Panel_Datos_Tipo_Prestamo = new javax.swing.JPanel();
        jLabel_txt_Tipo_Prestamo = new javax.swing.JLabel();
        jLabel_Reporte_Tipo_Prestamo = new javax.swing.JLabel();
        jLabel_txt_Estado_Cliente1 = new javax.swing.JLabel();
        jLabel_Reporte_Tasa_Interes = new javax.swing.JLabel();
        jLabel_txt_Estado_Cliente = new javax.swing.JLabel();
        jLabel_Reporte_Estado_Cliente = new javax.swing.JLabel();
        jLabel_txt_Cant_Productos = new javax.swing.JLabel();
        jLabel_Reporte_Cant_Productos = new javax.swing.JLabel();
        jLabel_txt_Descuento = new javax.swing.JLabel();
        jLabel_Reporte_Descuento = new javax.swing.JLabel();
        jLabel_txt_mts_Cuadrados = new javax.swing.JLabel();
        jLabel_Reporte_mts_Cuadrados = new javax.swing.JLabel();
        jLabel_txt_Cant_Empleados = new javax.swing.JLabel();
        jLabel_Reporte_Cant_Empleados = new javax.swing.JLabel();
        Panel_Detalles = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel_Reporte_Renta_Mensual = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaR_Detalles = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        Panel_Titulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel_Reporte_ID_Cotizacion = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel_Reporte_Fecha = new javax.swing.JLabel();
        Panel_Reporte_Boton = new javax.swing.JPanel();
        jButton_Regresar1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Panel_Aprobacion = new javax.swing.JPanel();
        Boton_Verificar = new javax.swing.JButton();
        Aceptar_Prestamo1 = new javax.swing.JButton();
        Valido_Invalido2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Valido_Invalido1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_Datos_Prestamo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Nombre ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Identificación");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Edad");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Ingreso Mensual");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Monto Préstamo");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Meses a Cancelar");

        jLabel_Reporte_Monto_Prestamo.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel_Reporte_Monto_Prestamo.setText("jLabel15");

        jLabel_Reporte_Nombre.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel_Reporte_Nombre.setText("jLabel11");

        jLabel_Reporte_Meses.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel_Reporte_Meses.setText("jLabel16");

        jLabel_Reporte_Edad.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel_Reporte_Edad.setText("jLabel13");

        jLabel_Reporte_Identificacion.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel_Reporte_Identificacion.setText("jLabel12");

        jLabel_Reporte_Ingreso.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel_Reporte_Ingreso.setText("jLabel14");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Primer Apellido");

        jLabel_Reporte_Primer_Apellido.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel_Reporte_Primer_Apellido.setText("jLabel11");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Segundo Apellido");

        jLabel_Reporte_Segundo_Apellido.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel_Reporte_Segundo_Apellido.setText("jLabel11");

        javax.swing.GroupLayout Panel_Datos_PrestamoLayout = new javax.swing.GroupLayout(Panel_Datos_Prestamo);
        Panel_Datos_Prestamo.setLayout(Panel_Datos_PrestamoLayout);
        Panel_Datos_PrestamoLayout.setHorizontalGroup(
            Panel_Datos_PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Datos_PrestamoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_Datos_PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel9)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(Panel_Datos_PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_Datos_PrestamoLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(Panel_Datos_PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Reporte_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Reporte_Meses, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Panel_Datos_PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel_Reporte_Ingreso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_Reporte_Monto_Prestamo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_Reporte_Segundo_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Reporte_Primer_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Reporte_Identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Reporte_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        Panel_Datos_PrestamoLayout.setVerticalGroup(
            Panel_Datos_PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Datos_PrestamoLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(Panel_Datos_PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel_Reporte_Identificacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_Datos_PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel_Reporte_Nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_Datos_PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel_Reporte_Primer_Apellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Panel_Datos_PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel_Reporte_Segundo_Apellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_Datos_PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel_Reporte_Edad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_Datos_PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel_Reporte_Ingreso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_Datos_PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel_Reporte_Monto_Prestamo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_Datos_PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel_Reporte_Meses))
                .addGap(19, 19, 19))
        );

        getContentPane().add(Panel_Datos_Prestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 430, 210));

        Panel_Datos_Tipo_Prestamo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel_txt_Tipo_Prestamo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_txt_Tipo_Prestamo.setText("Tipo Prestamo");

        jLabel_Reporte_Tipo_Prestamo.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel_Reporte_Tipo_Prestamo.setText("jLabel16");

        jLabel_txt_Estado_Cliente1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_txt_Estado_Cliente1.setText("Tasa de Interes");

        jLabel_Reporte_Tasa_Interes.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel_Reporte_Tasa_Interes.setText("jLabel16");

        jLabel_txt_Estado_Cliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_txt_Estado_Cliente.setText("Estado del Cliente");

        jLabel_Reporte_Estado_Cliente.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel_Reporte_Estado_Cliente.setText("jLabel16");

        jLabel_txt_Cant_Productos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_txt_Cant_Productos.setText("Cantidad Productos");

        jLabel_Reporte_Cant_Productos.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel_Reporte_Cant_Productos.setText("jLabel16");

        jLabel_txt_Descuento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_txt_Descuento.setText("Descuento Aplicado");

        jLabel_Reporte_Descuento.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel_Reporte_Descuento.setText("jLabel16");

        jLabel_txt_mts_Cuadrados.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_txt_mts_Cuadrados.setText("Mts Cuadrados");

        jLabel_Reporte_mts_Cuadrados.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel_Reporte_mts_Cuadrados.setText("jLabel16");

        jLabel_txt_Cant_Empleados.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_txt_Cant_Empleados.setText("Cantidad de Empleados");

        jLabel_Reporte_Cant_Empleados.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel_Reporte_Cant_Empleados.setText("jLabel16");

        javax.swing.GroupLayout Panel_Datos_Tipo_PrestamoLayout = new javax.swing.GroupLayout(Panel_Datos_Tipo_Prestamo);
        Panel_Datos_Tipo_Prestamo.setLayout(Panel_Datos_Tipo_PrestamoLayout);
        Panel_Datos_Tipo_PrestamoLayout.setHorizontalGroup(
            Panel_Datos_Tipo_PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Datos_Tipo_PrestamoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_Datos_Tipo_PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_Datos_Tipo_PrestamoLayout.createSequentialGroup()
                        .addGroup(Panel_Datos_Tipo_PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_Datos_Tipo_PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(Panel_Datos_Tipo_PrestamoLayout.createSequentialGroup()
                                    .addComponent(jLabel_txt_Cant_Productos)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel_Reporte_Cant_Productos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(Panel_Datos_Tipo_PrestamoLayout.createSequentialGroup()
                                    .addComponent(jLabel_txt_Descuento)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel_Reporte_Descuento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(Panel_Datos_Tipo_PrestamoLayout.createSequentialGroup()
                                    .addComponent(jLabel_txt_mts_Cuadrados)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel_Reporte_mts_Cuadrados, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(Panel_Datos_Tipo_PrestamoLayout.createSequentialGroup()
                                    .addComponent(jLabel_txt_Cant_Empleados)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel_Reporte_Cant_Empleados, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(Panel_Datos_Tipo_PrestamoLayout.createSequentialGroup()
                                .addComponent(jLabel_txt_Estado_Cliente)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel_Reporte_Estado_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(168, Short.MAX_VALUE))
                    .addGroup(Panel_Datos_Tipo_PrestamoLayout.createSequentialGroup()
                        .addGroup(Panel_Datos_Tipo_PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_txt_Tipo_Prestamo)
                            .addComponent(jLabel_txt_Estado_Cliente1))
                        .addGap(39, 39, 39)
                        .addGroup(Panel_Datos_Tipo_PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_Datos_Tipo_PrestamoLayout.createSequentialGroup()
                                .addComponent(jLabel_Reporte_Tasa_Interes, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel_Reporte_Tipo_Prestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        Panel_Datos_Tipo_PrestamoLayout.setVerticalGroup(
            Panel_Datos_Tipo_PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Datos_Tipo_PrestamoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_Datos_Tipo_PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_txt_Tipo_Prestamo)
                    .addComponent(jLabel_Reporte_Tipo_Prestamo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_Datos_Tipo_PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_txt_Estado_Cliente1)
                    .addComponent(jLabel_Reporte_Tasa_Interes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_Datos_Tipo_PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_txt_Estado_Cliente)
                    .addComponent(jLabel_Reporte_Estado_Cliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_Datos_Tipo_PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_txt_Cant_Productos)
                    .addComponent(jLabel_Reporte_Cant_Productos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_Datos_Tipo_PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_txt_Descuento)
                    .addComponent(jLabel_Reporte_Descuento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_Datos_Tipo_PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_txt_mts_Cuadrados)
                    .addComponent(jLabel_Reporte_mts_Cuadrados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_Datos_Tipo_PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_txt_Cant_Empleados)
                    .addComponent(jLabel_Reporte_Cant_Empleados))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(Panel_Datos_Tipo_Prestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 430, 190));

        Panel_Detalles.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Renta Mensual");

        jLabel_Reporte_Renta_Mensual.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel_Reporte_Renta_Mensual.setText("jLabel11");

        jTextAreaR_Detalles.setEditable(false);
        jTextAreaR_Detalles.setColumns(20);
        jTextAreaR_Detalles.setRows(5);
        jScrollPane1.setViewportView(jTextAreaR_Detalles);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("DETALLES ADICIONALES");

        javax.swing.GroupLayout Panel_DetallesLayout = new javax.swing.GroupLayout(Panel_Detalles);
        Panel_Detalles.setLayout(Panel_DetallesLayout);
        Panel_DetallesLayout.setHorizontalGroup(
            Panel_DetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_DetallesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(Panel_DetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_DetallesLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(150, 150, 150))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_DetallesLayout.createSequentialGroup()
                        .addComponent(jLabel_Reporte_Renta_Mensual, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116))))
            .addGroup(Panel_DetallesLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel11)
                .addContainerGap(135, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_DetallesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        Panel_DetallesLayout.setVerticalGroup(
            Panel_DetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_DetallesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addGap(5, 5, 5)
                .addComponent(jLabel_Reporte_Renta_Mensual)
                .addContainerGap())
        );

        getContentPane().add(Panel_Detalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 440, 210));

        Panel_Titulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("REPORTE PRESTAMO");

        jLabel_Reporte_ID_Cotizacion.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel_Reporte_ID_Cotizacion.setText("jLabel11");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ID Cotización");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Fecha");

        jLabel_Reporte_Fecha.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel_Reporte_Fecha.setText("jLabel11");

        javax.swing.GroupLayout Panel_TituloLayout = new javax.swing.GroupLayout(Panel_Titulo);
        Panel_Titulo.setLayout(Panel_TituloLayout);
        Panel_TituloLayout.setHorizontalGroup(
            Panel_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_TituloLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_Reporte_ID_Cotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 276, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(33, 33, 33)
                .addComponent(jLabel_Reporte_Fecha)
                .addGap(172, 172, 172))
            .addGroup(Panel_TituloLayout.createSequentialGroup()
                .addGap(335, 335, 335)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_TituloLayout.setVerticalGroup(
            Panel_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_TituloLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel_Reporte_Fecha))
                    .addGroup(Panel_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel_Reporte_ID_Cotizacion)))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        getContentPane().add(Panel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 880, 60));

        Panel_Reporte_Boton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Panel_Reporte_Boton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_Regresar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Regresar1.setText("Menu Principal");
        jButton_Regresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Regresar1ActionPerformed(evt);
            }
        });
        Panel_Reporte_Boton.add(jButton_Regresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Panel_Reporte_Boton.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 96, -1));

        getContentPane().add(Panel_Reporte_Boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, 440, 50));

        Panel_Aprobacion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Panel_Aprobacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Boton_Verificar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Boton_Verificar.setText("Verificar ");
        Boton_Verificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_VerificarActionPerformed(evt);
            }
        });
        Panel_Aprobacion.add(Boton_Verificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        Aceptar_Prestamo1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Aceptar_Prestamo1.setText("Aceptar Prestamo");
        Aceptar_Prestamo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Aceptar_Prestamo1ActionPerformed(evt);
            }
        });
        Panel_Aprobacion.add(Aceptar_Prestamo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, -1));

        Valido_Invalido2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Panel_Aprobacion.add(Valido_Invalido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 320, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Primero debe Verificar si califica para el Prestamo");
        Panel_Aprobacion.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        Valido_Invalido1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Panel_Aprobacion.add(Valido_Invalido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 230, 30));

        getContentPane().add(Panel_Aprobacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 440, 130));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Reporte.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //boton para volver al menu principal
    private void jButton_Regresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Regresar1ActionPerformed
        
        Menu_Principal ventana = new Menu_Principal();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_Regresar1ActionPerformed
    // boton para cerrar la ventana
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    //Boton para verificar si el cliente califica para el prestamo.
    private void Boton_VerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_VerificarActionPerformed

       // se crea un objeto de la clase file el cual representa un archivo.
        Leer_Escribir_Archivos archivo = new Leer_Escribir_Archivos();
        // llama al método que suma las cuotas mensuales de los préstamos que tiene activo el cliente y los guarda en una variable
        double cuotas = archivo.sumarcuotas(jLabel_Reporte_Identificacion.getText());
         // se extraen de los labels del reporte, la cuota del nuevo préstamo que está cotizando el cliente 
        //y se lo suma a las cuotas que ya tenía previamente de otros préstamos aprobados

        double Total_cuotas = cuotas + Double.parseDouble(jLabel_Reporte_Renta_Mensual.getText());
        // se extrae de los labels del reporte, el ingreso mensual del cliente 
        double Ingreso_Mensual = Double.parseDouble(jLabel_Reporte_Ingreso.getText());

        // se saca cual es el 40% del ingreso mensual del cliente 
        double porcentaje = Ingreso_Mensual * 0.40;
        // si la suma de todas las cuotas son menores o iguales al 40% del ingreso si califica para el préstamo
        if (Total_cuotas <= porcentaje) {
            this.Valido_Invalido1.setText("Puede ser Aprobado");
            Aceptar_Prestamo = true;
            Valido_Invalido1.setVisible(true);

        } else { // pero si se pasa no califica 
           
            this.Valido_Invalido1.setText("NO Puede ser Aprobado ");
            this.Valido_Invalido2.setText("   Porque es mayor al 40% del Ingreso ");

            Aceptar_Prestamo = false;
            Valido_Invalido1.setVisible(true);
            Valido_Invalido2.setVisible(true);
        }

    }//GEN-LAST:event_Boton_VerificarActionPerformed

    //Boton para aceptar el Prestamo 
    private void Aceptar_Prestamo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Aceptar_Prestamo1ActionPerformed

        // si califica entra en el if 
        if (Aceptar_Prestamo == true) {
            // se crea un objeto de la clase leer escribir archivos
            Leer_Escribir_Archivos archivo = new Leer_Escribir_Archivos();
             // se guarda en una variable los datos que se van a guardar sobre el préstamo aprobado
            String Mensaje = jLabel_Reporte_Identificacion.getText() + "/" + jLabel_Reporte_Nombre.getText() + "/" + jLabel_Reporte_Primer_Apellido.getText() + "/" + jLabel_Reporte_Segundo_Apellido.getText() + "/" + jLabel_Reporte_Tipo_Prestamo.getText() + "/" + jLabel_Reporte_Renta_Mensual.getText();
             // se llama al método que escribe los datos del préstamo aprobado, con el booleano true, para así saber
            //que es en el archivo de los datos del préstamo donde tiene que escribir

            archivo.Escribir(Mensaje, true);
            JOptionPane.showMessageDialog(null, " El Prestamo Aprobado", "ERROR", JOptionPane.ERROR_MESSAGE);
            Aceptar_Prestamo1.setEnabled(false);
            Boton_Verificar.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, " El Prestamo no puede ser Aprobado", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_Aceptar_Prestamo1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar_Prestamo1;
    private javax.swing.JButton Boton_Verificar;
    private javax.swing.JPanel Panel_Aprobacion;
    private javax.swing.JPanel Panel_Datos_Prestamo;
    private javax.swing.JPanel Panel_Datos_Tipo_Prestamo;
    private javax.swing.JPanel Panel_Detalles;
    private javax.swing.JPanel Panel_Reporte_Boton;
    private javax.swing.JPanel Panel_Titulo;
    public static javax.swing.JLabel Valido_Invalido1;
    private javax.swing.JLabel Valido_Invalido2;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton_Regresar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JLabel jLabel_Reporte_Cant_Empleados;
    public static javax.swing.JLabel jLabel_Reporte_Cant_Productos;
    public static javax.swing.JLabel jLabel_Reporte_Descuento;
    public static javax.swing.JLabel jLabel_Reporte_Edad;
    public static javax.swing.JLabel jLabel_Reporte_Estado_Cliente;
    public static javax.swing.JLabel jLabel_Reporte_Fecha;
    public static javax.swing.JLabel jLabel_Reporte_ID_Cotizacion;
    public static javax.swing.JLabel jLabel_Reporte_Identificacion;
    public static javax.swing.JLabel jLabel_Reporte_Ingreso;
    public static javax.swing.JLabel jLabel_Reporte_Meses;
    public static javax.swing.JLabel jLabel_Reporte_Monto_Prestamo;
    public static javax.swing.JLabel jLabel_Reporte_Nombre;
    public static javax.swing.JLabel jLabel_Reporte_Primer_Apellido;
    public static javax.swing.JLabel jLabel_Reporte_Renta_Mensual;
    public static javax.swing.JLabel jLabel_Reporte_Segundo_Apellido;
    public static javax.swing.JLabel jLabel_Reporte_Tasa_Interes;
    public static javax.swing.JLabel jLabel_Reporte_Tipo_Prestamo;
    public static javax.swing.JLabel jLabel_Reporte_mts_Cuadrados;
    public static javax.swing.JLabel jLabel_txt_Cant_Empleados;
    public static javax.swing.JLabel jLabel_txt_Cant_Productos;
    public static javax.swing.JLabel jLabel_txt_Descuento;
    public static javax.swing.JLabel jLabel_txt_Estado_Cliente;
    public static javax.swing.JLabel jLabel_txt_Estado_Cliente1;
    private javax.swing.JLabel jLabel_txt_Tipo_Prestamo;
    public static javax.swing.JLabel jLabel_txt_mts_Cuadrados;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextArea jTextAreaR_Detalles;
    // End of variables declaration//GEN-END:variables

}