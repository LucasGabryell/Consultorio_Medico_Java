package agendamento;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import medico.MedicoClass;
import paciente.PacienteClass;
import principal.Inicio;

public class Agendamento extends JFrame implements ActionListener {

	private JLabel background = new JLabel();

	JButton verificar = new JButton();
	JButton ok = new JButton();

	JTextField dataText = new JTextField("Data");
	JTextField crmText = new JTextField("CRM");
	JTextField cpfText = new JTextField("CPF");

	JCheckBox manha = new JCheckBox("Manhã");
	JCheckBox tarde = new JCheckBox("Tarde");

	public Agendamento() {

		this.setTitle("Área de Médicos");
		setBounds(100, 300, 550, 600);
		getContentPane().setLayout(null);

		ok.addActionListener(this);
		manha.addActionListener(this);
		tarde.addActionListener(this);

		dataText.setBounds(110, 155, 250, 25);
		crmText.setBounds(110, 230, 250, 25);
		cpfText.setBounds(110, 305, 250, 25);
		verificar.setBounds(370, 75, 115, 35);

		manha.setBounds(90, 360, 90, 25);
		tarde.setBounds(315, 360, 90, 25);

		ok.setBounds(450, 500, 80, 50);

		dataText.setHorizontalAlignment(JLabel.CENTER);
		crmText.setHorizontalAlignment(JLabel.CENTER);
		cpfText.setHorizontalAlignment(JLabel.CENTER);

		ButtonGroup groupHoras = new ButtonGroup();
		groupHoras.add(manha);
		groupHoras.add(tarde);

		dataText.setForeground(new Color(0x00FF00));
		dataText.setBackground(Color.black);
		dataText.setCaretColor(Color.white);
		crmText.setForeground(new Color(0x00FF00));
		crmText.setBackground(Color.black);
		crmText.setCaretColor(Color.white);
		cpfText.setForeground(new Color(0x00FF00));
		cpfText.setBackground(Color.black);
		cpfText.setCaretColor(Color.white);

		manha.setForeground(new Color(0x00FF00));
		manha.setBackground(Color.black);
		tarde.setForeground(new Color(0x00FF00));
		tarde.setBackground(Color.black);

		// verificar.setIcon(new ImageIcon(getClass().getResource("verificar.png")));

		ok.setIcon(new ImageIcon(getClass().getResource("ok.png")));

		this.add(dataText);
		this.add(crmText);
		this.add(cpfText);
		this.add(manha);
		this.add(tarde);
		this.add(ok);

		background.setIcon(new ImageIcon(getClass().getResource("hospitall.png")));
		getContentPane().add(background);
		background.setBounds(0, 0, 550, 600);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ok) {
			String horario = "";
			AgendamentoClass rel_Agendamento = new AgendamentoClass();
			if (manha.isSelected()) {

				Object[] horarios = { "8", "9", "10", "11", "12" };
				int opcaoHorario = JOptionPane.showOptionDialog(null, "Horários pela Manhã", "Asilo Arkhan",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, horarios, horarios[0]);
				horario = ((String) horarios[opcaoHorario]);
			} else if (tarde.isSelected()) {
				Object[] horarios = { "14", "15", "16", "17", "18" };
				int opcaoHorario = JOptionPane.showOptionDialog(null, "Horários pela Tarde", "Asilo Arkhan",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, horarios, horarios[0]);
				horario = ((String) horarios[opcaoHorario]);
			}

			boolean confirm = false;
			boolean confirmar = false;
			boolean confirmarHrs = false;
			for (MedicoClass verific_Medico : Inicio.reg_Medico) {
				if (verific_Medico.getCrm().equals(crmText.getText())){
					confirm = true;
					break;
				}
			}
			for (PacienteClass verific_Paciente : Inicio.reg_Paciente) {
				if (verific_Paciente.getCpf().equals(cpfText.getText())){
					confirmar = true;
					break;
				}
			}
			
			for (AgendamentoClass verific_Agendamento : Inicio.reg_Agendamento) {
				if(verific_Agendamento.getData().equals(dataText.getText()) && verific_Agendamento.getHorario().equals(horario)) {
					JOptionPane.showMessageDialog(null, "Horário indisponível!");
					confirmarHrs = true;
					break;
				}
			}
			if (confirm && confirmar && !confirmarHrs) {
				AgendamentoClass analise_Agendamento = new AgendamentoClass();
				analise_Agendamento.setCodigo(Inicio.cont);
				analise_Agendamento.setData(dataText.getText());
				analise_Agendamento.setCrm(crmText.getText());
				analise_Agendamento.setCpf(cpfText.getText());
				analise_Agendamento.setStatus("Agendada");
				analise_Agendamento.setHorario(horario);

				JOptionPane.showMessageDialog(null, "Registro concluído!");
				Inicio.cont ++;
				Inicio.reg_Agendamento.add(analise_Agendamento);
				dataText.setText("Data");
				crmText.setText("CRM");
				cpfText.setText("CPF");
			} else {
				JOptionPane.showMessageDialog(null, "  Erro em criar Consulta! ");
			}

		}

	}

}
