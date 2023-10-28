/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.CitaVacunacionData;
import AccesoADatos.CiudadanoData;
import Entidades.CitaVacunacion;
import Entidades.Ciudadano;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @Alex Anders
 */
public class CargarCitaView extends javax.swing.JInternalFrame {

    private CiudadanoData cd = new CiudadanoData(); //se instancia un ciudadanoData
    private Ciudadano ciudadano = null;             // una instancia de ciudadano inicializado en null.
    private CitaVacunacionData cvd = new CitaVacunacionData();
    private CitaVacunacion cita = null;
    
   
    
    public CargarCitaView() {
        
        initComponents();
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLocaleChooser1 = new com.toedter.components.JLocaleChooser();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollBar1 = new javax.swing.JScrollBar();
        jLabel2 = new javax.swing.JLabel();
        jTNombreCompleto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTCelular = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTPatologiaBase = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTAmbitoLaboral = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jCBCentroDeVacunacion = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jDCFechaCita = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jCBCodigoRefuerzo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jRBColocada = new javax.swing.JRadioButton();
        jCBDosis = new javax.swing.JComboBox<>();
        jBLimpiar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTDocumento = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTIdCiudadano = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jDCProximaFecha = new com.toedter.calendar.JDateChooser();
        jBSalir = new javax.swing.JButton();
        btnAlternancia = new javax.swing.JButton();

        setBackground(new java.awt.Color(142, 170, 189));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "www.argentina.gob.ar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 12), new java.awt.Color(3, 67, 97))); // NOI18N
        setForeground(new java.awt.Color(0, 0, 0));
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(750, 610));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre Completo");

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email");

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Celular");

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Patologia Base");

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ambito Laboral");

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Centro de Vacunacion");

