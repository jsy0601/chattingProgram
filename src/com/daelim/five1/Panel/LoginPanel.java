package com.daelim.five1.Panel;

import com.daelim.five1.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class LoginPanel extends JPanel {
    private JTextField idField;
    private JPasswordField pwField;

    public String line = "";

    public LoginPanel() {
        setView();

        setBackground(Color.ORANGE);
        setSize(500,500);
        setLayout(null);
    }

    private void setView() {
        JLabel label_id = new JLabel("아이디:");
        label_id.setBounds(100, 100, 50, 30);
        add(label_id);
        idField = new JTextField();
        idField.setBounds(150,100,200,30);
        add(idField);

        JLabel label_pw = new JLabel("비밀번호:");
        label_pw.setBounds(85, 150, 60, 30);
        add(label_pw);
        pwField = new JPasswordField();
        pwField.setBounds(150, 150, 200, 30);
        add(pwField);

        JButton bt_login = new JButton("로그인");
        bt_login.setBounds(120,250,260,30);
        bt_login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    /*파일 읽기 start*/
                    FileInputStream fis = new FileInputStream("d://settingData.txt");
                    ObjectInputStream in = new ObjectInputStream(fis);

                    String f_line = in.readObject().toString();
                    int first = f_line.indexOf("ws://");
                    String e_line = f_line.substring(first);
                    Main.uri(e_line);
                    in.close();
                    /*파일 읽기 end*/
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                Main.movePage(3);
                /*System.out.println("로그인을 요청했습니다");*/
                Main.connect(idField.getText());
            }
        });
        add(bt_login);

        JButton bt_join = new JButton("회원가입");
        bt_join.setBounds(120,300,260,30);
        bt_join.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("회원가입을 요청했습니다");
                Main.movePage(2);
            }
        });
        add(bt_join);

        JButton bt_setting = new JButton("환경설정");
        bt_setting.setBounds(120,350,260,30);
        bt_setting.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("환경설정 편집을 요청했습니다");
                Main.movePage(4);
            }
        });
        add(bt_setting);
    }

}