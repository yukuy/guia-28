/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

import Controlador.ControladorCliente;
import Modelo.Cliente;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JHONNY
 */
public class FRMCliente extends javax.swing.JInternalFrame {
    
    ControladorCliente clienteController = new ControladorCliente();

    /**
     * Creates new form FRMCliente
     */
    public FRMCliente() {
        initComponents();
        TXTIdCliente.setValue(0);
        TXTIdCliente.setVisible(false);
        limpiarFormulario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        LBLNombre = new javax.swing.JLabel();
        LBLDocumento = new javax.swing.JLabel();
        LBLDireccion = new javax.swing.JLabel();
        LBLCelular = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TXTNombreCliente = new javax.swing.JTextField();
        TXTIdCliente = new javax.swing.JFormattedTextField();
        TXTDocumentoCliente = new javax.swing.JTextField();
        TXTDireccionCliente = new javax.swing.JTextField();
        TXTCelularCliente = new javax.swing.JTextField();
        TXTBuscarCliente = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        BTNInsertar = new javax.swing.JButton();
        BTNEliminar = new javax.swing.JButton();
        BTNModificar = new javax.swing.JButton();
        BTNCerrar = new javax.swing.JButton();
        BTNBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBLCliente = new javax.swing.JTable();

        jLabel1.setText("jLabel1");

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Formulario Cliente\n");

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        LBLNombre.setText("Nombre");

        LBLDocumento.setText("Documento");

        LBLDireccion.setText("Direccion");

        LBLCelular.setText("Celular");

        jLabel6.setText("Buscar");

        TXTNombreCliente.setText("Escriba Nombre"); // NOI18N
        TXTNombreCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXTNombreClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXTNombreClienteFocusLost(evt);
            }
        });
        TXTNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTNombreClienteActionPerformed(evt);
            }
        });

        TXTIdCliente.setText("0");
        TXTIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTIdClienteActionPerformed(evt);
            }
        });

        TXTDocumentoCliente.setText("Escriba Documento");
        TXTDocumentoCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXTDocumentoClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXTDocumentoClienteFocusLost(evt);
            }
        });

        TXTDireccionCliente.setText("Escriba Direccion");
        TXTDireccionCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXTDireccionClienteFocusGained(evt);
            }
        });
        TXTDireccionCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTDireccionClienteActionPerformed(evt);
            }
        });

        TXTCelularCliente.setText("Escriba Celular");
        TXTCelularCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXTCelularClienteFocusGained(evt);
            }
        });
        TXTCelularCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTCelularClienteActionPerformed(evt);
            }
        });

        TXTBuscarCliente.setText("Escriba texto para buscar");
        TXTBuscarCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXTBuscarClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXTBuscarClienteFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LBLNombre)
                        .addGap(18, 18, 18)
                        .addComponent(TXTNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXTIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LBLDocumento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TXTDocumentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LBLDireccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TXTDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LBLCelular)
                        .addGap(18, 18, 18)
                        .addComponent(TXTCelularCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(TXTBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLNombre)
                    .addComponent(TXTNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLDocumento)
                    .addComponent(TXTDocumentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLDireccion)
                    .addComponent(TXTDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLCelular)
                    .addComponent(TXTCelularCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TXTBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));

        BTNInsertar.setText("Insertar");
        BTNInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNInsertarActionPerformed(evt);
            }
        });

        BTNEliminar.setText("Eliminar");
        BTNEliminar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BTNEliminarFocusGained(evt);
            }
        });
        BTNEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNEliminarActionPerformed(evt);
            }
        });

        BTNModificar.setText("Modificar");
        BTNModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNModificarActionPerformed(evt);
            }
        });

        BTNCerrar.setText("Cerrar");
        BTNCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCerrarActionPerformed(evt);
            }
        });

        BTNBuscar.setText("Buscar");
        BTNBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 13, Short.MAX_VALUE)
                        .addComponent(BTNModificar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTNInsertar)
                            .addComponent(BTNEliminar)
                            .addComponent(BTNCerrar)
                            .addComponent(BTNBuscar))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BTNInsertar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTNEliminar)
                .addGap(18, 18, 18)
                .addComponent(BTNModificar)
                .addGap(18, 18, 18)
                .addComponent(BTNCerrar)
                .addGap(18, 18, 18)
                .addComponent(BTNBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TBLCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "nombre", "documeto", "direccion", "celular"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TBLCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBLClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TBLCliente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 53, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXTIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTIdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTIdClienteActionPerformed

    private void TXTDireccionClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTDireccionClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTDireccionClienteActionPerformed

    private void TXTNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTNombreClienteActionPerformed

    private void TXTCelularClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTCelularClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTCelularClienteActionPerformed

    private void BTNCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCerrarActionPerformed
        // TODO add your handling code here:
        doDefaultCloseAction();
    }//GEN-LAST:event_BTNCerrarActionPerformed

    private void BTNInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNInsertarActionPerformed
        // TODO add your handling code here:
        clienteController.controlarAccion(evt, obtenerCliente());
        limpiarFormulario();
    }//GEN-LAST:event_BTNInsertarActionPerformed

    private void BTNModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNModificarActionPerformed
        // TODO add your handling code here:
        clienteController.controlarAccion(evt, obtenerCliente());
        limpiarFormulario();
    }//GEN-LAST:event_BTNModificarActionPerformed

    private void BTNEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNEliminarActionPerformed
        // TODO add your handling code here:
        clienteController.controlarAccion(evt, obtenerCliente());
        limpiarFormulario();
    }//GEN-LAST:event_BTNEliminarActionPerformed

    private void TBLClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBLClienteMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount()==2){
            int fila = TBLCliente.rowAtPoint(evt.getPoint());
            if ( fila>-1){
                TXTIdCliente.setValue((Integer) TBLCliente.getValueAt(fila, 0));
                TXTNombreCliente.setText((String) TBLCliente.getValueAt(fila, 1));
                TXTDocumentoCliente.setText((String) TBLCliente.getValueAt(fila, 2));
                TXTDireccionCliente.setText((String) TBLCliente.getValueAt(fila, 3));
                TXTCelularCliente.setText((String) TBLCliente.getValueAt(fila, 4));
                BTNModificar.setEnabled(true);
                BTNEliminar.setEnabled(true);                
            }
        }
    }//GEN-LAST:event_TBLClienteMouseClicked

    private void BTNBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBuscarActionPerformed
        // TODO add your handling code here:
        llenarTablaComBusqueda(TXTBuscarCliente.getText());
    }//GEN-LAST:event_BTNBuscarActionPerformed

    private void TXTBuscarClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXTBuscarClienteFocusGained
        // TODO add your handling code here:
        TXTBuscarCliente.setText("");
        if (TXTBuscarCliente.getText().equals("Escccriba testo a buscar")){
            TXTBuscarCliente.setText("");
        }
    }//GEN-LAST:event_TXTBuscarClienteFocusGained

    private void TXTBuscarClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXTBuscarClienteFocusLost
        // TODO add your handling code here:
        if (TXTBuscarCliente.getText().isEmpty()){
            TXTBuscarCliente.setText("Escriba texto a buscar");
        }
    }//GEN-LAST:event_TXTBuscarClienteFocusLost

    private void TXTNombreClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXTNombreClienteFocusGained
        // TODO add your handling code here:
        TXTNombreCliente.setText("");
    }//GEN-LAST:event_TXTNombreClienteFocusGained

    private void BTNEliminarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BTNEliminarFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNEliminarFocusGained

    private void TXTDocumentoClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXTDocumentoClienteFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTDocumentoClienteFocusLost

    private void TXTDocumentoClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXTDocumentoClienteFocusGained
        // TODO add your handling code here:
        TXTDocumentoCliente.setText("");
    }//GEN-LAST:event_TXTDocumentoClienteFocusGained

    private void TXTDireccionClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXTDireccionClienteFocusGained
        // TODO add your handling code here:
        TXTDireccionCliente.setText("");
    }//GEN-LAST:event_TXTDireccionClienteFocusGained

    private void TXTCelularClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXTCelularClienteFocusGained
        // TODO add your handling code here:
        TXTCelularCliente.setText("");
    }//GEN-LAST:event_TXTCelularClienteFocusGained

    private void TXTNombreClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXTNombreClienteFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TXTNombreClienteFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNBuscar;
    private javax.swing.JButton BTNCerrar;
    private javax.swing.JButton BTNEliminar;
    private javax.swing.JButton BTNInsertar;
    private javax.swing.JButton BTNModificar;
    private javax.swing.JLabel LBLCelular;
    private javax.swing.JLabel LBLDireccion;
    private javax.swing.JLabel LBLDocumento;
    private javax.swing.JLabel LBLNombre;
    private javax.swing.JTable TBLCliente;
    private javax.swing.JTextField TXTBuscarCliente;
    private javax.swing.JTextField TXTCelularCliente;
    private javax.swing.JTextField TXTDireccionCliente;
    private javax.swing.JTextField TXTDocumentoCliente;
    private javax.swing.JFormattedTextField TXTIdCliente;
    private javax.swing.JTextField TXTNombreCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    
    private void limpiarFormulario(){
        TXTIdCliente.setValue(0);
        TXTNombreCliente.setText("Escrba Nombre");
        TXTDocumentoCliente.setText("Escriba Documento");
        TXTDireccionCliente.setText("Escriba Direccion");
        TXTCelularCliente.setText("Escriba Celular");
        TXTBuscarCliente.setText("Escriba texto a buscar");
        BTNModificar.setEnabled(false);
        BTNEliminar.setEnabled(false);
        llenarTabla();
    }
    
    private void llenarTabla(){
        Cliente unCliente = new Cliente();
        DefaultTableModel tabla = ( DefaultTableModel)TBLCliente.getModel();
        Iterator<Cliente> itCliente = unCliente.listar(); //listado clientes
        Object[] filaCliente = new Object[TBLCliente.getColumnCount()]; //una fila
        tabla.setRowCount(0); //vaciar tabla
        while(itCliente.hasNext()){ //llenamos cada fila
            unCliente = itCliente.next();
            filaCliente[0] = unCliente.getIdCliente();
            filaCliente[1] = unCliente.getNombreCliente();
            filaCliente[2] = unCliente.getDocumentoCliente();
            filaCliente[3] = unCliente.getDireccionCliente();
            filaCliente[4] = unCliente.getCelularClinete();
            tabla.addRow(filaCliente);//agregamos fila a la tabla
        }
    }

    private Cliente obtenerCliente() {
        Cliente elCliente = new Cliente();
        elCliente.setIdCliente((Integer)TXTIdCliente.getValue());
        elCliente.setNombreCliente(TXTNombreCliente.getText());
        elCliente.setDocumentoCliente(TXTDocumentoCliente.getText());
        elCliente.setDireccionCliente(TXTDireccionCliente.getText());
        elCliente.setCelularClinete(TXTCelularCliente.getText());
        System.out.println("clientes "+elCliente.toString());
        return elCliente;
    }

    private void llenarTablaComBusqueda(String busqueda) {
        Cliente unCliente = new Cliente();
        DefaultTableModel tabla = (DefaultTableModel)TBLCliente.getModel();
        Iterator<Cliente> itClientes = unCliente.buscar(busqueda);
        Object[] filaCliente = new Object[TBLCliente.getColumnCount()];
        tabla.setRowCount(0);
        while (itClientes.hasNext()){
            unCliente = itClientes.next();
            filaCliente[0] = unCliente.getIdCliente();
            filaCliente[1] = unCliente.getNombreCliente();
            filaCliente[2] = unCliente.getDocumentoCliente();
            filaCliente[3] = unCliente.getDireccionCliente();
            filaCliente[4] = unCliente.getCelularClinete();
            ((DefaultTableModel)TBLCliente.getModel()).addRow(filaCliente);
        }
    }

}
