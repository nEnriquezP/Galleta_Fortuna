import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
public class GalletaFortuna implements ActionListener{

    JFrame frame;
    JPanel panel;
    JButton button;
    JLabel label;
    Random random;

    public GalletaFortuna(){
        frame = new JFrame();
        panel = new JPanel();
        button = new JButton("Abrir galleta");
        label = new JLabel();
        random = new Random();

        button.addActionListener(this);
        panel.add(button);
        panel.add(label);
        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 300);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GalletaFortuna();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String[] messages = {
                "Todos tus sueños pueden hacerse realidad si tienes el coraje de perseguirlos.",
                "El éxito es la suma de pequeños esfuerzos–repetidos un día sí y otro también.",
                "Si quieres que tus sueños se hagan realidad, el primer paso es levantarte.",
                "Haz de cada día tu obra maestra.",
                "El fracaso es una buena oportunidad para empezar de nuevo con más inteligencia.",
                "Da siempre lo mejor de ti mismo. Lo que plantas ahora, se cosechará más tarde.",
                "Las oportunidades son como los amaneceres. Si esperas mucho tiempo, las pierdes. - William",
                "Cuando te levantes por la mañana, piensa en el precioso privilegio de estar vivo, respirar, pensar, disfrutar y amar. "
        };
        int index = random.nextInt(messages.length);
        label.setText(messages[index]);
    }
}
