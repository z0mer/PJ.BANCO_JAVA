package view;
import controller.ControllerLoginCliente;
import model.Cliente;
import javax.swing.*;
import java.awt.event.ActionEvent;
import javax.accessibility.AccessibleContext;

public class ClienteLogin extends javax.swing.JFrame {

    public ClienteLogin() {
        initComponents();
        controller = new ControllerLoginCliente(this);
    }
    
    public ControllerLoginCliente getController() {
        return controller;
    }

    public void setController(ControllerLoginCliente controller) {
        this.controller = controller;
    }

    public JLabel getBancolb() {
        return Bancolb;
    }

    public void setBancolb(JLabel Bancolb) {
        this.Bancolb = Bancolb;
    }

    public JLabel getCpflb() {
        return Cpflb;
    }

    public void setCpflb(JLabel Cpflb) {
        this.Cpflb = Cpflb;
    }

    public JLabel getCpflb1() {
        return Cpflb1;
    }

    public void setCpflb1(JLabel Cpflb1) {
        this.Cpflb1 = Cpflb1;
    }

    public JTextField getCpftxt() {
        return Cpftxt;
    }

    public void setCpftxt(JTextField Cpftxt) {
        this.Cpftxt = Cpftxt;
    }

    public JMenuBar getDecoracaob() {
        return Decoracaob;
    }

    public void setDecoracaob(JMenuBar Decoracaob) {
        this.Decoracaob = Decoracaob;
    }

    public JToggleButton getEntrarbt() {
        return Entrarbt;
    }

    public void setEntrarbt(JToggleButton Entrarbt) {
        this.Entrarbt = Entrarbt;
    }

    public JLabel getLogolb() {
        return Logolb;
    }

    public void setLogolb(JLabel Logolb) {
        this.Logolb = Logolb;
    }

    public JPasswordField getSenhapss() {
        return Senhapss;
    }

    public void setSenhapss(JPasswordField Senhapss) {
        this.Senhapss = Senhapss;
    }

    public JToggleButton getVoltarbt() {
        return Voltarbt;
    }

    public void setVoltarbt(JToggleButton Voltarbt) {
        this.Voltarbt = Voltarbt;
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
    
    public ClienteLogin(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Bancolb = new javax.swing.JLabel();
        Cpflb = new javax.swing.JLabel();
        Cpftxt = new javax.swing.JTextField();
        Cpflb1 = new javax.swing.JLabel();
        Entrarbt = new javax.swing.JToggleButton();
        Logolb = new javax.swing.JLabel();
        Senhapss = new javax.swing.JPasswordField();
        Voltarbt = new javax.swing.JToggleButton();
        Decoracaob = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Bancolb.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Bancolb.setForeground(new java.awt.Color(0, 0, 153));
        Bancolb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bancolb.setText("Banco");

        Cpflb.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        Cpflb.setForeground(new java.awt.Color(0, 0, 204));
        Cpflb.setText("CPF: ");

        Cpftxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CpftxtActionPerformed(evt);
            }
        });

        Cpflb1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        Cpflb1.setForeground(new java.awt.Color(0, 0, 204));
        Cpflb1.setText("Senha: ");

        Entrarbt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Entrarbt.setForeground(new java.awt.Color(0, 102, 51));
        Entrarbt.setText("Entrar");
        Entrarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarbtActionPerformed(evt);
            }
        });

        Logolb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Logolb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logolb.setText("LOGO");
        Logolb.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Senhapss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SenhapssActionPerformed(evt);
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
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Voltarbt, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Entrarbt, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Cpflb1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Senhapss))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Cpflb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Cpftxt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(36, Short.MAX_VALUE))))
            .addComponent(Bancolb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Logolb, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Bancolb)
                .addGap(27, 27, 27)
                .addComponent(Logolb, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Cpftxt)
                    .addComponent(Cpflb, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cpflb1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Senhapss, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Entrarbt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Voltarbt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        Decoracaob.setBackground(new java.awt.Color(0, 0, 153));
        Decoracaob.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Decoracaob.setForeground(new java.awt.Color(0, 0, 153));
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void CpftxtActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void EntrarbtActionPerformed(java.awt.event.ActionEvent evt) {                                         
        controller.loginCliente();
    }                                        

    private void SenhapssActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void VoltarbtActionPerformed(java.awt.event.ActionEvent evt) {                                         
        this.dispose();
    }                                        

    
    private ControllerLoginCliente controller;
    // Variables declaration - do not modify                     
    private javax.swing.JLabel Bancolb;
    private javax.swing.JLabel Cpflb;
    private javax.swing.JLabel Cpflb1;
    private javax.swing.JTextField Cpftxt;
    private javax.swing.JMenuBar Decoracaob;
    private javax.swing.JToggleButton Entrarbt;
    private javax.swing.JLabel Logolb;
    private javax.swing.JPasswordField Senhapss;
    private javax.swing.JToggleButton Voltarbt;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration                   

    public Object getLb_senha_cliente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getLb_cpf_cliente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
