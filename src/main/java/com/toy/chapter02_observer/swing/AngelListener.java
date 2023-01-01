package com.toy.chapter02_observer.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AngelListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println("하지 마! 아마 후회할 걸?");
    }
}
