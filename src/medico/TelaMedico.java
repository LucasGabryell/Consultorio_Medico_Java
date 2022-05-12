package medico;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaMedico extends JFrame{
	
	private JLabel background = new JLabel();
	
	JButton medicoCadastro = new JButton();
	JButton consultaMedicos = new JButton();
	
	public TelaMedico() {
		
		this.setTitle("Área de Médicos");
		setBounds(100, 300, 400, 350);
		getContentPane().setLayout(null);
		
		medicoCadastro.setBounds(130, 60, 110, 60);
		consultaMedicos.setBounds(130, 150, 110, 60);
		
			
		medicoCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				Medico tela = new Medico();
				tela.setVisible(true);
			}
		});
		
		consultaMedicos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				new ConsultaMedico();
				setVisible(true);
			}
		});
		
		medicoCadastro.setIcon(new ImageIcon(getClass().getResource("cadastro.png"))); 
		consultaMedicos.setIcon(new ImageIcon(getClass().getResource("consulta.png"))); 
		
		this.add(medicoCadastro);
		this.add(consultaMedicos);
		
		background.setIcon(new ImageIcon(getClass().getResource("medicamentos.png")));
		getContentPane().add(background);
		background.setBounds(0, -20, 400, 350);
	}

}
