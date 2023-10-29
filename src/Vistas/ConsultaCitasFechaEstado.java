/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.CitaVacunacionData;
import Entidades.CitaVacunacion;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Juan Manuel
 */
public class ConsultaCitasFechaEstado extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    private CitaVacunacionData cvd;
    private List<CitaVacunacion> citas;
    private Color defaultColor = new Color(142, 170, 189); // color x default-*-
    private Container c = getContentPane();

    public ConsultaCitasFechaEstado() {
        initComponents();
        modelo = new DefaultTableModel();
        armarCabeceraTabla();
        cvd = new CitaVacunacionData();
        c.setBackground(defaultColor);
    }

    private void listarCitasPorFechas() {
        try {
            borrarFilasTabla();
            // Fecha desde
            Date desdeDate = jDCFechaDesde.getDate();
            Instant desdeInstant = desdeDate.toInstant();
            LocalDate desdeLocalDate = desdeInstant.atZone(ZoneId.systemDefault()).toLocalDate();
            // Fecha hasta
            Date hastaDate = jDCFechaHasta.getDate();
            Instant hastaInstant = hastaDate.toInstant();
            LocalDate hastaLocalDate = hastaInstant.atZone(ZoneId.systemDefault()).toLocalDate();
            // Estado
            boolean estado = !jRBCanceladas.isSelected();
            // Lista Citas
            citas = cvd.obtenerCitasPorFechas(desdeLocalDate, hastaLocalDate, estado);
            // Rellenar filas
            if (citas.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No se encontraron citas entre las fechas seleccionadas.");
            } else {
                for (CitaVacunacion cita : citas) {
                    modelo.addRow(new Object[]{cita.getIdCodCita(), cita.getIdCiudadano(), cita.getCodRefuerzo(), cita.getFechaHoraCita(),
                        cita.getCentroVacunacion(), cita.getFechaHoraColoca(), cita.getDosis(), cita.isEstado()});
                }
            }
        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(this, "Selecciona una Fecha Desde y Hasta.");
        }
    }

    private void listarCitasVencidas() {
        borrarFilasTabla();
        // Lista Citas
        citas = cvd.obtenerCitasVencidas();
        // Rellenar filas
        if (citas.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se encontraron citas vencidas.");
        } else {
            for (CitaVacunacion cita : citas) {
                modelo.addRow(new Object[]{cita.getIdCodCita(), cita.getIdCiudadano(), cita.getCodRefuerzo(), cita.getFechaHoraCita(),
                    cita.getCentroVacunacion(), cita.getFechaHoraColoca(), cita.getDosis(), cita.isEstado()});
            }
        }
    }

    private void listarCitasCumplidas() {
        borrarFilasTabla();
        // Listar Citas
        citas = cvd.obtenerCitasCumplidas();
        // Rellenar filas
        if (citas.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se encontraron citas cumplidas.");
        } else {
            for (CitaVacunacion cita : citas) {
                modelo.addRow(new Object[]{cita.getIdCodCita(), cita.getIdCiudadano(), cita.getCodRefuerzo(), cita.getFechaHoraCita(),
                    cita.getCentroVacunacion(), cita.getFechaHoraColoca(), cita.getDosis(), cita.isEstado()});
            }
        }
    }

    private void listarCitasCanceladas() {
        borrarFilasTabla();
        // Listar Citas
        citas = cvd.obtenerCitasCanceladas();
        // Rellenar filas
        if (citas.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se encontraron citas canceladas.");
        } else {
            for (CitaVacunacion cita : citas) {
                modelo.addRow(new Object[]{cita.getIdCodCita(), cita.getIdCiudadano(), cita.getCodRefuerzo(), cita.getFechaHoraCita(),
                    cita.getCentroVacunacion(), cita.getFechaHoraColoca(), cita.getDosis(), cita.isEstado()});
            }
        }
    }

    private void borrarFilasTabla() {
        int indice = modelo.getRowCount() - 1;

        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    private void armarCabeceraTabla() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("idCodCita");
        filaCabecera.add("idCiudadano");
        filaCabecera.add("codRefuerzo");
        filaCabecera.add("fechaHoraCita");
        filaCabecera.add("centroVacunacion");
        filaCabecera.add("fechaHoraColoca");
        filaCabecera.add("dosis");
        filaCabecera.add("estado");
        for (Object rec : filaCabecera) {
            modelo.addColumn(rec);
        }
        jTable1.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jRBCanceladas = new javax.swing.JRadioButton();
        jRBCumplidas = new javax.swing.JRadioButton();
        jRBVencidas = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jRBFechas = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jDCFechaDesde = new com.toedter.calendar.JDateChooser();
        jDCFechaHasta = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jBBuscar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        btnAlternancia = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "www.argentina.gob.ar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 12), new java.awt.Color(3, 67, 97))); // NOI18N
        setOpaque(false);

        jPanel1.setBackground(new java.awt.Color(142, 170, 189));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(650, 450));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Listar Citas");

        jPanel4.setOpaque(false);

        buttonGroup1.add(jRBCanceladas);
        jRBCanceladas.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jRBCanceladas.setForeground(new java.awt.Color(255, 255, 255));
        jRBCanceladas.setText("Canceladas");

        buttonGroup1.add(jRBCumplidas);
        jRBCumplidas.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jRBCumplidas.setForeground(new java.awt.Color(255, 255, 255));
        jRBCumplidas.setText("Cumplidas");

        buttonGroup1.add(jRBVencidas);
        jRBVencidas.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jRBVencidas.setForeground(new java.awt.Color(255, 255, 255));
        jRBVencidas.setText("Vencidas");

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Criterio de busqueda");

        buttonGroup1.add(jRBFechas);
        jRBFechas.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jRBFechas.setForeground(new java.awt.Color(255, 255, 255));
        jRBFechas.setSelected(true);
        jRBFechas.setText("Por fecha");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(33, 33, 33))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jRBFechas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRBCanceladas)
                    .addComponent(jRBCumplidas)
                    .addComponent(jRBVencidas))
                .addGap(17, 17, 17))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBCanceladas)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBCumplidas)
                    .addComponent(jRBFechas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRBVencidas)
                .addContainerGap())
        );

        jPanel5.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hasta");

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Desde");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jDCFechaDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jDCFechaHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jDCFechaDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDCFechaHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(288, 288, 288))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.setOpaque(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setOpaque(false);

        jBBuscar.setBackground(new java.awt.Color(41, 84, 171));
        jBBuscar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jBBuscar.setForeground(new java.awt.Color(0, 0, 0));
        jBBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/lupa.png"))); // NOI18N
        jBBuscar.setText("Buscar");
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

        jBLimpiar.setBackground(new java.awt.Color(157, 161, 158));
        jBLimpiar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jBLimpiar.setForeground(new java.awt.Color(0, 0, 0));
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

        jBCancelar.setBackground(new java.awt.Color(138, 4, 17));
        jBCancelar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jBCancelar.setForeground(new java.awt.Color(0, 0, 0));
        jBCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/basura.png"))); // NOI18N
        jBCancelar.setText("Cancelar Cita");
        jBCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBCancelarMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jBCancelarMouseReleased(evt);
            }
        });
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jBBuscar)
                .addGap(75, 75, 75)
                .addComponent(jBLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBCancelar)
                .addGap(69, 69, 69)
                .addComponent(jBSalir)
                .addGap(63, 63, 63))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jBBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBSalir)
                        .addComponent(jBLimpiar)
                        .addComponent(jBCancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 739, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAlternancia)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnAlternancia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
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

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        if (jRBFechas.isSelected()) {
            listarCitasPorFechas();
        }
        if (jRBVencidas.isSelected()) {
            listarCitasVencidas();
        }
        if (jRBCanceladas.isSelected()) {
            listarCitasCanceladas();
        }
        if (jRBCumplidas.isSelected()) {
            listarCitasCumplidas();
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        int fila = jTable1.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila para cancelar.");
        } else {
            int cerrar = JOptionPane.showConfirmDialog(this, "¿Está seguro de que quiere cancelar el registro seleccionado?", "Cancelar cita", 0, 2);
            if (cerrar == 0) {
                fila = jTable1.getSelectedRow();
                int idCita = (Integer) modelo.getValueAt(fila, 0);
                if (fila != -1) {
                    cvd.eliminarCitaVacunacion(idCita);
                }
                jBBuscar.doClick();
            }
        }
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed

        if (jRBFechas.getText().isEmpty() && jDCFechaDesde.getDate() == null && jDCFechaHasta.getDate() == null) {
            JOptionPane.showMessageDialog(this, "No hay datos para limpiar.");
        } else {

            jRBFechas.setSelected(true);
            jDCFechaDesde.setDate(null);
            jDCFechaHasta.setDate(null);
            borrarFilasTabla();

        }
    }//GEN-LAST:event_jBLimpiarActionPerformed

    // BTN ALTERNANCIA 
    private boolean isBlack = false; // inicializamos color-*-
