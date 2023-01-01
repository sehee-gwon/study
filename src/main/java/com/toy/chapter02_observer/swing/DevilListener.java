package com.toy.chapter02_observer.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DevilListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println("그냥 저질러 버렷!!!");
    }
}
