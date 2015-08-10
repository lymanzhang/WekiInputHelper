/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wekiinputhelper.gui;

/**
 *
 * @author rebecca
 */
public class UpDownDeleteGUI extends javax.swing.JPanel {

    private int id = 0;
    private UpDownDeleteNotifiable receiver;

    
    public UpDownDeleteGUI(int id, UpDownDeleteNotifiable receiver) {
        initComponents();
        this.receiver = receiver;
        this.id = id;
    }
    
    public void setID(int id) {
        this.id = id;
    }
    
    public void setDeleteEnabled(boolean enabled) {
      //  buttonDelete.setEnabled(enabled);
        buttonDelete.setVisible(enabled);
    }
    
    public void setDownEnabled(boolean enabled) {
        //buttonDown.setEnabled(enabled);
        buttonDown.setVisible(enabled);
    }
    
    public void setUpEnabled(boolean enabled) {
        buttonUp.setVisible(enabled);
    }
    
    //only for GUI testing
    public UpDownDeleteGUI() {
        initComponents();
        this.receiver = new UpDownDeleteNotifiable() {

            @Override
            public void up(int id) {
            }

            @Override
            public void down(int id) {
            }

            @Override
            public void delete(int id) {
            }
        };
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonUp = new javax.swing.JButton();
        buttonDown = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(39, 105));

        buttonUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wekiinputhelper/icons/upArrow1.png"))); // NOI18N
        buttonUp.setMaximumSize(new java.awt.Dimension(27, 27));
        buttonUp.setMinimumSize(new java.awt.Dimension(27, 27));
        buttonUp.setPreferredSize(new java.awt.Dimension(20, 25));
        buttonUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpActionPerformed(evt);
            }
        });

        buttonDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wekiinputhelper/icons/downArrow1.png"))); // NOI18N
        buttonDown.setMaximumSize(new java.awt.Dimension(27, 27));
        buttonDown.setMinimumSize(new java.awt.Dimension(27, 27));
        buttonDown.setPreferredSize(new java.awt.Dimension(20, 25));
        buttonDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDownActionPerformed(evt);
            }
        });

        buttonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wekiinputhelper/icons/x2.png"))); // NOI18N
        buttonDelete.setMaximumSize(new java.awt.Dimension(27, 27));
        buttonDelete.setMinimumSize(new java.awt.Dimension(27, 27));
        buttonDelete.setPreferredSize(new java.awt.Dimension(25, 25));
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonUp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDown, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonUp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonDown, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpActionPerformed
        receiver.up(id);
    }//GEN-LAST:event_buttonUpActionPerformed

    private void buttonDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDownActionPerformed
        receiver.down(id);

    }//GEN-LAST:event_buttonDownActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        receiver.delete(id);
    }//GEN-LAST:event_buttonDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonDown;
    private javax.swing.JButton buttonUp;
    // End of variables declaration//GEN-END:variables

    public interface UpDownDeleteNotifiable {

        public void up(int id);

        public void down(int id);

        public void delete(int id);
    }
}
