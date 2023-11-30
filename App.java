
import javax.swing.SwingUtilities;

public class App {
    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(() -> {
            try {
                BlackJack blackJack = new BlackJack();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}