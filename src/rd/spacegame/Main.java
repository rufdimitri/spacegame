package rd.spacegame;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new StartWindow("Space-Spiel", 600, 400);
        });
    }
}
