package paciente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import medico.ConsultaMedico;
import medico.Medico;

public class TelaPaciente extends JFrame{
	
	private JLabel background = new JLabel();
	
	JButton pacienteCadastro = new JButton();
	JButton consultaPaciente = new JButton();
	
	public TelaPaciente() {
		
		this.setTitle("Área de Pacientes");
		setBounds(100, 300, 400, 330);
		getContentPane().setLayout(null);
		
		pacienteCadastro.setBounds(145, 60, 110, 60);
		consultaPaciente.setBounds(145, 150, 110, 60);
		
			
		pacienteCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				Paciente tela = new Paciente();
				tela.setVisible(true);
			}
		});
		
		consultaPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				new ConsultaPaciente();
				setVisible(true);
			}
		});
		
		pacienteCadastro.setIcon(new ImageIcon(getClass().getResource("cadastro.png"))); 
		consultaPaciente.setIcon(new ImageIcon(getClass().getResource("consulta.png"))); 
		
		this.add(pacienteCadastro);
		this.add(consultaPaciente);
		
		background.setIcon(new ImageIcon(getClass().getResource("hosp.png")));
		getContentPane().add(background);
		background.setBounds(0, 0, 400, 350);
	}

}