//    private Color defaultColor = new Color(142, 170, 189); // color x default-*-

    private void btnAlternanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlternanciaActionPerformed
//         Container c = getContentPane();
        if (isBlack) {
            c.setBackground(defaultColor);
            isBlack = false;
        } else {
            c.setBackground(Color.BLACK);
            isBlack = true;
        }
    }//GEN-LAST:event_btnAlternanciaActionPerformed

    // HOVER Buscar 
    private void jBBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBuscarMouseEntered
        Color myColor = new Color(29, 34, 179); // creo mí color personalizado-*-

        jBBuscar.setBackground(myColor);
    }//GEN-LAST:event_jBBuscarMouseEntered
    // HOVER Buscar 
    private void jBBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBuscarMouseExited
        jBBuscar.setBackground(new Color(41, 84, 171));
    }//GEN-LAST:event_jBBuscarMouseExited
    // HOVER Buscar  
    private void jBBuscarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBuscarMouseReleased
        try {
            TimeUnit.MILLISECONDS.sleep(300);

            // En caso de haber funciones van aquí dentro-*-
        } catch (InterruptedException ex) {
            Logger.getLogger(GestionarCiudadano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBBuscarMouseReleased

    // HOVER Limpiar
    private void jBLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBLimpiarMouseEntered
        Color myColor = new Color(213, 230, 224); // creo mí color personalizado-*-

        jBLimpiar.setBackground(myColor);
    }//GEN-LAST:event_jBLimpiarMouseEntered
    // HOVER Limpiar
    private void jBLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBLimpiarMouseExited
        jBLimpiar.setBackground(new Color(157, 161, 158));
    }//GEN-LAST:event_jBLimpiarMouseExited
    // HOVER Limpiar
    private void jBLimpiarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBLimpiarMouseReleased
        try {
            TimeUnit.MILLISECONDS.sleep(300);

            // En caso de haber funciones van aquí dentro-*-
        } catch (InterruptedException ex) {
            Logger.getLogger(CargarLaboratorio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBLimpiarMouseReleased

    // HOVER Cancelar 
    private void jBCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCancelarMouseEntered
        Color myColor = new Color(224, 9, 78); // creo mí color personalizado-*-

        jBCancelar.setBackground(myColor);
    }//GEN-LAST:event_jBCancelarMouseEntered
    // HOVER Cancelar 
    private void jBCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCancelarMouseExited
        jBCancelar.setBackground(new Color(138, 4, 17));
    }//GEN-LAST:event_jBCancelarMouseExited
    // HOVER Cancelar 
    private void jBCancelarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCancelarMouseReleased
        try {
            TimeUnit.MILLISECONDS.sleep(300);

            // En caso de haber funciones van aquí dentro-*-
        } catch (InterruptedException ex) {
            Logger.getLogger(GestionarCiudadano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBCancelarMouseReleased

    // HOVER Salir
    private void jBSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalirMouseEntered
        Color myColor = new Color(88, 144, 173); // creo mí color personalizado-*-

        jBSalir.setBackground(myColor);
    }//GEN-LAST:event_jBSalirMouseEntered
    // HOVER Salir
    private void jBSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalirMouseExited
        jBSalir.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_jBSalirMouseExited
    // HOVER Salir
    private void jBSalirMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalirMouseReleased
        try {
            TimeUnit.MILLISECONDS.sleep(300);

            // En caso de haber funciones van aquí dentro-*-
        } catch (InterruptedException ex) {
            Logger.getLogger(CargarLaboratorio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBSalirMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlternancia;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBSalir;
    private com.toedter.calendar.JDateChooser jDCFechaDesde;
    private com.toedter.calendar.JDateChooser jDCFechaHasta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRBCanceladas;
    private javax.swing.JRadioButton jRBCumplidas;
    private javax.swing.JRadioButton jRBFechas;
    private javax.swing.JRadioButton jRBVencidas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
