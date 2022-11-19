/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import javax.swing.JOptionPane;
import java.awt.Color;

/**
 *
 * @author natty
 */
public class CuentaNueva extends javax.swing.JFrame {
    /**
     * Creates new form CuentaNueva
     */
    public CuentaNueva() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        casillaRut = new javax.swing.JTextField();
        casillaContrasenia = new javax.swing.JPasswordField();
        casillaNombre = new javax.swing.JTextField();
        casillaDireccion = new javax.swing.JTextField();
        casillaNumero = new javax.swing.JTextField();
        casillaEdad = new javax.swing.JTextField();
        btnRegistrarse = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jLblRut = new javax.swing.JLabel();
        jLblContrasenia = new javax.swing.JLabel();
        jLblNombre = new javax.swing.JLabel();
        jLblDireccion = new javax.swing.JLabel();
        jLblNumero = new javax.swing.JLabel();
        jLblEdad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblTitulo.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 130, 130));
        lblTitulo.setText("NUEVA CUENTA");

        casillaRut.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        casillaRut.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        casillaRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casillaRutActionPerformed(evt);
            }
        });

        casillaContrasenia.setText("jPasswordField1");

        casillaNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        casillaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casillaNombreActionPerformed(evt);
            }
        });

        casillaDireccion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        casillaNumero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        casillaEdad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        casillaEdad.setForeground(new java.awt.Color(0, 0, 0));
        casillaEdad.setToolTipText("");

        btnRegistrarse.setBackground(new java.awt.Color(0, 130, 130));
        btnRegistrarse.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarse.setText("REGISTRARTE");
        btnRegistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarseMouseClicked(evt);
            }
        });
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });

        btnAtras.setBackground(new java.awt.Color(0, 130, 130));
        btnAtras.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(255, 255, 255));
        btnAtras.setText("Atrás");
        btnAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAtrasMouseClicked(evt);
            }
        });

        jLblRut.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLblRut.setForeground(new java.awt.Color(0, 130, 130));
        jLblRut.setText("Rut (sin guión y dígito verificador):");

        jLblContrasenia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLblContrasenia.setForeground(new java.awt.Color(0, 130, 130));
        jLblContrasenia.setText("Contraseña:");

        jLblNombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLblNombre.setForeground(new java.awt.Color(0, 130, 130));
        jLblNombre.setText("Nombre y apellido:");

        jLblDireccion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLblDireccion.setForeground(new java.awt.Color(0, 130, 130));
        jLblDireccion.setText("Dirección:");

        jLblNumero.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLblNumero.setForeground(new java.awt.Color(0, 130, 130));
        jLblNumero.setText("Número de contacto:");

        jLblEdad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLblEdad.setForeground(new java.awt.Color(0, 130, 130));
        jLblEdad.setText("Edad:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAtras)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(91, 91, 91))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(casillaDireccion)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLblDireccion)
                                .addComponent(jLblNombre)
                                .addComponent(casillaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(24, 24, 24))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLblNumero)
                                    .addGap(59, 59, 59))
                                .addComponent(casillaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLblEdad)
                                .addComponent(casillaEdad))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(btnRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(casillaRut, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblRut)
                    .addComponent(jLblContrasenia)
                    .addComponent(casillaContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAtras)
                .addGap(45, 45, 45)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLblRut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(casillaRut, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLblContrasenia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(casillaContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(casillaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLblDireccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(casillaDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblNumero)
                    .addComponent(jLblEdad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(casillaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casillaEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(btnRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 651));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void casillaRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casillaRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casillaRutActionPerformed

    private void casillaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casillaNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casillaNombreActionPerformed

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void btnAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtrasMouseClicked
        // TODO add your handling code here:
        InicioSesion atras=new InicioSesion();
        atras.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAtrasMouseClicked

    private void btnRegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarseMouseClicked
        // TODO add your handling code here:
        int edadInt=0, numeroInt=0;
        boolean error=false;
        
        Modelos.AdultoMayor adultos;
        
        String rut=casillaRut.getText();
        String contrasenia=String.valueOf(casillaContrasenia.getPassword());
        String nombre=casillaNombre.getText();
        String direccion=casillaDireccion.getText();
        
        
        String edad=casillaEdad.getText();
        String numeroContacto=casillaNumero.getText();
        try{
            edadInt=Integer.parseInt(edad);
            numeroInt=Integer.parseInt(numeroContacto);
        }catch(NumberFormatException ex){
            ex.printStackTrace();
        }
        
        //falta sacarle el color si modifica el dato por uno valido
        if (!rut.matches("[0-9]*")){
            casillaRut.setBackground(new Color(250, 108, 97));
            error=true;
        }if (!nombre.matches("[a-zA-Z]*")){
            casillaNombre.setBackground(new Color(250, 108, 97));
            error=true;
        }else if (!direccion.matches("[a-zA-Z]*")){
            casillaDireccion.setBackground(new Color(250, 108, 97));
            error=true;
        }else if (!numeroContacto.matches("[0-9]*")){
            casillaNumero.setBackground(new Color(250, 108, 97));
            error=true;
        }else if (!edad.matches("[0-9]*")){
            casillaEdad.setBackground(new Color(250, 108, 97));
            error=true;
        }
        
        if (error!=true){
            adultos=new Modelos.AdultoMayor(rut, contrasenia, nombre, direccion, edadInt, numeroInt);

            JOptionPane.showMessageDialog(this, "Su cuenta ha sido creada");
            Menu registrada=new Menu();
            registrada.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnRegistrarseMouseClicked

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
            java.util.logging.Logger.getLogger(CuentaNueva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CuentaNueva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CuentaNueva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CuentaNueva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CuentaNueva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JPasswordField casillaContrasenia;
    private javax.swing.JTextField casillaDireccion;
    private javax.swing.JTextField casillaEdad;
    private javax.swing.JTextField casillaNombre;
    private javax.swing.JTextField casillaNumero;
    private javax.swing.JTextField casillaRut;
    private javax.swing.JLabel jLblContrasenia;
    private javax.swing.JLabel jLblDireccion;
    private javax.swing.JLabel jLblEdad;
    private javax.swing.JLabel jLblNombre;
    private javax.swing.JLabel jLblNumero;
    private javax.swing.JLabel jLblRut;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