        jCBCentroDeVacunacion.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jCBCentroDeVacunacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija una opcion.", "Centro de Vacunacion 1.", "Centro de Vacunacion 2.", "Centro de Vacunacion 3.", "Centro de Vacunacion 4.", "Centro de Vacunacion 5." }));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Fecha de Cita");

        jDCFechaCita.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jDCFechaCita.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDCFechaCitaPropertyChange(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Codigo de Refuerzo");

        jCBCodigoRefuerzo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jCBCodigoRefuerzo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija una opcion.", "1 Aplicacion.", "2 Aplicacion.", "3 Aplicacion." }));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Dosis");

        jRBColocada.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jRBColocada.setForeground(new java.awt.Color(255, 255, 255));
        jRBColocada.setText("(Colocada)");

        jCBDosis.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jCBDosis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija una opcion.", "1-ARNm (Pfiser)", "2-mRNA-1273 (Moderna)", "3-ChAdOx1-s (AstraSeneca)", "4-BBIBP-Corv (Sinopharm)", "5-Gam-Covid-VacM (Sputnik)" }));

        jBLimpiar.setBackground(new java.awt.Color(157, 161, 158));
        jBLimpiar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jBLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/escoba.png"))); // NOI18N
        jBLimpiar.setText("Limpiar");
        jBLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBLimpiarMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jBLimpiarMouseReleased(evt);
            }
        });
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jBGuardar.setBackground(new java.awt.Color(35, 153, 67));
        jBGuardar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jBGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/guardar-datos_1.png"))); // NOI18N
        jBGuardar.setText("Confirmar");
        jBGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBGuardarMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jBGuardarMouseReleased(evt);
            }
        });
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBModificar.setBackground(new java.awt.Color(224, 131, 38));
        jBModificar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jBModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/editar.png"))); // NOI18N
        jBModificar.setText("Modificar");
        jBModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBModificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBModificarMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jBModificarMouseReleased(evt);
            }
        });
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Cargar Aplicación de Vacuna");

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Documento");

        jBBuscar.setBackground(new java.awt.Color(41, 84, 171));
        jBBuscar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jBBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/lupa.png"))); // NOI18N
        jBBuscar.setText("Buscar");
        jBBuscar.setToolTipText("Ingrese un numero de DNI");
        jBBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBBuscarMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jBBuscarMouseReleased(evt);
            }
        });
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("IdCiudadano");

        jLabel14.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("proxima Fecha");

        jDCProximaFecha.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N

        jBSalir.setBackground(new java.awt.Color(0, 204, 204));
        jBSalir.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jBSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/salida.png"))); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBSalirMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jBSalirMouseReleased(evt);
            }
        });
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        btnAlternancia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/sol_luna.png"))); // NOI18N
        btnAlternancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlternanciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAlternancia)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTIdCiudadano, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCBCentroDeVacunacion, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTNombreCompleto, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTCelular, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTPatologiaBase, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTAmbitoLaboral, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBBuscar)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jDCProximaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel11)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRBColocada))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDCFechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCBDosis, javax.swing.GroupLayout.Alignment.TRAILING, 0, 222, Short.MAX_VALUE)
                            .addComponent(jCBCodigoRefuerzo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jBModificar)
                .addGap(85, 85, 85)
                .addComponent(jBLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jBGuardar)
                .addGap(63, 63, 63)
                .addComponent(jBSalir)
                .addGap(68, 68, 68))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAlternancia)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBBuscar)
                    .addComponent(jTDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTIdCiudadano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTPatologiaBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTAmbitoLaboral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBCentroDeVacunacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(jDCProximaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCBCodigoRefuerzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jDCFechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22)
                        .addComponent(jLabel9)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCBDosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRBColocada)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalir)
                    .addComponent(jBGuardar)
                    .addComponent(jBLimpiar)
                    .addComponent(jBModificar))
                .addGap(62, 62, 62))
        );

        getAccessibleContext().setAccessibleName("www.argentina.gob.ar");
        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        // boton buscar dni llena los text field de nombre,email,celular,patologia y ambito laboral
        try {
            int dni = Integer.parseInt(jTDocumento.getText());

            if (jTDocumento.getText().length() == 8 && jTDocumento.getText().matches("[0-9]+") || (jTCelular.getText().length() == 8 && jTCelular.getText().matches("[0-9]")) || (jTEmail.getText().contentEquals("@"))) {
                ciudadano = cvd.buscarCiudadanoPorDni(dni);

                jTIdCiudadano.setText(String.valueOf(ciudadano.getIdCiudadano()));
                jTNombreCompleto.setText(ciudadano.getNombreCompleto());
                jTEmail.setText(ciudadano.getEmail());
                jTCelular.setText(ciudadano.getCelular());
                jTPatologiaBase.setText(ciudadano.getPatologia());
                jTAmbitoLaboral.setText(ciudadano.getAmbitoTrabajo());
            } else {
                JOptionPane.showMessageDialog(this, "Numero de documento valido");
            }
        } catch (NumberFormatException nbe) {
            JOptionPane.showMessageDialog(this, "Debe ingresar números en el campo DNI.");
        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(this, "El ciudadano no existe.");
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        // BOTON GUARDAR CITAVACUNACION // 
        try{
        int idCiudadano = Integer.parseInt(jTIdCiudadano.getText());
        int codRefuerzo = jCBCodigoRefuerzo.getSelectedIndex();
        String centroVacunacion = (String) jCBCentroDeVacunacion.getSelectedItem();
        try{
        Date fechaHoraCita = jDCFechaCita.getDate();
        if(fechaHoraCita ==null){
        JOptionPane.showMessageDialog(this,"La fecha es invalida");
        }
        
        Instant instantCita = fechaHoraCita.toInstant();
        LocalDate fechaCit = instantCita.atZone(ZoneId.systemDefault()).toLocalDate();
        
        LocalDate fechaMinima = LocalDate.of(2023,10,1);
        if(fechaCit.isBefore(fechaMinima)){
         DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");   
        JOptionPane.showMessageDialog(this,"La fecha debe ser despúes de: "+fechaMinima.format(dtf));
        return;
        }
        
        Date fechaHoraColoca = jDCProximaFecha.getDate();
        Instant instantColoca = fechaHoraColoca.toInstant();
        LocalDate fechaProx = instantColoca.atZone(ZoneId.systemDefault()).toLocalDate();

        int dosis = jCBDosis.getSelectedIndex() + 1;
        boolean estado = jRBColocada.isSelected();

        cita = new CitaVacunacion(idCiudadano, codRefuerzo, fechaCit, centroVacunacion, fechaProx, dosis, estado);
        cvd.guardarCitaVacunacion(cita);
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        JOptionPane.showMessageDialog(this,"La proxima cita es: "+fechaProx.format(dtf));
        
        } catch (NumberFormatException nbe) {
            JOptionPane.showMessageDialog(this, "Debe ingresar datos validos.");
            }catch(NullPointerException e){
         JOptionPane.showMessageDialog(this, "Falta ingresar la fecha de cita o la fecha de proxima cita");
        }
        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(this, "El ciudadano no existe.");
        
        }
    }//GEN-LAST:event_jBGuardarActionPerformed
    
    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        // LIMPIA LA PANTALLA DE EVENTOS 
            jTDocumento.setText("");
            jTIdCiudadano.setText("");
            jTNombreCompleto.setText("");
            jTEmail.setText("");
            jTCelular.setText("");
            jTPatologiaBase.setText("");
            jTAmbitoLaboral.setText("");
            jCBCentroDeVacunacion.setSelectedIndex(0);
            jDCFechaCita.setDate(null);
            jDCProximaFecha.setDate(null);
            jCBDosis.setSelectedIndex(0);
            jCBCodigoRefuerzo.setSelectedIndex(0);
            jRBColocada.setSelected(false);
    }//GEN-LAST:event_jBLimpiarActionPerformed
    
    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        // TODO add your handling code here:
        try {
            int codRefuerzo = jCBCodigoRefuerzo.getSelectedIndex();

            Date fechaHoraCita = jDCFechaCita.getDate();
            Instant instantCita = fechaHoraCita.toInstant();
            LocalDate fechaCit = instantCita.atZone(ZoneId.systemDefault()).toLocalDate();

            String centroVacunacion = (String) jCBCentroDeVacunacion.getSelectedItem();

            Date fechaHoraColoca = jDCProximaFecha.getDate();
            Instant instantColoca = fechaHoraColoca.toInstant();
            LocalDate fechaProx = instantColoca.atZone(ZoneId.systemDefault()).toLocalDate();

            int dosis = jCBDosis.getSelectedIndex() + 1;
            boolean estado = jRBColocada.isSelected();

            cita = new CitaVacunacion();

            cita.setCodRefuerzo(codRefuerzo);
            cita.setFechaHoraCita(fechaCit);
            cita.setCentroVacunacion(centroVacunacion);
            cita.setFechaHoraColoca(fechaProx);
            cita.setDosis(dosis);
            cita.setEstado(estado);

            cvd.modificarCitaVacunacion(cita);
        } catch (NumberFormatException nbe) {
            JOptionPane.showMessageDialog(this, "Debe ingresar datos validos.");
        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(this, "El ciudadano no existe.");

        }
    }//GEN-LAST:event_jBModificarActionPerformed

    
    // FUNCION BTN HOVER  -------------------------------
    
    private void jBBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBuscarMouseEntered
        
         Color myColor = new Color(29, 34, 179); // creo mí color personalizado-*-

        jBBuscar.setBackground(myColor);
           
    }//GEN-LAST:event_jBBuscarMouseEntered

    private void jBBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBuscarMouseExited
       
         jBBuscar.setBackground(new Color(41,84,171));
    }//GEN-LAST:event_jBBuscarMouseExited

    private void jBBuscarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBuscarMouseReleased
       
         try {
            TimeUnit.MILLISECONDS.sleep(300);

            // En caso de haber funciones van aquí dentro-*-

        } catch (InterruptedException ex) {
            Logger.getLogger(GestionarCiudadano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBBuscarMouseReleased

    
    private void jBLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBLimpiarMouseEntered
    
        Color myColor = new Color(213, 230, 224); // creo mí color personalizado-*-

        jBLimpiar.setBackground(myColor);
    }//GEN-LAST:event_jBLimpiarMouseEntered

    private void jBLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBLimpiarMouseExited
        
         jBLimpiar.setBackground(new Color(157, 161, 158));
    }//GEN-LAST:event_jBLimpiarMouseExited

    private void jBLimpiarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBLimpiarMouseReleased
        
         try {
            TimeUnit.MILLISECONDS.sleep(300);

            // En caso de haber funciones van aquí dentro-*-
        } catch (InterruptedException ex) {
            Logger.getLogger(GestionarCiudadano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBLimpiarMouseReleased

    private void jBModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBModificarMouseEntered
        
        Color myColor = new Color(138, 71, 4); // creo mí color personalizado-*-

        jBModificar.setBackground(myColor);
        
    }//GEN-LAST:event_jBModificarMouseEntered

    private void jBModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBModificarMouseExited
       
        jBModificar.setBackground(new Color(224,131,38));
        
    }//GEN-LAST:event_jBModificarMouseExited

    private void jBModificarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBModificarMouseReleased
       
         try {
            TimeUnit.MILLISECONDS.sleep(300);

            // En caso de haber funciones van aquí dentro-*-

        } catch (InterruptedException ex) {
            Logger.getLogger(GestionarCiudadano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBModificarMouseReleased

    private void jBGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBGuardarMouseEntered
        
        Color myColor = new Color(12, 71, 6); // creo mí color personalizado-*-

        jBGuardar.setBackground(myColor);

    }//GEN-LAST:event_jBGuardarMouseEntered

    private void jBGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBGuardarMouseExited
       
         jBGuardar.setBackground(new Color(35,153,67));
    }//GEN-LAST:event_jBGuardarMouseExited

    private void jBGuardarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBGuardarMouseReleased
        
         try {
            TimeUnit.MILLISECONDS.sleep(300);

            // En caso de haber funciones van aquí dentro-*-

        } catch (InterruptedException ex) {
            Logger.getLogger(GestionarCiudadano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBGuardarMouseReleased

    
    
    
    
    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        // Boton salir:
        JPanel panel = new JPanel();
        Font customFont = new Font("Roboto", Font.BOLD, 15); 
    

        JLabel label = new JLabel("<html><p style=\" color: #eb4034; font: 13px; font-weight: bold; font-family: Roboto;\" >¿Esta seguro que deseas salir?</p></html>");
        label.setForeground(Color.black);
        label.setFont(customFont); // fuente custom etiqueta-*-
        panel.add(label);

        ImageIcon icono = new ImageIcon(getClass().getResource("../recursos/escudo.png"));

        String[] options = {"Salir", "Cancelar"}; // agregar opción "Cancelar"
        int result = JOptionPane.showOptionDialog(this, panel, "Ministerio de Salud Argentina", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, icono, options, null);

        if (result == JOptionPane.YES_OPTION) { // si se hace clic en "Salir"
        dispose(); // cerrar la ventana
    }
        
    }//GEN-LAST:event_jBSalirActionPerformed

    
    
        
    private void jBSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalirMouseEntered
        
         Color myColor = new Color(41, 124, 166); // creo mí color personalizado-*-

        jBSalir.setBackground(myColor);
    }//GEN-LAST:event_jBSalirMouseEntered

    private void jBSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalirMouseExited
       
         jBSalir.setBackground(new Color(0,204,204));
    }//GEN-LAST:event_jBSalirMouseExited

    private void jBSalirMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalirMouseReleased
        
         try {
            TimeUnit.MILLISECONDS.sleep(300);

            // En caso de haber funciones van aquí dentro-*-

        } catch (InterruptedException ex) {
            Logger.getLogger(GestionarCiudadano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBSalirMouseReleased

    private void jDCFechaCitaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDCFechaCitaPropertyChange
        // TODO add your handling code here:
        // Obtiene la fecha seleccionada en el primer JDateChooser
       try{
        Date selectedDate = jDCFechaCita.getDate();
        
        // Calcula la fecha 30 días después
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(selectedDate);
        calendar.add(Calendar.DAY_OF_MONTH, 30);
        
        // Establece la fecha calculada en el segundo JDateChooser
        jDCProximaFecha.setDate(calendar.getTime());
       }catch(NullPointerException ex){
//           JOptionPane.showMessageDialog(this,ex);
       }
    }//GEN-LAST:event_jDCFechaCitaPropertyChange
    // BTN ALTERNANCIA 
    private boolean isBlack = false; // inicializamos color-*-
    private Color defaultColor = new Color(142, 170, 189); // color x default-*-
    private void btnAlternanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlternanciaActionPerformed
    
          Container c = getContentPane();
    if (isBlack) {
        c.setBackground(defaultColor);
        isBlack = false;
    } else {
        c.setBackground(Color.BLACK);
        isBlack = true;
      }
        
    }//GEN-LAST:event_btnAlternanciaActionPerformed

    
    
    
    
           
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlternancia;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<String> jCBCentroDeVacunacion;
    private javax.swing.JComboBox<String> jCBCodigoRefuerzo;
    private javax.swing.JComboBox<String> jCBDosis;
    private com.toedter.calendar.JDateChooser jDCFechaCita;
    private com.toedter.calendar.JDateChooser jDCProximaFecha;
    private com.toedter.calendar.JDateChooser jDateChooser1;
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
    private com.toedter.components.JLocaleChooser jLocaleChooser1;
    private javax.swing.JRadioButton jRBColocada;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JTextField jTAmbitoLaboral;
    private javax.swing.JTextField jTCelular;
    private javax.swing.JTextField jTDocumento;
    private javax.swing.JTextField jTEmail;
    private javax.swing.JTextField jTIdCiudadano;
    private javax.swing.JTextField jTNombreCompleto;
    private javax.swing.JTextField jTPatologiaBase;
    // End of variables declaration//GEN-END:variables
 
}
