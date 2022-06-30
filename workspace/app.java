import javax.swing.*;

class App {

    private static void Fenster(){
        //Fenster erstellen und Titel festlegen
        JFrame window = new JFrame("Epic Chase Royale HD Champions Pro Edition");
        //app beim Schließen des Fensters beenden
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //jpanel erstellen, gameloop
        Board board = new Board();
        //jpanel anzeigen im Fenster
        window.add(board);
        //Tastatureingaben
        window.addKeyListener(board);

        //festgelegte Fenstergröße
        window.setResizable(false);
        //fenster so groß wie jpanel
        window.pack();
        //fenster in mitte
        window.setLocationRelativeTo(null);
        //anzeigen
        window.setVisible(true);
    }

    public static void main(String[] args) {
        // invokeLater() is used here to prevent our graphics processing from
        // blocking the GUI. https://stackoverflow.com/a/22534931/4655368
        // this is a lot of boilerplate code that you shouldn't be too concerned about.
        // just know that when main runs it will call initWindow() once.
        // ich weiß nicht was das hier ist :(

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                initWindow();
            }
        });
    }
}