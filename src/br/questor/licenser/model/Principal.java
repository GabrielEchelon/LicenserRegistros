package br.questor.licenser.model;

import br.questor.licenser.view.UI.Login;

public class Principal {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new Login().setVisible(true);
            }
        });
    }
    
}
