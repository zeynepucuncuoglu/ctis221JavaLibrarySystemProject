/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import GUI.displayBooks;
import GUI.searchBook;
import GUI.AddBook;
import SysAndMain.*;



/**
 *
 * @author USER
 */
public class MainPanel extends javax.swing.JPanel {

    /**
     * Creates new form MainPanel
     */
    public AddBook ab= new AddBook(this);
    public displayBooks db= new displayBooks(this);
    public searchBook sb= new searchBook(this);
    
    
    public MainPanel() {
        
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

        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        addbook = new javax.swing.JButton();
        searchBook = new javax.swing.JButton();
        displayBook = new javax.swing.JButton();

        jLabel1.setText("Welcome Administer!");

        jLabel6.setText("Welcome to the Library System! ");

        addbook.setText("Add Book");
        addbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbookActionPerformed(evt);
            }
        });

        searchBook.setText("Search Book");
        searchBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBookActionPerformed(evt);
            }
        });

        displayBook.setText("Display Books");
        displayBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(searchBook, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(displayBook, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(addbook, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addbook, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBook, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(displayBook, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbookActionPerformed
        // TODO add your handling code here:
        ab.setVisible(true);
        sb.setVisible(false);
        db.setVisible(false);
    }//GEN-LAST:event_addbookActionPerformed

    private void searchBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBookActionPerformed
        // TODO add your handling code here:
        ab.setVisible(false);
        sb.setVisible(true);
        db.setVisible(false);
    }//GEN-LAST:event_searchBookActionPerformed

    private void displayBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBookActionPerformed
        // TODO add your handling code here:
        ab.setVisible(false);
        sb.setVisible(false);
        db.setVisible(true);
    }//GEN-LAST:event_displayBookActionPerformed
    
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbook;
    private javax.swing.JButton displayBook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton searchBook;
    // End of variables declaration//GEN-END:variables
}