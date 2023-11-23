package rd.spacegame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class StartWindow extends JFrame {
    private JButton startGame;
    private JButton startMusic;
    public static final Color buttonColor = Color.CYAN;
    public static final Color backgroundColor = new Color(0, 22, 31);

    public StartWindow(String title, int width, int height) {
        super(title);
        setSize(width, height);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setLayout(new BorderLayout()); //NORTH; WEST; EAST; SOUTH; CENTER

        //North
        JPanel panelNorth = new JPanel();
        panelNorth.setLayout(new FlowLayout());
        panelNorth.setBackground(backgroundColor);

        startGame = new JButton("Start game");
        startGame.setBackground(buttonColor);
        startGame.setFocusPainted(false);
        startGame.addActionListener((ActionEvent e) -> {
            new SpaceWindow("Space Game", 800, 800);
        });
        panelNorth.add(startGame);

        startMusic = new JButton("Start music");
        startMusic.setBackground(buttonColor);
        startMusic.setFocusPainted(false);
        startMusic.addActionListener((ActionEvent e) -> {
            System.out.println("startMusic");
        });
        panelNorth.add(startMusic);

        JTextArea gameManual = new JTextArea();
        gameManual.setForeground(Color.WHITE);
        gameManual.setBackground(backgroundColor);
        gameManual.setFont(new Font("Arial", Font.ITALIC, 20));
        gameManual.setText("Der Weltraum, unendliche Weiten \r\n"
                + "Wir schreiben das Jahr 2200. \r\n"
                +"Dies sind die Abenteuer des Raumschiffs Enterprise..."
        );
        gameManual.setMargin(new Insets(30,30,30,30));

        add(gameManual, BorderLayout.CENTER);
        add(panelNorth, BorderLayout.NORTH);
        setVisible(true);
    }
}
