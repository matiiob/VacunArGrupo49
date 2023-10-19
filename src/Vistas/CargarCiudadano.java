
 
package Vistas;

import AccesoADatos.CiudadanoData;
import Entidades.Ciudadano;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class CargarCiudadano extends javax.swing.JInternalFrame {

    private CiudadanoData cd;
    private Ciudadano ciudadano;
    
    
    public CargarCiudadano() {
        initComponents();
        cd = new CiudadanoData();
        ciudadano = new Ciudadano();
      //  cargarPatologias();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        jTFDni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jCBAmbitoTrabajo = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jTFNombre = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTFEmail = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTFCelular = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnCargarCiudadano = new javax.swing.JButton();
        jCBPatologia = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(142, 170, 189));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "www.argentina.gob.ar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 12), new java.awt.Color(3, 67, 97))); // NOI18N
        jPanel1.setDoubleBuffered(false);
        jPanel1.setFocusCycleRoot(true);
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 400));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(245, 245, 245));
        jLabel1.setText("CARGAR CIUDADANO");

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(245, 245, 245));
        jLabel8.setText("Dni");

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

        jTFDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFDniActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/min_salud (1).png"))); // NOI18N

        jCBAmbitoTrabajo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jCBAmbitoTrabajo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una Opción  ", "Personal de Salud", "Personal de Seguridad", "Personal de Fuerzas Armadas", "Personal de Bomberos", "Autoridad de Gobierno", "Otro" }));
        jCBAmbitoTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBAmbitoTrabajoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(245, 245, 245));
        jLabel11.setText("Nombre Completo");

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(245, 245, 245));
        jLabel12.setText("Email");

        jLabel13.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(245, 245, 245));
        jLabel13.setText("Numero Celular");

        jLabel14.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(245, 245, 245));
        jLabel14.setText("Patologías");

        jLabel15.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(245, 245, 245));
        jLabel15.setText("Ambito de Trabajo");

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

        btnCargarCiudadano.setBackground(new java.awt.Color(35, 153, 67));
        btnCargarCiudadano.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnCargarCiudadano.setForeground(new java.awt.Color(0, 0, 0));
        btnCargarCiudadano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vacuna.png"))); // NOI18N
        btnCargarCiudadano.setText("Cargar");
        btnCargarCiudadano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCargarCiudadanoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCargarCiudadanoMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCargarCiudadanoMouseReleased(evt);
            }
        });
        btnCargarCiudadano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarCiudadanoActionPerformed(evt);
            }
        });

        jCBPatologia.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jCBPatologia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una Opción", "Diabétes", "Cáncer", "Obesidad", "Afección Renal", "Afección  Cardíaca", "Afección Pulmonar", "Otra", "Sin Patologías", " " }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnCargarCiudadano)
                .addGap(82, 82, 82)
                .addComponent(btnLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(37, 37, 37))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 221, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(54, 54, 54)
                                .addComponent(jTFDni, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel15))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                            .addComponent(jTFEmail)
                            .addComponent(jTFCelular)
                            .addComponent(jCBPatologia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCBAmbitoTrabajo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBPatologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBAmbitoTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCargarCiudadano)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        limpiarPantalla();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnLimpiarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseReleased

        try {
            TimeUnit.MILLISECONDS.sleep(300);

            // En caso de haber funciones van aquí dentro-*-
        } catch (InterruptedException ex) {
            Logger.getLogger(CargarCiudadano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLimpiarMouseReleased

    private void btnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseExited

        btnLimpiar.setBackground(new Color(157, 161, 158));
    }//GEN-LAST:event_btnLimpiarMouseExited

    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered

        Color myColor = new Color(213, 230, 224); // creo mí color personalizado-*-

        btnLimpiar.setBackground(myColor);
    }//GEN-LAST:event_btnLimpiarMouseEntered
    
    private void jCBAmbitoTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBAmbitoTrabajoActionPerformed
        
    }//GEN-LAST:event_jCBAmbitoTrabajoActionPerformed

    private void jTFDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFDniActionPerformed

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered

        Color myColor = new Color(88, 144, 173); // creo mí color personalizado-*-

        btnSalir.setBackground(myColor);

    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited

        btnSalir.setBackground(new Color(0,204,204));
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnSalirMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseReleased

        try {
            TimeUnit.MILLISECONDS.sleep(300);

            // En caso de haber funciones van aquí dentro-*-

        } catch (InterruptedException ex) {
            Logger.getLogger(CargarCiudadano.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnSalirMouseReleased
    
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        String [] botones = {"SI", "CANCELAR"};
        int x = JOptionPane.showOptionDialog(this, "¿Estás seguro que desea salir?", "Elije una respuesta", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, botones, botones[0]);
        //mensaje               //titulo                                                                                      //String

        if (x == 0) {
//            JOptionPane.showMessageDialog(this, "Gracias por tu visita!!!");
            dispose();
        } 

    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCargarCiudadanoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargarCiudadanoMouseEntered

        Color myColor = new Color(12, 71, 6); // creo mí color personalizado-*-

        btnCargarCiudadano.setBackground(myColor);

    }//GEN-LAST:event_btnCargarCiudadanoMouseEntered

    private void btnCargarCiudadanoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargarCiudadanoMouseExited

        btnCargarCiudadano.setBackground(new Color(35,153,67));

    }//GEN-LAST:event_btnCargarCiudadanoMouseExited

    private void btnCargarCiudadanoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargarCiudadanoMouseReleased

        try {
            TimeUnit.MILLISECONDS.sleep(300);

            // En caso de haber funciones van aquí dentro-*-

        } catch (InterruptedException ex) {
            Logger.getLogger(CargarCiudadano.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnCargarCiudadanoMouseReleased

                       // BTN CARGAR CIUDADANO  
    
    private void btnCargarCiudadanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarCiudadanoActionPerformed
                                                

        try {
        String dniText = jTFDni.getText();
        String nombreText = (String) jTFNombre.getText();
        String emailText = (String) jTFEmail.getText();
        String celularText = (String) jTFCelular.getText();
        String patologiaText = (String) jCBPatologia.getSelectedItem();
        String ambitoTrabajoText = (String) jCBAmbitoTrabajo.getSelectedItem();
        
                      // Condicional para datos vacios-*-
        
       if (dniText.isEmpty() || nombreText.isEmpty() || emailText.isEmpty() || celularText.isEmpty() || patologiaText.isEmpty() || ambitoTrabajoText.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Debe completar todos los campos.");
    return;
} 
                      // DNI  
        
        if (dniText.length()>=9 || dniText.length()<5){
            JOptionPane.showMessageDialog(this, "Debe introducir un dni válido");
            jTFDni.setText("");
            return; // <= buena práctica
        }
        
                         
                      // No se permiten acentos ni carateres especiales en la DB-*-
        
        if (nombreText.length()>=25 || nombreText.length()<3 || !nombreText.matches("[a-zA-Z\\s]+")) {
            JOptionPane.showMessageDialog(this, "Debe introducir un nombre válido");
            jTFNombre.setText("");
            return;
            } else {
            nombreText = nombreText.toLowerCase();
}
        
        
        
        
        
//         if(emailText.length()>=25 || emailText.length()<10 || !emailText.contains("@")) {
//            JOptionPane.showMessageDialog(this, "Ingrese un Email válido con '@'");    
//            jTFEmail.setText("");
//            return;
//        }  
         
//       if(emailText.length()>=25 || emailText.length()<10 || !emailText.matches("[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}")) {
//           JOptionPane.showMessageDialog(this, "Ingrese un Email válido que contenga '@'");    
//           jTFEmail.setText("");
//           return;
//           } else {
//           emailText = emailText.toLowerCase().replaceAll("[^a-zA-Z0-9._-@]+", "");
//}
                      // No se permiten letras mayusculas ni caracteres especiales-*-    
      
          if(emailText.length()>=25 || emailText.length()<10 || !emailText.matches("[a-z0-9._-]+@[a-z0-9.-]+\\.[a-z]{2,4}")) {
             JOptionPane.showMessageDialog(this, "Ingrese un Email en minuscula, que contenga '@' y sin caracteres especiales");    
             jTFEmail.setText("");
             return;
             } else {
             emailText = emailText.toLowerCase();
}


                      // Celular 

        if(celularText.length()>=15 || celularText.length()<8 || !celularText.matches("[0-9]+")) {
            JOptionPane.showMessageDialog(this, "Ingrese un numero de celular válido");
            jTFCelular.setText("");
            return; // <= buena práctica
        }
        
        
                     // Patología
        
        if(jCBPatologia.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una patología.");
            jCBPatologia.setSelectedIndex(-1);
            return;
        }             
        
        
                     // Ambito Trabajo 
        
        if (jCBAmbitoTrabajo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un ámbito de trabajo válido.");
            jCBAmbitoTrabajo.setSelectedIndex(-1);
            return;
}
        
        
             
        int dni = Integer.parseInt(jTFDni.getText());
        ciudadano.setDni(dni);
        ciudadano.setNombreCompleto(nombreText);
        ciudadano.setCelular(celularText);
        ciudadano.setEmail(emailText);
        ciudadano.setPatologia(patologiaText);
        ciudadano.setAmbitoTrabajo(ambitoTrabajoText);
        
        cd.guardarCiudadano(ciudadano);
        
        limpiarPantalla();
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "El campo DNI debe ser un número válido.");
    }                                                  
    

    }//GEN-LAST:event_btnCargarCiudadanoActionPerformed
         
             // SUSPENDIDA-*-
    
//    private void cargarPatologias() {
//    List<String> listasAmbitoTrabajo = new ArrayList<>();
//    listasAmbitoTrabajo.add("Educación");
//    listasAmbitoTrabajo.add("Salud");
//    listasAmbitoTrabajo.add("Otros");
//    
//    jCBAmbitoTrabajo.removeAllItems();
//    
//    for (String ambitoTrabajo : listasAmbitoTrabajo) {
//        jCBAmbitoTrabajo.addItem(ambitoTrabajo); 
//    }
//}
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarCiudadano;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> jCBAmbitoTrabajo;
    private javax.swing.JComboBox<String> jCBPatologia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFCelular;
    private javax.swing.JTextField jTFDni;
    private javax.swing.JTextField jTFEmail;
    private javax.swing.JTextField jTFNombre;
    // End of variables declaration//GEN-END:variables

    public void limpiarPantalla() {

        jTFDni.setText("");
        jTFNombre.setText("");
        jTFEmail.setText("");
        jTFCelular.setText("");
        jCBPatologia.setSelectedIndex(0); // toma indice 0
        jCBAmbitoTrabajo.setSelectedIndex(0); // toma indice 0


    }
}
