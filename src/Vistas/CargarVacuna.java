
package Vistas;


import AccesoADatos.VacunaData;
import Entidades.Vacuna;
import java.awt.Color;
import java.time.LocalDate;

import java.time.ZoneId;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class CargarVacuna extends javax.swing.JFrame {

    /**
     * Creates new form CargarVacuna
     */
    public CargarVacuna() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnGuardarVacuna = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTFNroSerieDosis = new javax.swing.JTextField();
        jTFMedida = new javax.swing.JTextField();
        jTFMarca = new javax.swing.JTextField();
        jTFLaboratorio = new javax.swing.JTextField();
        jDCFechaCaduca = new com.toedter.calendar.JDateChooser();
        jRBColocada = new javax.swing.JRadioButton();
        jRBEliminada = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(142, 170, 189));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "www.argentina.gob.ar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 12), new java.awt.Color(3, 67, 97))); // NOI18N
        jPanel1.setDoubleBuffered(false);
        jPanel1.setFocusCycleRoot(true);
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 500));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setText("CARGAR VACUNA");

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setText("Laboratorio:");

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setText("Marca:");

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setText("Fecha Caducidad:");

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel7.setText("Eliminada:");

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel8.setText("nroSerieDosis:");

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

        btnGuardarVacuna.setBackground(new java.awt.Color(35, 153, 67));
        btnGuardarVacuna.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnGuardarVacuna.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardarVacuna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vacuna.png"))); // NOI18N
        btnGuardarVacuna.setText("Cargar");
        btnGuardarVacuna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarVacunaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarVacunaMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnGuardarVacunaMouseReleased(evt);
            }
        });
        btnGuardarVacuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarVacunaActionPerformed(evt);
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

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel9.setText("Medida:");

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel10.setText("Colocada:");

        jTFLaboratorio.setToolTipText("<html><body style='background-color: #c752d9; color: #0f0f0f; font-family: Arial; font-size: 10px; font-weight: bold;'>Ingresar un Numero Entero <br> del <b>1</b> al <b>5</b></body></html>\n\n\n\n\n");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/min_salud (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jLabel1)
                .addGap(179, 179, 179))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnGuardarVacuna)
                                .addGap(93, 93, 93))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnLimpiar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSalir)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRBEliminada))
                                    .addComponent(jDCFechaCaduca, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTFNroSerieDosis, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTFMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTFLaboratorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jRBColocada, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(61, 61, 61)))
                        .addGap(47, 47, 47))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addComponent(jTFMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(253, 253, 253))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTFNroSerieDosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
                    .addComponent(jRBColocada))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jTFLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTFMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jRBEliminada)))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDCFechaCaduca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarVacuna)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
                   // BTN CARGAR VACUNA-*-
    
    private void btnGuardarVacunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarVacunaActionPerformed
        
        
        Long nroSerieDosis = Long.parseLong(jTFNroSerieDosis.getText());
        String marca = jTFMarca.getText();
        Double medida = Double.parseDouble(jTFMedida.getText());
        LocalDate fechaCaduca = jDCFechaCaduca.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Boolean colocada = jRBColocada.isSelected();
        Integer laboratorio = Integer.parseInt(jTFLaboratorio.getText());
        Boolean eliminada = jRBEliminada.isSelected();
         
        Vacuna vacuna = new Vacuna(nroSerieDosis, marca, medida, fechaCaduca, colocada, laboratorio, eliminada);
  
        VacunaData vacunaData = new VacunaData();
        vacunaData.GuardarVacuna(vacuna);
        
        limpiarPantalla();
    }//GEN-LAST:event_btnGuardarVacunaActionPerformed

                    // BOTON LIMPIAR-*-   
    
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        
          limpiarPantalla();
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    
                    // BOTON SALIR-*-
     String [] botones = {"SI", "NO", "CANCELAR"};
     
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
    
           int x = JOptionPane.showOptionDialog(this, "¿Te gusto esta página", "Elije una respuesta", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, botones, botones[0]);
                                             //mensaje               //titulo                                                                                      //String                 

        if (x == 0) {
            JOptionPane.showMessageDialog(this, "Gracias por tu visita!!!");
            dispose();
        } else if (x == 1) {
            JOptionPane.showMessageDialog(this, " :}D ");
        }
     
    }//GEN-LAST:event_btnSalirActionPerformed

    // EVENTOS HOVER DE LOS BTN-------------------------
    
                  // EVENTO BTN HOVER-*-1°Entered-*-
    
    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        
        Color myColor = new Color(88, 144, 173); // creo mí color personalizado-*-
              
             btnSalir.setBackground(myColor);
        
    }//GEN-LAST:event_btnSalirMouseEntered

                 // EVENTO BTN HOVER-*-2°Exited-*- 
    
    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        
         btnSalir.setBackground(new Color(0,204,204));
    }//GEN-LAST:event_btnSalirMouseExited

    
                // EVENTO BTN HOVER-*-3°Released-*-  
    
    private void btnSalirMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseReleased
    
         try {
            TimeUnit.MILLISECONDS.sleep(300);
            
            // En caso de haber funciones van aquí dentro-*-
            
        } catch (InterruptedException ex) {
            Logger.getLogger(CargarVacuna.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnSalirMouseReleased

    
    
    
    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
    
                  Color myColor = new Color(213, 230, 224); // creo mí color personalizado-*-
              
         btnLimpiar.setBackground(myColor);        

    }//GEN-LAST:event_btnLimpiarMouseEntered

    
    
    private void btnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseExited
    
        btnLimpiar.setBackground(new Color(157,161,158));
        
    }//GEN-LAST:event_btnLimpiarMouseExited

    
    
    private void btnLimpiarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseReleased
    
         try {
            TimeUnit.MILLISECONDS.sleep(300);
            
            // En caso de haber funciones van aquí dentro-*-
            
        } catch (InterruptedException ex) {
            Logger.getLogger(CargarVacuna.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btnLimpiarMouseReleased

    
    
    
    private void btnGuardarVacunaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarVacunaMouseEntered
    
         Color myColor = new Color(12, 71, 6); // creo mí color personalizado-*-
              
         btnGuardarVacuna.setBackground(myColor);
        
    }//GEN-LAST:event_btnGuardarVacunaMouseEntered

    
    
    private void btnGuardarVacunaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarVacunaMouseExited
    
        btnGuardarVacuna.setBackground(new Color(35,153,67));
        
    }//GEN-LAST:event_btnGuardarVacunaMouseExited

    
    
    private void btnGuardarVacunaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarVacunaMouseReleased
    
         try {
            TimeUnit.MILLISECONDS.sleep(300);
            
            // En caso de haber funciones van aquí dentro-*-
            
        } catch (InterruptedException ex) {
            Logger.getLogger(CargarVacuna.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnGuardarVacunaMouseReleased

    // EVENTOS HOVER DE LOS BTN-------------------------
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CargarVacuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CargarVacuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CargarVacuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CargarVacuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CargarVacuna().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarVacuna;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private com.toedter.calendar.JDateChooser jDCFechaCaduca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBColocada;
    private javax.swing.JRadioButton jRBEliminada;
    private javax.swing.JTextField jTFLaboratorio;
    private javax.swing.JTextField jTFMarca;
    private javax.swing.JTextField jTFMedida;
    private javax.swing.JTextField jTFNroSerieDosis;
    // End of variables declaration//GEN-END:variables

    // METODO LIMPIAR PANTALLA-*-    
    
    public void limpiarPantalla() {
        
        
        jTFNroSerieDosis.setText("");
        jTFMarca.setText("");
        jTFMedida.setText("");
        jDCFechaCaduca.setDate(null);
        jRBColocada.setSelected(true);
        jTFLaboratorio.setText("");
        jRBEliminada.setSelected(true); 
        
        
    }



}
