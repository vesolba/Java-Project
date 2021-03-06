/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;
import javax.swing.*;

/**
 *
 * @author YUSUF SHAKEEL
 */
public class ImageViewer extends javax.swing.JFrame {

    /**
     * Creates new form ImageViewer
     */
    public ImageViewer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSP = new javax.swing.JScrollPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMI_Open = new javax.swing.JMenuItem();
        jMI_Clear = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("File");

        jMI_Open.setText("Open");
        jMI_Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_OpenActionPerformed(evt);
            }
        });
        jMenu1.add(jMI_Open);

        jMI_Clear.setText("Clear");
        jMI_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_ClearActionPerformed(evt);
            }
        });
        jMenu1.add(jMI_Clear);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSP, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSP, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //create a label
    JLabel jlab = new JLabel();
    
    private void jMI_OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_OpenActionPerformed
        // TODO add your handling code here:
        //create file chooser
        JFileChooser jfc = new JFileChooser();
        
        //select file and display
        if(jfc.showOpenDialog(jMenu1) == JFileChooser.APPROVE_OPTION){
            //get selected file name [i.e., complete file path]
            java.io.File f = jfc.getSelectedFile();
            
            //set icon
            jlab.setIcon(new ImageIcon(f.toString()));
            
            //alignment
            jlab.setHorizontalAlignment(JLabel.CENTER);
            
            //add jLabel to scroll pane
            jSP.getViewport().add(jlab);
        }
    }//GEN-LAST:event_jMI_OpenActionPerformed

    private void jMI_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_ClearActionPerformed
        // TODO add your handling code here:
        
        //remove image from jlabel jlab
        jlab.setIcon(null);
    }//GEN-LAST:event_jMI_ClearActionPerformed

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
            java.util.logging.Logger.getLogger(ImageViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImageViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImageViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImageViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImageViewer().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jMI_Clear;
    private javax.swing.JMenuItem jMI_Open;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jSP;
    // End of variables declaration//GEN-END:variables
}
