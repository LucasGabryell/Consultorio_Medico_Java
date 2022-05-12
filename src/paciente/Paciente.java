package paciente;

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

import medico.MedicoClass;
import principal.Inicio;


@SuppressWarnings("serial")
public class Paciente extends JFrame implements ActionListener{
	
private JLabel background = new JLabel();
	
	JButton verificar = new JButton();
	JButton ok = new JButton();
	
	JTextField cpfText = new JTextField("CPF");
	JTextField nomeText = new JTextField("Nome");
	JTextField enderecoText = new JTextField("Endereço");
	
	public Paciente() {
		
		this.setTitle("Área de Médicos");
		setBounds(100, 300, 450, 500);
		getContentPane().setLayout(null);
		
		ok.addActionListener(this);
		verificar.addActionListener(this);
		
		cpfText.setBounds(110, 80, 250, 25);
		nomeText.setBounds(110, 155, 250, 25);
		enderecoText.setBounds(110, 230, 250, 25);
		verificar.setBounds(180, 110, 115, 35);
		ok.setBounds(350, 400, 80, 50);
		
		cpfText.setHorizontalAlignment(JLabel.CENTER);
		nomeText.setHorizontalAlignment(JLabel.CENTER);
		enderecoText.setHorizontalAlignment(JLabel.CENTER);
		
		verificar.setIcon(new ImageIcon(getClass().getResource("verificar.png"))); 
		ok.setIcon(new ImageIcon(getClass().getResource("ok.png")));
		
		this.add(cpfText);
		this.add(nomeText);
		this.add(enderecoText);
		this.add(verificar);
		this.add(ok);

		background.setIcon(new ImageIcon(getClass().getResource("paciente.png")));
		getContentPane().add(background);
		background.setBounds(0, 0, 450, 500);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == verificar) {
			boolean confirm = false;
			for (MedicoClass verific_CPF : Inicio.reg_Medico) {
				if (verific_CPF.getCpf().equals(cpfText.getText())) {
					JOptionPane.showMessageDialog(null, " CPF já cadastrado! ");
					confirm = true;
					break;
				}
			}

			if (!confirm) {
				JOptionPane.showMessageDialog(null, " Paciente não cadastrado! ");
			}
			
			boolean confirmar = false;
			for (PacienteClass verific_CPF : Inicio.reg_Paciente) {
				if (verific_CPF.getCpf().equals(cpfText.getText())) {
					JOptionPane.showMessageDialog(null, " CPF já cadastrado! ");
					confirm = true;
					break;
				}
			}

			if (!confirm) {
				JOptionPane.showMessageDialog(null, " Paciente não cadastrado! ");
			}
		}
		
		if (e.getSource() == ok) {
			boolean confirm = false;
			for (PacienteClass verific_Paciente : Inicio.reg_Paciente) {
				if (verific_Paciente.getCpf().equals(cpfText.getText())) {
					JOptionPane.showMessageDialog(null, " CPF já cadastrado! ");
					confirm = true;
					break;
				}
			}
			
			if (!confirm) {
				PacienteClass analise_Paciente = new PacienteClass();
				analise_Paciente.setCpf(cpfText.getText());
				analise_Paciente.setNome(nomeText.getText());
				analise_Paciente.setEndereco(enderecoText.getText());

				JOptionPane.showMessageDialog(null, "Registro de Paciente Concluído!");
				Inicio.reg_Paciente.add(analise_Paciente);
				cpfText.setText("CPF");
				nomeText.setText("Nome");
				enderecoText.setText("Endereço");
			}

			
		}
		
	}

}
