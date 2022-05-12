package telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import Disponivel.Disponiveis;
import Pronturario.TelaProntuarios;
import agendamento.AgendamentoTela;
import cancelamento.Cancelamento;
import consultas.Consultas;
import medico.TelaMedico;
import paciente.TelaPaciente;

public class Login extends JFrame{
	
	private JLabel background = new JLabel();
	
	JButton medicosButton = new JButton();
	JButton pacientesButton = new JButton();
	JButton agendamentoButton = new JButton();
	JButton cancelamentoButton = new JButton();
	JButton horarios = new JButton();
	JButton prontuario = new JButton();
	JButton consultas = new JButton();
	
	public Login() {
		
		this.setTitle("Área de Médicos");
		setBounds(100, 300, 900, 700);
		getContentPane().setLayout(null);
		
		medicosButton.setBounds(680, 100, 130, 50);
		pacientesButton.setBounds(680, 170, 130, 50);
		agendamentoButton.setBounds(680, 240, 130, 50);
		cancelamentoButton.setBounds(680, 310, 130, 50);
		horarios.setBounds(680, 380, 130, 50);
		prontuario.setBounds(680, 450, 130, 50);
		consultas.setBounds(680, 520, 130, 50);
		
		medicosButton.setIcon(new ImageIcon(getClass().getResource("medicos.png"))); 
		pacientesButton.setIcon(new ImageIcon(getClass().getResource("pacientes.png")));
		agendamentoButton.setIcon(new ImageIcon(getClass().getResource("agendamento.png")));
		cancelamentoButton.setIcon(new ImageIcon(getClass().getResource("cancelamento.png")));
		horarios.setIcon(new ImageIcon(getClass().getResource("horarios.png")));
		prontuario.setIcon(new ImageIcon(getClass().getResource("prontuarios.png")));
		consultas.setIcon(new ImageIcon(getClass().getResource("consultas.png")));
		
		medicosButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				TelaMedico tela = new TelaMedico();
				tela.setVisible(true);
			}
		});
		
		pacientesButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				TelaPaciente tela = new TelaPaciente();
				tela.setVisible(true);
			}
		});
		
		agendamentoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				AgendamentoTela tela = new AgendamentoTela();
				tela.setVisible(true);
			}
		});
		
		cancelamentoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				Cancelamento tela = new Cancelamento();
				tela.setVisible(true);
			}
		});
		
		horarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String datas = JOptionPane.showInputDialog(null, "Data das Consultas");
				String crm = JOptionPane.showInputDialog(null, "CRM do médico procurado");
				Disponiveis.ConsDisponiveis(datas, crm);
				
			}
		});
		prontuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				TelaProntuarios tela = new TelaProntuarios();
				tela.setVisible(true);
				
			}
		});
		
		consultas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				Consultas tela = new Consultas();
				tela.setVisible(true);
				
			}
		});
		
		this.add(medicosButton);
		this.add(pacientesButton);
		this.add(agendamentoButton);
		this.add(cancelamentoButton);
		this.add(horarios);
		this.add(prontuario);
		this.add(consultas);
		
		background.setIcon(new ImageIcon(getClass().getResource("hospitalFoto.png")));
		getContentPane().add(background);
		background.setBounds(0,0,900,700);
		
	}

}
