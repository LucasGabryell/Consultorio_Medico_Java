package Pronturario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import agendamento.AgendamentoClass;
import principal.Inicio;

public class Pronturarios extends JFrame implements ActionListener{
	
	private JLabel background = new JLabel();
	
	JButton continuar = new JButton();
	JButton ok = new JButton();
	
	JTextField crmText = new JTextField("CRM");
	JTextField cpfText = new JTextField("CPF");
	JTextField atendimentoText = new JTextField("Descreva o Atendimento");
	JTextField medicamentosText = new JTextField("Descreva os Medicamentos");
	

	public Pronturarios() {
		
		this.setTitle("Área de Médicos");
		setBounds(100, 300, 550, 600);
		getContentPane().setLayout(null);
		
		ok.addActionListener(this);
		continuar.addActionListener(this);
		
		crmText.setBounds(170, 80, 250, 25);
		cpfText.setBounds(170, 155, 250, 25);
		continuar.setBounds(230, 220, 115, 35);
		
		crmText.setHorizontalAlignment(JLabel.CENTER);
		cpfText.setHorizontalAlignment(JLabel.CENTER);
		
		continuar.setIcon(new ImageIcon(getClass().getResource("continuar.png"))); 
		ok.setIcon(new ImageIcon(getClass().getResource("ok.png")));

		this.add(crmText);
		this.add(cpfText);
		this.add(continuar);
		this.add(atendimentoText);
		this.add(medicamentosText);
		this.add(ok);
		
		background.setIcon(new ImageIcon(getClass().getResource("pront.png")));
		getContentPane().add(background);
		background.setBounds(0, 0, 550, 600);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == continuar) {
			boolean confirm = false;
			for(AgendamentoClass verif_Prontuarios : Inicio.reg_Agendamento) {
				if(verif_Prontuarios.getCpf().equals(cpfText.getText()) && verif_Prontuarios.getCrm().equals(crmText.getText()) && verif_Prontuarios.getStatus().equals("Agendada")) {
					confirm = true;
					break;
				}
			}
			if(confirm) {
				atendimentoText.setBounds(170, 270, 250, 25);
				medicamentosText.setBounds(170, 365, 250, 25);
				ok.setBounds(450, 500, 80, 50);
				atendimentoText.setHorizontalAlignment(JLabel.CENTER);
				medicamentosText.setHorizontalAlignment(JLabel.CENTER);
				
			}
			else {
				JOptionPane.showMessageDialog(null, "Erro em prosseguir no prontuário!");
			}
		}
		if(e.getSource() == ok) {
			ClassProntuarios analise_Pronturarios = new ClassProntuarios();
			analise_Pronturarios.setCrm(crmText.getText());
			analise_Pronturarios.setCpf(cpfText.getText());
			analise_Pronturarios.setAtendimento(atendimentoText.getText());
			analise_Pronturarios.setMedicamentos(medicamentosText.getText());
			analise_Pronturarios.setStatus("Realizada");
			
			JOptionPane.showMessageDialog(null, "Registro de prontuário concluído!");

			Inicio.reg_Prontuarios.add(analise_Pronturarios);
			crmText.setText("CRM");
			cpfText.setText("CPF");
			atendimentoText.setText("Descreva o Atendimento");
			medicamentosText.setText("Descreva os Medicamentos");
			
		}
		
	}

}
