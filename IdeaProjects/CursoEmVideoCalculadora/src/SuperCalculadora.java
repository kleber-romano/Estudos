import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SuperCalculadora {
    private JPanel Calculadora;
    private JSpinner Valor;
    private JButton btnCalcular;
    private JLabel lblResto;
    private JLabel lblCubo;
    private JLabel lblRaizQuadrada;
    private JLabel lblRaizCubica;
    private JLabel lblValorAbsoluto;
    private JPanel panCalc;

    public SuperCalculadora() {
        Calculadora.setSize(550,250);
        panCalc.setVisible(false);
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(Valor.getValue().toString());
                int r = num % 2;
                lblResto.setText(Integer.toString(r));
                panCalc.setVisible(true);
                int cubo = (int) Math.pow(num, 3);
                lblCubo.setText(Integer.toString(cubo));
                double raizQ = Math.sqrt(num);
                lblRaizQuadrada.setText(String.format("%.2f", raizQ));
                double raizC = Math.cbrt(num);
                lblRaizCubica.setText(String.format("%.2f", raizC));
                int vAbs = Math.abs(num);
                lblValorAbsoluto.setText(Integer.toString(vAbs));


            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("SuperCalculadora");
        frame.setContentPane(new SuperCalculadora().Calculadora);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);



    }
}
