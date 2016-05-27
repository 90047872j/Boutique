
package boutique;

import javax.print.event.PrintJobEvent;
import javax.swing.JOptionPane;


/**
 *
 * @author Juan Tavera
 */
public class ModificarPrenda extends javax.swing.JDialog {

    private ListaPrendas prendas;
    private Prenda prendaSeleccionada;

    public Prenda getPrendaSeleccionada() {
        return prendaSeleccionada;
    }

    public void setPrendaSeleccionada(Prenda prendaSeleccionada) {
        this.prendaSeleccionada = prendaSeleccionada;
    }

    public ListaPrendas getPrendas() {
        return prendas;
    }

    public void setPrendas(ListaPrendas prendas) {
        this.prendas = prendas;
    }

    public ModificarPrenda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        prendas = Boutique.misPrendas;
        prendaSeleccionada = new Prenda();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        AnadirStock = new javax.swing.JButton();
        EliminarPrenda = new javax.swing.JButton();
        CerrarMP = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ReducirStock = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modificar Prenda");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        AnadirStock.setText("Añadir Stock");
        AnadirStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnadirStockActionPerformed(evt);
            }
        });

        EliminarPrenda.setText("Eliminar Prenda");
        EliminarPrenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarPrendaActionPerformed(evt);
            }
        });

        CerrarMP.setText("Cerrar");
        CerrarMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarMPActionPerformed(evt);
            }
        });

        jTable1.setGridColor(new java.awt.Color(204, 153, 0));
        jTable1.setSelectionBackground(new java.awt.Color(204, 153, 0));

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${prendas.lista}");
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigo}"));
        columnBinding.setColumnName("Código");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${descripcion}"));
        columnBinding.setColumnName("Descripción");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${color}"));
        columnBinding.setColumnName("Color");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${talla}"));
        columnBinding.setColumnName("Talla");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${coste}"));
        columnBinding.setColumnName("Coste");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${venta}"));
        columnBinding.setColumnName("Venta");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${stock}"));
        columnBinding.setColumnName("Stock");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${prendaSeleccionada}"), jTable1, org.jdesktop.beansbinding.BeanProperty.create("selectedElement"));
        bindingGroup.addBinding(binding);

        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(300);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(40);
        }

        ReducirStock.setText("Reducir Stock");
        ReducirStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReducirStockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ReducirStock, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(AnadirStock, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(EliminarPrenda, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(CerrarMP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AnadirStock)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ReducirStock)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EliminarPrenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CerrarMP)))
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarMPActionPerformed
        dispose();
    }//GEN-LAST:event_CerrarMPActionPerformed

    private void EliminarPrendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarPrendaActionPerformed
        if (estaSeleccionada()) {
            int respuesta = JOptionPane.showConfirmDialog(this, "¿Estás seguro?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                Boutique.misPrendas.bajaPrenda(prendaSeleccionada);
                Boutique.miFichero.grabar(Boutique.misPrendas);
                JOptionPane.showMessageDialog(this, prendaModificada("eliminada"));
                dispose();
            }
        }
    }//GEN-LAST:event_EliminarPrendaActionPerformed

    private void AnadirStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnadirStockActionPerformed
        if (estaSeleccionada()) {
            String respuesta = JOptionPane.showInputDialog(this, "Introduce las unidades:", "Añadir Stock", JOptionPane.PLAIN_MESSAGE);
            try {
                int nuevostock = Integer.parseInt(respuesta);
                if (nuevostock <= 0) {
                    JOptionPane.showMessageDialog(this, "Debes indicar un número válido", "ERROR: Valor incorrecto", JOptionPane.ERROR_MESSAGE);
                } else {
                    prendaSeleccionada.setStock(prendaSeleccionada.getStock() + nuevostock);
                    Boutique.miFichero.grabar(Boutique.misPrendas);
                    JOptionPane.showMessageDialog(this,prendaModificada("modificada"), "Stock Modificado", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                }
            } catch (NumberFormatException ex) {
                if (respuesta != null) {
                    JOptionPane.showMessageDialog(this, "Debes indicar un número", "ERROR: Valor Incorrecto", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_AnadirStockActionPerformed

    private void ReducirStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReducirStockActionPerformed
        if (estaSeleccionada()) {
            String respuesta = JOptionPane.showInputDialog(this, "Introduce las unidades:", "Reducir Stock", JOptionPane.PLAIN_MESSAGE);
            try {
                int valorstock = Integer.parseInt(respuesta);
                if (valorstock <= 0) {
                    JOptionPane.showMessageDialog(this, "Debes indicar un número válido", "ERROR: Valor incorrecto", JOptionPane.ERROR_MESSAGE);
                } else {
                    if (valorstock > prendaSeleccionada.getStock()) {
                        JOptionPane.showMessageDialog(this, "El número introducido es mayor a las existencias", "ERROR: Valor incorrecto", JOptionPane.ERROR_MESSAGE);
                    } else {
                        prendaSeleccionada.setStock(prendaSeleccionada.getStock() - valorstock);
                        Boutique.miFichero.grabar(Boutique.misPrendas);
                        JOptionPane.showMessageDialog(this, prendaModificada("modificada"), "Stock Modificado", JOptionPane.INFORMATION_MESSAGE);
                        dispose();
                    }
                }
            } catch (NumberFormatException ex) {
                if (respuesta != null) {
                    JOptionPane.showMessageDialog(this, "Debes indicar un número", "ERROR: Valor Incorrecto", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_ReducirStockActionPerformed

    public boolean estaSeleccionada() {
        if (jTable1.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar una prenda", "ERROR: Prenda no seleccionada", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            return true;
        }
    }

    public String prendaModificada(String a) {
        String msg = "";
        if (a == "modificada") {
            msg = "La prenda " + prendaSeleccionada.getCodigo() + "\n" + prendaSeleccionada.getDescripcion() + "\nha sido " + a + "\n\nNuevo stock: " + prendaSeleccionada.getStock()+"\n";
        } else if (a == "eliminada") {
            msg = "La prenda " + prendaSeleccionada.getCodigo() + "\n" + prendaSeleccionada.getDescripcion() + "\nha sido " + a +"\n";
        }
        return msg;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnadirStock;
    private javax.swing.JButton CerrarMP;
    private javax.swing.JButton EliminarPrenda;
    private javax.swing.JButton ReducirStock;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
