package telas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import principal.Inicio;


public class TelaPrincipal extends JFrame{
	
	private JLabel background = new JLabel();
	
	private JButton cadastro = new JButton("Cadastro");
	private JButton login = new JButton("Login");
	JTextField usuarioText = new JTextField("Usuário");
	JTextField senhaText = new JTextField("Senha");
	
	//blank
	
	public TelaPrincipal() {
		
		this.setTitle("Cardioclínica Parada Repentina");
		setBounds(100, 300, 400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		usuarioText.setBounds(80, 65, 250, 25);
		senhaText.setBounds(80, 140, 250, 25);
		cadastro.setBounds(240, 300, 140, 60);
		login.setBounds(145, 185, 110, 40);
		
		usuarioText.setHorizontalAlignment(JLabel.CENTER);
		senhaText.setHorizontalAlignment(JLabel.CENTER);
		
		usuarioText.setBackground(Color.black);
		usuarioText.setForeground(Color.ORANGE);
		usuarioText.setCaretColor(new Color(0x00FF00));
		senhaText.setBackground(Color.black);
		senhaText.setForeground(Color.ORANGE);
		senhaText.setCaretColor(new Color(0x00FF00));
		
		cadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				Cadastro tela = new Cadastro();
				tela.setVisible(true);
			}
		});
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				boolean confirm =  false;
				for(ClassCadastro verific_Cadastro : Inicio.reg_Cadastro) {
					if(verific_Cadastro.getUsuario().equals(usuarioText.getText()) && verific_Cadastro.getSenha().equals(senhaText.getText())) {
						confirm = true;
					}
				}
				if(confirm) {
					Login tela = new Login();
					tela.setVisible(true);
				}
			}
		});
		
		login.setIcon(new ImageIcon(getClass().getResource("entrar.png"))); 
		cadastro.setIcon(new ImageIcon(getClass().getResource("cadastrar.png"))); 
		
		this.add(cadastro);
		this.add(login);
		this.add(usuarioText);
		this.add(senhaText);
		
		background.setIcon(new ImageIcon(getClass().getResource("hospital.png")));
		background.setBounds(0, 0, 400, 400);
		getContentPane().add(background);
		this.setVisible(true);
		getContentPane().setLayout(null);
	}

}
