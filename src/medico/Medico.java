package medico;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import paciente.PacienteClass;
import principal.Inicio;

public class Medico extends JFrame implements ActionListener {

	private JLabel background = new JLabel();

	JButton verificar = new JButton();
	JButton ok = new JButton();

	JTextField crmText = new JTextField("CRM");
	JTextField cpfText = new JTextField("CPF");
	JTextField nomeText = new JTextField("Nome");
	JTextField enderecoText = new JTextField("Endereço");
	JRadioButton ativo = new JRadioButton("Ativo");
	JRadioButton desligado = new JRadioButton("Desligado");

	public Medico() {

		this.setTitle("Área de Médicos");
		setBounds(100, 300, 550, 600);
		getContentPane().setLayout(null);

		ok.addActionListener(this);
		verificar.addActionListener(this);
		ativo.addActionListener(this);
		desligado.addActionListener(this);

		crmText.setBounds(110, 80, 250, 25);
		cpfText.setBounds(110, 155, 250, 25);
		nomeText.setBounds(110, 230, 250, 25);
		enderecoText.setBounds(110, 305, 250, 25);
		ativo.setBounds(110, 340, 65, 25);
		desligado.setBounds(260, 340, 100, 25);
		verificar.setBounds(370, 75, 115, 35);
		ok.setBounds(450, 500, 80, 50);

		crmText.setHorizontalAlignment(JLabel.CENTER);
		cpfText.setHorizontalAlignment(JLabel.CENTER);
		nomeText.setHorizontalAlignment(JLabel.CENTER);
		enderecoText.setHorizontalAlignment(JLabel.CENTER);

		ButtonGroup groupStatus = new ButtonGroup();
		groupStatus.add(ativo);
		groupStatus.add(desligado);

		verificar.setIcon(new ImageIcon(getClass().getResource("verificar.png")));
		ativo.setIcon(new ImageIcon(getClass().getResource("ativo.png")));
		desligado.setIcon(new ImageIcon(getClass().getResource("desligado.png")));
		ok.setIcon(new ImageIcon(getClass().getResource("ok.png")));

		this.add(crmText);
		this.add(cpfText);
		this.add(nomeText);
		this.add(enderecoText);
		this.add(ativo);
		this.add(desligado);
		this.add(verificar);
		this.add(ok);

		background.setIcon(new ImageIcon(getClass().getResource("medico.png")));
		getContentPane().add(background);
		background.setBounds(0, 0, 550, 600);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == verificar) {
			boolean confirm = false;
			for (MedicoClass verific_CRM : Inicio.reg_Medico) {
				if (verific_CRM.getCrm().equals(crmText.getText()) || verific_CRM.getCpf().equals(cpfText.getText())) {
					JOptionPane.showMessageDialog(null, " CPF já cadastrado! ");
					confirm = true;
					break;
				}
			}

			if (!confirm) {
				JOptionPane.showMessageDialog(null, " Médico não cadastrado! ");
			}

		}

		String tipo = "";
		if (e.getSource() == ativo) {
			ativo.setForeground(new Color(0x00FF00));
			ativo.setBackground(Color.BLACK);
			tipo = "Ativo";

		} else {
			ativo.setForeground(Color.BLACK);
			ativo.setBackground(Color.WHITE);
		}

		if (e.getSource() == desligado) {
			desligado.setForeground(new Color(0x00FF00));
			desligado.setBackground(Color.black);
			tipo = "Desligado";
		} else {
			desligado.setForeground(Color.BLACK);
			desligado.setBackground(Color.WHITE);
		}
		if (e.getSource() == ok) {
			boolean confirm = false;
			for (MedicoClass verific_Medico : Inicio.reg_Medico) {
				if (verific_Medico.getCrm().equals(crmText.getText())
						&& verific_Medico.getCpf().equals(cpfText.getText())) {
					JOptionPane.showMessageDialog(null, " CPF já cadastrado! ");
					confirm = true;
					break;
				}
			}

			if (!confirm) {
				MedicoClass analise_Medico = new MedicoClass();
				analise_Medico.setCrm(crmText.getText());
				analise_Medico.setCpf(cpfText.getText());
				analise_Medico.setNome(nomeText.getText());
				analise_Medico.setEndereco(enderecoText.getText());
				analise_Medico.setStatus(tipo);

				JOptionPane.showMessageDialog(null, "Registro de Médico Concluído!");
				Inicio.reg_Medico.add(analise_Medico);
				crmText.setText("CRM");
				cpfText.setText("CPF");
				nomeText.setText("Nome");
				enderecoText.setText("Endereço");
			}
		}
	}
}
