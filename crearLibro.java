package libros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class crearLibro extends javax.swing.JFrame {

    public crearLibro() {
        initComponents();
        setLocationRelativeTo(null);
        cargarAutores();
    }

    private void cargarAutores() {
        try {
            File file = new File("src/data/autores.txt");
            if (!file.exists()) {
                JOptionPane.showMessageDialog(this, "No hay autores disponibles. Agrega un autor primero.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String linea;
            while ((linea = br.readLine()) != null) {
                cmbAutor.addItem(linea);
            }
            br.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al leer el archivo de autores.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtISBM = new javax.swing.JTextField();
        cmbAutor = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSinopsis = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        radioFantasia = new javax.swing.JRadioButton();
        radioTerror = new javax.swing.JRadioButton();
        radioCiencia = new javax.swing.JRadioButton();
        radioRomance = new javax.swing.JRadioButton();
        chxNoLeido = new javax.swing.JCheckBox();
        chxLeido = new javax.swing.JCheckBox();
        btnCancelar = new javax.swing.JButton();
        btnCrearAutor = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("AGREGAR LIBRO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Género:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));
        jPanel1.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 290, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("ISBM:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Título:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));
        jPanel1.add(txtISBM, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 290, -1));

        jPanel1.add(cmbAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 290, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Autor:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        txtSinopsis.setColumns(20);
        txtSinopsis.setRows(5);
        jScrollPane1.setViewportView(txtSinopsis);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 290, 80));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Sinopsis:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        radioFantasia.setText("Fantasía");
        jPanel1.add(radioFantasia, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, -1, -1));

        radioTerror.setText("Terror");
        jPanel1.add(radioTerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        radioCiencia.setText("Ciencia ficción");
        jPanel1.add(radioCiencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, -1));

        radioRomance.setText("Romance");
        jPanel1.add(radioRomance, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, -1));

        chxNoLeido.setText("Lo tengo");
        jPanel1.add(chxNoLeido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, -1, -1));

        chxLeido.setText("Leído");
        jPanel1.add(chxLeido, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, -1, -1));

        btnCrearAutor.setText("Nuevo autor");
        btnCrearAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearAutorActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrearAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearAutorActionPerformed
        this.dispose();
        new crearAutor().setVisible(true);
    }//GEN-LAST:event_btnCrearAutorActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
        new menu().setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String isbn = txtISBM.getText();
        String titulo = txtTitulo.getText();
        String autor = (String) cmbAutor.getSelectedItem();
        String sinopsis = txtSinopsis.getText();
        String genero = "";
        if (radioTerror.isSelected()) {
            genero = "Terror";
        } else if (radioCiencia.isSelected()) {
            genero = "Ciencia ficción";
        } else if (radioRomance.isSelected()) {
            genero = "Romance";
        } else if (radioFantasia.isSelected()) {
            genero = "Fantasía";
        }

        boolean leido = chxLeido.isSelected();

        if (isbn.isEmpty() || titulo.isEmpty() || autor == null || sinopsis.isEmpty() || genero.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos deben estar llenos y un género seleccionado.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Libro nuevoLibro = new Libro(isbn, titulo, autor, sinopsis, genero, leido);
        guardarLibroEnArchivo(nuevoLibro);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void guardarLibroEnArchivo(Libro libro) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("src/data/libros.txt", true));
            bw.write(libro.getIsbn() + "~" + libro.getTitulo() + "~" + libro.getAutor() + "~" + libro.getSinopsis() + "~" + libro.getGenero() + "~" + libro.isLeido() + "\n");
            bw.close();
            JOptionPane.showMessageDialog(this, "Libro guardado correctamente.", "Guardado", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            new menu().setVisible(true);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar el libro.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(crearLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crearLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crearLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crearLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crearLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCrearAutor;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JCheckBox chxLeido;
    private javax.swing.JCheckBox chxNoLeido;
    private javax.swing.JComboBox<String> cmbAutor;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioCiencia;
    private javax.swing.JRadioButton radioFantasia;
    private javax.swing.JRadioButton radioRomance;
    private javax.swing.JRadioButton radioTerror;
    private javax.swing.JTextField txtISBM;
    private javax.swing.JTextArea txtSinopsis;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
