package medico;

import javax.swing.JOptionPane;
import principal.Inicio;

public class ConsultaMedico {

	public ConsultaMedico() {
		for (MedicoClass verif_medicos : Inicio.reg_Medico) {
			String save1 = "Consulta de M�dicos Cadastrados\n" + "\nCRM: " + verif_medicos.getCrm() + "\nCPF: "
					+ verif_medicos.getCpf() + "\nNome: " + verif_medicos.getNome() + "\nEndere�o: "
					+ verif_medicos.getEndereco() + "\nStatus: " + verif_medicos.getStatus();
			JOptionPane.showMessageDialog(null, save1, " Consulta de M�dicos ", JOptionPane.PLAIN_MESSAGE);
		}

	}

}
