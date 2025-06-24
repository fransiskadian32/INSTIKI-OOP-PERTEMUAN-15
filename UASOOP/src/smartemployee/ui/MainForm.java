package smartemployee.ui;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MainForm extends JFrame {
    private DefaultListModel<String> listModel;
    private JList<String> listKaryawan;
    private JButton btnTambah;
    private final ArrayList<Karyawan> daftarKaryawan;

    public MainForm() {
        setTitle("SmartEmployeeManager");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        daftarKaryawan = new ArrayList<>();
        listModel = new DefaultListModel<>();

        listKaryawan = new JList<>(listModel);
        btnTambah = new JButton("Tambah Karyawan");

        btnTambah.addActionListener(e -> tambahKaryawan());

        add(new JScrollPane(listKaryawan), BorderLayout.CENTER);
        add(btnTambah, BorderLayout.SOUTH);
    }

    private void tambahKaryawan() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class Karyawan {

        public Karyawan() {
        }
    }
}

   
