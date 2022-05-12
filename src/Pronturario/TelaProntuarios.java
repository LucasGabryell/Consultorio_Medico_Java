package Pronturario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaProntuarios extends JFrame{
	
private JLabel background = new JLabel();
	
	JButton pronturarios = new JButton();
	JButton consultaPronturarios = new JButton();
	
	public TelaProntuarios() {
		
		this.setTitle("Área de Médicos");
		setBounds(100, 300, 400, 350);
		getContentPane().setLayout(null);
		
		pronturarios.setBounds(160, 60, 110, 60);
		consultaPronturarios.setBounds(160, 150, 110, 60);
		
			
		pronturarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				Pronturarios tela = new Pronturarios();
				tela.setVisible(true);
			}
		});
		
		consultaPronturarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				new ConsultaProntuarios();
				setVisible(true);
			}
		});
		
		pronturarios.setIcon(new ImageIcon(getClass().getResource("BotaoPront.png"))); 
		consultaPronturarios.setIcon(new ImageIcon(getClass().getResource("consulta.png"))); 
		
		this.add(pronturarios);
		this.add(consultaPronturarios);
		
		background.setIcon(new ImageIcon(getClass().getResource("prontuarios.png")));
		getContentPane().add(background);
		background.setBounds(0, 0, 400, 350);
	}

}
