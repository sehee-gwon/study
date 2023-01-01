package com.toy.chapter02_observer.swing;

import javax.swing.*;

public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go() {
        frame = new JFrame();
        JButton button = new JButton("할까? 말까?");
        
        // 이벤트 리스너 직접 구현
        // button.addActionListener(new AngelListener());
        // button.addActionListener(new DevilListener());
        
        // 람다식 사용
        button.addActionListener(event -> System.out.println("하지 마! 아마 후회할 걸?"));
        button.addActionListener(event -> System.out.println("그냥 저질러 버렷!!!"));
    }
}
