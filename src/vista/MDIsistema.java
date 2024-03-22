/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package vista;

import Modelo.Cliente;
import Modelo.ConexionBD;
import java.beans.PropertyVetoException;

/**
 *
 * @author JHONNY
 */
public class MDIsistema extends javax.swing.JFrame {

    FRMAuto miAuto;
    FRMAuditoria fauditoria;
    FRMCliente fcliente;
    FRMEstudiante festudiante;
    FRMLogin flogin;
    FRMProducto fproducto;
    FRMProveedor fproveedor;
    FRMRol frol;
    
    
    
    
    
    /**
     * Creates new form MDIsistema
     */
    public MDIsistema() {
        ConexionBD.getInstance();
        initComponents();
        miAuto = new FRMAuto();
        fauditoria = new FRMAuditoria();
        fcliente = new FRMCliente();
        festudiante = new FRMEstudiante();
        flogin = new FRMLogin();
        fproducto = new FRMProducto();
        fproveedor = new FRMProveedor();
        frol = new FRMRol();
      
        
        //
        escritorio .add(miAuto);
        escritorio.add(fauditoria);
        escritorio.add(fcliente);
        escritorio.add(festudiante);
        escritorio.add(flogin);
        escritorio.add(fproducto);
        escritorio.add(fproveedor);
        escritorio.add(frol);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        Auto = new javax.swing.JMenu();
        AutoMenuIten = new javax.swing.JMenuItem();
        AuditoriaMenuIten = new javax.swing.JMenuItem();
        ClienteMenuIten = new javax.swing.JMenuItem();
        EstudianteMenuIten = new javax.swing.JMenuItem();
        LoginMenuIten = new javax.swing.JMenuItem();
        ProductoMenuIten = new javax.swing.JMenuItem();
        ProveedorMenuIten = new javax.swing.JMenuItem();
        RolMenuIten = new javax.swing.JMenuItem();
        UsuarioMenuIten = new javax.swing.JMenuItem();
        VentaMenuIten = new javax.swing.JMenuItem();
        SalirMenuIten = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Auto.setMnemonic('f');
        Auto.setText("Administrar");

        AutoMenuIten.setMnemonic('o');
        AutoMenuIten.setText("Auto");
        AutoMenuIten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutoMenuItenActionPerformed(evt);
            }
        });
        Auto.add(AutoMenuIten);

        AuditoriaMenuIten.setText("Auditoria");
        AuditoriaMenuIten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AuditoriaMenuItenActionPerformed(evt);
            }
        });
        Auto.add(AuditoriaMenuIten);

        ClienteMenuIten.setText("Cliente");
        ClienteMenuIten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteMenuItenActionPerformed(evt);
            }
        });
        Auto.add(ClienteMenuIten);

        EstudianteMenuIten.setText("Estudiante");
        EstudianteMenuIten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstudianteMenuItenActionPerformed(evt);
            }
        });
        Auto.add(EstudianteMenuIten);

        LoginMenuIten.setText("Login");
        LoginMenuIten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginMenuItenActionPerformed(evt);
            }
        });
        Auto.add(LoginMenuIten);

        ProductoMenuIten.setText("Producto");
        ProductoMenuIten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductoMenuItenActionPerformed(evt);
            }
        });
        Auto.add(ProductoMenuIten);

        ProveedorMenuIten.setText("Proveedor");
        ProveedorMenuIten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProveedorMenuItenActionPerformed(evt);
            }
        });
        Auto.add(ProveedorMenuIten);

        RolMenuIten.setText("Rol");
        RolMenuIten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RolMenuItenActionPerformed(evt);
            }
        });
        Auto.add(RolMenuIten);

        UsuarioMenuIten.setText("Usuario");
        UsuarioMenuIten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioMenuItenActionPerformed(evt);
            }
        });
        Auto.add(UsuarioMenuIten);

        VentaMenuIten.setText("Venta");
        VentaMenuIten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentaMenuItenActionPerformed(evt);
            }
        });
        Auto.add(VentaMenuIten);

        SalirMenuIten.setText("Salir");
        SalirMenuIten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirMenuItenActionPerformed(evt);
            }
        });
        Auto.add(SalirMenuIten);

        menuBar.add(Auto);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Contents");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AutoMenuItenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutoMenuItenActionPerformed
        // TODO add your handling code here:
        miAuto.setVisible(true);
    }//GEN-LAST:event_AutoMenuItenActionPerformed

    private void AuditoriaMenuItenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AuditoriaMenuItenActionPerformed
        // TODO add your handling code here:
        fauditoria.setVisible(true);
    }//GEN-LAST:event_AuditoriaMenuItenActionPerformed

    private void ClienteMenuItenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteMenuItenActionPerformed
        // TODO add your handling code here:
        fcliente.setVisible(true);
    }//GEN-LAST:event_ClienteMenuItenActionPerformed

    private void EstudianteMenuItenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstudianteMenuItenActionPerformed
        // TODO add your handling code here:
        festudiante.setVisible(true);
    }//GEN-LAST:event_EstudianteMenuItenActionPerformed

    private void LoginMenuItenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginMenuItenActionPerformed
        // TODO add your handling code here:
        flogin.setVisible(true);
    }//GEN-LAST:event_LoginMenuItenActionPerformed

    private void ProductoMenuItenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductoMenuItenActionPerformed
        // TODO add your handling code here:
        fproducto.setVisible(true);
    }//GEN-LAST:event_ProductoMenuItenActionPerformed

    private void ProveedorMenuItenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProveedorMenuItenActionPerformed
        // TODO add your handling code here:
        fproveedor.setVisible(true);
    }//GEN-LAST:event_ProveedorMenuItenActionPerformed

    private void RolMenuItenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RolMenuItenActionPerformed
        // TODO add your handling code here:
        frol.setVisible(true);
    }//GEN-LAST:event_RolMenuItenActionPerformed

    private void UsuarioMenuItenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioMenuItenActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_UsuarioMenuItenActionPerformed

    private void VentaMenuItenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentaMenuItenActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_VentaMenuItenActionPerformed

    private void SalirMenuItenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirMenuItenActionPerformed
        // TODO add your handling code here:
        ConexionBD.Desconectar();
        try{
            miAuto.setClosed(true);
            fauditoria.setClosed(true);
            fcliente.setClosed(true);
            festudiante.setClosed(true);
            flogin.setClosed(true);
            fproducto.setClosed(true);
            fproveedor.setClosed(true);
            frol.setClosed(true);
            
        }catch (PropertyVetoException ex){
            System.err.println("Error al salir:"+ex.getMessage());
        }
        System.exit(0);
    }//GEN-LAST:event_SalirMenuItenActionPerformed

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
            java.util.logging.Logger.getLogger(MDIsistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDIsistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDIsistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDIsistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDIsistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AuditoriaMenuIten;
    private javax.swing.JMenu Auto;
    private javax.swing.JMenuItem AutoMenuIten;
    private javax.swing.JMenuItem ClienteMenuIten;
    private javax.swing.JMenuItem EstudianteMenuIten;
    private javax.swing.JMenuItem LoginMenuIten;
    private javax.swing.JMenuItem ProductoMenuIten;
    private javax.swing.JMenuItem ProveedorMenuIten;
    private javax.swing.JMenuItem RolMenuIten;
    private javax.swing.JMenuItem SalirMenuIten;
    private javax.swing.JMenuItem UsuarioMenuIten;
    private javax.swing.JMenuItem VentaMenuIten;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem pasteMenuItem;
    // End of variables declaration//GEN-END:variables

}
