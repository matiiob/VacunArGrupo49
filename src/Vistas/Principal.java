/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.Color;


/**
 *
 * @author pc
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    
    public int xMouse, yMouse;
    public Principal() {
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

        jPBackGround = new javax.swing.JPanel();
        jPSuperior = new javax.swing.JPanel();
        jPBotonCerrar = new javax.swing.JPanel();
        jLCerrar = new javax.swing.JLabel();
        jLImagenFondo = new javax.swing.JLabel();
        jDEscritorio = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPBackGround.setBackground(new java.awt.Color(255, 255, 255));
        jPBackGround.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPSuperior.setOpaque(false);
        jPSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPSuperiorMouseDragged(evt);
            }
        });
        jPSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPSuperiorMousePressed(evt);
            }
        });

        jPBotonCerrar.setBackground(java.awt.Color.lightGray);
        jPBotonCerrar.setPreferredSize(new java.awt.Dimension(32, 32));

        jLCerrar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        jLCerrar.setForeground(new java.awt.Color(0, 0, 0));
        jLCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLCerrar.setText("x");
        jLCerrar.setPreferredSize(new java.awt.Dimension(32, 32));
        jLCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLCerrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPBotonCerrarLayout = new javax.swing.GroupLayout(jPBotonCerrar);
        jPBotonCerrar.setLayout(jPBotonCerrarLayout);
        jPBotonCerrarLayout.setHorizontalGroup(
            jPBotonCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPBotonCerrarLayout.setVerticalGroup(
            jPBotonCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPSuperiorLayout = new javax.swing.GroupLayout(jPSuperior);
        jPSuperior.setLayout(jPSuperiorLayout);
        jPSuperiorLayout.setHorizontalGroup(
            jPSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPSuperiorLayout.createSequentialGroup()
                .addContainerGap(848, Short.MAX_VALUE)
                .addComponent(jPBotonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPSuperiorLayout.setVerticalGroup(
            jPSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPBotonCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPBackGround.add(jPSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 30));

        jLImagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/fondo.jpg"))); // NOI18N
        jPBackGround.add(jLImagenFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, -1, -1));

        jDEscritorio.setPreferredSize(new java.awt.Dimension(640, 427));

        javax.swing.GroupLayout jDEscritorioLayout = new javax.swing.GroupLayout(jDEscritorio);
        jDEscritorio.setLayout(jDEscritorioLayout);
        jDEscritorioLayout.setHorizontalGroup(
            jDEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        jDEscritorioLayout.setVerticalGroup(
            jDEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
        );

        jPBackGround.add(jDEscritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(50, 71, 138));
        jPanel1.setPreferredSize(new java.awt.Dimension(240, 427));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(195, 227, 250));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 240, 40));

        jPanel4.setBackground(new java.awt.Color(174, 215, 245));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 240, 40));

        jPanel5.setBackground(new java.awt.Color(167, 206, 235));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 240, 40));

        jPanel6.setBackground(new java.awt.Color(122, 184, 225));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 240, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/LogoVacunAr2.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 200, 90));

        jPBackGround.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPBackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPBackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPSuperiorMousePressed
        // TODO add your handling code here:

        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPSuperiorMousePressed

    private void jPSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPSuperiorMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPSuperiorMouseDragged

    private void jLCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCerrarMouseExited
        // TODO add your handling code here:
        jPBotonCerrar.setBackground(Color.LIGHT_GRAY);
        jLCerrar.setForeground(Color.black);
    }//GEN-LAST:event_jLCerrarMouseExited

    private void jLCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCerrarMouseEntered
        // TODO add your handling code here:
        jPBotonCerrar.setBackground(Color.red);
        jLCerrar.setForeground(Color.white);
    }//GEN-LAST:event_jLCerrarMouseEntered

    private void jLCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCerrarMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLCerrarMouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDEscritorio;
    private javax.swing.JLabel jLCerrar;
    private javax.swing.JLabel jLImagenFondo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPBackGround;
    private javax.swing.JPanel jPBotonCerrar;
    private javax.swing.JPanel jPSuperior;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
