package paciente;

import javax.swing.JOptionPane;

import principal.Inicio;

public class ConsultaPaciente {

	public ConsultaPaciente() {
		for (PacienteClass verif_pacientes : Inicio.reg_Paciente) {
			String save1 = "Consulta de Médicos Cadastrados\n" + "\nCPF: " + verif_pacientes.getCpf() + "\nNome: "
					+ verif_pacientes.getNome() + "\nEndereço: " + verif_pacientes.getEndereco();
			JOptionPane.showMessageDialog(null, save1, " Consulta de Pacientes ", JOptionPane.PLAIN_MESSAGE);
		}

	}

}
