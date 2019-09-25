/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaji.view;

import gaji.controller.ControllerGaji;
import gaji.controller.ControllerKaryawan;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Gaji;
import model.Karyawan;

/**
 *
 * @author A s u s
 */
public class DaftarUpdate extends javax.swing.JFrame {
    
    private final ControllerGaji controllerGaji = new ControllerGaji();
    private final ControllerKaryawan controllerKaryawan = new ControllerKaryawan();
    /**
     * Creates new form DaftarUpdate
     */
    public DaftarUpdate() {
        initComponents();  
        setComboKaryawan(controllerKaryawan.getAllData());
        setTableGaji(controllerGaji.getAllGaji());
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popup = new javax.swing.JPopupMenu();
        mnDelete = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        btnSimpan = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblGajiPokok = new javax.swing.JLabel();
        lblTunjanganJabatan = new javax.swing.JLabel();
        lblTunjanganKedisiplinan = new javax.swing.JLabel();
        lblTransport = new javax.swing.JLabel();
        cbxKaryawan = new javax.swing.JComboBox<>();
        txtGaji = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTunjanganPrestasi = new javax.swing.JTextField();
        txtTunjanganpph = new javax.swing.JTextField();
        txtBpjsKesehatan = new javax.swing.JTextField();
        txtBpjsKetenagakerjaan = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtLain = new javax.swing.JTextField();
        lblGapok = new javax.swing.JLabel();
        lblJabatan = new javax.swing.JLabel();
        lblDisiplin = new javax.swing.JLabel();
        lblTrans = new javax.swing.JLabel();
        btnGaji = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableKaryawan = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        outCommand = new javax.swing.JLabel();

        mnDelete.setText("Delete");
        mnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDeleteActionPerformed(evt);
            }
        });
        popup.add(mnDelete);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        btnSimpan.setText("Save");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnClear)
                    .addComponent(btnClose))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setText("Nama Karyawan");

        jLabel2.setText("Gaji");

        lblGajiPokok.setText("Gaji Pokok");

        lblTunjanganJabatan.setText("Tunjangan Jabatan");

        lblTunjanganKedisiplinan.setText("Tunjangan Kedisiplinan");

        lblTransport.setText("Transport");

        cbxKaryawan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxKaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxKaryawanActionPerformed(evt);
            }
        });

        txtGaji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGajiActionPerformed(evt);
            }
        });

        jLabel7.setText("Tunjangan Prestasi");

        jLabel8.setText("Tunjangan PPh 21");

        jLabel9.setText("BPJS Kesehatan");

        jLabel10.setText("BPJS Ketenagakerjaan");

        txtTunjanganPrestasi.setText("Rp.000,00-");
        txtTunjanganPrestasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTunjanganPrestasiActionPerformed(evt);
            }
        });

        txtTunjanganpph.setText("Rp.000,00-");

        txtBpjsKesehatan.setText("Rp.000,00-");

        txtBpjsKetenagakerjaan.setText("Rp.000,00-");

        jLabel11.setText("Lain - lain");

        txtLain.setText("Rp.000,00-");
        txtLain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLainActionPerformed(evt);
            }
        });

        lblGapok.setText("Rp.000,00-");

        lblJabatan.setText("Rp.000,00-");

        lblDisiplin.setText("Rp.000,00-");

        lblTrans.setText("Rp.000,00-");

        btnGaji.setText("Set Gaji");
        btnGaji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGajiActionPerformed(evt);
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
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11))
                        .addGap(126, 126, 126)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLain, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                            .addComponent(txtTunjanganpph)
                            .addComponent(txtBpjsKetenagakerjaan)
                            .addComponent(txtBpjsKesehatan)
                            .addComponent(txtTunjanganPrestasi, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap(152, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblGajiPokok)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtGaji, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxKaryawan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnGaji)
                                .addGap(45, 45, 45))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(lblGapok, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTunjanganKedisiplinan)
                                    .addComponent(lblTransport))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblTrans, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(122, 122, 122))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblDisiplin, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblTunjanganJabatan)
                        .addGap(29, 29, 29)
                        .addComponent(lblJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnGaji, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTunjanganJabatan)
                            .addComponent(lblJabatan)
                            .addComponent(lblTransport)
                            .addComponent(lblTrans))
                        .addGap(32, 32, 32))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cbxKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtGaji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGajiPokok)
                            .addComponent(lblGapok)
                            .addComponent(lblTunjanganKedisiplinan)
                            .addComponent(lblDisiplin))
                        .addGap(56, 56, 56)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTunjanganPrestasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTunjanganpph, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtBpjsKesehatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtBpjsKetenagakerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));

        tableKaryawan.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        tableKaryawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama", "Gaji", "Gaji pokok", "Jabatan", "Kedisiplinan", "Transport", "Prestasi", "PPh 21", "BPJS Kesehat", "BPJS Kerja", "Lain-Lain"
            }
        ));
        tableKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableKaryawanMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableKaryawanMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tableKaryawan);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 712, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(34, Short.MAX_VALUE)))
        );

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Input Gaji Karyawan");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Proses");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Output");

        outCommand.setText("Ready");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(266, 266, 266)
                                .addComponent(outCommand)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(8, 8, 8)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(outCommand))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTunjanganPrestasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTunjanganPrestasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTunjanganPrestasiActionPerformed

    private void txtLainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLainActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        String cbx = cbxKaryawan.getSelectedItem().toString();
        double gaji = Double.parseDouble(txtGaji.getText());
        double gaji_pokok = Double.parseDouble(lblGapok.getText());
        double tunjangan_jabatan = Double.parseDouble(lblJabatan.getText());
        double tunjangan_kedisiplinan = Double.parseDouble(lblDisiplin.getText());
        double transport = Double.parseDouble(lblTrans.getText());
        double tunjangan_prestasi = Double.parseDouble(txtTunjanganPrestasi.getText());
        double tunjangan_pph = Double.parseDouble(txtTunjanganpph.getText());
        double bpjs_kesehatan = Double.parseDouble(txtBpjsKesehatan.getText());
        double bpjs_ketenagakerjaan = Double.parseDouble(txtBpjsKetenagakerjaan.getText());
        double lain = Double.parseDouble(txtLain.getText());
        
        char[] id = new char[1];
        for(int x=0; x < cbx.length(); x++){
            if(cbx.charAt(x) != '-'){
                id[x] = cbx.charAt(x);
            } else {
                break;
            }
        
        int id_urutan = Integer.parseInt(new String(id));
        
        Gaji data = new Gaji(gaji, gaji_pokok, tunjangan_jabatan, tunjangan_kedisiplinan, transport, tunjangan_prestasi, tunjangan_pph, bpjs_kesehatan, bpjs_ketenagakerjaan,lain,cbx);
        
        if(btnSimpan.getText().equals("Save")){
            if(controllerGaji.insertGaji(id_urutan,cbx,gaji,gaji_pokok,tunjangan_jabatan,tunjangan_kedisiplinan,transport,tunjangan_prestasi,tunjangan_pph,bpjs_kesehatan,bpjs_ketenagakerjaan,lain)){
            outCommand.setText("Insert Berhasil");
            setTableGaji(controllerGaji.getAllGaji());
            } else {
                outCommand.setText("Insert Gagal");
            }
        } else {
            if(controllerGaji.updateGaji(data)){
                outCommand.setText("Update Berhasil");
                setTableGaji(controllerGaji.getAllGaji());
            } else {
                outCommand.setText("Update Gagal");
            }
        }}
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void txtGajiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGajiActionPerformed

    }//GEN-LAST:event_txtGajiActionPerformed

    private void btnGajiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGajiActionPerformed
        setLabel();
    }//GEN-LAST:event_btnGajiActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        setClear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void tableKaryawanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableKaryawanMousePressed
        if(evt.getClickCount()==2){
           int idxrow = tableKaryawan.getSelectedRow();
           txtGaji.setText(tableKaryawan.getModel().getValueAt(idxrow, 0).toString());
           txtTunjanganPrestasi.setText(tableKaryawan.getModel().getValueAt(idxrow, 1).toString());
           txtTunjanganpph.setText(tableKaryawan.getModel().getValueAt(idxrow, 2).toString());
           txtBpjsKesehatan.setText(tableKaryawan.getModel().getValueAt(idxrow, 3).toString());
           txtBpjsKetenagakerjaan.setText(tableKaryawan.getModel().getValueAt(idxrow, 4).toString());
           txtLain.setText(tableKaryawan.getModel().getValueAt(idxrow, 5).toString());
           btnSimpan.setText("Update");
       }
       if(evt.isPopupTrigger()){
           popup.show(tableKaryawan, evt.getX(), evt.getY());
       }
    }//GEN-LAST:event_tableKaryawanMousePressed

    private void tableKaryawanMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableKaryawanMouseReleased
        if(evt.getClickCount()==2){
           int idxrow = tableKaryawan.getSelectedRow();
           txtGaji.setText(tableKaryawan.getModel().getValueAt(idxrow, 1).toString());
           txtTunjanganPrestasi.setText(tableKaryawan.getModel().getValueAt(idxrow, 2).toString());
           txtTunjanganpph.setText(tableKaryawan.getModel().getValueAt(idxrow, 3).toString());
           txtBpjsKesehatan.setText(tableKaryawan.getModel().getValueAt(idxrow, 4).toString());
           txtBpjsKetenagakerjaan.setText(tableKaryawan.getModel().getValueAt(idxrow, 5).toString());
           txtLain.setText(tableKaryawan.getModel().getValueAt(idxrow, 6).toString());
           btnSimpan.setText("Update");
       }
       if(evt.isPopupTrigger()){
           popup.show(tableKaryawan, evt.getX(), evt.getY());
       }
    }//GEN-LAST:event_tableKaryawanMouseReleased

    private void mnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDeleteActionPerformed
        int result = JOptionPane.showConfirmDialog(rootPane, "Apakah Yakin Untuk Didelete?", "Delete Dialog", JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION){
            String cbx = tableKaryawan.getModel().getValueAt(tableKaryawan.getSelectedRow(), 0).toString();
            controllerGaji.deleteGaji(cbx);
            setClear();
            setTableGaji(controllerGaji.getAllGaji());
        }
    }//GEN-LAST:event_mnDeleteActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void cbxKaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxKaryawanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxKaryawanActionPerformed

    private void setTableGaji(List<Gaji> listGaji){
        if(listGaji==null){
            JOptionPane.showMessageDialog(this, "Data " + "Gaji gagal diambil dari database","Database Failed",JOptionPane.ERROR_MESSAGE);
        } else {
            DefaultTableModel tableModel = new DefaultTableModel();
            tableModel.setColumnIdentifiers(
            new String[]{
                "Nama",
                "Gaji",
                "Gaji Pokok",
                "Jabatan",
                "Kedisiplinan",
                "Transport",
                "Prestasi",
                "PPh 21",
                "Bpjs Kesehatan",
                "Bpjs Ketenagakerjaan",
                "Lain-lain"
            }
            );
            for (Gaji g : listGaji){    
                Object[] o = new Object[11];
                o[0] = g.getNama_karyawan();
                o[1] = g.getGaji();
                o[2] = g.getGaji_Pokok();
                o[3] = g.getTunjangan_Jabatan();
                o[4] = g.getTunjangan_Kedisiplinan();
                o[5] = g.getTransport();
                o[6] = g.getTunjangan_prestasi();
                o[7] = g.getTunjangan_pph();
                o[8] = g.getBpjs_kesehatan();
                o[9] = g.getBpjs_ketenagakerjaan();
                o[10] = g.getLain_lain();
                tableModel.addRow(o);
            }
            tableKaryawan.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
            tableKaryawan.setModel(tableModel);
        }
    }
    
    private void setComboKaryawan(List <Karyawan> listKaryawan){
        if(listKaryawan==null){
            JOptionPane.showMessageDialog(this, "Data Karyawan gagal diambil dari database","DATABASE FAILED",JOptionPane.ERROR_MESSAGE);
        } else {
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            for(Karyawan g : listKaryawan){
                model.addElement(g.getId_urutan()+"-"+g.getNama_karyawan());
            } cbxKaryawan.setModel(model);
        }
    }
    
    private void setLabel(){
        double gaji = Double.parseDouble(txtGaji.getText());
        double gapok = gaji * 0.3;
        double jabatan = gaji * 0.45;
        double kedisiplinan = gaji * 0.15;
        double transportt = gaji * 0.1;
        lblGapok.setText(Double.toString(gapok));
        lblJabatan.setText(Double.toString(jabatan));
        lblDisiplin.setText(Double.toString(kedisiplinan));
        lblTrans.setText(Double.toString(transportt));
    }
    
    private void setClear(){
        cbxKaryawan.setSelectedIndex(0);
        txtGaji.setText("");
        lblGapok.setText("0");
        lblJabatan.setText("0");
        lblDisiplin.setText("0");
        lblTrans.setText("0");
        txtTunjanganPrestasi.setText("0");
        txtTunjanganpph.setText("0");
        txtBpjsKesehatan.setText("0");
        txtBpjsKetenagakerjaan.setText("0");
        txtLain.setText("0");
        outCommand.setText("Ready");
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
            java.util.logging.Logger.getLogger(DaftarUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DaftarUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DaftarUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DaftarUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DaftarUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnGaji;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox<String> cbxKaryawan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDisiplin;
    private javax.swing.JLabel lblGajiPokok;
    private javax.swing.JLabel lblGapok;
    private javax.swing.JLabel lblJabatan;
    private javax.swing.JLabel lblTrans;
    private javax.swing.JLabel lblTransport;
    private javax.swing.JLabel lblTunjanganJabatan;
    private javax.swing.JLabel lblTunjanganKedisiplinan;
    private javax.swing.JMenuItem mnDelete;
    private javax.swing.JLabel outCommand;
    private javax.swing.JPopupMenu popup;
    private javax.swing.JTable tableKaryawan;
    private javax.swing.JTextField txtBpjsKesehatan;
    private javax.swing.JTextField txtBpjsKetenagakerjaan;
    private javax.swing.JTextField txtGaji;
    private javax.swing.JTextField txtLain;
    private javax.swing.JTextField txtTunjanganPrestasi;
    private javax.swing.JTextField txtTunjanganpph;
    // End of variables declaration//GEN-END:variables
}
