package consultas;

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
import telas.ClassCadastro;

public class Consultas extends JFrame {

	private JLabel background = new JLabel();

	JTextField crmText = new JTextField("CRM");
	JTextField dataText = new JTextField("Data");
	JButton ok = new JButton();

	public Consultas() {

		this.setTitle("Área de Cadastro");
		setBounds(100, 400, 400, 400);
		getContentPane().setLayout(null);

		crmText.setBounds(80, 100, 250, 25);
		dataText.setBounds(80, 175, 250, 25);
		ok.setBounds(300, 300, 80, 50);

		crmText.setHorizontalAlignment(JLabel.CENTER);
		dataText.setHorizontalAlignment(JLabel.CENTER);

		crmText.setForeground(new Color(0x00FF00));
		crmText.setBackground(Color.black);
		dataText.setForeground(new Color(0x00FF00));
		dataText.setBackground(Color.black);

		ok.setIcon(new ImageIcon(getClass().getResource("ok.png")));

		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				boolean confirm = false;
				for (AgendamentoClass verific_Consultas : Inicio.reg_Agendamento) {
					if (verific_Consultas.getCrm().equals(crmText.getText())
							&& verific_Consultas.getData().equals(dataText.getText())
							&& (verific_Consultas.getStatus().equals("Agendada")
									|| verific_Consultas.getStatus().equals("Realizada"))) {
						confirm = true;
						break;
					}
				}
				if (confirm) {
					for (AgendamentoClass reg_Cons : Inicio.reg_Agendamento) {
						String save1 = "Consulta de Agendamentos\n" + "\nCódigo: " + reg_Cons.getCodigo() + "\nData: "
								+ reg_Cons.getData() + "\nCRM: " + reg_Cons.getCrm() + "\nCPF: " + reg_Cons.getCpf()
								+ "\nStatus: " + reg_Cons.getStatus() + "\nHorário: " + reg_Cons.getHorario();
						JOptionPane.showMessageDialog(null, save1, " Asilo Arkhan ", JOptionPane.PLAIN_MESSAGE);
					}
				}
			}
		});

		this.add(crmText);
		this.add(dataText);
		this.add(ok);

		background.setIcon(new ImageIcon(getClass().getResource("cons.png")));
		background.setBounds(0, 0, 400, 400);
		getContentPane().add(background);
		this.setVisible(true);

	}
}
