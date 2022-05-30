package ventanas;
//Importación de las clases utilizadas para la creación de los objetos.

import clases.Leer_Escribir_Archivos;
import clases.Prestamo;
import clases.Prestamo_Personal;
import clases.Prestamo_Pymes;
import clases.Prestamo_Vivienda;

//Importación de las librerías utilizadas en esta ventana.
import java.awt.Color;
import java.io.File;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;


/**
 *
 * @author Minor
 */
public class Cotizar extends javax.swing.JFrame {
// variables que se van a utilizar en toda la clase

    boolean Validacion = false;
    String Datos_Archivo = "";

    public Cotizar() {
        initComponents();
        // Estas lineas le asigan un nombre a la ventana que se muestra y la centra en la pantalla.
        this.setTitle("Proyecto Final Minor Marin Obando");
        this.setLocationRelativeTo(null);
        //se deshabilitan los botones de cotizar y limpiar los datos
        Boton_Cotizar.setEnabled(false);
        Limpiar_Datos.setEnabled(false);

        //Estas líneas de código son para inicializar los jTextField de la fecha y el ID de cotización cuando se muestra esta ventana.
        jTextF_ID_Cotizacion.setText("" + Prestamo.ID_Aleatorio());
        jTextF_Fecha.setText("" + Prestamo.Fecha_Actual());

        //Estas líneas de código son para inicializar diferentes congifuraciones a los paneles cuando se ejecuta la ventana.
        //y mostrarlos inmediatamente cuando se abra esta ventana.
        jPanel_Titulo.setBackground(new Color(246, 235, 241, 140));
        jPanel_Datos_Cliente.setBackground(new Color(246, 235, 241, 140));
        jPanel_Datos_Prestamo.setBackground(new Color(246, 235, 241, 140));
        jPanel_Boton.setBackground(new Color(246, 235, 241, 140));
        jPanel_Tipo_Prestamo.setBackground(new Color(246, 235, 241, 140));

        // Para ocultar los panes donde se ingresan los datos de los tipo de prestamo.
        jPanel_Prestamo_Personal.setVisible(false);
        jPanel_Prestamo_Vivienda.setVisible(false);
        jPanel_Prestamo_Pymes.setVisible(false);
        jLabel_Gif_Pymes.setVisible(false);
        jLabel_Gif_Vivienda.setVisible(false);
        jLabel_Gif_Personal.setVisible(false);

        //se deshabilitan  el combo box y los jtextfield relacionados con el prestamo a cotizar 
        jTextF_Monto_Prestamo.setEditable(false);
        jTextF_Meses.setEditable(false);
        jComboBox_Tipo_Prestamos.setEnabled(false);

        // Para mostrar un tamaño especifo para el pane del tipo de prestamo.
        jPanel_Tipo_Prestamo.setBounds(410, 58, 389, 250);
        setLayout(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
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
        jButton_Verificar_ID = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jTextF_Primer_Apellido = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextF_Segundo_Apellido = new javax.swing.JTextField();
        Limpiar_Datos = new javax.swing.JButton();
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
        jTextF_Monto_Valido = new javax.swing.JTextField();
        jPanel_Tipo_Prestamo = new javax.swing.JPanel();
        jComboBox_Tipo_Prestamos = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jPanel_Prestamo_Personal = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jRadioB_Activo = new javax.swing.JRadioButton();
        jRadioB_Nuevo = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jTextF_Cant_Productos = new javax.swing.JTextField();
        jPanel_Prestamo_Pymes = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jTextF_Cant_Empleados = new javax.swing.JTextField();
        jPanel_Boton = new javax.swing.JPanel();
        Boton_Cotizar = new javax.swing.JButton();
        jButton_Volver_Menu = new javax.swing.JButton();
        jPanel_Prestamo_Vivienda = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jTextF_Metros2 = new javax.swing.JTextField();
        jLabel_Gif_Vivienda = new javax.swing.JLabel();
        jLabel_Gif_Pymes = new javax.swing.JLabel();
        jLabel_Gif_Personal = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
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
                .addContainerGap(244, Short.MAX_VALUE))
        );
        jPanel_TituloLayout.setVerticalGroup(
            jPanel_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_TituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        getContentPane().add(jPanel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 4, 790, -1));

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

        jTextF_Nombre.setEditable(false);

        jTextF_Edad.setEditable(false);

        jTextF_Ingreso_Mensual.setEditable(false);

        jButton_Verificar_ID.setText("Verificar ID");
        jButton_Verificar_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Verificar_IDActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Primer Apellido");

        jTextF_Primer_Apellido.setEditable(false);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Segundo Apellido");

        jTextF_Segundo_Apellido.setEditable(false);

