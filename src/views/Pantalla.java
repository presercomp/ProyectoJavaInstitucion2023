
package views;

import classes.Carrera;
import classes.Estudiante;
import classes.Instituto;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Pantalla extends javax.swing.JFrame {

    private static Instituto i;   
    private static List<Carrera> cs;
    private static List<Estudiante> es;
    public Pantalla() {
        initComponents();  
        cs = new ArrayList<>();
        es = new ArrayList<>();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCarreras = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEstudiantes = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtInstitucionNombre = new javax.swing.JTextField();
        txtCarreraNombre = new javax.swing.JTextField();
        txtEstudianteNombre = new javax.swing.JTextField();
        txtEstudianteRut = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnEstudianteGuardar = new javax.swing.JButton();
        btnInstitucionGuardar = new javax.swing.JButton();
        btnCarreraGuardar = new javax.swing.JButton();
        btnEstudianteAsociar = new javax.swing.JButton();
        btnCarreraAsociar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtEstudiantesCantidad = new javax.swing.JTextField();
        txtCarrerasCantidad = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblCarreras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCarreras);

        tblEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RUT", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblEstudiantes);

        jLabel2.setText("Nombre Carrera");

        jLabel3.setText("Nombre Institucion");

        txtCarreraNombre.setEditable(false);
        txtCarreraNombre.setFocusCycleRoot(true);

        txtEstudianteNombre.setEditable(false);
        txtEstudianteNombre.setFocusCycleRoot(true);

        txtEstudianteRut.setEditable(false);
        txtEstudianteRut.setFocusCycleRoot(true);

        jLabel4.setText("Nombre");

        jLabel5.setText("R.U.T.");

        btnEstudianteGuardar.setText("Guardar Estudiante");
        btnEstudianteGuardar.setEnabled(false);
        btnEstudianteGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstudianteGuardarActionPerformed(evt);
            }
        });

        btnInstitucionGuardar.setText("Guardar Institución");
        btnInstitucionGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstitucionGuardarActionPerformed(evt);
            }
        });

        btnCarreraGuardar.setText("Guardar Carrera");
        btnCarreraGuardar.setEnabled(false);
        btnCarreraGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarreraGuardarActionPerformed(evt);
            }
        });

        btnEstudianteAsociar.setText("Asociar a Carrera");
        btnEstudianteAsociar.setEnabled(false);

        btnCarreraAsociar.setText("Asociar a Institucion");
        btnCarreraAsociar.setEnabled(false);

        jLabel6.setText("N° de Carreras");

        jLabel7.setText("N° de Estudiantes");

        txtEstudiantesCantidad.setEditable(false);
        txtEstudiantesCantidad.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtCarrerasCantidad.setEditable(false);
        txtCarrerasCantidad.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCarrerasCantidad.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtInstitucionNombre)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 72, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnInstitucionGuardar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtCarreraNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCarrerasCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnCarreraAsociar, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCarreraGuardar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGap(29, 29, 29)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtEstudianteRut, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtEstudiantesCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btnEstudianteAsociar)
                                .addComponent(btnEstudianteGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEstudianteNombre)
                                .addComponent(jLabel4)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInstitucionNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInstitucionGuardar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEstudianteRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEstudianteNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCarreraNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCarreraGuardar)
                    .addComponent(btnEstudianteGuardar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCarreraAsociar)
                            .addComponent(btnEstudianteAsociar))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCarrerasCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)
                                .addComponent(txtEstudiantesCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInstitucionGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstitucionGuardarActionPerformed
        String errores = "";
        errores += txtInstitucionNombre.getText().length() == 0 ? "- Debe indicar el nombre de la institucion.\n" : "";
        if(errores.length() > 0){
            JOptionPane.showMessageDialog(rootPane, "Corrija los siguientes erorres:\n"+errores);            
        } else {
            i = new Instituto(txtInstitucionNombre.getText());
            btnInstitucionGuardar.setEnabled(false);
            txtInstitucionNombre.setEditable(false);
            txtEstudianteRut.setEditable(true);
            txtEstudianteNombre.setEditable(true);
            btnEstudianteGuardar.setEnabled(true);
            
            txtCarreraNombre.setEditable(true);
            btnCarreraGuardar.setEnabled(true);            
        }
        
    }//GEN-LAST:event_btnInstitucionGuardarActionPerformed

    private void btnEstudianteGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstudianteGuardarActionPerformed
        //validamos que haya un rut y un nombre
         String errores = "";
        errores += txtEstudianteRut.getText().length() == 0 ? "- Debe indicar el rut del estudiante.\n" : "";
        errores += txtEstudianteNombre.getText().length() == 0 ? "- Debe indicar el nombre del estudiante.\n" : "";
        if(errores.length() > 0){
            JOptionPane.showMessageDialog(rootPane, "Corrija los siguientes erorres:\n"+errores);            
        } else {
            Estudiante e = new Estudiante(txtEstudianteNombre.getText(), txtEstudianteRut.getText());
            es.add(e);
            txtEstudianteRut.setText("");
            txtEstudianteNombre.setText("");
            despliegaEstudiantes();
        }
    }//GEN-LAST:event_btnEstudianteGuardarActionPerformed

    private void btnCarreraGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarreraGuardarActionPerformed
        String errores = "";
        errores += txtCarreraNombre.getText().length() == 0 ? "- Debe indicar el nombre de la carrera.\n" : "";
        if(errores.length() > 0){
            JOptionPane.showMessageDialog(rootPane, "Corrija los siguientes erorres:\n"+errores);            
        } else {
            Carrera c = new Carrera(txtCarreraNombre.getText());
            cs.add(c);
            txtCarreraNombre.setText("");
            despliegaCarreras();
        }
    }//GEN-LAST:event_btnCarreraGuardarActionPerformed

    public void habilitaAgregarInstitucion() {
        if(!cs.isEmpty()){
            btnCarreraAsociar.setEnabled(true);
        } else {
            btnCarreraAsociar.setEnabled(false);
        }
    }
    
    public void habilitaAgregarEstudiantes() {
        if(!cs.isEmpty()){
            btnEstudianteAsociar.setEnabled(true);
        } else {
            btnEstudianteAsociar.setEnabled(false);
        }
    }
    
    public void despliegaEstudiantes() {
        DefaultTableModel modeloTabla = (DefaultTableModel) tblEstudiantes.getModel();
       
        modeloTabla.setRowCount(0);
       
        for(int i = 0; i < es.size(); i++){
            modeloTabla.addRow(new Object[]{es.get(i).getRut(), es.get(i).getNombre() });
        }
        tblEstudiantes.setModel(modeloTabla);
        int numEstudiantes = modeloTabla.getRowCount();
        txtEstudiantesCantidad.setText(String.valueOf(numEstudiantes));
    }
    
    public void despliegaCarreras() {
        DefaultTableModel modeloTabla = (DefaultTableModel) tblCarreras.getModel();
        
        modeloTabla.setRowCount(0);
        for(int i = 0; i < cs.size(); i++){
            modeloTabla.addRow(new Object[]{cs.get(i).getNombre()});
        }
        tblCarreras.setModel(modeloTabla);
        int numCarreras = modeloTabla.getRowCount();
        txtCarrerasCantidad.setText(String.valueOf(numCarreras));
    }
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
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarreraAsociar;
    private javax.swing.JButton btnCarreraGuardar;
    private javax.swing.JButton btnEstudianteAsociar;
    private javax.swing.JButton btnEstudianteGuardar;
    private javax.swing.JButton btnInstitucionGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblCarreras;
    private javax.swing.JTable tblEstudiantes;
    private javax.swing.JTextField txtCarreraNombre;
    private javax.swing.JTextField txtCarrerasCantidad;
    private javax.swing.JTextField txtEstudianteNombre;
    private javax.swing.JTextField txtEstudianteRut;
    private javax.swing.JTextField txtEstudiantesCantidad;
    private javax.swing.JTextField txtInstitucionNombre;
    // End of variables declaration//GEN-END:variables
}
