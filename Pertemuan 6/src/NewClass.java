/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tono
 */
public class NewClass {
    
}
try {
    // 1. Siapkan Query
    String sql = "DELETE FROM datanil WHERE nim=?";
    PreparedStatement pS = connection.prepareStatement(sql);
    pS.setString(1, nimTF.getText());

    // 2. Tampilkan Konfirmasi DAHULU sebelum menghapus
    int x = JOptionPane.showConfirmDialog(null, 
            "Data Yakin akan Dihapus?", "Konfirmasi Hapus", 
            JOptionPane.YES_NO_OPTION);

    if (x == JOptionPane.YES_OPTION) {
        // 3. Eksekusi penghapusan menggunakan executeUpdate()
        int rowsDeleted = pS.executeUpdate();

        if (rowsDeleted > 0) {
            JOptionPane.showMessageDialog(this, "Data Telah Dihapus", 
                    "Informasi", JOptionPane.INFORMATION_MESSAGE);
            hapus(); // Membersihkan form/input
        } else {
            JOptionPane.showMessageDialog(this, "Data Tidak Ditemukan", 
                    "Informasi", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    pS.close();

} catch (SQLException e) {
    System.out.println("Koneksi atau Query Gagal: " + e.toString());
}