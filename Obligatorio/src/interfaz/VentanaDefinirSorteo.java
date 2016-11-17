/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import dominio.Restaurante;
import dominio.Sistema;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Guillermo
 */
public class VentanaDefinirSorteo extends javax.swing.JFrame {

    private JFrame padre;
    private Sistema sistema;

    //Constructor
    public VentanaDefinirSorteo(VentanaPrincipal ventanaPrincipal, Sistema sistema) {
        initComponents();
        this.padre = ventanaPrincipal;
        this.sistema = sistema;
        String[] restaurantes = new String[this.sistema.getRestaurantes().size()];
        for (int i = 0; i < restaurantes.length; i++) {
            restaurantes[i] = this.sistema.getRestaurantes().get(i).getNombre();
        }
        cmbBxRestaurantes.setModel(new DefaultComboBoxModel(restaurantes));
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
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
        btnDefinirSorteo = new javax.swing.JButton();
        txtFldCantGanadores = new javax.swing.JTextField();
        lblCantGanadores = new javax.swing.JLabel();
        cmbBxRestaurantes = new javax.swing.JComboBox<String>();
        lblDescripcionPremio = new javax.swing.JLabel();
        lblElegirRestaurante = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDescripcionPremio = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblTitulo.setText("DEFINIR SORTEO");

        btnDefinirSorteo.setText("DEFINIR SORTEO");
        btnDefinirSorteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefinirSorteoActionPerformed(evt);
            }
        });

        lblCantGanadores.setText("Defina la cantidad de ganadores:");

        cmbBxRestaurantes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbBxRestaurantes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbBxRestaurantesFocusLost(evt);
            }
        });

        lblDescripcionPremio.setText("Describa el premio a sortear:");

        lblElegirRestaurante.setText("Elegir que restaurante realiza el sorteo");

        txtAreaDescripcionPremio.setColumns(20);
        txtAreaDescripcionPremio.setRows(5);
        jScrollPane1.setViewportView(txtAreaDescripcionPremio);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(lblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(btnDefinirSorteo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCantGanadores)))
                .addContainerGap(111, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblElegirRestaurante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(cmbBxRestaurantes, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDescripcionPremio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(213, Short.MAX_VALUE)
                    .addComponent(txtFldCantGanadores, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbBxRestaurantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblElegirRestaurante))
                .addGap(43, 43, 43)
                .addComponent(lblCantGanadores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDescripcionPremio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addComponent(btnDefinirSorteo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(133, Short.MAX_VALUE)
                    .addComponent(txtFldCantGanadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(145, 145, 145)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDefinirSorteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefinirSorteoActionPerformed
        //Se verifica la informacion ingresada y se guarda la informacion del nuevo sorteo, si ya existe uno anteriormente, se sobreescribe
        if (verificarCampos()) {
            String nombre = (String) cmbBxRestaurantes.getSelectedItem();
            Restaurante restaurante = sistema.buscarRestaurantePorNombre(nombre);
            restaurante.definirSorteo(Integer.parseInt(txtFldCantGanadores.getText()), txtAreaDescripcionPremio.getText());
            JOptionPane.showMessageDialog(null, "Se definio exitosamente el sorteo");
            this.dispose();
            this.padre.setEnabled(true);
            this.padre.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "faltan campos a completar");
        }
    }//GEN-LAST:event_btnDefinirSorteoActionPerformed

    private void cmbBxRestaurantesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbBxRestaurantesFocusLost

    }//GEN-LAST:event_cmbBxRestaurantesFocusLost

    private boolean verificarCampos() {
        boolean retorno = true;
        if (txtFldCantGanadores.getText().isEmpty() || txtAreaDescripcionPremio.getText().isEmpty()) {
            retorno = false;
        }
        return retorno;
    }
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.dispose();
        this.padre.setEnabled(true);
        this.padre.setVisible(true);
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDefinirSorteo;
    private javax.swing.JComboBox<String> cmbBxRestaurantes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCantGanadores;
    private javax.swing.JLabel lblDescripcionPremio;
    private javax.swing.JLabel lblElegirRestaurante;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txtAreaDescripcionPremio;
    private javax.swing.JTextField txtFldCantGanadores;
    // End of variables declaration//GEN-END:variables
}
