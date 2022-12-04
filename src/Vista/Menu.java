/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import javax.swing.JOptionPane;

/**
 *
 * @author natty
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);  
    }
    
    int comando=0;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        pnPrincipal = new javax.swing.JPanel();
        btnApoderado = new javax.swing.JButton();
        btnMedicamentos = new javax.swing.JButton();
        btnHorasMedicas = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnDatos1 = new javax.swing.JButton();
        btnEmergencia = new javax.swing.JButton();
        btnLlamar = new javax.swing.JButton();
        tabPn = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        pnApoderado = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblApoderado = new javax.swing.JLabel();
        btnRegistrarApoderado = new javax.swing.JButton();
        btnMostrarApoderado = new javax.swing.JButton();
        btnApoderadoMenor = new javax.swing.JButton();
        pnMedicamentos = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblMedicamentos = new javax.swing.JLabel();
        btnAgregarMedicamento = new javax.swing.JButton();
        btnMostrarMedicamento = new javax.swing.JButton();
        btnEliminarMedicamento = new javax.swing.JButton();
        pnHoras = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblHorasMedicas = new javax.swing.JLabel();
        btnAgregarHora = new javax.swing.JButton();
        btnMostrarHoras = new javax.swing.JButton();
        btnBuscarHora = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(8, 153, 112));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(0, 130, 130));

        btnSalir.setBackground(new java.awt.Color(7, 71, 143));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(716, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalir)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 50));

        pnPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        btnApoderado.setBackground(new java.awt.Color(7, 71, 143));
        btnApoderado.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        btnApoderado.setForeground(new java.awt.Color(255, 255, 255));
        btnApoderado.setText("Apoderado");
        btnApoderado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnApoderadoMouseClicked(evt);
            }
        });
        btnApoderado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApoderadoActionPerformed(evt);
            }
        });

        btnMedicamentos.setBackground(new java.awt.Color(7, 71, 143));
        btnMedicamentos.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        btnMedicamentos.setForeground(new java.awt.Color(255, 255, 255));
        btnMedicamentos.setText("Medicamentos");
        btnMedicamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMedicamentosMouseClicked(evt);
            }
        });

        btnHorasMedicas.setBackground(new java.awt.Color(7, 71, 143));
        btnHorasMedicas.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        btnHorasMedicas.setForeground(new java.awt.Color(255, 255, 255));
        btnHorasMedicas.setText("Horas médicas");
        btnHorasMedicas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHorasMedicasMouseClicked(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(7, 71, 143));
        btnEditar.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });

        btnDatos1.setBackground(new java.awt.Color(7, 71, 143));
        btnDatos1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        btnDatos1.setForeground(new java.awt.Color(255, 255, 255));
        btnDatos1.setText("Adulto mayor");
        btnDatos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDatos1MouseClicked(evt);
            }
        });
        btnDatos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatos1ActionPerformed(evt);
            }
        });

        btnEmergencia.setBackground(new java.awt.Color(255, 255, 255));
        btnEmergencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/emergencia.png"))); // NOI18N
        btnEmergencia.setBorder(null);
        btnEmergencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEmergenciaMouseClicked(evt);
            }
        });
        btnEmergencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmergenciaActionPerformed(evt);
            }
        });

        btnLlamar.setBackground(new java.awt.Color(255, 255, 255));
        btnLlamar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/telefono.png"))); // NOI18N
        btnLlamar.setBorder(null);
        btnLlamar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLlamarMouseClicked(evt);
            }
        });
        btnLlamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLlamarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnPrincipalLayout = new javax.swing.GroupLayout(pnPrincipal);
        pnPrincipal.setLayout(pnPrincipalLayout);
        pnPrincipalLayout.setHorizontalGroup(
            pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPrincipalLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnLlamar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEmergencia)
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPrincipalLayout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPrincipalLayout.createSequentialGroup()
                        .addComponent(btnDatos1)
                        .addGap(107, 107, 107))
                    .addGroup(pnPrincipalLayout.createSequentialGroup()
                        .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMedicamentos)
                            .addComponent(btnHorasMedicas))
                        .addContainerGap())))
            .addGroup(pnPrincipalLayout.createSequentialGroup()
                .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPrincipalLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(btnApoderado))
                    .addGroup(pnPrincipalLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(btnEditar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnPrincipalLayout.setVerticalGroup(
            pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPrincipalLayout.createSequentialGroup()
                .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnPrincipalLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEmergencia))
                    .addGroup(pnPrincipalLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(btnDatos1)
                        .addGap(18, 18, 18)
                        .addComponent(btnApoderado)
                        .addGap(18, 18, 18)
                        .addComponent(btnMedicamentos)
                        .addGap(18, 18, 18)
                        .addComponent(btnHorasMedicas)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addComponent(btnLlamar)))
                .addGap(14, 14, 14))
        );

        getContentPane().add(pnPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, 560));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 567, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabPn.addTab("tab4", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        lblApoderado.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        lblApoderado.setForeground(new java.awt.Color(0, 0, 0));
        lblApoderado.setText("Apoderado");

        btnRegistrarApoderado.setBackground(new java.awt.Color(0, 130, 130));
        btnRegistrarApoderado.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        btnRegistrarApoderado.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarApoderado.setText("Registrar apoderado");
        btnRegistrarApoderado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarApoderadoMouseClicked(evt);
            }
        });
        btnRegistrarApoderado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarApoderadoActionPerformed(evt);
            }
        });

        btnMostrarApoderado.setBackground(new java.awt.Color(0, 130, 130));
        btnMostrarApoderado.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        btnMostrarApoderado.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrarApoderado.setText("Datos apoderado");
        btnMostrarApoderado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMostrarApoderadoMouseClicked(evt);
            }
        });
        btnMostrarApoderado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarApoderadoActionPerformed(evt);
            }
        });

        btnApoderadoMenor.setBackground(new java.awt.Color(0, 130, 130));
        btnApoderadoMenor.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        btnApoderadoMenor.setForeground(new java.awt.Color(255, 255, 255));
        btnApoderadoMenor.setText("Apoderado menor");
        btnApoderadoMenor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnApoderadoMenorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(lblApoderado)
                        .addGap(111, 111, 111))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btnRegistrarApoderado)
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnApoderadoMenor)
                            .addComponent(btnMostrarApoderado))
                        .addGap(78, 78, 78))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(lblApoderado)
                .addGap(43, 43, 43)
                .addComponent(btnRegistrarApoderado)
                .addGap(44, 44, 44)
                .addComponent(btnMostrarApoderado)
                .addGap(37, 37, 37)
                .addComponent(btnApoderadoMenor)
                .addContainerGap(167, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnApoderadoLayout = new javax.swing.GroupLayout(pnApoderado);
        pnApoderado.setLayout(pnApoderadoLayout);
        pnApoderadoLayout.setHorizontalGroup(
            pnApoderadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnApoderadoLayout.setVerticalGroup(
            pnApoderadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabPn.addTab("tab1", pnApoderado);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblMedicamentos.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        lblMedicamentos.setForeground(new java.awt.Color(0, 0, 0));
        lblMedicamentos.setText("Medicamentos");

        btnAgregarMedicamento.setBackground(new java.awt.Color(0, 130, 130));
        btnAgregarMedicamento.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        btnAgregarMedicamento.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarMedicamento.setText("Agregar medicamento");
        btnAgregarMedicamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMedicamentoMouseClicked(evt);
            }
        });
        btnAgregarMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMedicamentoActionPerformed(evt);
            }
        });

        btnMostrarMedicamento.setBackground(new java.awt.Color(0, 130, 130));
        btnMostrarMedicamento.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        btnMostrarMedicamento.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrarMedicamento.setText("Mostrar medicamento");
        btnMostrarMedicamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMostrarMedicamentoMouseClicked(evt);
            }
        });

        btnEliminarMedicamento.setBackground(new java.awt.Color(0, 130, 130));
        btnEliminarMedicamento.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        btnEliminarMedicamento.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarMedicamento.setText("Eliminar medicamento");
        btnEliminarMedicamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMedicamentoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMedicamentos)
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnEliminarMedicamento)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnMostrarMedicamento)
                            .addComponent(btnAgregarMedicamento))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(lblMedicamentos)
                .addGap(36, 36, 36)
                .addComponent(btnAgregarMedicamento)
                .addGap(29, 29, 29)
                .addComponent(btnMostrarMedicamento)
                .addGap(36, 36, 36)
                .addComponent(btnEliminarMedicamento)
                .addContainerGap(182, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnMedicamentosLayout = new javax.swing.GroupLayout(pnMedicamentos);
        pnMedicamentos.setLayout(pnMedicamentosLayout);
        pnMedicamentosLayout.setHorizontalGroup(
            pnMedicamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnMedicamentosLayout.setVerticalGroup(
            pnMedicamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabPn.addTab("tab2", pnMedicamentos);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lblHorasMedicas.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        lblHorasMedicas.setForeground(new java.awt.Color(0, 0, 0));
        lblHorasMedicas.setText("Horas médicas");

        btnAgregarHora.setBackground(new java.awt.Color(0, 130, 130));
        btnAgregarHora.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        btnAgregarHora.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarHora.setText("Agregar hora");
        btnAgregarHora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarHoraMouseClicked(evt);
            }
        });
        btnAgregarHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarHoraActionPerformed(evt);
            }
        });

        btnMostrarHoras.setBackground(new java.awt.Color(0, 130, 130));
        btnMostrarHoras.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        btnMostrarHoras.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrarHoras.setText("Mostrar horas");
        btnMostrarHoras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMostrarHorasMouseClicked(evt);
            }
        });
        btnMostrarHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarHorasActionPerformed(evt);
            }
        });

        btnBuscarHora.setBackground(new java.awt.Color(0, 130, 130));
        btnBuscarHora.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        btnBuscarHora.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarHora.setText("Buscar hora");
        btnBuscarHora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarHoraMouseClicked(evt);
            }
        });
        btnBuscarHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarHoraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnMostrarHoras)
                            .addComponent(btnAgregarHora)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnBuscarHora))
                    .addComponent(lblHorasMedicas))
                .addGap(106, 106, 106))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(lblHorasMedicas)
                .addGap(48, 48, 48)
                .addComponent(btnAgregarHora)
                .addGap(30, 30, 30)
                .addComponent(btnMostrarHoras)
                .addGap(33, 33, 33)
                .addComponent(btnBuscarHora)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnHorasLayout = new javax.swing.GroupLayout(pnHoras);
        pnHoras.setLayout(pnHorasLayout);
        pnHorasLayout.setHorizontalGroup(
            pnHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnHorasLayout.setVerticalGroup(
            pnHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabPn.addTab("tab3", pnHoras);

        getContentPane().add(tabPn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 430, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnApoderadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApoderadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnApoderadoActionPerformed

    private void btnApoderadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnApoderadoMouseClicked
        // TODO add your handling code here:
        tabPn.setSelectedIndex(1);
    }//GEN-LAST:event_btnApoderadoMouseClicked

    private void btnMedicamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMedicamentosMouseClicked
        // TODO add your handling code here:
        tabPn.setSelectedIndex(2);
    }//GEN-LAST:event_btnMedicamentosMouseClicked

    private void btnHorasMedicasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHorasMedicasMouseClicked
        // TODO add your handling code here:
        tabPn.setSelectedIndex(3);
    }//GEN-LAST:event_btnHorasMedicasMouseClicked

    private void btnAgregarMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMedicamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarMedicamentoActionPerformed

    private void btnMostrarHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarHorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMostrarHorasActionPerformed

    private void btnBuscarHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarHoraActionPerformed

    private void btnRegistrarApoderadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarApoderadoMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Interactue con la consola");
        comando=2;
    }//GEN-LAST:event_btnRegistrarApoderadoMouseClicked

    private void btnMostrarApoderadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarApoderadoMouseClicked
        // TODO add your handling code here:
        comando=3;
    }//GEN-LAST:event_btnMostrarApoderadoMouseClicked

    private void btnAgregarMedicamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMedicamentoMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Interactue con la consola");
        comando=4;
    }//GEN-LAST:event_btnAgregarMedicamentoMouseClicked

    private void btnMostrarMedicamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarMedicamentoMouseClicked
        // TODO add your handling code here:
        comando=5;
    }//GEN-LAST:event_btnMostrarMedicamentoMouseClicked

    private void btnEliminarMedicamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMedicamentoMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Interactue con la consola");
        comando=6;
    }//GEN-LAST:event_btnEliminarMedicamentoMouseClicked

    private void btnAgregarHoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarHoraMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Interactue con la consola");
        comando=7;
    }//GEN-LAST:event_btnAgregarHoraMouseClicked

    private void btnMostrarHorasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarHorasMouseClicked
        // TODO add your handling code here:
        comando=8;
    }//GEN-LAST:event_btnMostrarHorasMouseClicked

    private void btnBuscarHoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarHoraMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Interactue con la consola");
        comando=9;
    }//GEN-LAST:event_btnBuscarHoraMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Interactue con la consola");
        comando=10;
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnAgregarHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarHoraActionPerformed

    private void btnRegistrarApoderadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarApoderadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarApoderadoActionPerformed

    private void btnMostrarApoderadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarApoderadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMostrarApoderadoActionPerformed

    private void btnDatos1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDatos1MouseClicked
        // TODO add your handling code here:
        comando=1;
    }//GEN-LAST:event_btnDatos1MouseClicked

    private void btnDatos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDatos1ActionPerformed

    private void btnLlamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLlamarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLlamarActionPerformed

    private void btnEmergenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmergenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEmergenciaActionPerformed

    private void btnLlamarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLlamarMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Interactue con la consola");
        comando=11;
    }//GEN-LAST:event_btnLlamarMouseClicked

    private void btnEmergenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmergenciaMouseClicked
        // TODO add your handling code here:
        comando=12;
    }//GEN-LAST:event_btnEmergenciaMouseClicked

    private void btnApoderadoMenorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnApoderadoMenorMouseClicked
        // TODO add your handling code here:
        comando=13;
    }//GEN-LAST:event_btnApoderadoMenorMouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Menu().setVisible(true);
            }
        });
    }

    public int getComando() {
        return comando;
    }

    public void setComando(int comando) {
        this.comando = comando;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarHora;
    private javax.swing.JButton btnAgregarMedicamento;
    private javax.swing.JButton btnApoderado;
    private javax.swing.JButton btnApoderadoMenor;
    private javax.swing.JButton btnBuscarHora;
    private javax.swing.JButton btnDatos1;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminarMedicamento;
    private javax.swing.JButton btnEmergencia;
    private javax.swing.JButton btnHorasMedicas;
    private javax.swing.JButton btnLlamar;
    private javax.swing.JButton btnMedicamentos;
    private javax.swing.JButton btnMostrarApoderado;
    private javax.swing.JButton btnMostrarHoras;
    private javax.swing.JButton btnMostrarMedicamento;
    private javax.swing.JButton btnRegistrarApoderado;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lblApoderado;
    private javax.swing.JLabel lblHorasMedicas;
    private javax.swing.JLabel lblMedicamentos;
    private javax.swing.JPanel pnApoderado;
    private javax.swing.JPanel pnHoras;
    private javax.swing.JPanel pnMedicamentos;
    private javax.swing.JPanel pnPrincipal;
    private javax.swing.JTabbedPane tabPn;
    // End of variables declaration//GEN-END:variables
}
