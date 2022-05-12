package agendamento;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import medico.ConsultaMedico;
import medico.Medico;

public class AgendamentoTela extends JFrame{
	
private JLabel background = new JLabel();
	
	JButton agendamentoButton = new JButton();
	JButton consultaAgendamento = new JButton();
	
	public AgendamentoTela() {
		
		this.setTitle("Área de Agendamentos de Consultas");
		setBounds(100, 300, 400, 350);
		getContentPane().setLayout(null);
		
		agendamentoButton.setBounds(130, 60, 115, 60);
		consultaAgendamento.setBounds(130, 150, 115, 60);
		
		agendamentoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				Agendamento tela = new Agendamento();
				tela.setVisible(true);
			}
		});
		
		consultaAgendamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				new ConsultaAgendamento();
				setVisible(true);
			}
		});
		
		agendamentoButton.setIcon(new ImageIcon(getClass().getResource("agendamento.png"))); 
		consultaAgendamento.setIcon(new ImageIcon(getClass().getResource("consulta.png"))); 
		
		this.add(agendamentoButton);
		this.add(consultaAgendamento);
		
		background.setIcon(new ImageIcon(getClass().getResource("agendamentoBCK.png")));
		getContentPane().add(background);
		background.setBounds(0, 0, 400, 350);
	}

}
