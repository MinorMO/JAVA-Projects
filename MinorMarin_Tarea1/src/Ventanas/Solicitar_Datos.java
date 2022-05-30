/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;
//Importación de las clases utilizadas para la creación de los objetos.
import Classes.Calculadora_Renta;
import Classes.Prestamo;

//Importación de las librerías utilizadas en esta ventana.
import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Minor
 */
public class Solicitar_Datos extends javax.swing.JFrame {

    public Solicitar_Datos() {
        initComponents();
        // Estas lineas le asigan un nombre a la ventana que se muestra y la centra en la pantalla.
        this.setTitle("Tarea 1 Minor Marin Obando");
        this.setLocationRelativeTo(null);
        //Estas líneas de código son para inicializar los jTextField de la fecha y el ID de cotización cuando se muestra esta ventana.
        jTextF_ID_Cotizacion.setText("" + Prestamo.ID_Aleatorio());
        jTextF_Fecha.setText("" + Prestamo.Fecha_Actual());

        //Estas líneas de código son para inicializar los jPanels con los colores y transparencia escogidos
        //y mostrarlos inmediatamente cuando se abra esta ventana.
        jPanel_Titulo.setBackground(new Color(246, 235, 241, 140));
        jPanel_Datos_Cliente.setBackground(new Color(246, 235, 241, 140));
        jPanel_Datos_Prestamo.setBackground(new Color(246, 235, 241, 140));
        jPanel_Boton.setBackground(new Color(246, 235, 241, 140));
    }

    //Se crean los objetos con los atributos del Cliente y del Préstamo cuando esta ventana de se ejecuta.
    Calculadora_Renta Datos_Cliente = new Calculadora_Renta();
    Calculadora_Renta Datos_Prestamo = new Calculadora_Renta();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Titulo = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel_Datos_Cliente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextF_Identificacion = new javax.swing.JTextField();
        jTextF_Nombre = new javax.swing.JTextField();
        jTextF_Edad = new javax.swing.JTextField();
        jTextF_Ingreso_Mensual = new javax.swing.JTextField();
        jPanel_Datos_Prestamo = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextF_ID_Cotizacion = new javax.swing.JTextField();
        jTextF_Fecha = new javax.swing.JTextField();
        jTextF_Monto_Prestamo = new javax.swing.JTextField();
        jTextF_Meses = new javax.swing.JTextField();
        jPanel_Boton = new javax.swing.JPanel();
        jButton_Agregar_Datos = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_Titulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("DATOS DE FINANCIAMIENTO");

