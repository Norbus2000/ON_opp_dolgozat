package dolgozat_oop;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class gui extends javax.swing.JFrame {

    String szam = "";
    String[] szamok = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    ArrayList<JButton> gombLista = new ArrayList<>();
//    JPanel gombokPanel = new JPanel();
//    Component[] gombok = gombokPanel.getComponents();

    public gui() {
        initComponents();
//        pinPanel.add((Component) new ujgombokPanel());
//        gombListaFeltolt();
        gombKattintas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        BeallitPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        keverCheckbox = new javax.swing.JCheckBox();
        kodTextfield = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pinPanel = new ujgombokPanel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        ujraJmenu = new javax.swing.JMenuItem();
        kilepJmenu = new javax.swing.JMenuItem();
        vizszintesJmenu = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        fuggolegesJmenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("GUI-OOP 1. dolgozat");
        setSize(new java.awt.Dimension(410, 350));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel3.setText("Kód");

        keverCheckbox.setText("Kever");
        keverCheckbox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                keverCheckboxItemStateChanged(evt);
            }
        });
        keverCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                none(evt);
            }
        });

        jLabel2.setText("Beállitás");

        javax.swing.GroupLayout BeallitPanelLayout = new javax.swing.GroupLayout(BeallitPanel);
        BeallitPanel.setLayout(BeallitPanelLayout);
        BeallitPanelLayout.setHorizontalGroup(
            BeallitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BeallitPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BeallitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kodTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                    .addGroup(BeallitPanelLayout.createSequentialGroup()
                        .addGroup(BeallitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(keverCheckbox)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        BeallitPanelLayout.setVerticalGroup(
            BeallitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BeallitPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(keverCheckbox)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kodTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setText("Pin kód");

        javax.swing.GroupLayout pinPanelLayout = new javax.swing.GroupLayout(pinPanel);
        pinPanel.setLayout(pinPanelLayout);
        pinPanelLayout.setHorizontalGroup(
            pinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pinPanelLayout.setVerticalGroup(
            pinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jDesktopPane1.setLayer(BeallitPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(pinPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(pinPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94)
                .addComponent(BeallitPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pinPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BeallitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Bejelentkezés", jDesktopPane1);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 238, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Játék", jDesktopPane2);

        jMenu2.setText("Program");

        ujraJmenu.setText("Újra");
        jMenu2.add(ujraJmenu);

        kilepJmenu.setText("Kilépés");
        kilepJmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kilepJmenuActionPerformed(evt);
            }
        });
        jMenu2.add(kilepJmenu);

        jMenuBar1.add(jMenu2);

        vizszintesJmenu.setText("játék");

        jMenuItem3.setText("Vízszintes");
        vizszintesJmenu.add(jMenuItem3);

        fuggolegesJmenu.setText("Függőleges");
        vizszintesJmenu.add(fuggolegesJmenu);

        jMenuBar1.add(vizszintesJmenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void none(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_none

    }//GEN-LAST:event_none

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        kilepes();
    }//GEN-LAST:event_formWindowClosing

    private void kilepJmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kilepJmenuActionPerformed
        kilepes();
    }//GEN-LAST:event_kilepJmenuActionPerformed

    private void keverCheckboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_keverCheckboxItemStateChanged

        ArrayList<String> szamokLista = new ArrayList<>();

        for (String szam : szamokLista) {
            szamokLista.add(szam);
        }

        for (JButton gomb : gombLista) {
            gomb.setText(szamok[(new Random()).nextInt(10)]);
            gomb.setName(gomb.getText());
        }
    }//GEN-LAST:event_keverCheckboxItemStateChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BeallitPanel;
    private javax.swing.JMenuItem fuggolegesJmenu;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JCheckBox keverCheckbox;
    private javax.swing.JMenuItem kilepJmenu;
    private javax.swing.JTextField kodTextfield;
    private javax.swing.JPanel pinPanel;
    private javax.swing.JMenuItem ujraJmenu;
    private javax.swing.JMenu vizszintesJmenu;
    // End of variables declaration//GEN-END:variables

    private void kilepes() {
        int valasz = JOptionPane.showConfirmDialog(null, "Biztosan szeretne kilépni?", "Kilépés", JOptionPane.YES_NO_OPTION);
        if (valasz == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    private void gombKattintas() {
        for (JButton gomb : gombLista) {
            gomb.addActionListener(e -> {
                szam += gomb.getText();
                kodTextfield.setText(szam);
                gomb.setBackground(Color.CYAN);
            });
        }
    }

//    private void gombListaFeltolt() {
//
//        for (Component component : gombok) {
//            gombLista.add((JButton) component);
//        }
//    }

}

class ujgombokPanel extends JPanel {
    public ujgombokPanel() {
        setLayout(new java.awt.GridLayout(4, 4));
        for (int i = 0; i <= 9; ++i) {
            JButton b = new JButton(String.valueOf(i));
            b.addActionListener((java.awt.event.ActionEvent e) -> {
                System.out.println("kattint");
            });
            add(b);
        }
    }
}
