package cancelamento;

import java.awt.Color;
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

public class Cancelamento extends JFrame implements ActionListener {

	private JLabel background = new JLabel();

	JButton verificar = new JButton();
	JButton ok = new JButton();

	JTextField dataText = new JTextField("Data da Consulta");
	JTextField horarioText = new JTextField("Horário da Consulta");
	JTextField crmText = new JTextField("CRM do Médico");

	public Cancelamento() {

		this.setTitle("Área de Cadastros");
		setBounds(100, 300, 400, 350);
		getContentPane().setLayout(null);

		ok.addActionListener(this);
		verificar.addActionListener(this);

		dataText.setBounds(70, 60, 250, 25);
		horarioText.setBounds(70, 115, 250, 25);
		crmText.setBounds(70, 190, 250, 25);
		ok.setBounds(300, 250, 80, 50);

		dataText.setHorizontalAlignment(JLabel.CENTER);
		horarioText.setHorizontalAlignment(JLabel.CENTER);
		crmText.setHorizontalAlignment(JLabel.CENTER);

		ok.setIcon(new ImageIcon(getClass().getResource("ok.png")));

		dataText.setForeground(new Color(0x00FF00));
		dataText.setBackground(Color.black);
		horarioText.setForeground(new Color(0x00FF00));
		horarioText.setBackground(Color.black);
		crmText.setForeground(new Color(0x00FF00));
		crmText.setBackground(Color.black);

		this.add(dataText);
		this.add(horarioText);
		this.add(crmText);
		this.add(ok);

		background.setIcon(new ImageIcon(getClass().getResource("cancelamento.png")));
		getContentPane().add(background);
		background.setBounds(0, 0, 400, 350);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for (AgendamentoClass verific_Cancelamento : Inicio.reg_Agendamento) {
			if (verific_Cancelamento.getData().equals(dataText.getText())
					&& verific_Cancelamento.getHorario().equals(horarioText.getText())
					&& verific_Cancelamento.getCrm().equals(crmText.getText())) {

				verific_Cancelamento.setStatus("Cancelada");
				verific_Cancelamento.setHorario("");

				dataText.setText("Data da Consulta");
				horarioText.setText("Horario da Consulta");
				crmText.setText("CRM");

				JOptionPane.showMessageDialog(null, "  Consulta Cancelada com Sucesso! ");
				ConsultaCancelamento.ConsCancelamento(verific_Cancelamento.getCpf(), verific_Cancelamento.getData(),
						verific_Cancelamento.getHorario());
				break;
			}
		}
	}
}
