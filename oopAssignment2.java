/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package package1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;


public class oopAssignment2 extends javax.swing.JFrame {

    public oopAssignment2() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameTf = new javax.swing.JTextField();
        pNumTf = new javax.swing.JTextField();
        emailTf = new javax.swing.JTextField();
        addressTf = new javax.swing.JTextField();
        saveInfo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        display = new javax.swing.JTextArea();
        search = new javax.swing.JButton();
        showInfo = new javax.swing.JButton();
        searchTf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name:");

        jLabel2.setText("Phone Number:");

        jLabel3.setText("Email:");

        jLabel4.setText("Address:");

        saveInfo.setText("SAVE INFO");
        saveInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveInfoActionPerformed(evt);
            }
        });

        display.setColumns(20);
        display.setRows(5);
        jScrollPane1.setViewportView(display);

        search.setText("SEARCH");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        showInfo.setText("SHOW INFO");
        showInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showInfoActionPerformed(evt);
            }
        });

        searchTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pNumTf, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailTf, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressTf, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(saveInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(showInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 28, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(searchTf, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(searchTf, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(search))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(pNumTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(emailTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(addressTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saveInfo)
                            .addComponent(showInfo))
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveInfoActionPerformed
       String name = nameTf.getText();
       String email = emailTf.getText();
       String pnum = pNumTf.getText();
       String address = addressTf.getText();
       
       try{
           FileWriter myFile = new FileWriter("Input_data.txt",true);
           BufferedWriter fw = new BufferedWriter(myFile);
           fw.write(name);
           fw.write("#");
           fw.write(email);
           fw.write("#");
           fw.write(pnum);
           fw.write("#");
           fw.write(address);
           fw.write("#");
           fw.newLine();
           nameTf.setText("");
           emailTf.setText("");
           pNumTf.setText("");
           addressTf.setText("");
           fw.close();
       }
       catch(IOException e){
           e.printStackTrace();
       }
    }//GEN-LAST:event_saveInfoActionPerformed

    private void showInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showInfoActionPerformed
        ArrayList<addBook> sortx = new ArrayList<addBook>();
        display.setText("");
        try{
            FileReader yourFile = new FileReader("Input_data.txt");
            BufferedReader fr = new BufferedReader(yourFile);
            String bob;
            while((bob = fr.readLine())!= null){
                String[] jbob = bob.split("#");
                String name = jbob[0];
                String email = jbob[1];
                String pnum = jbob[2];
                String address = jbob[3];
                sortx.add(new addBook(name, email, pnum, address));
                
            }
            Collections.sort(sortx, addBook.compareNamex);
            fr.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        for(addBook gui: sortx){
            display.append("Name: "+gui.getNamex()+" Email: "+gui.getEmailx()+" Pnone_Number: "+gui.getPnumx()+" Address: "+gui.getAddressx());
            display.append("\n");
        }
    }//GEN-LAST:event_showInfoActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String xyz = searchTf.getText();
        //display.setText("");
        try{
            FileReader ur = new FileReader("Input_data.txt");
            BufferedReader fz = new BufferedReader(ur);
            String bobz;
            while((bobz=fz.readLine())!= null){
                if(bobz.contains(xyz)){
                String[] jbobz = bobz.split("#");
                String name = jbobz[0];
                String email = jbobz[1];
                String pnum = jbobz[2];
                String address = jbobz[3];
                    display.setText("Name: "+jbobz[0]+" Email: "+jbobz[1]+" Pnone_Number: "+jbobz[2]+" Address: "+jbobz[3]);
                }
                else{
                    display.setText("Data Not Found");
                }
            }
            fz.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_searchActionPerformed

    private void searchTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTfActionPerformed

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
            java.util.logging.Logger.getLogger(oopAssignment2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(oopAssignment2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(oopAssignment2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(oopAssignment2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new oopAssignment2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTf;
    private javax.swing.JTextArea display;
    private javax.swing.JTextField emailTf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTf;
    private javax.swing.JTextField pNumTf;
    private javax.swing.JButton saveInfo;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchTf;
    private javax.swing.JButton showInfo;
    // End of variables declaration//GEN-END:variables
}
class addBook{
    String namex, emailx, pnumx, addressx;

    public addBook(String namex, String emailx, String pnumx, String addressx) {
        this.namex = namex;
        this.emailx = emailx;
        this.pnumx = pnumx;
        this.addressx = addressx;
    }

    public String getNamex() {
        return namex;
    }

    public void setNamex(String namex) {
        this.namex = namex;
    }

    public String getEmailx() {
        return emailx;
    }

    
    public void setEmailx(String emailx) {
        this.emailx = emailx;
    }
    
    public String getPnumx() {
        return pnumx;
    }

    public void setPnumx(String pnumx) {
        this.pnumx = pnumx;
    }

    public String getAddressx() {
        return addressx;
    }

    public void setAddressx(String addressx) {
        this.addressx = addressx;
    }
    public static Comparator<addBook>compareNamex = new Comparator<addBook>(){
    @Override
    public int compare(addBook o1, addBook o2) {
        String namex1 = o1.getNamex();
        String namex2 = o2.getNamex();
        return namex1.compareTo(namex2);
    }
};
    
}
