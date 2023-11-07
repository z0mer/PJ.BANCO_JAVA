package view;

public class GerenteClienteCadastrado extends javax.swing.JFrame {

    public GerenteClienteCadastrado() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lb_nome_cliente_cadastrado = new javax.swing.JLabel();
        tf_nome_cliente_cadastrado = new javax.swing.JTextField();
        lb_cpf_cliente_cadastrado = new javax.swing.JLabel();
        tf_cpf_cliente_cadastrado = new javax.swing.JTextField();
        lb_senha_cliente_cadastrado = new javax.swing.JLabel();
        tf_senha_cliente_cadastrado = new javax.swing.JTextField();
        lb_valor_cliente_cadastrado = new javax.swing.JLabel();
        tf_valor_cliente_cadastrado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf_tipo_conta_cadastrado = new javax.swing.JTextField();
        Voltarbt = new javax.swing.JToggleButton();
        Decoracaob = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cliente Cadastrado!");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));

        lb_nome_cliente_cadastrado.setBackground(new java.awt.Color(255, 255, 255));
        lb_nome_cliente_cadastrado.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lb_nome_cliente_cadastrado.setForeground(new java.awt.Color(0, 204, 204));
        lb_nome_cliente_cadastrado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_nome_cliente_cadastrado.setText("NOME:");

        tf_nome_cliente_cadastrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nome_cliente_cadastradoActionPerformed(evt);
            }
        });

        lb_cpf_cliente_cadastrado.setBackground(new java.awt.Color(255, 255, 255));
        lb_cpf_cliente_cadastrado.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lb_cpf_cliente_cadastrado.setForeground(new java.awt.Color(0, 204, 204));
        lb_cpf_cliente_cadastrado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_cpf_cliente_cadastrado.setText("CPF:");

        tf_cpf_cliente_cadastrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_cpf_cliente_cadastradoActionPerformed(evt);
            }
        });

        lb_senha_cliente_cadastrado.setBackground(new java.awt.Color(255, 255, 255));
        lb_senha_cliente_cadastrado.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lb_senha_cliente_cadastrado.setForeground(new java.awt.Color(0, 204, 204));
        lb_senha_cliente_cadastrado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_senha_cliente_cadastrado.setText("SENHA:");

        tf_senha_cliente_cadastrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_senha_cliente_cadastradoActionPerformed(evt);
            }
        });

        lb_valor_cliente_cadastrado.setBackground(new java.awt.Color(255, 255, 255));
        lb_valor_cliente_cadastrado.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lb_valor_cliente_cadastrado.setForeground(new java.awt.Color(0, 204, 204));
        lb_valor_cliente_cadastrado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_valor_cliente_cadastrado.setText("VALOR:");

        tf_valor_cliente_cadastrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_valor_cliente_cadastradoActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("CONTA:");

        tf_tipo_conta_cadastrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_tipo_conta_cadastradoActionPerformed(evt);
            }
        });

        Voltarbt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Voltarbt.setForeground(new java.awt.Color(153, 0, 0));
        Voltarbt.setText("Voltar");
        Voltarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarbtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lb_cpf_cliente_cadastrado, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_cpf_cliente_cadastrado, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lb_nome_cliente_cadastrado, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_nome_cliente_cadastrado, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lb_senha_cliente_cadastrado, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tf_senha_cliente_cadastrado, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lb_valor_cliente_cadastrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tf_valor_cliente_cadastrado, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                                .addComponent(tf_tipo_conta_cadastrado)))))
                .addContainerGap(25, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Voltarbt, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lb_nome_cliente_cadastrado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_nome_cliente_cadastrado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_cpf_cliente_cadastrado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_cpf_cliente_cadastrado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_senha_cliente_cadastrado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_senha_cliente_cadastrado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_valor_cliente_cadastrado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_valor_cliente_cadastrado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_tipo_conta_cadastrado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Voltarbt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        Decoracaob.setBackground(new java.awt.Color(0, 204, 204));
        Decoracaob.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Decoracaob.setForeground(new java.awt.Color(0, 204, 204));
        Decoracaob.setToolTipText("");
        Decoracaob.add(jMenu2);

        setJMenuBar(Decoracaob);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_valor_cliente_cadastradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_valor_cliente_cadastradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_valor_cliente_cadastradoActionPerformed

    private void tf_senha_cliente_cadastradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_senha_cliente_cadastradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_senha_cliente_cadastradoActionPerformed

    private void tf_cpf_cliente_cadastradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cpf_cliente_cadastradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_cpf_cliente_cadastradoActionPerformed

    private void tf_nome_cliente_cadastradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nome_cliente_cadastradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nome_cliente_cadastradoActionPerformed

    private void tf_tipo_conta_cadastradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_tipo_conta_cadastradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_tipo_conta_cadastradoActionPerformed

    private void VoltarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarbtActionPerformed
        this.dispose();
    }//GEN-LAST:event_VoltarbtActionPerformed

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
            java.util.logging.Logger.getLogger(GerenteClienteCadastrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenteClienteCadastrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenteClienteCadastrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenteClienteCadastrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenteClienteCadastrado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Decoracaob;
    private javax.swing.JToggleButton Voltarbt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_cpf_cliente_cadastrado;
    private javax.swing.JLabel lb_nome_cliente_cadastrado;
    private javax.swing.JLabel lb_senha_cliente_cadastrado;
    private javax.swing.JLabel lb_valor_cliente_cadastrado;
    private javax.swing.JTextField tf_cpf_cliente_cadastrado;
    private javax.swing.JTextField tf_nome_cliente_cadastrado;
    private javax.swing.JTextField tf_senha_cliente_cadastrado;
    private javax.swing.JTextField tf_tipo_conta_cadastrado;
    private javax.swing.JTextField tf_valor_cliente_cadastrado;
    // End of variables declaration//GEN-END:variables
}
