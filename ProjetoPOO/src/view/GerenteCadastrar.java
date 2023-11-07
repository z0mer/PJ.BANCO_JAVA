package view;
import static java.time.Clock.system;

public class GerenteCadastrar extends javax.swing.JFrame {

    public GerenteCadastrar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lb_titulo_cadastre = new javax.swing.JLabel();
        lb_nome_cliente = new javax.swing.JLabel();
        tf_nome_cliente = new javax.swing.JTextField();
        tf_cpf_cliente = new javax.swing.JTextField();
        lb_cpf_cliente = new javax.swing.JLabel();
        lb_senha_cliente = new javax.swing.JLabel();
        tf_senha_cliente = new javax.swing.JTextField();
        lb_valor_cliente = new javax.swing.JLabel();
        tf_valor_cliente = new javax.swing.JTextField();
        lb_tipo_conta = new javax.swing.JLabel();
        rb_salario = new javax.swing.JRadioButton();
        rb_poupanca = new javax.swing.JRadioButton();
        rb_corrente = new javax.swing.JRadioButton();
        bt_cancelar_criar = new javax.swing.JButton();
        bt_criar_cadastrar = new javax.swing.JButton();
        Decoracaob = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lb_titulo_cadastre.setBackground(new java.awt.Color(255, 255, 255));
        lb_titulo_cadastre.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lb_titulo_cadastre.setForeground(new java.awt.Color(0, 204, 204));
        lb_titulo_cadastre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_titulo_cadastre.setText("Cadastre seu cliente");
        lb_titulo_cadastre.setToolTipText("");
        lb_titulo_cadastre.setBorder(new javax.swing.border.MatteBorder(null));

        lb_nome_cliente.setBackground(new java.awt.Color(255, 255, 255));
        lb_nome_cliente.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lb_nome_cliente.setForeground(new java.awt.Color(0, 204, 204));
        lb_nome_cliente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_nome_cliente.setText("NOME:");

        tf_nome_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nome_clienteActionPerformed(evt);
            }
        });

        tf_cpf_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_cpf_clienteActionPerformed(evt);
            }
        });

        lb_cpf_cliente.setBackground(new java.awt.Color(255, 255, 255));
        lb_cpf_cliente.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lb_cpf_cliente.setForeground(new java.awt.Color(0, 204, 204));
        lb_cpf_cliente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_cpf_cliente.setText("CPF:");

        lb_senha_cliente.setBackground(new java.awt.Color(255, 255, 255));
        lb_senha_cliente.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lb_senha_cliente.setForeground(new java.awt.Color(0, 204, 204));
        lb_senha_cliente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_senha_cliente.setText("SENHA:");

        tf_senha_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_senha_clienteActionPerformed(evt);
            }
        });

        lb_valor_cliente.setBackground(new java.awt.Color(255, 255, 255));
        lb_valor_cliente.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lb_valor_cliente.setForeground(new java.awt.Color(0, 204, 204));
        lb_valor_cliente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_valor_cliente.setText("VALOR:");

        tf_valor_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_valor_clienteActionPerformed(evt);
            }
        });

        lb_tipo_conta.setBackground(new java.awt.Color(255, 255, 255));
        lb_tipo_conta.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lb_tipo_conta.setForeground(new java.awt.Color(0, 204, 204));
        lb_tipo_conta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_tipo_conta.setText("TIPO DE CONTA:");

        rb_salario.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        rb_salario.setText("Salário");
        rb_salario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_salarioActionPerformed(evt);
            }
        });

        rb_poupanca.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        rb_poupanca.setText("Poupança");
        rb_poupanca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_poupancaActionPerformed(evt);
            }
        });

        rb_corrente.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        rb_corrente.setText("Corrente");
        rb_corrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_correnteActionPerformed(evt);
            }
        });

        bt_cancelar_criar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt_cancelar_criar.setForeground(new java.awt.Color(153, 0, 0));
        bt_cancelar_criar.setText("Cancelar");
        bt_cancelar_criar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelar_criarActionPerformed(evt);
            }
        });

        bt_criar_cadastrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt_criar_cadastrar.setForeground(new java.awt.Color(0, 102, 51));
        bt_criar_cadastrar.setText("Criar");
        bt_criar_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_criar_cadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_titulo_cadastre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lb_nome_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tf_nome_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lb_cpf_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tf_cpf_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lb_valor_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lb_senha_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_senha_cliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_valor_cliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rb_salario)
                                .addGap(45, 45, 45)
                                .addComponent(rb_poupanca))
                            .addComponent(bt_cancelar_criar))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rb_corrente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(bt_criar_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)))))
                .addContainerGap())
            .addComponent(lb_tipo_conta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_titulo_cadastre, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_nome_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_nome_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_cpf_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_cpf_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_senha_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_senha_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_valor_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_valor_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lb_tipo_conta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_salario)
                    .addComponent(rb_poupanca)
                    .addComponent(rb_corrente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_cancelar_criar)
                    .addComponent(bt_criar_cadastrar))
                .addContainerGap())
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
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_nome_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nome_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nome_clienteActionPerformed

    private void tf_cpf_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cpf_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_cpf_clienteActionPerformed

    private void tf_senha_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_senha_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_senha_clienteActionPerformed

    private void tf_valor_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_valor_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_valor_clienteActionPerformed

    private void rb_poupancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_poupancaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_poupancaActionPerformed

    private void rb_salarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_salarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_salarioActionPerformed

    private void rb_correnteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_correnteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_correnteActionPerformed

    private void bt_cancelar_criarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelar_criarActionPerformed
        this.dispose();
    }//GEN-LAST:event_bt_cancelar_criarActionPerformed

    private void bt_criar_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_criar_cadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_criar_cadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(GerenteCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenteCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenteCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenteCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenteCadastrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Decoracaob;
    private javax.swing.JButton bt_cancelar_criar;
    private javax.swing.JButton bt_criar_cadastrar;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_cpf_cliente;
    private javax.swing.JLabel lb_nome_cliente;
    private javax.swing.JLabel lb_senha_cliente;
    private javax.swing.JLabel lb_tipo_conta;
    private javax.swing.JLabel lb_titulo_cadastre;
    private javax.swing.JLabel lb_valor_cliente;
    private javax.swing.JRadioButton rb_corrente;
    private javax.swing.JRadioButton rb_poupanca;
    private javax.swing.JRadioButton rb_salario;
    private javax.swing.JTextField tf_cpf_cliente;
    private javax.swing.JTextField tf_nome_cliente;
    private javax.swing.JTextField tf_senha_cliente;
    private javax.swing.JTextField tf_valor_cliente;
    // End of variables declaration//GEN-END:variables
}
