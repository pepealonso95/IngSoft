/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import dominio.Sistema;
import javax.swing.JOptionPane;

/**
 *
 * @author Guillermo
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private static Sistema sistema = new Sistema();

    public static Sistema getSistema() {
        return sistema;
    }

    public static void setSistema(Sistema sistema) {
        VentanaPrincipal.sistema = sistema;
    }
    public VentanaPrincipal() {
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

        lblTitulo = new javax.swing.JLabel();
        btnCrearFichaRestaurante = new javax.swing.JToggleButton();
        btnEditarFichaRestaurante = new javax.swing.JToggleButton();
        btnRealizarEvaluacion = new javax.swing.JToggleButton();
        btnDefinirSorteo = new javax.swing.JToggleButton();
        btnRealizarSorteo = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setText("MENU PRINCIPAL");

        btnCrearFichaRestaurante.setText("Crear Ficha Restaurante");
        btnCrearFichaRestaurante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearFichaRestauranteActionPerformed(evt);
            }
        });

        btnEditarFichaRestaurante.setText("Editar Ficha Restaurante");
        btnEditarFichaRestaurante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarFichaRestauranteActionPerformed(evt);
            }
        });

        btnRealizarEvaluacion.setText("Realizar Evaluacion");
        btnRealizarEvaluacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarEvaluacionActionPerformed(evt);
            }
        });

        btnDefinirSorteo.setText("Definir Sorteo");
        btnDefinirSorteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefinirSorteoActionPerformed(evt);
            }
        });

        btnRealizarSorteo.setText("Realizar Sorteo");
        btnRealizarSorteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarSorteoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(lblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEditarFichaRestaurante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRealizarEvaluacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDefinirSorteo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRealizarSorteo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCrearFichaRestaurante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(35, 35, 35)
                .addComponent(btnCrearFichaRestaurante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditarFichaRestaurante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRealizarEvaluacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDefinirSorteo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRealizarSorteo)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRealizarEvaluacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarEvaluacionActionPerformed
        //se clickeo el boton para realizar una nueva evaluacion
        VentanaRealizarEvaluacion ventana = new VentanaRealizarEvaluacion(this, sistema);
        ventana.setVisible(true);
        this.setEnabled(false);
    }//GEN-LAST:event_btnRealizarEvaluacionActionPerformed

    private void btnCrearFichaRestauranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearFichaRestauranteActionPerformed
        //se clickeo el boton para crear una nueva ficha de restaurante
        VentanaCrearFichaRestaurante ventana = new VentanaCrearFichaRestaurante(this, sistema);
        ventana.setVisible(true);
        this.setEnabled(false);
    }//GEN-LAST:event_btnCrearFichaRestauranteActionPerformed

    private void btnEditarFichaRestauranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarFichaRestauranteActionPerformed
        //se clickeo el boton para editar una ficha de restaurante
        if(VentanaPrincipal.sistema.getRestaurantes().size()>0){
            VentanaEditarFichaRestaurante ventana = new VentanaEditarFichaRestaurante(this, sistema);
            ventana.setVisible(true);
            this.setEnabled(false);
        }
        else{
            JOptionPane.showMessageDialog(null, "no hay restaurantes cargados para editar");
        }
    }//GEN-LAST:event_btnEditarFichaRestauranteActionPerformed

    private void btnDefinirSorteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefinirSorteoActionPerformed
        // Se clickeo el boton para definir un nuevo sorteo
        if(VentanaPrincipal.sistema.getRestaurantes().size()>0){
        VentanaDefinirSorteo ventana = new VentanaDefinirSorteo(this, sistema);
        ventana.setVisible(true);
        this.setEnabled(false);
        }
        else{
            JOptionPane.showMessageDialog(null, "no hay restaurantes cargados para editar");
        }
    }//GEN-LAST:event_btnDefinirSorteoActionPerformed

    private void btnRealizarSorteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarSorteoActionPerformed
        // Se clickeo el boton para realizar un sorteo
        if(VentanaPrincipal.sistema.getRestaurantes().size()>0){
        VentanaRealizarSorteo ventana = new VentanaRealizarSorteo(this, sistema);
        ventana.setVisible(true);
        this.setEnabled(false);
        }
        else{
            JOptionPane.showMessageDialog(null, "no hay restaurantes cargados para editar");
        }
    }//GEN-LAST:event_btnRealizarSorteoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCrearFichaRestaurante;
    private javax.swing.JToggleButton btnDefinirSorteo;
    private javax.swing.JToggleButton btnEditarFichaRestaurante;
    private javax.swing.JToggleButton btnRealizarEvaluacion;
    private javax.swing.JToggleButton btnRealizarSorteo;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