        Limpiar_Datos.setText("Limpar Datos");
        Limpiar_Datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Limpiar_DatosActionPerformed(evt);
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
                        .addComponent(jLabel1))
                    .addGroup(jPanel_Datos_ClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel_Datos_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_Datos_ClienteLayout.createSequentialGroup()
                                .addGroup(jPanel_Datos_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel_Datos_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextF_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextF_Ingreso_Mensual, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel_Datos_ClienteLayout.createSequentialGroup()
                                .addGroup(jPanel_Datos_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel_Datos_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel_Datos_ClienteLayout.createSequentialGroup()
                                        .addComponent(jButton_Verificar_ID)
                                        .addGap(18, 18, 18)
                                        .addComponent(Limpiar_Datos))
                                    .addGroup(jPanel_Datos_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextF_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(jTextF_Primer_Apellido)
                                        .addComponent(jTextF_Identificacion)
                                        .addComponent(jTextF_Segundo_Apellido))))))
                    .addGroup(jPanel_Datos_ClienteLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel5)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel_Datos_ClienteLayout.setVerticalGroup(
            jPanel_Datos_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Datos_ClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(15, 15, 15)
                .addGroup(jPanel_Datos_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextF_Identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_Datos_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Verificar_ID)
                    .addComponent(Limpiar_Datos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_Datos_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextF_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel_Datos_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextF_Primer_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel_Datos_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jTextF_Segundo_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_Datos_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextF_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_Datos_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextF_Ingreso_Mensual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel_Datos_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 390, 250));

        jPanel_Datos_Prestamo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel_Datos_Prestamo.setPreferredSize(new java.awt.Dimension(410, 275));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("DATOS DEL PRESTAMO");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("ID Cotización");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Fecha");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Monto Préstamo");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Meses a Cancelar");

        jTextF_ID_Cotizacion.setEditable(false);

        jTextF_Fecha.setEditable(false);

        jTextF_Monto_Prestamo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextF_Monto_PrestamoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextF_Monto_PrestamoKeyTyped(evt);
            }
        });

        jTextF_Meses.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextF_MesesKeyTyped(evt);
            }
        });

        jTextF_Monto_Valido.setEditable(false);

        javax.swing.GroupLayout jPanel_Datos_PrestamoLayout = new javax.swing.GroupLayout(jPanel_Datos_Prestamo);
        jPanel_Datos_Prestamo.setLayout(jPanel_Datos_PrestamoLayout);
        jPanel_Datos_PrestamoLayout.setHorizontalGroup(
            jPanel_Datos_PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Datos_PrestamoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_Datos_PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_Datos_PrestamoLayout.createSequentialGroup()
                        .addGroup(jPanel_Datos_PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel_Datos_PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextF_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextF_ID_Cotizacion, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(jTextF_Monto_Prestamo)
                            .addComponent(jTextF_Meses, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextF_Monto_Valido))
                        .addContainerGap(17, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_Datos_PrestamoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(85, 85, 85))))
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
                .addGap(18, 18, 18)
                .addGroup(jPanel_Datos_PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextF_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel_Datos_PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextF_Monto_Prestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextF_Monto_Valido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel_Datos_PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextF_Meses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanel_Datos_Prestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 390, 233));

        jPanel_Tipo_Prestamo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jComboBox_Tipo_Prestamos.setEditable(true);
        jComboBox_Tipo_Prestamos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox_Tipo_Prestamos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione un Tipo", "Personal", "Vivienda", "Pymes" }));
        jComboBox_Tipo_Prestamos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_Tipo_PrestamosItemStateChanged(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("TIPO DE PRESTAMO");

        jPanel_Prestamo_Personal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Tipo Cliente ");

        buttonGroup1.add(jRadioB_Activo);
        jRadioB_Activo.setText("Activo");

        buttonGroup1.add(jRadioB_Nuevo);
        jRadioB_Nuevo.setText("Nuevo");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Cantidad de Productos");

        jTextF_Cant_Productos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextF_Cant_ProductosKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel_Prestamo_PersonalLayout = new javax.swing.GroupLayout(jPanel_Prestamo_Personal);
        jPanel_Prestamo_Personal.setLayout(jPanel_Prestamo_PersonalLayout);
        jPanel_Prestamo_PersonalLayout.setHorizontalGroup(
            jPanel_Prestamo_PersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Prestamo_PersonalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_Prestamo_PersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_Prestamo_PersonalLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioB_Activo)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioB_Nuevo))
                    .addGroup(jPanel_Prestamo_PersonalLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(jTextF_Cant_Productos, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel_Prestamo_PersonalLayout.setVerticalGroup(
            jPanel_Prestamo_PersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Prestamo_PersonalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_Prestamo_PersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jRadioB_Activo)
                    .addComponent(jRadioB_Nuevo))
                .addGap(18, 18, 18)
                .addGroup(jPanel_Prestamo_PersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(jTextF_Cant_Productos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel_Prestamo_Pymes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Cantidad de empleados ");

        jTextF_Cant_Empleados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextF_Cant_EmpleadosKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel_Prestamo_PymesLayout = new javax.swing.GroupLayout(jPanel_Prestamo_Pymes);
        jPanel_Prestamo_Pymes.setLayout(jPanel_Prestamo_PymesLayout);
        jPanel_Prestamo_PymesLayout.setHorizontalGroup(
            jPanel_Prestamo_PymesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Prestamo_PymesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(jTextF_Cant_Empleados, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_Prestamo_PymesLayout.setVerticalGroup(
            jPanel_Prestamo_PymesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_Prestamo_PymesLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel_Prestamo_PymesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextF_Cant_Empleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        jPanel_Boton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Boton_Cotizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Boton_Cotizar.setText("Cotizar");
        Boton_Cotizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_CotizarActionPerformed(evt);
            }
        });

        jButton_Volver_Menu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Volver_Menu.setText("Volver Menú");
        jButton_Volver_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Volver_MenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_BotonLayout = new javax.swing.GroupLayout(jPanel_Boton);
        jPanel_Boton.setLayout(jPanel_BotonLayout);
        jPanel_BotonLayout.setHorizontalGroup(
            jPanel_BotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BotonLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(Boton_Cotizar)
                .addGap(18, 18, 18)
                .addComponent(jButton_Volver_Menu)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel_BotonLayout.setVerticalGroup(
            jPanel_BotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BotonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_BotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton_Cotizar)
                    .addComponent(jButton_Volver_Menu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel_Prestamo_Vivienda.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText(" Mts cuadrados");

        jTextF_Metros2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextF_Metros2KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel_Prestamo_ViviendaLayout = new javax.swing.GroupLayout(jPanel_Prestamo_Vivienda);
        jPanel_Prestamo_Vivienda.setLayout(jPanel_Prestamo_ViviendaLayout);
        jPanel_Prestamo_ViviendaLayout.setHorizontalGroup(
            jPanel_Prestamo_ViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Prestamo_ViviendaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(jTextF_Metros2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_Prestamo_ViviendaLayout.setVerticalGroup(
            jPanel_Prestamo_ViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Prestamo_ViviendaLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel_Prestamo_ViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextF_Metros2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_Tipo_PrestamoLayout = new javax.swing.GroupLayout(jPanel_Tipo_Prestamo);
        jPanel_Tipo_Prestamo.setLayout(jPanel_Tipo_PrestamoLayout);
        jPanel_Tipo_PrestamoLayout.setHorizontalGroup(
            jPanel_Tipo_PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_Tipo_PrestamoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(92, 92, 92))
            .addGroup(jPanel_Tipo_PrestamoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_Tipo_PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_Prestamo_Personal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_Prestamo_Pymes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_Prestamo_Vivienda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel_Tipo_PrestamoLayout.createSequentialGroup()
                .addGroup(jPanel_Tipo_PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_Tipo_PrestamoLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jComboBox_Tipo_Prestamos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_Tipo_PrestamoLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jPanel_Boton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_Tipo_PrestamoLayout.setVerticalGroup(
            jPanel_Tipo_PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Tipo_PrestamoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox_Tipo_Prestamos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel_Prestamo_Personal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_Prestamo_Vivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_Prestamo_Pymes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_Boton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel_Tipo_Prestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 380, 420));

        jLabel_Gif_Vivienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Casa_GIF.gif"))); // NOI18N
        getContentPane().add(jLabel_Gif_Vivienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 490, 80, 40));

        jLabel_Gif_Pymes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Pymes_GIF.gif"))); // NOI18N
        getContentPane().add(jLabel_Gif_Pymes, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 490, 80, 40));

        jLabel_Gif_Personal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Personal_GIF.gif"))); // NOI18N
        getContentPane().add(jLabel_Gif_Personal, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, 80, 40));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/prestamos.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Boton que realiza la cotizacion del préstamo.
    private void Boton_CotizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_CotizarActionPerformed
        //se llama a la función que verifica los Jtexfild relacionados con el préstamo
        Verificar_JtextFild();
        // si las validaciones son correctas entra en el if
        if (Validacion == true) {

            // Dependiendo de la opción del tipo de préstamo seleccionado va a entrar en los diferentes case del switch.
            switch (jComboBox_Tipo_Prestamos.getSelectedIndex()) {
                case 0: // Si entra en esta opción es porque no selecciono ninguna opcion, por ende se despliega un mensaje de error.
                    JOptionPane.showMessageDialog(null, " Debe Selecionar un Tipo de Préstamo ", "ERROR", JOptionPane.ERROR_MESSAGE);
                    break;

                case 1: // Opción Préstamo Personal.
                    // Try para capturar un posible error y que no se caiga el programa.
                    try {
                        //Validación de la cantidad de productos para que no quede el campo vacío y que los datos sean mayores que cero.
                        if (jTextF_Cant_Productos.getText().trim().equals("")) {
                            JOptionPane.showMessageDialog(null, "Error, Debe ingresar datos en la Cantidad de Productos", "ERROR", JOptionPane.ERROR_MESSAGE);
                            return;
                        } else if (Integer.parseInt(jTextF_Cant_Productos.getText()) <= 0) {
                            JOptionPane.showMessageDialog(null, " La cantidad de Productos debe ser mayor que 0 ", "ERROR", JOptionPane.ERROR_MESSAGE);
                            return;
                        }

                        //Si todos los datos ingresados por el usuario son correctos se mandan a la clase hija y a la padre a través de los objetos con constructores sobrecargados.
                        Prestamo_Personal datos_Prestamo_P = new Prestamo_Personal(jRadioB_Activo.isSelected(), Integer.parseInt(jTextF_Cant_Productos.getText()), Integer.parseInt(jTextF_ID_Cotizacion.getText()), jTextF_Fecha.getText(), Double.parseDouble(jTextF_Monto_Prestamo.getText()), Integer.parseInt(jTextF_Meses.getText()));

                        // Se muestra la ventana del reporte del préstamo y se cierra la ventana de ingresar los datos.
                        Reporte Ventana = new Reporte();
                        this.dispose();
                        Ventana.setVisible(true);

                        // Con un operador ternario se determina si el cliente es activo o nuevo y se muestra en el reporte.
                        String estado_Cliente = (jRadioB_Activo.isSelected()) ? "Activo" : "Nuevo";

                        // como los jtexfild se los datos del cliente se llenan automaticamente con los datos del cliente registrados en el archivo
                        //cuando le doy a verificar ID entonces se los mando a los label correspondientes de la ventana reporte
                        Reporte.jLabel_Reporte_Identificacion.setText("" + jTextF_Identificacion.getText());
                        Reporte.jLabel_Reporte_Nombre.setText("" + jTextF_Nombre.getText());
                        Reporte.jLabel_Reporte_Primer_Apellido.setText("" + jTextF_Primer_Apellido.getText());
                        Reporte.jLabel_Reporte_Segundo_Apellido.setText("" + jTextF_Segundo_Apellido.getText());
                        Reporte.jLabel_Reporte_Edad.setText("" + jTextF_Edad.getText());
                        Reporte.jLabel_Reporte_Ingreso.setText("" + jTextF_Ingreso_Mensual.getText());

                        // A través del objeto que se crearon arriba de la clase hija Prestamo_Personal se van asignando 
                        //los datos a los label correspondientes de la ventana del reporte del préstamo.
                        Reporte.jLabel_Reporte_ID_Cotizacion.setText("" + datos_Prestamo_P.getId_Cotizacion());
                        Reporte.jLabel_Reporte_Fecha.setText("" + datos_Prestamo_P.getFecha());
                        Reporte.jLabel_Reporte_Monto_Prestamo.setText("" + datos_Prestamo_P.getMonto_Prestamo());
                        Reporte.jLabel_Reporte_Meses.setText("" + datos_Prestamo_P.getMeses());
                        Reporte.jLabel_Reporte_Tipo_Prestamo.setText("Personal");
                        Reporte.jLabel_Reporte_Estado_Cliente.setText("" + estado_Cliente);
                        Reporte.jLabel_Reporte_Cant_Productos.setText("" + datos_Prestamo_P.getCant_Productos());

                        // Se crea un objeto del para darle formato a los decimales que se quieren mostrar. 
                        DecimalFormat decimal = new DecimalFormat("#");// En este caso no se quiere que el descuento y la tasa de interes se muestre con decimales.

                        Reporte.jLabel_Reporte_Tasa_Interes.setText("" + String.valueOf(decimal.format(datos_Prestamo_P.Tasa_Interes() * 100)) + " %");
                        if (jRadioB_Activo.isSelected()){
                        Reporte.jLabel_Reporte_Descuento.setText("" + String.valueOf(decimal.format(datos_Prestamo_P.Descuento_Aplicado() * 100)) + " %");
                        }else {
                            Reporte.jLabel_Reporte_Descuento.setText("0%");
                        }
                        // Con esta línea de código se le da formato al valor de la renta mensual para que solo muestre 2 decimales en el reporte.
                        decimal = new DecimalFormat("#.00");
                        Reporte.jLabel_Reporte_Renta_Mensual.setText("" + String.valueOf(decimal.format(datos_Prestamo_P.Calcular_Renta_Total())));
                        // como es la clase Prestamo_Personal se ocultan los label que son utilizados para los otros tipos de prestamos
                        Reporte.jLabel_txt_Cant_Empleados.setVisible(false);
                        Reporte.jLabel_Reporte_Cant_Empleados.setVisible(false);
                        Reporte.jLabel_txt_mts_Cuadrados.setVisible(false);
                        Reporte.jLabel_Reporte_mts_Cuadrados.setVisible(false);

                        //decimal = new DecimalFormat("#.00");
                        // Estas líneas de código es para mostrar más detalles del préstamo y si se le aplicó descuento o no y cuanto es a lo que equivale el descuento que se le rebajara de la cuota mensual.
                        if (jRadioB_Activo.isSelected()) {
                            Reporte.jTextAreaR_Detalles.setText(" El Cliente es Activo\n" + "Aplica Descuento a la Couta Mensual debido la Cantidad de Productos \n" + "1 a 5 | 1%\n" + "6 o más | 3%\n"
                                    + "La cantidad de productos del cliente es de : " + datos_Prestamo_P.getCant_Productos() + "\n" + "Se le Rebajara de la Couta Mensual " + String.valueOf(decimal.format(datos_Prestamo_P.Cantidad_Descuento())));
                        } else {
                            Reporte.jTextAreaR_Detalles.setText("El Cliente es Nuevo\n " + "No Aplica Descuento");
                        }

                    } catch (NumberFormatException er) { // Si salta un error se captura y se muestra un mensaje de error.
                        JOptionPane.showMessageDialog(null, " Solo se puede Ingresar Valores Numericos en la Cantidad de Productos ", "ERROR", JOptionPane.ERROR_MESSAGE);
                        return; // Si salta el error entonces el return permite que no pase a la siguiente ventana hasta que se corrija.
                    }
                    break; // Fin del case 1.

                case 2: // Préstamo vivienda.
                    // Try para capturar un posible error y que no se caiga el programa.
                    try {
                        //Validación de la cantidad de metros para que no quede el campo vacío y que los datos sean mayores que cero.
                        if (jTextF_Metros2.getText().trim().equals("")) {
                            JOptionPane.showMessageDialog(null, "Error, Debe ingresar datos en la Cantidad de Metros Cuadrados", "ERROR", JOptionPane.ERROR_MESSAGE);
                            return;
                        } else if (Integer.parseInt(jTextF_Metros2.getText()) <= 0) {
                            JOptionPane.showMessageDialog(null, " La cantidad de Metros Cuadrados debe ser mayor que 0 ", "ERROR", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        // Si todos los datos ingresados por el usuario son correctos se mandan a la clase hija Préstamo Vivienda y a la padre a través de los objetos con constructores sobrecargados.
                        Prestamo_Vivienda datos_Prestamo_V = new Prestamo_Vivienda(Integer.parseInt(jTextF_Metros2.getText()), Integer.parseInt(jTextF_ID_Cotizacion.getText()), jTextF_Fecha.getText(), Double.parseDouble(jTextF_Monto_Prestamo.getText()), Integer.parseInt(jTextF_Meses.getText()));
                        // Se muestra la ventana del reporte del préstamo y se cierra la ventana de ingresar los datos.
                        Reporte Ventana = new Reporte();
                        dispose();
                        Ventana.setVisible(true);

                        // como los jtexfild se los datos del cliente se llenan automaticamente con los datos del cliente registrados en el archivo
                        //cuando le doy a verificar ID entonces se los mando a los label correspondientes de la ventana reporte
                        Reporte.jLabel_Reporte_Identificacion.setText("" + jTextF_Identificacion.getText());
                        Reporte.jLabel_Reporte_Nombre.setText("" + jTextF_Nombre.getText());
                        Reporte.jLabel_Reporte_Primer_Apellido.setText("" + jTextF_Primer_Apellido.getText());
                        Reporte.jLabel_Reporte_Segundo_Apellido.setText("" + jTextF_Segundo_Apellido.getText());
                        Reporte.jLabel_Reporte_Edad.setText("" + jTextF_Edad.getText());
                        Reporte.jLabel_Reporte_Ingreso.setText("" + jTextF_Ingreso_Mensual.getText());

                        // A través de los objetos que se crearon arriba de la clase hija Préstamo_Vivienda se van asignando 
                        //los datos a los label correspondientes de la ventana del reporte del préstamo.
                        Reporte.jLabel_Reporte_ID_Cotizacion.setText("" + datos_Prestamo_V.getId_Cotizacion());
                        Reporte.jLabel_Reporte_Fecha.setText("" + datos_Prestamo_V.getFecha());
                        Reporte.jLabel_Reporte_Monto_Prestamo.setText("" + datos_Prestamo_V.getMonto_Prestamo());
                        Reporte.jLabel_Reporte_Meses.setText("" + datos_Prestamo_V.getMeses());
                        Reporte.jLabel_Reporte_mts_Cuadrados.setText("" + datos_Prestamo_V.getMts_cuadrados());
                        Reporte.jLabel_Reporte_Tipo_Prestamo.setText("Vivienda");

                        // Se crea un objeto del para darle formato a los decimales que se quieren mostrar.
                        DecimalFormat decimal = new DecimalFormat("#.00");
                        Reporte.jLabel_Reporte_Tasa_Interes.setText("" + String.valueOf(decimal.format(datos_Prestamo_V.Tasa_Interes() * 100)) + " %");

                        // Con esta línea de código se le da formato al valor de la renta mensual para que solo muestre 2 decimales en el reporte.
                        decimal = new DecimalFormat("#.00");
                        Reporte.jLabel_Reporte_Renta_Mensual.setText("" + String.valueOf(decimal.format(datos_Prestamo_V.Calcular_Renta_Total())));

                        // Estas líneas de código es para mostrar más detalles del préstamo y si se le aplicó cobro demás o no por pasarse de metros y cuanto se le aumentara a la cuota mensual.
                        if (Integer.parseInt(jTextF_Metros2.getText()) > 500) {
                            Reporte.jTextAreaR_Detalles.setText("Despues de 500mts se Aplica un Cobro Extra\n" + "Costo Extra por cada metro cuadrado ¢25\n"
                                    + " Se paso de 500mts " + datos_Prestamo_V.getMts_cuadrados() + "\n" + "Total Metros Cuadrados" + (datos_Prestamo_V.getMts_cuadrados() - 500) + "\n"
                                    + "Total Extra a Pagar en la Couta Mensual : " + datos_Prestamo_V.Mts_Cuadrados_Demas());

                        } else {
                            Reporte.jTextAreaR_Detalles.setText("Despues de 500mts se Aplica un Cobro Extra\n" + "Costo Extra por cada metro cuadrado ¢25\n" + "Total Metros Cuadrados " + datos_Prestamo_V.getMts_cuadrados() + "\n"
                                    + "Los Metros Cuadrados No Exeden los 500mts\n" + "No se Cobrara Ningun Coste Extra");
                        }

                        // Como es la clase Prestamo_Vivienda se ocultan los label que son utilizados para los otros tipos de prestamos
                        Reporte.jLabel_txt_Cant_Empleados.setVisible(false);
                        Reporte.jLabel_Reporte_Cant_Empleados.setVisible(false);
                        Reporte.jLabel_txt_Cant_Productos.setVisible(false);
                        Reporte.jLabel_Reporte_Cant_Productos.setVisible(false);
                        Reporte.jLabel_txt_Estado_Cliente.setVisible(false);
                        Reporte.jLabel_Reporte_Estado_Cliente.setVisible(false);
                        Reporte.jLabel_Reporte_Descuento.setVisible(false);
                        Reporte.jLabel_txt_Descuento.setVisible(false);

                        // Si salta un error se captura y se muestra un mensaje de error.
                    } catch (NumberFormatException er) {
                        JOptionPane.showMessageDialog(null, " Solo se puede Ingresar Valores Numericos en los Metros Cuadrados ", "ERROR", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    break;// Fin del case 2.

                case 3: // Préstamo Pymes.
                    // Try para capturar un posible error y que no se caiga el programa.
                    try {
                        //Validación de la cantidad de Empleados para que no quede el campo vacío y que los datos sean mayores que cero. 
                        if (jTextF_Cant_Empleados.getText().trim().equals("")) {
                            JOptionPane.showMessageDialog(null, "Error, Debe ingresar datos en la Cantidad de Empleados", "ERROR", JOptionPane.ERROR_MESSAGE);
                            return;
                        } else if (Integer.parseInt(jTextF_Cant_Empleados.getText()) <= 0) {
                            JOptionPane.showMessageDialog(null, " La cantidad de Empleados debe ser mayor que 0 ", "ERROR", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        // Si todos los datos ingresados por el usuario son correctos se mandan a la clase hija Préstamo Vivienda y a la padre a través de los objetos con constructores sobrecargados.
                        //Prestamo_Pymes datos_Cliente_PY = new Prestamo_Pymes(jTextF_Identificacion.getText(), jTextF_Nombre.getText(), jTextF_Primer_Apellido.getText(), jTextF_Segundo_Apellido.getText(), Integer.parseInt(jTextF_Edad.getText()), Double.parseDouble(jTextF_Ingreso_Mensual.getText()));
                        Prestamo_Pymes datos_Prestamo_PY = new Prestamo_Pymes(Integer.parseInt(jTextF_Cant_Empleados.getText()), Integer.parseInt(jTextF_ID_Cotizacion.getText()), jTextF_Fecha.getText(), Double.parseDouble(jTextF_Monto_Prestamo.getText()), Integer.parseInt(jTextF_Meses.getText()));
                        // Se muestra la ventana del reporte del préstamo y se cierra la ventana de ingresar los datos.
                        Reporte Ventana = new Reporte();
                        dispose();
                        Ventana.setVisible(true);

                        // A través de los objetos que se crearon arriba de la clase hija Préstamo_Pymes se van asignando 
                        //los datos a los label correspondientes de la ventana del reporte del préstamo.
                        Reporte.jLabel_Reporte_Identificacion.setText("" + jTextF_Identificacion.getText());
                        Reporte.jLabel_Reporte_Nombre.setText("" + jTextF_Nombre.getText());
                        Reporte.jLabel_Reporte_Primer_Apellido.setText("" + jTextF_Primer_Apellido.getText());
                        Reporte.jLabel_Reporte_Segundo_Apellido.setText("" + jTextF_Segundo_Apellido.getText());
                        Reporte.jLabel_Reporte_Edad.setText("" + jTextF_Edad.getText());
                        Reporte.jLabel_Reporte_Ingreso.setText("" + jTextF_Ingreso_Mensual.getText());
                        // A través de los objetos que se crearon arriba de la clase hija Préstamo Pymes se van asignando 
                        //los datos a los label correspondientes de la ventana del reporte del préstamo.
                        Reporte.jLabel_Reporte_ID_Cotizacion.setText("" + datos_Prestamo_PY.getId_Cotizacion());
                        Reporte.jLabel_Reporte_Fecha.setText("" + datos_Prestamo_PY.getFecha());
                        Reporte.jLabel_Reporte_Monto_Prestamo.setText("" + datos_Prestamo_PY.getMonto_Prestamo());
                        Reporte.jLabel_Reporte_Meses.setText("" + datos_Prestamo_PY.getMeses());
                        Reporte.jLabel_Reporte_Cant_Empleados.setText("" + datos_Prestamo_PY.getCant_Empleados());
                        // Se crea un objeto del para darle formato a los decimales que se quieren mostrar.
                        DecimalFormat decimal = new DecimalFormat("#"); // Para que no se muestren los decimales.
                        Reporte.jLabel_Reporte_Tasa_Interes.setText("" + String.valueOf(decimal.format(datos_Prestamo_PY.Tasa_Interes() * 100)) + " %");
                        Reporte.jLabel_Reporte_Descuento.setText("" + String.valueOf(decimal.format(datos_Prestamo_PY.Descuento_Aplicado() * 100)) + " %");

                        Reporte.jLabel_Reporte_Tipo_Prestamo.setText("Pymes");

                        // Con esta línea de código se le da formato al valor de la renta mensual para que solo muestre 2 decimales en el reporte.
                        decimal = new DecimalFormat("#.00");
                        Reporte.jLabel_Reporte_Renta_Mensual.setText("" + String.valueOf(decimal.format(datos_Prestamo_PY.Calcular_Renta_Total())));
                        // Estas Líneas de código es para mostrar más detalles del préstamo y cuanto es el descuento que se le aplicó dependiendo la cantidad de empleados.
                        if (Integer.parseInt(jTextF_Cant_Empleados.getText()) >= 1 && Integer.parseInt(jTextF_Cant_Empleados.getText()) < 5) {
                            Reporte.jTextAreaR_Detalles.setText("Aplica Descuento a la Couta Mensual debido la Cantidad de Empleados \n" + "1 a 4 | 2%\n" + "5 a 9 | 3%\n" + "10 o más | 10%\n"
                                    + "La cantidad de Empleados  es de : " + datos_Prestamo_PY.getCant_Empleados() + "\n" + "Se le Rebajara de la Couta Mensual " + String.valueOf(decimal.format(datos_Prestamo_PY.Cantidad_Descuento())));
                        } else if (Integer.parseInt(jTextF_Cant_Empleados.getText()) >= 5 && Integer.parseInt(jTextF_Cant_Empleados.getText()) < 10) {
                            Reporte.jTextAreaR_Detalles.setText("Aplica Descuento a la Couta Mensual debido la Cantidad de Empleados \n" + "1 a 4 | 2%\n" + "5 a 9 | 3%\n" + "10 o más | 10%\n"
                                    + "La cantidad de Empleados  es de : " + datos_Prestamo_PY.getCant_Empleados() + "\n" + "Se le Rebajara de la Couta Mensual " + String.valueOf(decimal.format(datos_Prestamo_PY.Cantidad_Descuento())));
                        } else {
                            Reporte.jTextAreaR_Detalles.setText("Aplica Descuento a la Couta Mensual debido la Cantidad de Empleados \n" + "1 a 4 | 2%\n" + "5 a 9 | 3%\n" + "10 o más | 10%\n"
                                    + "La cantidad de Empleados  es de : " + datos_Prestamo_PY.getCant_Empleados() + "\n" + "Se le Rebajara de la Couta Mensual " + String.valueOf(decimal.format(datos_Prestamo_PY.Cantidad_Descuento())));
                        }

                        // Como es la clase Prestamo_Personal se ocultan los label que son utilizados para los otros tipos de préstamos.
                        Reporte.jLabel_txt_Cant_Productos.setVisible(false);
                        Reporte.jLabel_Reporte_Cant_Productos.setVisible(false);
                        Reporte.jLabel_txt_mts_Cuadrados.setVisible(false);
                        Reporte.jLabel_Reporte_mts_Cuadrados.setVisible(false);
                        Reporte.jLabel_txt_Estado_Cliente.setVisible(false);
                        Reporte.jLabel_Reporte_Estado_Cliente.setVisible(false);

                        // Si salta un error se captura y se muestra un mensaje de error.
                    } catch (NumberFormatException er) {

                        JOptionPane.showMessageDialog(null, " Solo se puede Ingresar Valores Numericos en la Cantidad de Empleados ", "ERROR", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    break; // Fin del case 3.

            }// fin switch

        }// fin if

        /* Todos los "return" utilizados en los "if" y en el "catch", se aseguran de que si se presenta un error 
           debido a las condiciones establecidas en los if o porque se capturó un error, el programa no siga avanzando, 
           y así el usuario tenga que corregir el dato para que el programa avance*/

    }//GEN-LAST:event_Boton_CotizarActionPerformed
     //Método que verifica que los datos ingresados en los Jtexfield estén correctos
    public void Verificar_JtextFild() {
        this.Validacion = false;
        try {
            //Validación de identificación para que no quede el campo vacío y que los datos no sean menores a 10.
            if (jTextF_Identificacion.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Error, Debe Ingresar una Identificación", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (jTextF_Identificacion.getText().length() < 10) {
                JOptionPane.showMessageDialog(null, "Error, Debe Ingresar los 10 numeros de la Identificación", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            //Validación del Monto Préstamo para que no quede el campo vacío y que el ingreso esté en el rango permitido.
            if (jTextF_Monto_Prestamo.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Error, Debe ingresar datos en el Monto del Prestamo", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (Integer.parseInt(jTextF_Monto_Prestamo.getText()) < 300000 || (Integer.parseInt(jTextF_Monto_Prestamo.getText()) > 15000000)) { // se corrigio la validacion de la tarea anterior.
                JOptionPane.showMessageDialog(null, " El Monto Minimo permitido del Prestamo es de 300 000 y el Maximo es de 15 000 000 ", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            //Validación de Meses para que no quede el campo vacío y que los meses sean mayor que 0.
            if (jTextF_Meses.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Error, Debe ingresar datos en el Meses a cancelar", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (Integer.parseInt(jTextF_Meses.getText()) <= 0) {
                JOptionPane.showMessageDialog(null, " La cantidad de Meses debe ser Mayor a 0 ", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException er) {
            JOptionPane.showMessageDialog(null, " Solo se puede Ingresar Valores Numericos en los siguientes datos: \n, Monto Prestamo, Meses ", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        //Si las validaciones estan bien entonces la variable validacion pasa a true.
        this.Validacion = true;
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

    // De aquí en adelante se generan 9 eventos del tipo KeyTyped para los jTextField donde el usuario puede ingresar datos.
    private void jTextF_IdentificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextF_IdentificacionKeyTyped
        // llama al método que restringe los caracteres especiales.
        RestringirCaracteres(evt);
        if (jTextF_Identificacion.getText().length() >= 10) {
            // si el rango se excede cuando se ingresa la identificación se muestra un mensaje y se desecha el dato de la tecla que presiono el usuario.
            JOptionPane.showMessageDialog(null, " Ha excedido el limite de numeros de la Identificacion", "ERROR", JOptionPane.ERROR_MESSAGE);
            evt.consume();
        }
    }//GEN-LAST:event_jTextF_IdentificacionKeyTyped


    private void jTextF_Monto_PrestamoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextF_Monto_PrestamoKeyTyped
        //Llama al método que solo permite que se ingresen valores númericos del tipo entero o con decimales.
        Validar_Solo_Numeros_y_Decimales(evt);


    }//GEN-LAST:event_jTextF_Monto_PrestamoKeyTyped

    private void jTextF_MesesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextF_MesesKeyTyped
        //Llama al método que solo permite que se ingresen valores númericos del tipo entero.
        Validar_Solo_Numeros_Enteros(evt);
    }//GEN-LAST:event_jTextF_MesesKeyTyped

    //Método que muestra los paneles correspondientes dependiendo que tipo de préstamo seleciona el usuario.
    private void jComboBox_Tipo_PrestamosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox_Tipo_PrestamosItemStateChanged

        // Segun el tipo de prestamo se entra en los diferentes case del switch.
        switch (jComboBox_Tipo_Prestamos.getSelectedIndex()) {
            case 0: // No selecciono un tipo de prestamo, se esconden todos los paneles del tipo de préstamo.
                jPanel_Prestamo_Personal.setVisible(false);
                jPanel_Prestamo_Vivienda.setVisible(false);
                jPanel_Prestamo_Pymes.setVisible(false);

                // Se ocultan los gif que se agregaron.
                jLabel_Gif_Personal.setVisible(false);
                jLabel_Gif_Vivienda.setVisible(false);
                jLabel_Gif_Pymes.setVisible(false);

                break;

            case 1: // Préstamo Personal.
                // se habilita el panel de préstamo personal y se ocultan los demás.
                jPanel_Prestamo_Personal.setVisible(true);
                jPanel_Prestamo_Vivienda.setVisible(false);
                jPanel_Prestamo_Pymes.setVisible(false);
                // Se habilita el gif del prestamo personal y se le indica en que parte de la ventana mostrarlo.
                jLabel_Gif_Personal.setVisible(true);
                jLabel_Gif_Personal.setBounds(460, 340, 300, 180);
                // se ocultan los otros gif.
                jLabel_Gif_Vivienda.setVisible(false);
                jLabel_Gif_Pymes.setVisible(false);

                break;

            case 2: // Préstamo Vivienda.
                // se habilita el panel de préstamo vivienda y se ocultan los demás.
                jPanel_Prestamo_Personal.setVisible(false);
                jPanel_Prestamo_Vivienda.setVisible(true);
                jPanel_Prestamo_Pymes.setVisible(false);
                // Se habilita el gif del préstamo vivienda y se le indica en que parte de la ventana mostrarlo.
                jLabel_Gif_Vivienda.setVisible(true);
                jLabel_Gif_Vivienda.setBounds(460, 300, 300, 280);
                // se ocultan los otros gif.
                jLabel_Gif_Personal.setVisible(false);
                jPanel_Prestamo_Pymes.setVisible(false);

                break;

            case 3:// Préstamo Pymes.
                // se habilita el panel de préstamo Pymes y se ocultan los demás.
                jPanel_Prestamo_Personal.setVisible(false);
                jPanel_Prestamo_Vivienda.setVisible(false);
                jPanel_Prestamo_Pymes.setVisible(true);
                // Se habilita el gif del préstamo pymes y se le indica en que parte de la ventana mostrarlo.
                jLabel_Gif_Pymes.setVisible(true);
                jLabel_Gif_Pymes.setBounds(500, 300, 414, 280);
                // se ocultan los otros gif.
                jLabel_Gif_Personal.setVisible(false);
                jLabel_Gif_Vivienda.setVisible(false);

                break;

        }

    }//GEN-LAST:event_jComboBox_Tipo_PrestamosItemStateChanged

    private void jTextF_Cant_ProductosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextF_Cant_ProductosKeyTyped
        //Llama al método que solo permite que se ingresen valores númericos del tipo entero.
        Validar_Solo_Numeros_Enteros(evt);
    }//GEN-LAST:event_jTextF_Cant_ProductosKeyTyped

    private void jTextF_Metros2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextF_Metros2KeyTyped
        //Llama al método que solo permite que se ingresen valores númericos del tipo entero.
        Validar_Solo_Numeros_Enteros(evt);
    }//GEN-LAST:event_jTextF_Metros2KeyTyped

    private void jTextF_Cant_EmpleadosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextF_Cant_EmpleadosKeyTyped
        //Llama al método que solo permite que se ingresen valores númericos del tipo entero.
        Validar_Solo_Numeros_Enteros(evt);
    }//GEN-LAST:event_jTextF_Cant_EmpleadosKeyTyped

    //Método para indicarle al usuario si el monto del préstamo que esta ingresando esta entre el minimo o maximo permitido.
    private void jTextF_Monto_PrestamoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextF_Monto_PrestamoKeyReleased
        try { // try catch para manejar los errores que se puedan presentar al dejar el monto del prestamo en vacio.
            if (Integer.parseInt(jTextF_Monto_Prestamo.getText()) < 300000 || (Integer.parseInt(jTextF_Monto_Prestamo.getText()) > 15000000)) { // se corrigio la validacion de la tarea anterior.
                jTextF_Monto_Valido.setText(" El Monto no es valido.");

            } else if (Integer.parseInt(jTextF_Monto_Prestamo.getText()) >= 300000 && (Integer.parseInt(jTextF_Monto_Prestamo.getText()) <= 15000000)) {
                jTextF_Monto_Valido.setText(" El Monto valido.");
            }
        } catch (Exception er) { // si ingresa un numero, pero luego lo borra y queda en vacio salta el error, se captura y se muestra en pantalla.
            JOptionPane.showMessageDialog(null, " No debe dejar el monto del prestamo vacio ", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jTextF_Monto_PrestamoKeyReleased

   //Botón que verifica el ID de los clientes registrados para hacer la cotización.
    private void jButton_Verificar_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Verificar_IDActionPerformed
        

        String[] datos; // vector dónde voy a almacenar los datos del cliente
        //Se crea un objeto de la clase Leer Escribir Archivos
        Leer_Escribir_Archivos archivo = new Leer_Escribir_Archivos();
        // se llama al método que verifica el ID y extrae la información de dicho cliente y la guarda en la variable 
        //pero si no encuentra datos registrados con ese ID entonces solo guarda la cédula en la variable 
        Datos_Archivo = archivo.Verificar_ID(jTextF_Identificacion.getText(), false);
        // se crea un objeto de la clase file el cual representa un archivo.
        File file = new File("clientes_prestamos.txt"); // solo para verificar si el archivo existe
        
        // si el archivo existe entra en el if
        if (file.exists()) {
           //si los datos guardados en la variable son solamente igual al número de cédula ingresado 
            //significa que no encontró datos con ese iD

            if (Datos_Archivo.equals(jTextF_Identificacion.getText())) {
                JOptionPane.showMessageDialog(null, "Error, El Cliente aun no se Encuentra Registrado\n" + "Debe Regresar al Menu Principal y Agregar los datos del Cliente", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else {
               // pero si encontró datos entonces se habilitan los jtexfield para realizar la cotización, así como los botones y el combo box.
                Boton_Cotizar.setEnabled(true);
                jTextF_Monto_Prestamo.setEditable(true);
                jTextF_Meses.setEditable(true);
                jComboBox_Tipo_Prestamos.setEnabled(true);

                // se asignan los datos encontrados del cliente a los jtextfield correspondientes
                datos = Datos_Archivo.split("/");
                jTextF_Identificacion.setText(datos[0]);
                jTextF_Nombre.setText(datos[1]);
                jTextF_Primer_Apellido.setText(datos[2]);
                jTextF_Segundo_Apellido.setText(datos[3]);
                jTextF_Edad.setText(datos[4]);
                jTextF_Ingreso_Mensual.setText(datos[5]);
                //se desahabilita el boton de verificar ID y se habilita el de limpiar datos
                jButton_Verificar_ID.setEnabled(false);
                Limpiar_Datos.setEnabled(true);
            }
        } else {
            
            JOptionPane.showMessageDialog(null, "Error, El Cliente aun no se Encuentra Registrado\n" + "Debe Regresar al Menu Principal y Agregar los datos del Cliente", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        


    }//GEN-LAST:event_jButton_Verificar_IDActionPerformed

    private void jButton_Volver_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Volver_MenuActionPerformed
        //boton para volver a menu principal 
        Menu_Principal Ventana = new Menu_Principal();
        Ventana.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton_Volver_MenuActionPerformed

    //Boton para limpiar los datos del cliente.
    private void Limpiar_DatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Limpiar_DatosActionPerformed
        //con este botón se limpian todos los datos y se deshabilitan varios botones los cuales solo se van a habilitar hasta 
        // que se ingrese otro ID
        jTextF_Identificacion.setText("");
        jTextF_Nombre.setText("");
        jTextF_Primer_Apellido.setText("");
        jTextF_Segundo_Apellido.setText("");
        jTextF_Edad.setText("");
        jTextF_Ingreso_Mensual.setText("");
        jButton_Verificar_ID.setEnabled(true);
        Boton_Cotizar.setEnabled(false);
        Limpiar_Datos.setEnabled(false);
        jTextF_Monto_Prestamo.setEditable(false);
        jTextF_Meses.setEditable(false);
        jComboBox_Tipo_Prestamos.setEnabled(false);
    }//GEN-LAST:event_Limpiar_DatosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Cotizar;
    private javax.swing.JButton Limpiar_Datos;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton_Verificar_ID;
    private javax.swing.JButton jButton_Volver_Menu;
    private javax.swing.JComboBox<String> jComboBox_Tipo_Prestamos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabel_Gif_Personal;
    private javax.swing.JLabel jLabel_Gif_Pymes;
    private javax.swing.JLabel jLabel_Gif_Vivienda;
    private javax.swing.JPanel jPanel_Boton;
    private javax.swing.JPanel jPanel_Datos_Cliente;
    private javax.swing.JPanel jPanel_Datos_Prestamo;
    private javax.swing.JPanel jPanel_Prestamo_Personal;
    private javax.swing.JPanel jPanel_Prestamo_Pymes;
    private javax.swing.JPanel jPanel_Prestamo_Vivienda;
    private javax.swing.JPanel jPanel_Tipo_Prestamo;
    private javax.swing.JPanel jPanel_Titulo;
    private javax.swing.JRadioButton jRadioB_Activo;
    private javax.swing.JRadioButton jRadioB_Nuevo;
    private javax.swing.JTextField jTextF_Cant_Empleados;
    private javax.swing.JTextField jTextF_Cant_Productos;
    private javax.swing.JTextField jTextF_Edad;
    private javax.swing.JTextField jTextF_Fecha;
    private javax.swing.JTextField jTextF_ID_Cotizacion;
    private javax.swing.JTextField jTextF_Identificacion;
    private javax.swing.JTextField jTextF_Ingreso_Mensual;
    private javax.swing.JTextField jTextF_Meses;
    private javax.swing.JTextField jTextF_Metros2;
    private javax.swing.JTextField jTextF_Monto_Prestamo;
    private javax.swing.JTextField jTextF_Monto_Valido;
    private javax.swing.JTextField jTextF_Nombre;
    private javax.swing.JTextField jTextF_Primer_Apellido;
    private javax.swing.JTextField jTextF_Segundo_Apellido;
    // End of variables declaration//GEN-END:variables
}
