/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infox.telas;

import br.com.infox.dal.ModuloConexao;
import java.awt.Dimension;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import java.sql.*;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author bento
 */
public class TelaPrincipal extends javax.swing.JFrame {
    
    Connection conexao;
    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        conexao = ModuloConexao.conector();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        menuCad = new javax.swing.JMenu();
        menuCadCliente = new javax.swing.JMenuItem();
        menuCadOS = new javax.swing.JMenuItem();
        menuCadUser = new javax.swing.JMenuItem();
        menuRel = new javax.swing.JMenu();
        menRelCli = new javax.swing.JMenuItem();
        menuRelServ = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        menuAjudaSobre = new javax.swing.JMenuItem();
        menuOpt = new javax.swing.JMenu();
        menuOptSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("D Project - Sistema para criação de ordem de serviço");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        desktop.setPreferredSize(new java.awt.Dimension(620, 448));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icones/System-control-panel-icon.png"))); // NOI18N

        lblUser.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        lblUser.setForeground(new java.awt.Color(95, 129, 131));
        lblUser.setText("Usuário");

        lblDate.setFont(new java.awt.Font("Yrsa", 0, 18)); // NOI18N
        lblDate.setForeground(new java.awt.Color(140, 131, 131));
        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDate.setText("Data");

        menuCad.setText("Cadastro");

        menuCadCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        menuCadCliente.setText("Cliente");
        menuCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadClienteActionPerformed(evt);
            }
        });
        menuCad.add(menuCadCliente);

        menuCadOS.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        menuCadOS.setText("OS");
        menuCadOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadOSActionPerformed(evt);
            }
        });
        menuCad.add(menuCadOS);

        menuCadUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        menuCadUser.setText("Usuário");
        menuCadUser.setEnabled(false);
        menuCadUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadUserActionPerformed(evt);
            }
        });
        menuCad.add(menuCadUser);

        menu.add(menuCad);

        menuRel.setText("Relatório");
        menuRel.setEnabled(false);

        menRelCli.setText("Clientes");
        menRelCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menRelCliActionPerformed(evt);
            }
        });
        menuRel.add(menRelCli);

        menuRelServ.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menuRelServ.setText("Serviço");
        menuRelServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRelServActionPerformed(evt);
            }
        });
        menuRel.add(menuRelServ);

        menu.add(menuRel);

        menuAjuda.setText("Ajuda");

        menuAjudaSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        menuAjudaSobre.setText("Sobre");
        menuAjudaSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAjudaSobreActionPerformed(evt);
            }
        });
        menuAjuda.add(menuAjudaSobre);

        menu.add(menuAjuda);

        menuOpt.setText("Opções");

        menuOptSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        menuOptSair.setText("Sair");
        menuOptSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOptSairActionPerformed(evt);
            }
        });
        menuOpt.add(menuOptSair);

        menu.add(menuOpt);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUser)
                            .addComponent(jLabel1))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDate)))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(810, 530));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        Date data = new Date();
        DateFormat formatadorData = DateFormat.getDateInstance(DateFormat.DEFAULT);
        lblDate.setText(formatadorData.format(data));
        
    }//GEN-LAST:event_formWindowActivated

    private void menuAjudaSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAjudaSobreActionPerformed
        // TODO add your handling code here:
        TelaSobre sobre = new TelaSobre();
        sobre.setVisible(true);
        
    }//GEN-LAST:event_menuAjudaSobreActionPerformed

    private void menuOptSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOptSairActionPerformed
        // TODO add your handling code here:
        int sair = JOptionPane.showConfirmDialog(null, "Deseja realmente Sair?","Atenção", JOptionPane.YES_NO_OPTION);
        if(sair == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_menuOptSairActionPerformed

    private void menuCadUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadUserActionPerformed
        // TODO add your handling code here:
        TelaUsuario usuario = new TelaUsuario();
        Dimension resolucao = desktop.getSize();
        
        usuario.setSize(resolucao);
        desktop.add(usuario);
        usuario.setLocation(0, 0);
        usuario.setVisible(true);
        //desktop
    }//GEN-LAST:event_menuCadUserActionPerformed

    private void menuCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadClienteActionPerformed
        // TODO add your handling code here:
        TelaCliente cliente = new TelaCliente();
        Dimension resolucao = desktop.getSize();
        
        cliente.setSize(resolucao);
        desktop.add(cliente);
        cliente.setLocation(0, 0);
        cliente.setVisible(true);
    }//GEN-LAST:event_menuCadClienteActionPerformed

    private void menuCadOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadOSActionPerformed
        // TODO add your handling code here:
        TelaOS cliente = new TelaOS();
        Dimension resolucao = desktop.getSize();
        
        cliente.setSize(resolucao);
        desktop.add(cliente);
        cliente.setLocation(0, 0);
        cliente.setVisible(true);
    }//GEN-LAST:event_menuCadOSActionPerformed

    private void menRelCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menRelCliActionPerformed
        // TODO add your handling code here:
        int confirma = JOptionPane.showConfirmDialog(null, "Confirma a impressão do relatório?", "Atenção", JOptionPane.YES_NO_OPTION);
        
        if (confirma == JOptionPane.YES_OPTION) {
            
            try {
                JasperPrint print = JasperFillManager.fillReport("MyReports/Clientes.jasper", null, conexao);
                JasperViewer.viewReport(print, false);
            } catch (JRException e) {
                JOptionPane.showMessageDialog(null, e);
            }
            
        }
        
    }//GEN-LAST:event_menRelCliActionPerformed

    private void menuRelServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRelServActionPerformed
        // TODO add your handling code here:
        int confirma = JOptionPane.showConfirmDialog(null, "Confirma a exibição do relatório?", "Atenção", JOptionPane.YES_NO_OPTION);
        
        if (confirma == JOptionPane.YES_OPTION) {
            
            try {
                JasperPrint print = JasperFillManager.fillReport("MyReports/Servicos.jasper", null, conexao);
                JasperViewer.viewReport(print, false);
            } catch (JRException e) {
                JOptionPane.showMessageDialog(null, e);
            }
            
        }
    }//GEN-LAST:event_menuRelServActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblDate;
    public static javax.swing.JLabel lblUser;
    private javax.swing.JMenuItem menRelCli;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenuItem menuAjudaSobre;
    private javax.swing.JMenu menuCad;
    private javax.swing.JMenuItem menuCadCliente;
    private javax.swing.JMenuItem menuCadOS;
    public static javax.swing.JMenuItem menuCadUser;
    private javax.swing.JMenu menuOpt;
    private javax.swing.JMenuItem menuOptSair;
    public static javax.swing.JMenu menuRel;
    private javax.swing.JMenuItem menuRelServ;
    // End of variables declaration//GEN-END:variables
}