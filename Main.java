package DMH;


import javax.swing.*;
import java.awt.*;


class DMH {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(1920,1080);
        frame.getContentPane().setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel bg = new JPanel(){
            Image img = new ImageIcon("src/DMH/PokerBg1.jpg"). getImage();
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g.drawImage(img,0,0,1920,1080,null);
            }
        };
        bg.setLayout(null);
        bg.setBounds(0,0,1920,1080);
        frame.setContentPane(bg);

        Font titleFont = new Font("Sans Serif", Font.BOLD, 90);
        Font btnFont = new Font("Sans Serif", Font.BOLD, 36);
        frame.setVisible(true);


        JLabel title = new JLabel("Dead Man's Hand", SwingConstants.CENTER);
        title.setFont(titleFont);
        title.setForeground(Color.decode("#191919"));
        title.setBounds(460,150,1000,100);
        bg.add(title);


        JButton btn1 = new JButton("Play Game");
        JButton btn2 = new JButton("View Rules");
        JButton btn3 = new JButton("Settings");
        JButton btn4 = new JButton("Tutorial");
        JButton[] buttons = {btn1,btn2,btn3,btn4};
        int stratY = 350;
        int buttonWidth = 400;
        int buttonHeight = 100;
        int spacing = 30;
        int centerX = (1920 - buttonWidth)/2;
        for(int i = 0; i < buttons.length; i++){
            JButton btn = buttons[i];


            btn.setOpaque(true);
            btn.setBorderPainted(false);
            btn.setBackground(Color.BLACK);
            btn.setForeground(Color.WHITE);
            btn.setFont(btnFont);


            int currentY = stratY + (i * (buttonHeight + spacing));
            btn.setBounds(centerX, currentY, buttonWidth, buttonHeight);
            bg.add(btn);
        }
        frame.setVisible(true);
    }}
