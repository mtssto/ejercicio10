
package Formularios;

import Desarollo.AbmLibro;
import javax.swing.JOptionPane;

public class FrmLibro extends javax.swing.JFrame {

   AbmLibro objsinpar = new AbmLibro();
   AbmLibro objconpar;
   String LibroAnterior = null;
    public FrmLibro() 
    {
        initComponents();
        //listlibros.setModel(objsinpar.Muestro());
        this.tablelibros.setModel(objsinpar.Titulo());
        MostrarBotones();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelprincipal = new javax.swing.JPanel();
        panelinformacion = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnomlibro = new javax.swing.JTextField();
        txtautor = new javax.swing.JTextField();
        combogenero = new javax.swing.JComboBox<>();
        btnalta = new javax.swing.JButton();
        btnmostrar = new javax.swing.JButton();
        btnbaja = new javax.swing.JButton();
        btnmodificaciones = new javax.swing.JButton();
        btnaceptar = new javax.swing.JButton();
        año = new com.toedter.calendar.JYearChooser();
        btnsalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablelibros = new javax.swing.JTable();
        btncancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelprincipal.setBackground(new java.awt.Color(102, 204, 255));

        panelinformacion.setBackground(new java.awt.Color(255, 255, 255));
        panelinformacion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("Libro");

        jLabel3.setText("Autor");

        jLabel4.setText("Tipo de libro");

        jLabel5.setText("Edicion");

        txtnomlibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomlibroActionPerformed(evt);
            }
        });

        combogenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matematica", "Historia", "Ficcion" }));

        btnalta.setText("Alta");
        btnalta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaltaActionPerformed(evt);
            }
        });

        btnmostrar.setText("Consulta");
        btnmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrarActionPerformed(evt);
            }
        });

        btnbaja.setText("Baja");
        btnbaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbajaActionPerformed(evt);
            }
        });

        btnmodificaciones.setText("Modificaciones");
        btnmodificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificacionesActionPerformed(evt);
            }
        });

        btnaceptar.setText("Aceptar");
        btnaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelinformacionLayout = new javax.swing.GroupLayout(panelinformacion);
        panelinformacion.setLayout(panelinformacionLayout);
        panelinformacionLayout.setHorizontalGroup(
            panelinformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelinformacionLayout.createSequentialGroup()
                .addGroup(panelinformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelinformacionLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(panelinformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(50, 50, 50)
                        .addGroup(panelinformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnomlibro)
                            .addComponent(txtautor)
                            .addComponent(combogenero, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelinformacionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnalta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnmostrar)
                        .addGap(18, 18, 18)
                        .addComponent(btnbaja)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnmodificaciones)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnaceptar)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        panelinformacionLayout.setVerticalGroup(
            panelinformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelinformacionLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panelinformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnomlibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panelinformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtautor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panelinformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(combogenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(panelinformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(panelinformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnalta)
                    .addComponent(btnmostrar)
                    .addComponent(btnbaja)
                    .addComponent(btnmodificaciones)
                    .addComponent(btnaceptar))
                .addGap(19, 19, 19))
        );

        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        tablelibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablelibros);

        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelprincipalLayout = new javax.swing.GroupLayout(panelprincipal);
        panelprincipal.setLayout(panelprincipalLayout);
        panelprincipalLayout.setHorizontalGroup(
            panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelprincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelinformacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelprincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btncancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnsalir)))
                .addContainerGap())
        );
        panelprincipalLayout.setVerticalGroup(
            panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelprincipalLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelinformacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelprincipalLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnsalir)
                            .addComponent(btncancelar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelprincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaltaActionPerformed
        
        
     
        {
            if (this.txtnomlibro.getText().isEmpty() || this.txtautor.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");    
        }
        else
        {
        String NombreLibro = this.txtnomlibro.getText();
        String Autor = this.txtautor.getText();

        int Edicion = this.año.getYear();
        String TipoLibro = String.valueOf(this.combogenero.getSelectedItem());
        objconpar = new AbmLibro(NombreLibro, Autor, TipoLibro, Edicion);
        objconpar.Alta();
        } 
        }
       
        
        
    }//GEN-LAST:event_btnaltaActionPerformed

    private void btnmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrarActionPerformed
        
        objsinpar.MuestroDatos();
        this.btnmodificaciones.setEnabled(true);
        this.btnbaja.setEnabled(true);
        this.btnalta.setEnabled(false);
        
        this.btnmostrar.setEnabled(false);
    }//GEN-LAST:event_btnmostrarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnmodificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificacionesActionPerformed
       
        this.btnmodificaciones.setEnabled(false);
        int rowIndex = tablelibros.getSelectedRow();
        LibroAnterior = String.valueOf(this.tablelibros.getValueAt(rowIndex, 0));
       this.txtnomlibro.setText(LibroAnterior);
       TraerDatos(LibroAnterior);
       
       this.btnaceptar.setEnabled(true);
       
    }//GEN-LAST:event_btnmodificacionesActionPerformed

    private void btnaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaceptarActionPerformed
       
        int z = JOptionPane.showConfirmDialog(null, "¿Estas seguro en realizar estos cambios?");
        if (z == 0) 
        {
          String NombreLibroAct = this.txtnomlibro.getText().toUpperCase();
          String AutorAct= this.txtautor.getText().toUpperCase();
          String TipoAct = String.valueOf(this.combogenero.getSelectedItem());
          int EdicionAct = this.año.getYear();
          objsinpar.setNombre(NombreLibroAct);
          objsinpar.setAutor(AutorAct);
          objsinpar.setEdicion(EdicionAct);
          objsinpar.setTipo(TipoAct);
          
          objsinpar.Modificar(LibroAnterior); 
        }
        else
        {
        MostrarBotones();
        }
       Limpiar();
        
    }//GEN-LAST:event_btnaceptarActionPerformed

    private void btnbajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbajaActionPerformed

        int i = JOptionPane.showConfirmDialog(null,"¿Estás seguro que desea eliminar el registro?");
        if (i == 0) 
        {
           objsinpar.setNombre(LibroAnterior);
           objsinpar.Baja();
        }
    }//GEN-LAST:event_btnbajaActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        MostrarBotones();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void txtnomlibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomlibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomlibroActionPerformed
