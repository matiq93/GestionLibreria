/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author Matias
 */
public class VistaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VistaPrincipal
     */
    public VistaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        permisossucurales();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPan_general = new javax.swing.JPanel();
        jPan_vacio = new javax.swing.JPanel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenu_altas = new javax.swing.JMenu();
        jMI_altaEscritores = new javax.swing.JMenuItem();
        jMI_altaEditorial = new javax.swing.JMenuItem();
        jMI_altaLibro = new javax.swing.JMenuItem();
        jSep_1 = new javax.swing.JPopupMenu.Separator();
        jMI_Librerias = new javax.swing.JMenuItem();
        jSep_2 = new javax.swing.JPopupMenu.Separator();
        jMI_modStock = new javax.swing.JMenuItem();
        jMI_modPrecio = new javax.swing.JMenuItem();
        jMenu_consultas = new javax.swing.JMenu();
        jMI_consutaStock = new javax.swing.JMenuItem();
        jMI_consultaVentas = new javax.swing.JMenuItem();
        jMenu_ventas = new javax.swing.JMenu();
        jMI_altaCliente = new javax.swing.JMenuItem();
        jMI_altaVenta = new javax.swing.JMenuItem();
        jSep_3 = new javax.swing.JPopupMenu.Separator();
        jMI_anularVenta = new javax.swing.JMenuItem();
        jMenu_masOpciones = new javax.swing.JMenu();
        jMI_cerrarSesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 750));
        setMinimumSize(new java.awt.Dimension(900, 750));
        setPreferredSize(new java.awt.Dimension(900, 750));
        setResizable(false);

        jPan_general.setLayout(new java.awt.CardLayout());

        jPan_vacio.setMaximumSize(new java.awt.Dimension(900, 729));
        jPan_vacio.setMinimumSize(new java.awt.Dimension(900, 729));

        javax.swing.GroupLayout jPan_vacioLayout = new javax.swing.GroupLayout(jPan_vacio);
        jPan_vacio.setLayout(jPan_vacioLayout);
        jPan_vacioLayout.setHorizontalGroup(
            jPan_vacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jPan_vacioLayout.setVerticalGroup(
            jPan_vacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 729, Short.MAX_VALUE)
        );

        jPan_general.add(jPan_vacio, "card2");

        jMenu_altas.setText("Altas");

        jMI_altaEscritores.setText("Cargar Autores");
        jMI_altaEscritores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_altaEscritoresActionPerformed(evt);
            }
        });
        jMenu_altas.add(jMI_altaEscritores);

        jMI_altaEditorial.setText("Cargar Editorial");
        jMI_altaEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_altaEditorialActionPerformed(evt);
            }
        });
        jMenu_altas.add(jMI_altaEditorial);

        jMI_altaLibro.setText("Cargar Libro");
        jMenu_altas.add(jMI_altaLibro);
        jMenu_altas.add(jSep_1);

        jMI_Librerias.setText("Cargar Sucursales");
        jMenu_altas.add(jMI_Librerias);
        jMenu_altas.add(jSep_2);

        jMI_modStock.setText("Modificar Stock");
        jMenu_altas.add(jMI_modStock);

        jMI_modPrecio.setText("Modificar Precio");
        jMenu_altas.add(jMI_modPrecio);

        jMenuBar.add(jMenu_altas);

        jMenu_consultas.setText("Consultas");

        jMI_consutaStock.setText("Consultar Stock");
        jMenu_consultas.add(jMI_consutaStock);

        jMI_consultaVentas.setText("Historial de Venta");
        jMenu_consultas.add(jMI_consultaVentas);

        jMenuBar.add(jMenu_consultas);

        jMenu_ventas.setText("Ventas");

        jMI_altaCliente.setText("Nuevo Cliente");
        jMenu_ventas.add(jMI_altaCliente);

        jMI_altaVenta.setText("Nueva Venta");
        jMenu_ventas.add(jMI_altaVenta);
        jMenu_ventas.add(jSep_3);

        jMI_anularVenta.setText("Anular Factura");
        jMI_anularVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_anularVentaActionPerformed(evt);
            }
        });
        jMenu_ventas.add(jMI_anularVenta);

        jMenuBar.add(jMenu_ventas);

        jMenu_masOpciones.setText("Opciones");

        jMI_cerrarSesion.setText("Cerrar Sesión");
        jMI_cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_cerrarSesionActionPerformed(evt);
            }
        });
        jMenu_masOpciones.add(jMI_cerrarSesion);

        jMenuBar.add(jMenu_masOpciones);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPan_general, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPan_general, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMI_altaEscritoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_altaEscritoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMI_altaEscritoresActionPerformed

    private void jMI_altaEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_altaEditorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMI_altaEditorialActionPerformed

    private void jMI_anularVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_anularVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMI_anularVentaActionPerformed

    private void jMI_cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_cerrarSesionActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMI_cerrarSesionActionPerformed

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
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jMI_Librerias;
    private javax.swing.JMenuItem jMI_altaCliente;
    private javax.swing.JMenuItem jMI_altaEditorial;
    private javax.swing.JMenuItem jMI_altaEscritores;
    private javax.swing.JMenuItem jMI_altaLibro;
    private javax.swing.JMenuItem jMI_altaVenta;
    private javax.swing.JMenuItem jMI_anularVenta;
    private javax.swing.JMenuItem jMI_cerrarSesion;
    private javax.swing.JMenuItem jMI_consultaVentas;
    private javax.swing.JMenuItem jMI_consutaStock;
    private javax.swing.JMenuItem jMI_modPrecio;
    private javax.swing.JMenuItem jMI_modStock;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenu_altas;
    private javax.swing.JMenu jMenu_consultas;
    private javax.swing.JMenu jMenu_masOpciones;
    private javax.swing.JMenu jMenu_ventas;
    private javax.swing.JPanel jPan_general;
    private javax.swing.JPanel jPan_vacio;
    private javax.swing.JPopupMenu.Separator jSep_1;
    private javax.swing.JPopupMenu.Separator jSep_2;
    private javax.swing.JPopupMenu.Separator jSep_3;
    // End of variables declaration//GEN-END:variables

    private void permisossucurales() {
        if (Controlador.GestionLibreria.idUsuario!=1) {
            jMI_Librerias.setVisible(false);
            jSep_1.setVisible(false);
        }
    }
}