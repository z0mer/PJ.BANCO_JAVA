package view;

public class GerenteCriarContas extends javax.swing.JFrame {

    public GerenteCriarContas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lb_titulo_criar_contas = new javax.swing.JLabel();
        lb_cpf_criar_contas = new javax.swing.JLabel();
        tf_cpf_criar_contas = new javax.swing.JTextField();
        lb_valor_criar_contas = new javax.swing.JLabel();
        tf_valor_criar_contas = new javax.swing.JTextField();
        lb_tipo_conta_criar_contas = new javax.swing.JLabel();
        rb_salario_criar_contas = new javax.swing.JRadioButton();
        rb_poupanca_criar_contas = new javax.swing.JRadioButton();
        rb_corrente_criar_contas = new javax.swing.JRadioButton();
        Criarbt = new javax.swing.JButton();
        Cancelarbt = new javax.swing.JButton();
        Decoracaob = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lb_titulo_criar_contas.setBackground(new java.awt.Color(255, 255, 255));
        lb_titulo_criar_contas.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lb_titulo_criar_contas.setForeground(new java.awt.Color(0, 204, 204));
        lb_titulo_criar_contas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_titulo_criar_contas.setText("Criar Conta");
        lb_titulo_criar_contas.setToolTipText("");
        lb_titulo_criar_contas.setBorder(new javax.swing.border.MatteBorder(null));

        lb_cpf_criar_contas.setBackground(new java.awt.Color(255, 255, 255));
        lb_cpf_criar_contas.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lb_cpf_criar_contas.setForeground(new java.awt.Color(0, 204, 204));
        lb_cpf_criar_contas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_cpf_criar_contas.setText("CPF:");

        tf_cpf_criar_contas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_cpf_criar_contasActionPerformed(evt);
            }
        });

        lb_valor_criar_contas.setBackground(new java.awt.Color(255, 255, 255));
        lb_valor_criar_contas.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lb_valor_criar_contas.setForeground(new java.awt.Color(0, 204, 204));
        lb_valor_criar_contas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_valor_criar_contas.setText("VALOR:");

        tf_valor_criar_contas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_valor_criar_contasActionPerformed(evt);
            }
        });

        lb_tipo_conta_criar_contas.setBackground(new java.awt.Color(255, 255, 255));
        lb_tipo_conta_criar_contas.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lb_tipo_conta_criar_contas.setForeground(new java.awt.Color(0, 204, 204));
        lb_tipo_conta_criar_contas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_tipo_conta_criar_contas.setText("TIPO DE CONTA:");

        rb_salario_criar_contas.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        rb_salario_criar_contas.setText("Salário");
        rb_salario_criar_contas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_salario_criar_contasActionPerformed(evt);
            }
        });

        rb_poupanca_criar_contas.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        rb_poupanca_criar_contas.setText("Poupança");
        rb_poupanca_criar_contas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_poupanca_criar_contasActionPerformed(evt);
            }
        });

        rb_corrente_criar_contas.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        rb_corrente_criar_contas.setText("Corrente");
        rb_corrente_criar_contas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_corrente_criar_contasActionPerformed(evt);
            }
        });

        Criarbt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Criarbt.setForeground(new java.awt.Color(0, 102, 51));
        Criarbt.setText("Criar");

        Cancelarbt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Cancelarbt.setForeground(new java.awt.Color(153, 0, 0));
        Cancelarbt.setText("Cancelar");
        Cancelarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarbtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Cancelarbt)
                                .addGap(116, 116, 116)
                                .addComponent(Criarbt))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rb_salario_criar_contas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rb_poupanca_criar_contas)
                                .addGap(31, 31, 31)
                                .addComponent(rb_corrente_criar_contas))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lb_valor_criar_contas, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                            .addComponent(lb_cpf_criar_contas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_cpf_criar_contas, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                            .addComponent(tf_valor_criar_contas))))
                .addGap(27, 27, 27))
            .addComponent(lb_titulo_criar_contas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lb_tipo_conta_criar_contas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_titulo_criar_contas)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_cpf_criar_contas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_cpf_criar_contas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_valor_criar_contas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_valor_criar_contas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lb_tipo_conta_criar_contas)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_salario_criar_contas)
                    .addComponent(rb_poupanca_criar_contas)
                    .addComponent(rb_corrente_criar_contas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Criarbt)
                    .addComponent(Cancelarbt))
                .addGap(28, 28, 28))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void tf_cpf_criar_contasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cpf_criar_contasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_cpf_criar_contasActionPerformed

    private void tf_valor_criar_contasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_valor_criar_contasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_valor_criar_contasActionPerformed

    private void rb_salario_criar_contasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_salario_criar_contasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_salario_criar_contasActionPerformed

    private void rb_poupanca_criar_contasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_poupanca_criar_contasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_poupanca_criar_contasActionPerformed

    private void rb_corrente_criar_contasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_corrente_criar_contasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_corrente_criar_contasActionPerformed

    private void CancelarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarbtActionPerformed
        this.dispose();
    }//GEN-LAST:event_CancelarbtActionPerformed

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
            java.util.logging.Logger.getLogger(GerenteCriarContas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenteCriarContas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenteCriarContas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenteCriarContas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenteCriarContas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelarbt;
    private javax.swing.JButton Criarbt;
    private javax.swing.JMenuBar Decoracaob;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_cpf_criar_contas;
    private javax.swing.JLabel lb_tipo_conta_criar_contas;
    private javax.swing.JLabel lb_titulo_criar_contas;
    private javax.swing.JLabel lb_valor_criar_contas;
    private javax.swing.JRadioButton rb_corrente_criar_contas;
    private javax.swing.JRadioButton rb_poupanca_criar_contas;
    private javax.swing.JRadioButton rb_salario_criar_contas;
    private javax.swing.JTextField tf_cpf_criar_contas;
    private javax.swing.JTextField tf_valor_criar_contas;
    // End of variables declaration//GEN-END:variables
}
