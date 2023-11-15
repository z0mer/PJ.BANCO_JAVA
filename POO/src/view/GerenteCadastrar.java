package view;
import static java.time.Clock.system;
import javax.accessibility.AccessibleContext;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JRootPane;
import javax.swing.JTextField;
import controller.ControllerCadastrarCliente;


public class GerenteCadastrar extends javax.swing.JFrame {

    public GerenteCadastrar() {
        initComponents();
        controller = new ControllerCadastrarCliente(this);
    }

    public ControllerCadastrarCliente getController() {
        return controller;
    }

    public void setController(ControllerCadastrarCliente controller) {
        this.controller = controller;
    }

    public JMenuBar getDecoracaob() {
        return Decoracaob;
    }

    public void setDecoracaob(JMenuBar Decoracaob) {
        this.Decoracaob = Decoracaob;
    }

    public JButton getBt_cancelar_criar() {
        return bt_cancelar_criar;
    }

    public void setBt_cancelar_criar(JButton bt_cancelar_criar) {
        this.bt_cancelar_criar = bt_cancelar_criar;
    }

    public JButton getBt_criar_cadastrar() {
        return bt_criar_cadastrar;
    }

    public void setBt_criar_cadastrar(JButton bt_criar_cadastrar) {
        this.bt_criar_cadastrar = bt_criar_cadastrar;
    }

    public JMenu getjMenu2() {
        return jMenu2;
    }

    public void setjMenu2(JMenu jMenu2) {
        this.jMenu2 = jMenu2;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JLabel getLb_cpf_cliente() {
        return lb_cpf_cliente;
    }

    public void setLb_cpf_cliente(JLabel lb_cpf_cliente) {
        this.lb_cpf_cliente = lb_cpf_cliente;
    }

    public JLabel getLb_nome_cliente() {
        return lb_nome_cliente;
    }

    public void setLb_nome_cliente(JLabel lb_nome_cliente) {
        this.lb_nome_cliente = lb_nome_cliente;
    }

    public JLabel getLb_senha_cliente() {
        return lb_senha_cliente;
    }

    public void setLb_senha_cliente(JLabel lb_senha_cliente) {
        this.lb_senha_cliente = lb_senha_cliente;
    }

    public JLabel getLb_tipo_conta() {
        return lb_tipo_conta;
    }

    public void setLb_tipo_conta(JLabel lb_tipo_conta) {
        this.lb_tipo_conta = lb_tipo_conta;
    }

    public JLabel getLb_titulo_cadastre() {
        return lb_titulo_cadastre;
    }

    public void setLb_titulo_cadastre(JLabel lb_titulo_cadastre) {
        this.lb_titulo_cadastre = lb_titulo_cadastre;
    }

    public JLabel getLb_valor_cliente() {
        return lb_valor_cliente;
    }

    public void setLb_valor_cliente(JLabel lb_valor_cliente) {
        this.lb_valor_cliente = lb_valor_cliente;
    }

    public JRadioButton getRb_corrente() {
        return rb_corrente;
    }

    public void setRb_corrente(JRadioButton rb_corrente) {
        this.rb_corrente = rb_corrente;
    }

    public JRadioButton getRb_poupanca() {
        return rb_poupanca;
    }

    public void setRb_poupanca(JRadioButton rb_poupanca) {
        this.rb_poupanca = rb_poupanca;
    }

    public JRadioButton getRb_salario() {
        return rb_salario;
    }

    public void setRb_salario(JRadioButton rb_salario) {
        this.rb_salario = rb_salario;
    }

    public JTextField getCpf_cliente() {
        return cpf_cliente;
    }

    public void setCpf_cliente(JTextField cpf_cliente) {
        this.cpf_cliente = cpf_cliente;
    }

    public JTextField getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(JTextField nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public JTextField getSenha_cliente() {
        return senha_cliente;
    }

    public void setSenha_cliente(JTextField senha_cliente) {
        this.senha_cliente = senha_cliente;
    }

    public JTextField getValor_cliente() {
        return valor_cliente;
    }

    public void setValor_cliente(JTextField valor_cliente) {
        this.valor_cliente = valor_cliente;
    }

    public JRootPane getRootPane() {
        return rootPane;
    }

    public void setRootPane(JRootPane rootPane) {
        this.rootPane = rootPane;
    }

    public boolean isRootPaneCheckingEnabled() {
        return rootPaneCheckingEnabled;
    }

    public void setRootPaneCheckingEnabled(boolean rootPaneCheckingEnabled) {
        this.rootPaneCheckingEnabled = rootPaneCheckingEnabled;
    }

    public AccessibleContext getAccessibleContext() {
        return accessibleContext;
    }

    public void setAccessibleContext(AccessibleContext accessibleContext) {
        this.accessibleContext = accessibleContext;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lb_titulo_cadastre = new javax.swing.JLabel();
        lb_nome_cliente = new javax.swing.JLabel();
        nome_cliente = new javax.swing.JTextField();
        cpf_cliente = new javax.swing.JTextField();
        lb_cpf_cliente = new javax.swing.JLabel();
        lb_senha_cliente = new javax.swing.JLabel();
        senha_cliente = new javax.swing.JTextField();
        lb_valor_cliente = new javax.swing.JLabel();
        valor_cliente = new javax.swing.JTextField();
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

        lb_nome_cliente.setBackground(new java.awt.Color(255, 255, 255));
        lb_nome_cliente.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lb_nome_cliente.setForeground(new java.awt.Color(0, 204, 204));
        lb_nome_cliente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_nome_cliente.setText("NOME:");

        nome_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_clienteActionPerformed(evt);
            }
        });

