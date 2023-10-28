
package Vistas;


import AccesoADatos.LaboratorioData;
import Entidades.Laboratorio;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;




public class CargarLaboratorio extends javax.swing.JInternalFrame {
    private LaboratorioData ld;
    private Laboratorio laboratorio;
    
    
    public CargarLaboratorio() {
        initComponents();
        ld = new LaboratorioData();
        laboratorio = new Laboratorio();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTFNombreLaboratorio = new javax.swing.JTextField();
        jTFCuit = new javax.swing.JTextField();
        jTFPais = new javax.swing.JTextField();
        jTFDomicilio = new javax.swing.JTextField();
        btnBuscarLaboratorio = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCargarLaboratorio = new javax.swing.JButton();
        btnAlternancia = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(142, 170, 189));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "www.argentina.gob.ar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 12), new java.awt.Color(3, 67, 97))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 500));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cargar Laboratorio");

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cuit");

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("País");

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Domicilio");

        jTFCuit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFCuitKeyPressed(evt);
            }
        });

        btnBuscarLaboratorio.setBackground(new java.awt.Color(41, 84, 171));
        btnBuscarLaboratorio.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnBuscarLaboratorio.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscarLaboratorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/lupa.png"))); // NOI18N
        btnBuscarLaboratorio.setText("Buscar");
        btnBuscarLaboratorio.setToolTipText("Debe ingresar un número de Cuit");
        btnBuscarLaboratorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarLaboratorioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarLaboratorioMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnBuscarLaboratorioMouseReleased(evt);
            }
        });
        btnBuscarLaboratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarLaboratorioActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(0, 204, 204));
        btnSalir.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(0, 0, 0));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/salida.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnSalirMouseReleased(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(157, 161, 158));
        btnLimpiar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/escoba.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseReleased(evt);
            }
        });
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(224, 131, 38));
        btnModificar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(0, 0, 0));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/editar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModificarMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnModificarMouseReleased(evt);
            }
        });
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(138, 4, 17));
        btnEliminar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/basura.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnEliminarMouseReleased(evt);
            }
        });
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCargarLaboratorio.setBackground(new java.awt.Color(35, 153, 67));
        btnCargarLaboratorio.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnCargarLaboratorio.setForeground(new java.awt.Color(0, 0, 0));
        btnCargarLaboratorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/microscope.png"))); // NOI18N
        btnCargarLaboratorio.setText("Cargar");
        btnCargarLaboratorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCargarLaboratorioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCargarLaboratorioMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCargarLaboratorioMouseReleased(evt);
            }
        });
        btnCargarLaboratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarLaboratorioActionPerformed(evt);
            }
        });

        btnAlternancia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/sol_luna.png"))); // NOI18N
        btnAlternancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlternanciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFCuit, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(jTFNombreLaboratorio)
                            .addComponent(jTFPais)
                            .addComponent(jTFDomicilio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscarLaboratorio))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiar)
                        .addGap(28, 28, 28)
                        .addComponent(btnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(51, 51, 51)
                        .addComponent(btnSalir)))
                .addGap(26, 26, 26))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAlternancia)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(btnCargarLaboratorio)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel2))
                    .addComponent(btnAlternancia))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarLaboratorio)
                    .addComponent(jLabel4))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNombreLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(btnCargarLaboratorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnEliminar)
                    .addComponent(btnModificar)
                    .addComponent(btnLimpiar)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // BTN BUSCAR
    private void btnBuscarLaboratorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarLaboratorioActionPerformed
        
         try {

            String cuit = jTFCuit.getText();
            long cuitLong = Long.parseLong(cuit);
            
            laboratorio = ld.buscarLaboratorioCuit(cuitLong, true);
            if (laboratorio != null) {
                jTFNombreLaboratorio.setText(laboratorio.getNomLaboratorio());
                jTFPais.setText(laboratorio.getPais());
                jTFDomicilio.setText(laboratorio.getDomComercial());
                laboratorio.setEstado(true);

            } else {
                JOptionPane.showMessageDialog(this, "El número de Cuit no existe.");
            }
        } catch (NumberFormatException nbe) {
            JOptionPane.showMessageDialog(this, "Debe ingresar números en el Cuit.");
        }

        
    }//GEN-LAST:event_btnBuscarLaboratorioActionPerformed

            // HOVER Buscar
    private void btnBuscarLaboratorioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarLaboratorioMouseEntered
       
         Color myColor = new Color(29, 34, 179); // creo mí color personalizado-*-

        btnBuscarLaboratorio.setBackground(myColor);
    }//GEN-LAST:event_btnBuscarLaboratorioMouseEntered
            // HOVER Buscar 
    private void btnBuscarLaboratorioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarLaboratorioMouseExited
        btnBuscarLaboratorio.setBackground(new Color(41,84,171));        
    }//GEN-LAST:event_btnBuscarLaboratorioMouseExited
            // HOVER Buscar  
    private void btnBuscarLaboratorioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarLaboratorioMouseReleased
        try {
            TimeUnit.MILLISECONDS.sleep(300);

            // En caso de haber funciones van aquí dentro-*-

        } catch (InterruptedException ex) {
            Logger.getLogger(GestionarCiudadano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarLaboratorioMouseReleased
            
    // BTN CARGAR  
    private void btnCargarLaboratorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarLaboratorioActionPerformed
       try {
    String cuitText = jTFCuit.getText();
    String nombreLaboratorioText = (String) jTFNombreLaboratorio.getText();
    String paisText = (String) jTFPais.getText();
    String domicilioText = (String) jTFDomicilio.getText();

        // Cuit
    if (!cuitText.matches("\\d{11}")) {
        JOptionPane.showMessageDialog(this, "El campo CUIT debe tener 11 dígitos enteros.");
    }   // Nombre  
    else if (!nombreLaboratorioText.matches("[a-zA-Z ]{3,30}")) {
        JOptionPane.showMessageDialog(this, "El campo Nombre debe tener entre 3 y 15 caracteres sin caracteres especiales.");
    }   // Pais
    else if (!paisText.matches("[a-zA-Z ]{4,15}")) {
        JOptionPane.showMessageDialog(this, "El campo País debe tener entre 4 y 15 caracteres sin caracteres especiales.");
    }   // Domicilio                                                                                    // espacio en blanco para numeros-*-                         
    else if (domicilioText.length() < 6 || domicilioText.length() > 25 || !domicilioText.matches("[a-zA-Z0-9° ]{6,25}")) {
        JOptionPane.showMessageDialog(this, "El campo Domicilio debe tener entre 6 y 25 caracteres sin caracteres especiales.");
    }   // Laboratorio
    else if (ld.buscarLaboratorioCuit(Long.parseLong(cuitText), true) != null) { // Se debe Parsear-*-
        JOptionPane.showMessageDialog(this, "El laboratorio ya existe en la base de datos.");
    }
    else {
        long cuit = Long.parseLong(jTFCuit.getText());
        laboratorio.setCuit(cuit);
        laboratorio.setNomLaboratorio(nombreLaboratorioText.toLowerCase());
        laboratorio.setPais(paisText.toLowerCase());
        laboratorio.setDomComercial(domicilioText.toLowerCase());
        laboratorio.setEstado(true);

        ld.guardarLaboratorio(laboratorio);
        limpiarPantalla();
    }
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(this, "El campo CUIT debe ser un número válido.");
}

    }//GEN-LAST:event_btnCargarLaboratorioActionPerformed

            // HOVER Cargar
    private void btnCargarLaboratorioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargarLaboratorioMouseEntered
        Color myColor = new Color(12, 71, 6); // creo mí color personalizado-*-

                btnCargarLaboratorio.setBackground(myColor);
    }//GEN-LAST:event_btnCargarLaboratorioMouseEntered
            // HOVER Cargar
    private void btnCargarLaboratorioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargarLaboratorioMouseExited
         btnCargarLaboratorio.setBackground(new Color(35,153,67));
    }//GEN-LAST:event_btnCargarLaboratorioMouseExited
            // HOVER Cargar
    private void btnCargarLaboratorioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargarLaboratorioMouseReleased
         try {
                        TimeUnit.MILLISECONDS.sleep(300);
            
                        // En caso de haber funciones van aquí dentro-*-
            
                    } catch (InterruptedException ex) {
                        Logger.getLogger(CargarLaboratorio.class.getName()).log(Level.SEVERE, null, ex);
                    }
    }//GEN-LAST:event_btnCargarLaboratorioMouseReleased

    // BTN LIMPIAR
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
         limpiarPantalla();
    }//GEN-LAST:event_btnLimpiarActionPerformed

            // HOVER Limpiar
    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
         Color myColor = new Color(213, 230, 224); // creo mí color personalizado-*-

                btnLimpiar.setBackground(myColor);
    }//GEN-LAST:event_btnLimpiarMouseEntered
            // HOVER Limpiar
    private void btnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseExited
       btnLimpiar.setBackground(new Color(157, 161, 158));
    }//GEN-LAST:event_btnLimpiarMouseExited
            // HOVER Limpiar
    private void btnLimpiarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseReleased
          try {
                        TimeUnit.MILLISECONDS.sleep(300);
            
                        // En caso de haber funciones van aquí dentro-*-
                    } catch (InterruptedException ex) {
                        Logger.getLogger(CargarLaboratorio.class.getName()).log(Level.SEVERE, null, ex);
                    }
    }//GEN-LAST:event_btnLimpiarMouseReleased

    
    // BTN MODIFICAR
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            String cuit = jTFCuit.getText();
            long cuitLong = Long.parseLong(cuit);
            laboratorio = ld.buscarLaboratorioCuit(cuitLong, true);
            if (laboratorio == null) {
                JOptionPane.showMessageDialog(this, "El Laboratorio no existe en la base de datos.");
                return;
            }
            String nombreLaboratorioText = jTFNombreLaboratorio.getText();
            String paisText = jTFPais.getText();
            String domicilioText = jTFDomicilio.getText();
            laboratorio.setCuit(cuitLong);
            laboratorio.setNomLaboratorio(nombreLaboratorioText.toLowerCase());
            laboratorio.setPais(paisText.toLowerCase());
            laboratorio.setDomComercial(domicilioText.toLowerCase());
            laboratorio.setEstado(true);
            ld.modificarLaboratorio(laboratorio);
            limpiarPantalla();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El campo CUIT debe ser un número válido.");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

            // HOVER Modificar
    private void btnModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseEntered
        Color myColor = new Color(138, 71, 4); // creo mí color personalizado-*-

        btnModificar.setBackground(myColor);
    }//GEN-LAST:event_btnModificarMouseEntered
            // HOVER Modificar
    private void btnModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseExited
         btnModificar.setBackground(new Color(224,131,38)); 
    }//GEN-LAST:event_btnModificarMouseExited
            // HOVER Modificar 
    private void btnModificarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseReleased
        try {
            TimeUnit.MILLISECONDS.sleep(300);

            // En caso de haber funciones van aquí dentro-*-

        } catch (InterruptedException ex) {
            Logger.getLogger(GestionarCiudadano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnModificarMouseReleased

    
    // BTN ELIMINAR 
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        try {
            if (laboratorio != null) {
                ld.eliminarLaboratorio(laboratorio.getIdLaboratorio());
                btnLimpiar.doClick();
            }
        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un Laboratorio.");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed
            // EVENTO CLIC-> MOUSE 
    private void jTFCuitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCuitKeyPressed
          if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnBuscarLaboratorio.doClick();
        }
    }//GEN-LAST:event_jTFCuitKeyPressed
            // HOVER Eliminar  
    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
         Color myColor = new Color(224,9,78); // creo mí color personalizado-*-

        btnEliminar.setBackground(myColor);
    }//GEN-LAST:event_btnEliminarMouseEntered
            // HOVER Eliminar   
    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        btnEliminar.setBackground(new Color(138, 4, 17));
    }//GEN-LAST:event_btnEliminarMouseExited
            // HOVER Eliminar   
    private void btnEliminarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseReleased
        try {
            TimeUnit.MILLISECONDS.sleep(300);

            // En caso de haber funciones van aquí dentro-*-

        } catch (InterruptedException ex) {
            Logger.getLogger(GestionarCiudadano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarMouseReleased

    
    // BTN SALIR
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
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
    }//GEN-LAST:event_btnSalirActionPerformed

            // HOVER Salir
    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        Color myColor = new Color(88, 144, 173); // creo mí color personalizado-*-

                btnSalir.setBackground(myColor);
    }//GEN-LAST:event_btnSalirMouseEntered
            // HOVER Salir
    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
          btnSalir.setBackground(new Color(0,204,204));
    }//GEN-LAST:event_btnSalirMouseExited
            // HOVER Salir
    private void btnSalirMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseReleased
         try {
                        TimeUnit.MILLISECONDS.sleep(300);
            
                        // En caso de haber funciones van aquí dentro-*-
            
                    } catch (InterruptedException ex) {
                        Logger.getLogger(CargarLaboratorio.class.getName()).log(Level.SEVERE, null, ex);
                    }
    }//GEN-LAST:event_btnSalirMouseReleased

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
    private javax.swing.JButton btnBuscarLaboratorio;
    private javax.swing.JButton btnCargarLaboratorio;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFCuit;
    private javax.swing.JTextField jTFDomicilio;
    private javax.swing.JTextField jTFNombreLaboratorio;
    private javax.swing.JTextField jTFPais;
    // End of variables declaration//GEN-END:variables
// METODO LIMPIAR -*-
public void limpiarPantalla() {
        if (jTFCuit.getText().isEmpty() && jTFNombreLaboratorio.getText().isEmpty() && jTFPais.getText().isEmpty() && jTFDomicilio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos ya están vacíos.");
        } else {

            jTFCuit.setText("");
            jTFNombreLaboratorio.setText("");
            jTFPais.setText("");
            jTFDomicilio.setText("");
        }
    }
}
