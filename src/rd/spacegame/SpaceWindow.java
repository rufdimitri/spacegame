package rd.spacegame;

import javax.swing.*;

public class SpaceWindow extends JFrame {
    private int width;
    private int height;
    private SpaceGame spaceGame;

    public SpaceWindow(String title, int width, int height) {
        super(title);
        setSize(width, height);
        setResizable(false);
        setLocationRelativeTo(null);
        this.width = width;
        this.height = height;
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        setVisible(true);

        int titleHeight = getInsets().top;
        int borderRight = getInsets().right;
        int borderLeft = getInsets().left;
        int borderBottom = getInsets().bottom;

        spaceGame = new SpaceGame(width-borderLeft-borderRight, height-borderBottom-titleHeight);
        add(spaceGame);
    }

    @Override
    public void dispose() {
        super.dispose();
        spaceGame.dispose();
    }
}