        cpf_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpf_clienteActionPerformed(evt);
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

        senha_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senha_clienteActionPerformed(evt);
            }
        });

        lb_valor_cliente.setBackground(new java.awt.Color(255, 255, 255));
        lb_valor_cliente.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lb_valor_cliente.setForeground(new java.awt.Color(0, 204, 204));
        lb_valor_cliente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_valor_cliente.setText("VALOR:");

        valor_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor_clienteActionPerformed(evt);
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
                                .addComponent(nome_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lb_cpf_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cpf_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lb_valor_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lb_senha_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(senha_cliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(valor_cliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                    .addComponent(nome_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cpf_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_cpf_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_senha_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senha_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_valor_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valor_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void nome_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome_clienteActionPerformed

    private void cpf_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpf_clienteActionPerformed
       
    }//GEN-LAST:event_cpf_clienteActionPerformed

    private void senha_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senha_clienteActionPerformed
        
    }//GEN-LAST:event_senha_clienteActionPerformed

    private void valor_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valor_clienteActionPerformed

    private void rb_poupancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_poupancaActionPerformed

    }//GEN-LAST:event_rb_poupancaActionPerformed

    private void rb_salarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_salarioActionPerformed

    }//GEN-LAST:event_rb_salarioActionPerformed

    private void rb_correnteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_correnteActionPerformed

    }//GEN-LAST:event_rb_correnteActionPerformed

    private void bt_cancelar_criarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelar_criarActionPerformed
        this.dispose();
    }//GEN-LAST:event_bt_cancelar_criarActionPerformed

    private void bt_criar_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_criar_cadastrarActionPerformed
        controller.salvarCliente();
    }//GEN-LAST:event_bt_criar_cadastrarActionPerformed


    private ControllerCadastrarCliente controller;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Decoracaob;
    private javax.swing.JButton bt_cancelar_criar;
    private javax.swing.JButton bt_criar_cadastrar;
    private javax.swing.JTextField cpf_cliente;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_cpf_cliente;
    private javax.swing.JLabel lb_nome_cliente;
    private javax.swing.JLabel lb_senha_cliente;
    private javax.swing.JLabel lb_tipo_conta;
    private javax.swing.JLabel lb_titulo_cadastre;
    private javax.swing.JLabel lb_valor_cliente;
    private javax.swing.JTextField nome_cliente;
    private javax.swing.JRadioButton rb_corrente;
    private javax.swing.JRadioButton rb_poupanca;
    private javax.swing.JRadioButton rb_salario;
    private javax.swing.JTextField senha_cliente;
    private javax.swing.JTextField valor_cliente;
    // End of variables declaration//GEN-END:variables
}