        javax.swing.GroupLayout jPanel_TituloLayout = new javax.swing.GroupLayout(jPanel_Titulo);
        jPanel_Titulo.setLayout(jPanel_TituloLayout);
        jPanel_TituloLayout.setHorizontalGroup(
            jPanel_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TituloLayout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(jLabel11)
                .addContainerGap(292, Short.MAX_VALUE))
        );
        jPanel_TituloLayout.setVerticalGroup(
            jPanel_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_TituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        getContentPane().add(jPanel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 4, 838, -1));

        jPanel_Datos_Cliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel_Datos_Cliente.setPreferredSize(new java.awt.Dimension(410, 275));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Identificación");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Edad");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Ingreso Mensual");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("DATOS DEL CLIENTE");

        jTextF_Identificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextF_IdentificacionKeyTyped(evt);
            }
        });

        jTextF_Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextF_NombreKeyTyped(evt);
            }
        });

        jTextF_Edad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextF_EdadKeyTyped(evt);
            }
        });

        jTextF_Ingreso_Mensual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextF_Ingreso_MensualKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel_Datos_ClienteLayout = new javax.swing.GroupLayout(jPanel_Datos_Cliente);
        jPanel_Datos_Cliente.setLayout(jPanel_Datos_ClienteLayout);
        jPanel_Datos_ClienteLayout.setHorizontalGroup(
            jPanel_Datos_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Datos_ClienteLayout.createSequentialGroup()
                .addGroup(jPanel_Datos_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_Datos_ClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel_Datos_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(jPanel_Datos_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextF_Identificacion, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                            .addComponent(jTextF_Nombre)
                            .addComponent(jTextF_Ingreso_Mensual, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextF_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_Datos_ClienteLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel5)))
                .addContainerGap())
        );
        jPanel_Datos_ClienteLayout.setVerticalGroup(
            jPanel_Datos_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Datos_ClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_Datos_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_Datos_ClienteLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1))
                    .addComponent(jTextF_Identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_Datos_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextF_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_Datos_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextF_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_Datos_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextF_Ingreso_Mensual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel_Datos_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 75, -1, 233));

        jPanel_Datos_Prestamo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel_Datos_Prestamo.setPreferredSize(new java.awt.Dimension(410, 275));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("DATOS DEL PRESTAMO");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("ID Cotización");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Fecha");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Monto Prestamo");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Meses a Cancelar");

        jTextF_ID_Cotizacion.setEditable(false);

        jTextF_Fecha.setEditable(false);

        jTextF_Monto_Prestamo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextF_Monto_PrestamoKeyTyped(evt);
            }
        });

        jTextF_Meses.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextF_MesesKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel_Datos_PrestamoLayout = new javax.swing.GroupLayout(jPanel_Datos_Prestamo);
        jPanel_Datos_Prestamo.setLayout(jPanel_Datos_PrestamoLayout);
        jPanel_Datos_PrestamoLayout.setHorizontalGroup(
            jPanel_Datos_PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Datos_PrestamoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_Datos_PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_Datos_PrestamoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(85, 85, 85))
                    .addGroup(jPanel_Datos_PrestamoLayout.createSequentialGroup()
                        .addGroup(jPanel_Datos_PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel_Datos_PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextF_ID_Cotizacion, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(jTextF_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextF_Meses, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextF_Monto_Prestamo))
                        .addContainerGap(37, Short.MAX_VALUE))))
        );
        jPanel_Datos_PrestamoLayout.setVerticalGroup(
            jPanel_Datos_PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Datos_PrestamoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(27, 27, 27)
                .addGroup(jPanel_Datos_PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextF_ID_Cotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel_Datos_PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextF_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel_Datos_PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextF_Monto_Prestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_Datos_PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextF_Meses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        getContentPane().add(jPanel_Datos_Prestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 75, -1, 233));

        jPanel_Boton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton_Agregar_Datos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Agregar_Datos.setText("Agregar Datos");
        jButton_Agregar_Datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Agregar_DatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_BotonLayout = new javax.swing.GroupLayout(jPanel_Boton);
        jPanel_Boton.setLayout(jPanel_BotonLayout);
        jPanel_BotonLayout.setHorizontalGroup(
            jPanel_BotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BotonLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jButton_Agregar_Datos)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel_BotonLayout.setVerticalGroup(
            jPanel_BotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BotonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_Agregar_Datos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel_Boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 210, 50));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 860, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Aquí se maneja todo lo que el Botón agregar datos realiza cuando el usuario le da click.
    private void jButton_Agregar_DatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Agregar_DatosActionPerformed
        // Try para capturar un posible error y que no se caiga el programa.
        try {
            //Validación de identificación para que no quede el campo vacío y que los datos no sean menores a 10.
            if (jTextF_Identificacion.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Error, Debe Ingresar una Identificación", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (jTextF_Identificacion.getText().length() < 10) {
                JOptionPane.showMessageDialog(null, "Error, Debe Ingresar los 10 numeros de la Identificación", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            //Validación de nombre para que no quede el campo vacío.
            if (jTextF_Nombre.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Error, Debe ingresar datos en el Nombre", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            //validación de edad para que no quede el campo vacío y que la edad ingresada esté en el rango establecido.
            if (jTextF_Edad.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Error, Debe ingresar datos en el Nombre", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (Integer.parseInt(jTextF_Edad.getText()) < 18 || (Integer.parseInt(jTextF_Edad.getText()) >= 100)) {
                JOptionPane.showMessageDialog(null, " La edad ingresada debe estar entre 18 y 100 años ", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            //Validación de Ingreso Mensual para que no quede el campo vacío y que el ingreso sea mayor a 0.
            if (jTextF_Ingreso_Mensual.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Error, Debe ingresar datos en el Nombre", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (Double.parseDouble(jTextF_Ingreso_Mensual.getText()) <= 0) {
                JOptionPane.showMessageDialog(null, " El Ingreso debe ser mayor que 0 ", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            //Validación del Monto Préstamo para que no quede el campo vacío y que el ingreso esté en el rango permitido.
            if (jTextF_Monto_Prestamo.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Error, Debe ingresar datos en el Nombre", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (Integer.parseInt(jTextF_Monto_Prestamo.getText()) < 300000 || (Integer.parseInt(jTextF_Monto_Prestamo.getText()) > 1500000)) {
                JOptionPane.showMessageDialog(null, " El Monto Minimo permitido del Prestamo es de 300 000 y el Maximo es de 1 500 000 ", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            //Validación de Meses para que no quede el campo vacío y que los meses sean mayor que 0.
            if (jTextF_Monto_Prestamo.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Error, Debe ingresar datos en el Nombre", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (Integer.parseInt(jTextF_Meses.getText()) <= 0) {
                JOptionPane.showMessageDialog(null, " La cantidad de Meses debe ser Mayor a 0 ", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

           //Si se diera el caso de que el usuario digita un valor alfabético en los campos donde solo pueden ingresar números
           //el catch captura el error y muestra un mensaje en pantalla.
        } catch (NumberFormatException er) {
            JOptionPane.showMessageDialog(null, " Solo se puede Ingresar Valores Numericos en los siguientes datos: \n Edad, Ingreso MEnsual, Monto Prestamo, Meses ", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        /* Todos los "return" utilizados en los "if" y en el "catch", se aseguran de que si se presenta un error 
           debido a las condiciones establecidas en los if o porque se capturó un error, el programa no siga avanzando, 
           y así el usuario tenga que corregir el dato para que el programa avance*/

        //Si todos los datos son correctos entonces el código continúa y  estos datos son enviados como atributos por medio de los constructores de cada objeto.
        Datos_Cliente = new Calculadora_Renta(jTextF_Identificacion.getText(), jTextF_Nombre.getText(), Integer.parseInt(jTextF_Edad.getText()), Double.parseDouble(jTextF_Ingreso_Mensual.getText()));
        Datos_Prestamo = new Calculadora_Renta(Integer.parseInt(jTextF_ID_Cotizacion.getText()), jTextF_Fecha.getText(), Double.parseDouble(jTextF_Monto_Prestamo.getText()), Integer.parseInt(jTextF_Meses.getText()));
        
        //Se llama al método que envía los atributos de cada objeto así como el cálculo de la renta mensual a otra ventana para generar un Reporte.
        Enviar_Datos();  
    }//GEN-LAST:event_jButton_Agregar_DatosActionPerformed

    //Método que envía los atributos de cada objeto así como el cálculo de la renta mensual a otra ventana para generar un Reporte.
    public void Enviar_Datos() {
        //Estas líneas de codigo crean un objeto del jFrameForm donde se crea el reporte del financiamiento
        //luego la muestra esa ventana y cierra esta.
        Reporte ventana_reporte = new Reporte();
        ventana_reporte.setVisible(true);
        this.dispose();

        //Estas líneas muestran en los jLabel que les corresponden los datos del cliente y del préstamo
        //así como el cálculo de la renta del posible financiamiento para generar un reporte.
        Reporte.jLabel_Reporte_Identificacion.setText("" + Datos_Cliente.getIdentificacion());
        Reporte.jLabel_Reporte_Nombre.setText("" + Datos_Cliente.getNombre());
        Reporte.jLabel_Reporte_Edad.setText("" + Datos_Cliente.getEdad());
        Reporte.jLabel_Reporte_Ingreso.setText("" + Datos_Cliente.getIngreso_mensual());
        Reporte.jLabel_Reporte_ID_Cotizacion.setText("" + Datos_Prestamo.getId_Cotizacion());
        Reporte.jLabel_Reporte_Fecha.setText("" + Datos_Prestamo.getFecha());
        Reporte.jLabel_Reporte_Monto_Prestamo.setText("" + Datos_Prestamo.getMonto_Prestamo());
        Reporte.jLabel_Reporte_Meses.setText("" + Datos_Prestamo.getMeses());
        //Con esta línea de código se le da formato al valor de la renta mensual para que solo muestre 2 decimales en el reporte.
        DecimalFormat decimal = new DecimalFormat("#.00");
        Reporte.jLabel_Reporte_Renta_Mensual.setText("" + String.valueOf(decimal.format(Prestamo.Calcular_Renta_Total(Datos_Prestamo.getMonto_Prestamo(), Datos_Prestamo.getMeses()))));
    }

    //Método que Restringe los caracteres especiales basado en su representación en código ASCII
    public void RestringirCaracteres(java.awt.event.KeyEvent caracter) {
        if (caracter.getKeyChar() >= 33 && caracter.getKeyChar() <= 47
                || caracter.getKeyChar() >= 58 && caracter.getKeyChar() <= 64
                || caracter.getKeyChar() >= 91 && caracter.getKeyChar() <= 96
                || caracter.getKeyChar() >= 123 && caracter.getKeyChar() <= 208
                || caracter.getKeyChar() >= 210 && caracter.getKeyChar() <= 240
                || caracter.getKeyChar() >= 242 && caracter.getKeyChar() <= 8482) {
            
            // si esta el rango establecido, entonces, se desecha el dato ingresado por el usuario y se muestra el mensaje del JPotionPane.
            caracter.consume();
            JOptionPane.showMessageDialog(null, "No se permiten caracteres especiales ");
        }
    }
    //Método que que valida que solo se ingresen números enteros. 
    public void Validar_Solo_Numeros_Enteros(java.awt.event.KeyEvent caracter2) {
        // Sino esta el rango establecido, entonces, se desecha el dato ingresado por el usuario y se muestra el mensaje del JPotionPane.
        if ((caracter2.getKeyChar() < '0' || caracter2.getKeyChar() > '9') & (caracter2.getKeyChar() != '\b')) {
            caracter2.consume();
            JOptionPane.showMessageDialog(null, "Debe Ingresar solo Numeros");
        }
    }
    //Método que que valida que solo se ingresen Números ya sea enteros o con decimales.
    public void Validar_Solo_Numeros_y_Decimales(java.awt.event.KeyEvent caracter3) {
        // Sino esta el rango establecido, entonces, se desecha el dato ingresado por el usuario y se muestra el mensaje del JPotionPane.
        if ((caracter3.getKeyChar() < '0' || caracter3.getKeyChar() > '9') && (caracter3.getKeyChar() != '\b') && caracter3.getKeyChar() != '.') {
            caracter3.consume();
            JOptionPane.showMessageDialog(null, "Debe Ingresar solo Numeros");
        }
    }
    
    // De aquí en adelante se generan 6 eventos del tipo KeyTyped para los jTextField donde el usuario puede ingresar datos.
    private void jTextF_IdentificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextF_IdentificacionKeyTyped
        // llama al método que restringe los caracteres especiales.
        RestringirCaracteres(evt);
        if (jTextF_Identificacion.getText().length() >= 10) {
            // si el rango se excede cuando se ingresa la identificación se muestra un mensaje y se desecha el dato de la tecla que presiono el usuario.
            JOptionPane.showMessageDialog(null, " Ha excedido el limite de numeros de la Identificacion", "ERROR", JOptionPane.ERROR_MESSAGE);
            evt.consume();
        }
    }//GEN-LAST:event_jTextF_IdentificacionKeyTyped


    private void jTextF_NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextF_NombreKeyTyped
        // Llama al método que restringe los caracteres especiales.
        RestringirCaracteres(evt);
        //Si se ingresan valores numéricos en en el nombre se muestra un mensaje y se desecha el dato de la tecla que presiono el usuario.
        char validar = evt.getKeyChar();
        if (!(validar < '0' || validar > '9') & (validar != '\b')) {
            JOptionPane.showMessageDialog(null, "Debe Ingresar solo letras");
            evt.consume();
        }

        // Si el rango de caracteres excede el rango establecido se muestra un mensaje y se desecha el dato de la tecla que presiono el usuario.
        if (jTextF_Nombre.getText().length() >= 50) {
            JOptionPane.showMessageDialog(null, " Solo se permiten 50 Caracteres en el Nombre", "ERROR", JOptionPane.ERROR_MESSAGE);
            evt.consume();
        }
    }//GEN-LAST:event_jTextF_NombreKeyTyped

    private void jTextF_EdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextF_EdadKeyTyped
        //Llama al método que solo permite que se ingresen valores númericos del tipo entero.
        Validar_Solo_Numeros_Enteros(evt);
    }//GEN-LAST:event_jTextF_EdadKeyTyped

    private void jTextF_Ingreso_MensualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextF_Ingreso_MensualKeyTyped
        //Llama al método que solo permite que se ingresen valores númericos del tipo entero o con decimales.
        Validar_Solo_Numeros_y_Decimales(evt);
    }//GEN-LAST:event_jTextF_Ingreso_MensualKeyTyped

    private void jTextF_Monto_PrestamoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextF_Monto_PrestamoKeyTyped
        //Llama al método que solo permite que se ingresen valores númericos del tipo entero o con decimales.
        Validar_Solo_Numeros_y_Decimales(evt);
    }//GEN-LAST:event_jTextF_Monto_PrestamoKeyTyped

    private void jTextF_MesesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextF_MesesKeyTyped
        //Llama al método que solo permite que se ingresen valores númericos del tipo entero.
        Validar_Solo_Numeros_Enteros(evt);
    }//GEN-LAST:event_jTextF_MesesKeyTyped

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Agregar_Datos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JPanel jPanel_Boton;
    private javax.swing.JPanel jPanel_Datos_Cliente;
    private javax.swing.JPanel jPanel_Datos_Prestamo;
    private javax.swing.JPanel jPanel_Titulo;
    private javax.swing.JTextField jTextF_Edad;
    private javax.swing.JTextField jTextF_Fecha;
    private javax.swing.JTextField jTextF_ID_Cotizacion;
    private javax.swing.JTextField jTextF_Identificacion;
    private javax.swing.JTextField jTextF_Ingreso_Mensual;
    private javax.swing.JTextField jTextF_Meses;
    private javax.swing.JTextField jTextF_Monto_Prestamo;
    private javax.swing.JTextField jTextF_Nombre;
    // End of variables declaration//GEN-END:variables
}
