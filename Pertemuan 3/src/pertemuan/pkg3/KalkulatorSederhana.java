/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan.pkg3;

/**
 *
 * @author Gibran
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KalkulatorSederhana extends JFrame {

    // Deklarasi Komponen
    private JLabel lblAngka1, lblAngka2, lblHasil;
    private JTextField txtAngka1, txtAngka2, txtHasil;
    private JButton btnTambah, btnHapus, btnExit;

    public KalkulatorSederhana() {
        // Pengaturan Frame
        setTitle("Aplikasi Pertambahan");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Inisialisasi Komponen (JLabel)
        lblAngka1 = new JLabel("Angka Pertama");
        lblAngka2 = new JLabel("Angka Kedua");
        lblHasil = new JLabel("Hasil");

        // Inisialisasi Komponen (JTextField)
        txtAngka1 = new JTextField(10);
        txtAngka2 = new JTextField(10);
        txtHasil = new JTextField(10);
        txtHasil.setEditable(false); // Hasil tidak bisa diketik manual

        // Inisialisasi Komponen (JButton)
        btnTambah = new JButton("Tambah");
        btnHapus = new JButton("Hapus");
        btnExit = new JButton("Exit");

        // Layouting (Menggunakan GroupLayout agar presisi)
        JPanel panel = new JPanel();
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        // Pengaturan Horizontal
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(lblAngka1)
                    .addComponent(lblAngka2)
                    .addComponent(lblHasil))
                .addGap(30)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(txtAngka1)
                    .addComponent(txtAngka2)
                    .addComponent(txtHasil)))
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnTambah)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHapus)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit))
        );

        // Pengaturan Vertical
        layout.setVerticalGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(lblAngka1)
                .addComponent(txtAngka1))
            .addGap(10)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(lblAngka2)
                .addComponent(txtAngka2))
            .addGap(20)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(lblHasil)
                .addComponent(txtHasil))
            .addGap(30)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(btnTambah)
                .addComponent(btnHapus)
                .addComponent(btnExit))
        );

        add(panel);

        // --- Logika Tombol ---

        // Tombol Tambah
        btnTambah.addActionListener(e -> {
            try {
                double a1 = Double.parseDouble(txtAngka1.getText());
                double a2 = Double.parseDouble(txtAngka2.getText());
                txtHasil.setText(String.valueOf(a1 + a2));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Masukkan angka yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Tombol Hapus
        btnHapus.addActionListener(e -> {
            txtAngka1.setText("");
            txtAngka2.setText("");
            txtHasil.setText("");
            txtAngka1.requestFocus();
        });

        // Tombol Exit
        btnExit.addActionListener(e -> System.exit(0));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new KalkulatorSederhana().setVisible(true);
        });
    }
}
