/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.Aplikasi;
import ViewGUI.Addpenyedia_penyedia;
import ViewGUI.Login;
import ViewGUI.MainMenu;
import ViewGUI.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

/**
 *
 * @author Farid Kiftirul Aziz
 */
public class Controllerbarang_penyedia extends MouseAdapter implements ActionListener {

    private Aplikasi apk2;

    private View viewW;

    public Controllerbarang_penyedia(Aplikasi apk2) {
        this.apk2 = apk2;
        MainMenu m2 = new MainMenu();
        m2.setVisible(true);
        m2.addListener(this);
        viewW = (View) m2;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (viewW instanceof MainMenu) {
            MainMenu m2 = (MainMenu) viewW;
            if (source.equals(m2.getBtnPenyedia())) {
                Addpenyedia_penyedia pny = new Addpenyedia_penyedia();
                pny.setVisible(true);
                pny.addListener(this);
                m2.dispose();
                viewW = (View) pny;
            } else if (source.equals(m2.getBtnLogin())) {
                Login L = new Login();
                L.setVisible(true);
                L.addListener(this);
                m2.dispose();
                viewW = (View) L;
            }
        }

    }
}
