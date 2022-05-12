package telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import principal.Inicio;

public class Cadastro extends JFrame {

	private JLabel background = new JLabel();

	JTextField usuarioText = new JTextField("Usuário");
	JTextField senhaText = new JTextField("Senha");
	JButton cadastrar = new JButton();

	public Cadastro() {

		this.setTitle("Área de Cadastro");
		setBounds(100, 400, 400, 400);
		getContentPane().setLayout(null);

		usuarioText.setBounds(80, 100, 250, 25);
		senhaText.setBounds(80, 175, 250, 25);
		cadastrar.setBounds(270, 300, 100, 55);
		usuarioText.setHorizontalAlignment(JLabel.CENTER);
		senhaText.setHorizontalAlignment(JLabel.CENTER);

		cadastrar.setIcon(new ImageIcon(getClass().getResource("botao.png")));

		cadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				boolean confirm = false;
				for (ClassCadastro verific_Cadastrados : Inicio.reg_Cadastro) {
					if (verific_Cadastrados.getUsuario().equals(usuarioText.getText())) {
						JOptionPane.showMessageDialog(null, " Usuário já Cadastrado! ");
						confirm = true;
					}
				}
				if (!confirm) {
					ClassCadastro reg_Cadastrados = new ClassCadastro();
					reg_Cadastrados.setUsuario(usuarioText.getText());
					reg_Cadastrados.setSenha(senhaText.getText());

					JOptionPane.showMessageDialog(null, " Cadastro concluido! ");
					Inicio.reg_Cadastro.add(reg_Cadastrados);
				}
			}
		});

		this.add(usuarioText);
		this.add(senhaText);
		this.add(cadastrar);

		background.setIcon(new ImageIcon(getClass().getResource("ambulancia.png")));
		background.setBounds(0, 0, 400, 400);
		getContentPane().add(background);
		this.setVisible(true);

	}
}
