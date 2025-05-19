import javax.swing.*;
import java.awt.event.*;

public class TelaInicial extends JFrame {
    private JButton btnLogin, btnCadastrar;

    public TelaInicial() {
        setTitle("Sistema de Doação de Sangue");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        btnLogin = new JButton("LOGIN");
        btnLogin.setBounds(100, 40, 100, 30);
        add(btnLogin);

        btnCadastrar = new JButton("CADASTRAR");
        btnCadastrar.setBounds(100, 90, 100, 30);
        add(btnCadastrar);

        btnLogin.addActionListener(e -> {
            new TelaLogin();
            this.dispose();
        });

        btnCadastrar.addActionListener(e -> {
            new TelaCadastro();
            this.dispose();
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new TelaInicial();
    }
}