private void TraerDatos (String NombreLibro)
   {
   boolean Nombre = objsinpar.Buscar(NombreLibro); //busca el parametro que esta entre paréntesis en la base de datos
       if (Nombre == true) //cuando consigue el dato ejecuta la sentencia sql en la clase abm
       {
           this.txtnomlibro.setText(objsinpar.getNombre()); //estoy llamando a los metodos get de la clase abm para mostrar todos los datos en la caja de texto, por eso el set.
           this.txtautor.setText(objsinpar.getAutor());
           this.combogenero.setSelectedItem(objsinpar.getTipo());
           this.año.setYear(objsinpar.getEdicion());
       }
       else
       {
       MostrarBotones();
       Limpiar();
       }
   }
    private void MostrarBotones()
    {
     this.btnalta.setEnabled(true);
     this.btnmostrar.setEnabled(true);
     this.btnbaja.setEnabled(false);
     this.btnmodificaciones.setEnabled(false);
     this.btnaceptar.setEnabled(false);  
    
    
    }
    private void Limpiar ()
    {
    txtnomlibro.setText(null);
    txtautor.setText(null);
    }
    
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
            java.util.logging.Logger.getLogger(FrmLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JYearChooser año;
    private javax.swing.JButton btnaceptar;
    private javax.swing.JButton btnalta;
    private javax.swing.JButton btnbaja;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnmodificaciones;
    private javax.swing.JButton btnmostrar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox<String> combogenero;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelinformacion;
    private javax.swing.JPanel panelprincipal;
    private javax.swing.JTable tablelibros;
    private javax.swing.JTextField txtautor;
    private javax.swing.JTextField txtnomlibro;
    // End of variables declaration//GEN-END:variables
}
